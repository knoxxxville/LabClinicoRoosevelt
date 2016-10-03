/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBeans;

import entities.LabHelper;
import entities.Orina;
import entities.OrinaFisicoQuimico;
import entities.OrinaMicroscopico;

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

    private String strPaciente;
    private String strDoctor;
    private String message;
    LabHelper helper;
    private Orina orina;
    private OrinaFisicoQuimico orinaFisicoQuimica;
    private OrinaMicroscopico orinaMicroscopico;

    public OrinaManagedBean() {
        orina = new Orina();
        orinaFisicoQuimica = new OrinaFisicoQuimico();
        orinaMicroscopico = new OrinaMicroscopico();
        helper = new LabHelper();

    }

    public void saveExamen() {

       
            orina.setPacientes(helper.getPacienteObject(strPaciente));
            orina.setDoctores(helper.getDoctorObject(strDoctor));
            helper.save(orina);

            orinaFisicoQuimica.setOrina(orina);
            helper.save(orinaFisicoQuimica);

            orinaMicroscopico.setOrina(orina);
            helper.save(orinaMicroscopico);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El examen se registro exitosamente !"));

           this.limpiarFormulario();
        

    }

   

    public void limpiarFormulario() {

        String limpiar = null;
        strDoctor = limpiar;
        strPaciente = limpiar;
        orina.setFecha(null);
        orina.setObservaciones(limpiar);
        orinaFisicoQuimica.setAspecto(limpiar);
        orinaFisicoQuimica.setBilirrubina(limpiar);
        orinaFisicoQuimica.setCetonas(limpiar);
        orinaFisicoQuimica.setColor(limpiar);
        orinaFisicoQuimica.setDensidad(limpiar);
        orinaFisicoQuimica.setGlucos(limpiar);
        orinaFisicoQuimica.setNitritos(limpiar);
        orinaFisicoQuimica.setPh(limpiar);
        orinaFisicoQuimica.setProteinas(limpiar);
        orinaFisicoQuimica.setSangre(limpiar);
        orinaFisicoQuimica.setUrobilinogeno(limpiar);
        orinaMicroscopico.setBacterias(limpiar);
        orinaMicroscopico.setCelepiteliales(limpiar);
        orinaMicroscopico.setCereos(limpiar);
        orinaMicroscopico.setCristales(limpiar);
        orinaMicroscopico.setEpiteliales(limpiar);
        orinaMicroscopico.setGranulosos(limpiar);
        orinaMicroscopico.setHematicos(limpiar);
        orinaMicroscopico.setHematies(limpiar);
        orinaMicroscopico.setHialinos(limpiar);
        orinaMicroscopico.setLeucocitarios(limpiar);
        orinaMicroscopico.setLeucocitos(limpiar);
        orinaMicroscopico.setMucoides(limpiar);

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
