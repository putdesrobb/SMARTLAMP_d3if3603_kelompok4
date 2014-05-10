/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ocid
 */
public class Room {
    private String roomId  = null ; // Id ruangan
    private String name  = null ; // Nama ruangan
    private String description  = null ; // Deskripsi tentang ruangan
    private String[] listLamp  = null ;  // Untuk menyimpan daftar id lampu 
    private LampMode lampMode  = null ; // Mode yang dipakai
    public Room( String newName , String newDescription ){
        this.name = newName ;
        this.description = newDescription ;
    } // Konstruktor

    public Room() {
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the listLamp
     */
    public String[] getListLamp() {
        return listLamp;
    }

    /**
     * @param listLamp the listLamp to set
     */
    public void setListLamp(String[] listLamp) {
        this.setListLamp(listLamp);
    }

    

    /**
     * @return the lampMode
     */
    public LampMode getLampMode() {
        return lampMode;
    }

    /**
     * @param lampMode the lampMode to set
     */
    public void setLampMode(LampMode lampMode) {
        this.lampMode = lampMode;
    }
    

}
