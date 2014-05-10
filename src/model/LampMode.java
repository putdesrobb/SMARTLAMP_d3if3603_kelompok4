/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ocid
 */
public class LampMode {
    private String id  = null ;
    private String name = null ; // nama modenya
    private String description = null ; // deskripsi mengenai mode
    private Lamp[] setLampList = new Lamp[ 100 ] ; // untuk menyimpan pengaturan setiap lampu
    public LampMode(){};
    public LampMode( String name , String description , Lamp[] setLamp ){
       this.name = name ;
       this.description = description ;
       this.setLampList = setLamp ;
    } ;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the setLampList
     */
    public Lamp[] getSetLampList() {
        return setLampList;
    }

    /**
     * @param setLampList the setLampList to set
     */
    public void setSetLampList(Lamp[] setLampList) {
        this.setLampList = setLampList;
    }
    
}

/*
    * mode 
 
 
 */
