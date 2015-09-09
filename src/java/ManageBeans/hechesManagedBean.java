/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.Heces;
import entities.LabHelper;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author MacAlex
 */
@ManagedBean
@SessionScoped
public class hechesManagedBean {

    /**
     * Creates a new instance of hechesManagedBean
     */
    private String strPaciente;
    private String strDoctor;
    LabHelper helper;
    private Heces heces;

    public hechesManagedBean() {
        
        heces = new Heces();
        helper = new LabHelper();
    }

    public void save() {

        heces.setPacientes(helper.getPacienteObject(strPaciente));
        heces.setDoctores(helper.getDoctorObject(strDoctor));
        helper.save(heces);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El examen se registro exitosamente !"));
        this.limpiarFormulario();
    }
    
    

    public final void limpiarFormulario() {
        
        
        String limpiar = null;

        strPaciente = limpiar;
        strDoctor = limpiar;
        heces.setBacterias(limpiar);
        heces.setColor(limpiar);
        heces.setEritrocitos(limpiar);
        heces.setFecha(null);
        heces.setHuevos(limpiar);
        heces.setLarvas(limpiar);
        heces.setLeucocitos(limpiar);
        heces.setLevaduras(limpiar);
        heces.setMucus(limpiar);
        heces.setObservaciones(limpiar);
        heces.setOtros(limpiar);
        heces.setQuistes(limpiar);
        heces.setRamacro(limpiar);
        heces.setRamicro(limpiar);
        heces.setSangreoculta(limpiar);
        heces.setTrofozoitos(limpiar);

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

    public Heces getHeces() {
        return heces;
    }

    public void setHeces(Heces heces) {
        this.heces = heces;
    }

}
