/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.Hematologia;
import entities.HematologiaExamena;
import entities.HematologiaExamenb;
import entities.LabHelper;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author MacAlex
 */
@ManagedBean
@SessionScoped
public class hematologiaManagedBean {

    private String strPaciente;
    private String strDoctor;
    LabHelper helper;
    Hematologia hematologia;
    HematologiaExamena hematologiaA;
    HematologiaExamenb hematologiaB;

    public hematologiaManagedBean() {
        hematologiaA = new HematologiaExamena();
        hematologiaB = new HematologiaExamenb();
        hematologia = new Hematologia();
    }

    public void save() {
        hematologia.setPacientes(helper.getPacienteObject(strPaciente));
        hematologia.setDoctores(helper.getDoctorObject(strDoctor));

        helper.save(hematologia);
        
        
        hematologiaA.setHematologia(hematologia);
        helper.save(hematologiaA);
        
        hematologiaB.setHematologia(hematologia);
        helper.save(hematologiaB);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Operacion Exitosa !"));
        this.limpiarFormulario();
    }

    public void limpiarFormulario() {
        String limpiar = null;
        strPaciente = null;
        strDoctor = null;
        hematologia.setCelulasle(limpiar);
        hematologia.setEritrosedimentacion(limpiar);
        hematologia.setFecha(null);
        hematologia.setFsangreperiferica(limpiar);
        hematologia.setGotagruesa(limpiar);
        hematologia.setObservaciones(limpiar);
        hematologia.setPlaquetas(limpiar);
        hematologia.setReticulocitos(limpiar);
        hematologiaA.setBhcm(limpiar);
        hematologiaA.setGlobrojo(limpiar);
        hematologiaA.setHcm(limpiar);
        hematologiaA.setHematrocitos(limpiar);
        hematologiaA.setHemoglobina(limpiar);
        hematologiaA.setVcm(limpiar);
        hematologiaB.setBasofilos(limpiar);
        hematologiaB.setEosinofilos(limpiar);
        hematologiaB.setGlobblancos(limpiar);
        hematologiaB.setLinfocitos(limpiar);
        hematologiaB.setMonocitos(limpiar);
        hematologiaB.setNeutrofiliosbanda(limpiar);
        hematologiaB.setNeutrofiliossegmen(limpiar);

    }

    public String getStrPaciente() {
        return strPaciente;
    }

    public void setStrPaciente(String strPaciente) {
        this.strPaciente = strPaciente;
    }

    public String getStrDoctor() {
        return strDoctor;
    }

    public void setStrDoctor(String strDoctor) {
        this.strDoctor = strDoctor;
    }

    public Hematologia getHematologia() {
        return hematologia;
    }

    public void setHematologia(Hematologia hematologia) {
        this.hematologia = hematologia;
    }

    public HematologiaExamena getHematologiaA() {
        return hematologiaA;
    }

    public void setHematologiaA(HematologiaExamena hematologiaA) {
        this.hematologiaA = hematologiaA;
    }

    public HematologiaExamenb getHematologiaB() {
        return hematologiaB;
    }

    public void setHematologiaB(HematologiaExamenb hematologiaB) {
        this.hematologiaB = hematologiaB;
    }

    
}
