/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManageBeans;

import entities.Doctores;
import entities.LabHelper;
import entities.Pacientes;
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
public class ModulosMB {

    /**
     * Creates a new instance of ModulosMB
     */
    private Pacientes p;
    private Doctores d;
    
    private String nombrePaciente;
    private String nombreDoctor;
    private String edadPaciente;
    
    LabHelper helper;

    public ModulosMB() {
        
        helper = new LabHelper();
       
    }
    
    public void saveDoctores() {
        d = new Doctores();
        d.setNombre(nombreDoctor);
        
        helper.saveDoctores(d);
    }
    
    public void savePaciente() {
        p = new Pacientes();
        
        p.setNombre(nombrePaciente);
        p.setEdad(edadPaciente);
        helper.savePacientes(p);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Operacion exitosa!"));
    }
    
    public Pacientes getP() {
        return p;
    }
    
    public void setP(Pacientes p) {
        this.p = p;
    }
    
    public Doctores getD() {
        return d;
    }
    
    public void setD(Doctores d) {
        this.d = d;
    }
    
    public String getNombrePaciente() {
        return nombrePaciente;
    }
    
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    
    public String getNombreDoctor() {
        return nombreDoctor;
    }
    
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    
    public String getEdadPaciente() {
        return edadPaciente;
    }
    
    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }
    
}
