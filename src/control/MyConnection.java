/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.* ;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.Lamp;
import model.LampMode;
import model.Room;
import view.NewLamp;

/**
 *
 * @author ocid
 */
public class MyConnection {
    private boolean stat = false ; // status dia sedang login atau tidak
    private String user = "" ; // untuk menyimpan nama user yang sedang login 
    Scanner in = new Scanner( System.in ) ;
     Connection conn = null ;
     private Statement stmt = null ;
     private ResultSet rs = null ;
     
    public MyConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/smartlamp", "root", "");
            stmt = conn.createStatement() ;
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Kesalahan pada Koneksi db");
        }
    }
    
    // * Login
        public void signIn(){
        String tUsername ; 
        String tPassword ;
        System.out.print( " Username : " ) ; 
        tUsername = in.next() ;
        System.out.print( " Password : " ) ;
        tPassword = in.next() ;
        
    } ; // console
        
        public boolean cekLogin( Admin u ) {
            boolean cek = false ;
            Admin[] arrayAdmin = new Admin[100] ;
            System.out.println("u :"+u.getUsername());
            int i = 0 ;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from admin");    
            while(rs.next()){
           Admin temp = new Admin() ;     
                System.out.println("i : " + i ) ;
                temp.setNama(rs.getString(2));
                temp.setUsername(rs.getString(3));
                temp.setPassword(rs.getString(4));
                arrayAdmin[i] = temp ;
                i++ ;
            }
            for( int j = 0 ; j < i ; j++ ){
                if(arrayAdmin[j].getUsername().equals(u.getUsername())&&arrayAdmin[j].getPassword().equals(u.getPassword())){
                    System.out.println("masuk");
                    cek = true ;
                }
            }
            
        } 
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "gagal koneksi cek login");
        }
        return cek;
        
        };
    
    // * Manage Lamp
        public Lamp createLampu ( String lampId , String nama , String time , String description ){
        Lamp l = null ;
        return l ;
        } ;
        public void insertLampu ( Lamp newLamp ){
            if(newLamp != null){
            try {
//                 PreparedStatement p = conn.prepareStatement("insert into lampu "
//                        + "(id_lampu, nama, description) values ('" 
//                         + newLamp.getLampId() + "','" + newLamp.getNama()+   "','" +newLamp.getDescription() + "','" +newLamp.getTime()+"'");
                 PreparedStatement p = conn.prepareStatement("insert into lampu "
                        + "(id_lampu, nama, description) values (?, ?, ?)");
                p.setString(1, newLamp.getLampId());
                p.setString(2, newLamp.getNama());
                p.setString(3, newLamp.getDescription());
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
//            viewAllLamp();
        } 
        
        } ; // ok
        public void updateLampu ( String idLampu , Lamp newLamp ){
          if(newLamp != null){
            try {
                 PreparedStatement p = conn.prepareStatement("update lampu set id_lampu = ?,"
                        + "nama = ?, description = ? where id_lampu = ? ");
                p.setString(1, newLamp.getLampId());
                p.setString(2, newLamp.getNama());
                p.setString(3, newLamp.getDescription());
                p.setString(4, idLampu);
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        } ;
        public void deleteLampu ( String lampId ){
            try {
                PreparedStatement p = conn.prepareStatement("delete from lampu "
                        + "where id_ruangan = "+lampId );
             //   p.setString(1, m.getIdMaskapai());
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        } ;
        
    // * Manage Room
        public Room createRoom ( String roomId , String name , String description ){
        Room r = null ;
        return r ;
        } ;
        public void insertRoom ( Room newRoom ){
              if(newRoom != null){
            try {
                 PreparedStatement p = conn.prepareStatement("insert into ruangan "
                        + "(id_ruangan, nama, description, id_mode_lampu) values ('" 
                         + newRoom.getRoomId() + "','" + newRoom.getName()+   "','" +newRoom.getDescription() + "','" +newRoom.getLampMode()+"'");

                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        } ;
        public void updateRoom ( String idRuangan , Room newRoom ){
                  if(newRoom != null){
            try {
                 PreparedStatement p = conn.prepareStatement("update ruangan set id_ruangan = ?,"
                        + "nama = ?, description = ? where id_ruangan = ? ");
                p.setString(1, newRoom.getRoomId());
                p.setString(2, newRoom.getName());
                p.setString(3, newRoom.getDescription());
                p.setString(4, idRuangan);
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        } ;
        public void deleteRoom ( String roomId ){
            try {
                PreparedStatement p = conn.prepareStatement("delete from ruangan "
                        + "where id_ruangan = "+roomId );
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } ;
    
    // * Manage Lamp Mode 
        public LampMode createModeLampu ( String lampModeId , String name , String description ) {
        LampMode ml = null ;
        return ml ;
        };
        public void insertModeLampu ( LampMode newLampMode ) {
           if(newLampMode != null){
            try {
                 PreparedStatement p = conn.prepareStatement("insert into mode_lampu "
                        + "(id_mode_lampu, nama, description) values (?, ?, ?)");
                p.setString(1, newLampMode.getId());
                p.setString(2, newLampMode.getName());
                p.setString(3, newLampMode.getDescription());
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
        };
        public void updateModeLampu ( String idLampMode , LampMode newLampMode ) {
                  if(newLampMode != null){
            try {
                 PreparedStatement p = conn.prepareStatement("update mode_lampu set id_lampu = ?,"
                        + "nama = ?, description = ? where id_lampu = ? ");
                p.setString(1, newLampMode.getId());
                p.setString(2, newLampMode.getName());
                p.setString(3, newLampMode.getDescription());
                p.setString(4, idLampMode);
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        };
        public void deleteModeLampu ( String lampModeId ) {
        try {
                PreparedStatement p = conn.prepareStatement("delete from mode_lampu "
                        + "where id_mode_lampu = "+lampModeId );
             
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        };
        public void addLampu(String inModeId , String namaLampu , int time){
            if(inModeId!=null&&namaLampu!=null){
            try {
                 PreparedStatement p = conn.prepareStatement("insert into mengatur "
                        + "(id_mode_lampu, id_lampu, time) values (?, ?, ?)");
                p.setString(1, inModeId) ;
                p.setString(2, namaLampu) ;
                p.setString(3, "3") ;
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }}
        
        } ;
        public void deleteLampuInMode ( String lampMode , String lampId ){
            try {
                PreparedStatement p = conn.prepareStatement("delete from mengatur "
                        + "where id_mode_lampu = ? and id_lampu = ?" );
                p.setString(1, lampMode);
                p.setString(1, lampId);
                p.executeUpdate();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } ;
    
    // * Cek
        
    // *View
   public ResultSet getData(String SQLString){
   
   try{
       rs = stmt.executeQuery(SQLString) ;
   }catch(Exception e){
       e.getMessage() ;
   }
       return rs ;
   };   
   public Room[] viewAllRoom(){
       Room[] room = null ;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from lampu"); 
            int i = 0 ;
            while(rs.next()){
            Room temp = new Room() ;     
                System.out.println("i : " + i ) ;
                temp.setRoomId(rs.getString(1));
                temp.setName(rs.getString(2));
                temp.setDescription(rs.getString(4));
                room[i] = temp ;
                i++ ;
            }
            
        } 
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "gagal koneksi cek login");
        }
       return room ;
   } ;
   public LampMode[] viewAllModeLamp(){
       LampMode[] LampMode = null ;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from lampu"); 
            int i = 0 ;
            while(rs.next()){
            LampMode temp = new LampMode() ;     
                System.out.println("i : " + i ) ;
                temp.setId(rs.getString(1));
                temp.setName(rs.getString(2));
                temp.setDescription(rs.getString(3));
                LampMode[i] = temp ;
                i++ ;
            }
            
        } 
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "gagal koneksi cek login");
        }
       return LampMode ;
   } ;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//--------------------------------------------------------------------------------------------------------------------------
    // *Content App console
    public void logo(){
        System.out.println( " -------------------------------- " ) ;
        System.out.println( "            SMART LAMP            " ) ;
        System.out.println( " -------------------------------- " ) ;
    }
    public void startMenu(){
        int temp = 3 ;
        logo();
        while( temp != 0 ){
            System.out.println( " 1 .SignIn " ) ;
            System.out.println( " 2 .View Room " ) ;
            System.out.println( " 0 .Exit " ) ;
            System.out.print( "Choose one : " );
            temp = in.nextInt() ;
            if( temp == 1 ){
                signIn() ;
                logo() ;
            }else{
                if( temp == 2 ){
                   // printAll() ;
                }else{
                    logo() ;
                }
            }
        }
    } // menu awal
    public void sndMenu(){
        int pil = 7 ;
        while( pil != 0 ){
            logo() ;
            System.out.println( "                 hello "+this.user+" !");
            System.out.println( "1 .New Room " ) ;
            System.out.println( "2 .New Lamp " ) ;
            System.out.println( "3 .New Lamp Mode ");
            System.out.println( "4 .View Room ") ;
            System.out.println( "5 .View Lamp ") ;
            System.out.println( "0 .SignOut " );
            System.out.print( " - Choose one : ");
            pil = in.nextInt() ;
        }
    } // menu setelah signIn
    
    
//=========================================================================================================================
    
    
    
    
}
