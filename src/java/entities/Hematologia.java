package entities;
// Generated 01-sep-2015 14:16:40 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Hematologia generated by hbm2java
 */
public class Hematologia  implements java.io.Serializable {


     private int idhematologia;
     private HematologiaExamena hematologiaExamena;
     private HematologiaExamenb hematologiaExamenb;
     private Pacientes pacientes;
     private Doctores doctores;
     private Date fecha;
     private String celulasle;
     private String gotagruesa;
     private String plaquetas;
     private String reticulocitos;
     private String eritrosedimentacion;
     private String fsangreperiferica;
     private String observaciones;

    public Hematologia() {
    }

	
    public Hematologia(HematologiaExamena hematologiaExamena, HematologiaExamenb hematologiaExamenb) {
        this.hematologiaExamena = hematologiaExamena;
        this.hematologiaExamenb = hematologiaExamenb;
    }
    public Hematologia(HematologiaExamena hematologiaExamena, HematologiaExamenb hematologiaExamenb, Pacientes pacientes, Doctores doctores, Date fecha, String celulasle, String gotagruesa, String plaquetas, String reticulocitos, String eritrosedimentacion, String fsangreperiferica, String observaciones) {
       this.hematologiaExamena = hematologiaExamena;
       this.hematologiaExamenb = hematologiaExamenb;
       this.pacientes = pacientes;
       this.doctores = doctores;
       this.fecha = fecha;
       this.celulasle = celulasle;
       this.gotagruesa = gotagruesa;
       this.plaquetas = plaquetas;
       this.reticulocitos = reticulocitos;
       this.eritrosedimentacion = eritrosedimentacion;
       this.fsangreperiferica = fsangreperiferica;
       this.observaciones = observaciones;
    }
   
    public int getIdhematologia() {
        return this.idhematologia;
    }
    
    public void setIdhematologia(int idhematologia) {
        this.idhematologia = idhematologia;
    }
    public HematologiaExamena getHematologiaExamena() {
        return this.hematologiaExamena;
    }
    
    public void setHematologiaExamena(HematologiaExamena hematologiaExamena) {
        this.hematologiaExamena = hematologiaExamena;
    }
    public HematologiaExamenb getHematologiaExamenb() {
        return this.hematologiaExamenb;
    }
    
    public void setHematologiaExamenb(HematologiaExamenb hematologiaExamenb) {
        this.hematologiaExamenb = hematologiaExamenb;
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
    public String getCelulasle() {
        return this.celulasle;
    }
    
    public void setCelulasle(String celulasle) {
        this.celulasle = celulasle;
    }
    public String getGotagruesa() {
        return this.gotagruesa;
    }
    
    public void setGotagruesa(String gotagruesa) {
        this.gotagruesa = gotagruesa;
    }
    public String getPlaquetas() {
        return this.plaquetas;
    }
    
    public void setPlaquetas(String plaquetas) {
        this.plaquetas = plaquetas;
    }
    public String getReticulocitos() {
        return this.reticulocitos;
    }
    
    public void setReticulocitos(String reticulocitos) {
        this.reticulocitos = reticulocitos;
    }
    public String getEritrosedimentacion() {
        return this.eritrosedimentacion;
    }
    
    public void setEritrosedimentacion(String eritrosedimentacion) {
        this.eritrosedimentacion = eritrosedimentacion;
    }
    public String getFsangreperiferica() {
        return this.fsangreperiferica;
    }
    
    public void setFsangreperiferica(String fsangreperiferica) {
        this.fsangreperiferica = fsangreperiferica;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}

