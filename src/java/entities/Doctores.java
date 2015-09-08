package entities;
// Generated 07-sep-2015 20:24:23 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Doctores generated by hbm2java
 */
public class Doctores  implements java.io.Serializable {


     private Integer iddoctor;
     private String nombre;
     private Set<Inmunologia> inmunologias = new HashSet<Inmunologia>(0);
     private Set<Heces> heceses = new HashSet<Heces>(0);
     private Set<Orina> orinas = new HashSet<Orina>(0);
     private Set<Bacteriologia> bacteriologias = new HashSet<Bacteriologia>(0);
     private Set<Quimica> quimicas = new HashSet<Quimica>(0);
     private Set<Hematologia> hematologias = new HashSet<Hematologia>(0);

    public Doctores() {
    }

    public Doctores(String nombre, Set<Inmunologia> inmunologias, Set<Heces> heceses, Set<Orina> orinas, Set<Bacteriologia> bacteriologias, Set<Quimica> quimicas, Set<Hematologia> hematologias) {
       this.nombre = nombre;
       this.inmunologias = inmunologias;
       this.heceses = heceses;
       this.orinas = orinas;
       this.bacteriologias = bacteriologias;
       this.quimicas = quimicas;
       this.hematologias = hematologias;
    }
   
    public Integer getIddoctor() {
        return this.iddoctor;
    }
    
    public void setIddoctor(Integer iddoctor) {
        this.iddoctor = iddoctor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Inmunologia> getInmunologias() {
        return this.inmunologias;
    }
    
    public void setInmunologias(Set<Inmunologia> inmunologias) {
        this.inmunologias = inmunologias;
    }
    public Set<Heces> getHeceses() {
        return this.heceses;
    }
    
    public void setHeceses(Set<Heces> heceses) {
        this.heceses = heceses;
    }
    public Set<Orina> getOrinas() {
        return this.orinas;
    }
    
    public void setOrinas(Set<Orina> orinas) {
        this.orinas = orinas;
    }
    public Set<Bacteriologia> getBacteriologias() {
        return this.bacteriologias;
    }
    
    public void setBacteriologias(Set<Bacteriologia> bacteriologias) {
        this.bacteriologias = bacteriologias;
    }
    public Set<Quimica> getQuimicas() {
        return this.quimicas;
    }
    
    public void setQuimicas(Set<Quimica> quimicas) {
        this.quimicas = quimicas;
    }
    public Set<Hematologia> getHematologias() {
        return this.hematologias;
    }
    
    public void setHematologias(Set<Hematologia> hematologias) {
        this.hematologias = hematologias;
    }




}


