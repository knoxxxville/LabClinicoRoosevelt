package entities;
// Generated 07-sep-2015 20:24:23 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orina generated by hbm2java
 */
public class Orina  implements java.io.Serializable {


     private Integer idorina;
     private Pacientes pacientes;
     private Doctores doctores;
     private Date fecha;
     private String observaciones;
     private Set<OrinaMicroscopico> orinaMicroscopicos = new HashSet<OrinaMicroscopico>(0);
     private Set<OrinaFisicoQuimico> orinaFisicoQuimicos = new HashSet<OrinaFisicoQuimico>(0);

    public Orina() {
    }

    public Orina(Pacientes pacientes, Doctores doctores, Date fecha, String observaciones, Set<OrinaMicroscopico> orinaMicroscopicos, Set<OrinaFisicoQuimico> orinaFisicoQuimicos) {
       this.pacientes = pacientes;
       this.doctores = doctores;
       this.fecha = fecha;
       this.observaciones = observaciones;
       this.orinaMicroscopicos = orinaMicroscopicos;
       this.orinaFisicoQuimicos = orinaFisicoQuimicos;
    }
   
    public Integer getIdorina() {
        return this.idorina;
    }
    
    public void setIdorina(Integer idorina) {
        this.idorina = idorina;
    }
    public Pacientes getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }
    public Doctores getDoctores() {
        return this.doctores;
    }
    
    public void setDoctores(Doctores doctores) {
        this.doctores = doctores;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Set<OrinaMicroscopico> getOrinaMicroscopicos() {
        return this.orinaMicroscopicos;
    }
    
    public void setOrinaMicroscopicos(Set<OrinaMicroscopico> orinaMicroscopicos) {
        this.orinaMicroscopicos = orinaMicroscopicos;
    }
    public Set<OrinaFisicoQuimico> getOrinaFisicoQuimicos() {
        return this.orinaFisicoQuimicos;
    }
    
    public void setOrinaFisicoQuimicos(Set<OrinaFisicoQuimico> orinaFisicoQuimicos) {
        this.orinaFisicoQuimicos = orinaFisicoQuimicos;
    }




}


