package entities;
// Generated 07-sep-2015 20:24:23 by Hibernate Tools 3.6.0



/**
 * HematologiaExamenb generated by hbm2java
 */
public class HematologiaExamenb  implements java.io.Serializable {


     private Integer idhematologiaexamenb;
     private Hematologia hematologia;
     private String globblancos;
     private String neutrofiliossegmen;
     private String neutrofiliosbanda;
     private String linfocitos;
     private String eosinofilos;
     private String monocitos;
     private String basofilos;

    public HematologiaExamenb() {
    }

    public HematologiaExamenb(Hematologia hematologia, String globblancos, String neutrofiliossegmen, String neutrofiliosbanda, String linfocitos, String eosinofilos, String monocitos, String basofilos) {
       this.hematologia = hematologia;
       this.globblancos = globblancos;
       this.neutrofiliossegmen = neutrofiliossegmen;
       this.neutrofiliosbanda = neutrofiliosbanda;
       this.linfocitos = linfocitos;
       this.eosinofilos = eosinofilos;
       this.monocitos = monocitos;
       this.basofilos = basofilos;
    }
   
    public Integer getIdhematologiaexamenb() {
        return this.idhematologiaexamenb;
    }
    
    public void setIdhematologiaexamenb(Integer idhematologiaexamenb) {
        this.idhematologiaexamenb = idhematologiaexamenb;
    }
    public Hematologia getHematologia() {
        return this.hematologia;
    }
    
    public void setHematologia(Hematologia hematologia) {
        this.hematologia = hematologia;
    }
    public String getGlobblancos() {
        return this.globblancos;
    }
    
    public void setGlobblancos(String globblancos) {
        this.globblancos = globblancos;
    }
    public String getNeutrofiliossegmen() {
        return this.neutrofiliossegmen;
    }
    
    public void setNeutrofiliossegmen(String neutrofiliossegmen) {
        this.neutrofiliossegmen = neutrofiliossegmen;
    }
    public String getNeutrofiliosbanda() {
        return this.neutrofiliosbanda;
    }
    
    public void setNeutrofiliosbanda(String neutrofiliosbanda) {
        this.neutrofiliosbanda = neutrofiliosbanda;
    }
    public String getLinfocitos() {
        return this.linfocitos;
    }
    
    public void setLinfocitos(String linfocitos) {
        this.linfocitos = linfocitos;
    }
    public String getEosinofilos() {
        return this.eosinofilos;
    }
    
    public void setEosinofilos(String eosinofilos) {
        this.eosinofilos = eosinofilos;
    }
    public String getMonocitos() {
        return this.monocitos;
    }
    
    public void setMonocitos(String monocitos) {
        this.monocitos = monocitos;
    }
    public String getBasofilos() {
        return this.basofilos;
    }
    
    public void setBasofilos(String basofilos) {
        this.basofilos = basofilos;
    }




}


