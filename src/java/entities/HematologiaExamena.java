package entities;
// Generated 07-sep-2015 20:24:23 by Hibernate Tools 3.6.0



/**
 * HematologiaExamena generated by hbm2java
 */
public class HematologiaExamena  implements java.io.Serializable {


     private Integer idhematologiaexamena;
     private Hematologia hematologia;
     private String globrojo;
     private String hematrocitos;
     private String hemoglobina;
     private String vcm;
     private String hcm;
     private String bhcm;

    public HematologiaExamena() {
    }

    public HematologiaExamena(Hematologia hematologia, String globrojo, String hematrocitos, String hemoglobina, String vcm, String hcm, String bhcm) {
       this.hematologia = hematologia;
       this.globrojo = globrojo;
       this.hematrocitos = hematrocitos;
       this.hemoglobina = hemoglobina;
       this.vcm = vcm;
       this.hcm = hcm;
       this.bhcm = bhcm;
    }
   
    public Integer getIdhematologiaexamena() {
        return this.idhematologiaexamena;
    }
    
    public void setIdhematologiaexamena(Integer idhematologiaexamena) {
        this.idhematologiaexamena = idhematologiaexamena;
    }
    public Hematologia getHematologia() {
        return this.hematologia;
    }
    
    public void setHematologia(Hematologia hematologia) {
        this.hematologia = hematologia;
    }
    public String getGlobrojo() {
        return this.globrojo;
    }
    
    public void setGlobrojo(String globrojo) {
        this.globrojo = globrojo;
    }
    public String getHematrocitos() {
        return this.hematrocitos;
    }
    
    public void setHematrocitos(String hematrocitos) {
        this.hematrocitos = hematrocitos;
    }
    public String getHemoglobina() {
        return this.hemoglobina;
    }
    
    public void setHemoglobina(String hemoglobina) {
        this.hemoglobina = hemoglobina;
    }
    public String getVcm() {
        return this.vcm;
    }
    
    public void setVcm(String vcm) {
        this.vcm = vcm;
    }
    public String getHcm() {
        return this.hcm;
    }
    
    public void setHcm(String hcm) {
        this.hcm = hcm;
    }
    public String getBhcm() {
        return this.bhcm;
    }
    
    public void setBhcm(String bhcm) {
        this.bhcm = bhcm;
    }




}


