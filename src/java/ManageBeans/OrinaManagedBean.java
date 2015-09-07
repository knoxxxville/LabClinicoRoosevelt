/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.Doctores;
import entities.LabHelper;
import entities.Orina;
import entities.OrinaFisicoQuimico;
import entities.OrinaMicroscopico;
import entities.Pacientes;
import java.util.List;
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
public class OrinaManagedBean {

    private Pacientes paciente;
    private Doctores doctor;
    private String strPaciente;
    private String strDoctor;
    String[] parametros;
    LabHelper helper;
    Orina orina;
    OrinaFisicoQuimico orinaFisicoQuimica;
    OrinaMicroscopico orinaMicroscopico;

    public OrinaManagedBean() {
        orina = new Orina();
        paciente = new Pacientes();

        helper = new LabHelper();

    }

    public void saveExamen() {
        orina.setPacientes(helper.getPacienteObject(strPaciente));
        orina.setDoctores(helper.getDoctorObject(strDoctor));
        helper.saveOrina(orina);
        
       
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El examen se registro exitosamente !"));

        
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
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

    public Orina getOrina() {
        return orina;
    }

    public void setOrina(Orina orina) {
        this.orina = orina;
    }

    public OrinaFisicoQuimico getOrinaFisicoQuimica() {
        return orinaFisicoQuimica;
    }

    public void setOrinaFisicoQuimica(OrinaFisicoQuimico orinaFisicoQuimica) {
        this.orinaFisicoQuimica = orinaFisicoQuimica;
    }

    public OrinaMicroscopico getOrinaMicroscopico() {
        return orinaMicroscopico;
    }

    public void setOrinaMicroscopico(OrinaMicroscopico orinaMicroscopico) {
        this.orinaMicroscopico = orinaMicroscopico;
    }
    
    

}
