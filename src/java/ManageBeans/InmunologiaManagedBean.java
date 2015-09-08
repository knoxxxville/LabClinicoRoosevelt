/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.Inmunologia;
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
public class InmunologiaManagedBean {

    private String strPaciente;
    private String strDoctor;
    LabHelper helper;
    Inmunologia inmunologia;

    public InmunologiaManagedBean() {
        inmunologia = new Inmunologia();
        helper = new LabHelper();
    }

    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Operacion Exitosa !"));
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

    public Inmunologia getInmunologia() {
        return inmunologia;
    }

    public void setInmunologia(Inmunologia inmunologia) {
        this.inmunologia = inmunologia;
    }

}
