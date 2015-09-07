/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.Bacteriologia;
import entities.Doctores;
import entities.LabHelper;
import entities.Pacientes;
import java.util.ArrayList;
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
public class BactereologiaManagedBean {

    private List<Bacteriologia> bactereologias = new ArrayList<Bacteriologia>();
    private Bacteriologia bac;
    private Pacientes paciente;
    private Doctores doctor;
    private String strPaciente;
    private String strDoctor;
  
    private List<Bacteriologia> filteredBactereologias = new ArrayList<Bacteriologia>();
    LabHelper helper;

    public BactereologiaManagedBean() {
        bac = new Bacteriologia();
        paciente = new Pacientes();

        helper = new LabHelper();
        bactereologias = helper.getExamnesBactereologia();

    }

    public void save() {

       
        bac.setPacientes(helper.getPacienteObject(strPaciente));
        bac.setDoctores(helper.getDoctorObject(strDoctor));
        helper.saveExamenBactereologia(bac);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El examen se registro exitosamente !"));
        
    }

    

    public String getStrDoctor() {
        return strDoctor;
    }

    public void setStrDoctor(String strDoctor) {
        this.strDoctor = strDoctor;
    }

    
    public String getStrPaciente() {
        return strPaciente;
    }

    public void setStrPaciente(String strPaciente) {
        this.strPaciente = strPaciente;
    }

    public List<Bacteriologia> getBactereologias() {
        return bactereologias;
    }

    public void setBactereologias(List<Bacteriologia> bactereologias) {
        this.bactereologias = bactereologias;
    }

    public List<Bacteriologia> getFilteredBactereologias() {
        return filteredBactereologias;
    }

    public void setFilteredBactereologias(List<Bacteriologia> filteredBactereologias) {
        this.filteredBactereologias = filteredBactereologias;
    }

    public Bacteriologia getBac() {
        return bac;
    }

    public void setBac(Bacteriologia bac) {
        this.bac = bac;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

}
