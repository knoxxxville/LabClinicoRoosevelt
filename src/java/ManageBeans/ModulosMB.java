/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManageBeans;

import entities.Doctores;
import entities.LabHelper;
import entities.Pacientes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
        
        p.setNombre(nombreDoctor);
        p.setEdad(edadPaciente);
        helper.savePacientes(p);
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
