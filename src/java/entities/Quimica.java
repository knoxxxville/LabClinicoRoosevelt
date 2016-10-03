package entities;
// Generated 07-sep-2015 20:24:23 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Quimica generated by hbm2java
 */
public class Quimica  implements java.io.Serializable {


     private Integer idquimica;
     private Pacientes pacientes;
     private Doctores doctores;
     private Date fecha;

    public Quimica() {
    }

    public Quimica(Pacientes pacientes, Doctores doctores, Date fecha) {
       this.pacientes = pacientes;
       this.doctores = doctores;
       this.fecha = fecha;
    }
   
    public Integer getIdquimica() {
        return this.idquimica;
    }
    
    public void setIdquimica(Integer idquimica) {
        this.idquimica = idquimica;
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




}


