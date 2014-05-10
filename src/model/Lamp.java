/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ocid
 */
public class Lamp {
    private String lampId = null ; // id lampu
    private String nama = null ; // nama
    private String location = null ; // lokasi lampu ( diruangan mana ? )
    private String Stat = null ; // mati atau menyala
    private String description = null ; // deskripsi tentang lampu
    private int condition = 100 ; // persentase kondisi lampu
   
    private int time ;
   
    public Lamp(){};
    public Lamp( String lampId , String description ){
        this.lampId = lampId ;
        this.description = description ;
    };

    /**
     * @return the lampId
     */
    public String getLampId() {
        return lampId;
    }

    /**
     * @param lampId the lampId to set
     */
    public void setLampId(String lampId) {
        this.lampId = lampId;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the Stat
     */
    public String getStat() {
        return Stat;
    }

    /**
     * @param Stat the Stat to set
     */
    public void setStat(String Stat) {
        this.Stat = Stat;
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
     * @return the condition
     */
    public int getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(int condition) {
        this.condition = condition;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
}
/*
   Note ( asumsi )
    *
    * 
   

*/

