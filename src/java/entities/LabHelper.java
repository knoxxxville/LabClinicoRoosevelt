/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author MacAlex
 */
public class LabHelper {

    Session session = null;
    String selectDoctores = "from Doctores b";
    String selectPacientes = "from Pacientes b";
    String selectBateriologia = "from Bacteriologia b order by b.idbacteriologia desc";

    public LabHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Bacteriologia> getExamnesBactereologia() {
        List<Bacteriologia> examList = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery(selectBateriologia);
            examList = (List<Bacteriologia>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return examList;
    }

    public List<Pacientes> getPacientes() {
        List<Pacientes> lista = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery(selectPacientes);
            lista = (List<Pacientes>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return lista;
    }

    public List<Doctores> getDoctores() {
        List<Doctores> lista = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery(selectDoctores);
            lista = (List<Doctores>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return lista;
    }

    public List<String> QueryPacientesByName(String nombre) {

        List<String> resultList = new ArrayList<>();
        List<Pacientes> listaPacientes = this.getPacientes();

        for (Pacientes item : listaPacientes) {
            String codigoNombreMayuscula = (item.getIdpaciente() + " : " + item.getNombre()).toUpperCase();
            String codigoNombre = item.getIdpaciente() + " : " + item.getNombre();
            if (codigoNombreMayuscula.contains(nombre)) {
                System.out.println("SE AGREGARA UN REGISTRO A LA LISTA: " + item.getNombre());
                resultList.add(codigoNombre);
            }

        }

        return resultList;
    }

    public List<String> QueryDoctoresByName(String nombre) {

        List<String> resultList = new ArrayList<>();
        List<Doctores> listaDoctores = this.getDoctores();

        for (Doctores item : listaDoctores) {
            String codigoNombreMayuscula = (item.getIddoctor() + " : " + item.getNombre()).toUpperCase();
            String codigoNombre = item.getIddoctor() + " : " + item.getNombre();
            if (codigoNombreMayuscula.contains(nombre)) {
                System.out.println("SE AGREGARA UN REGISTRO A LA LISTA: " + item.getNombre());
                resultList.add(codigoNombre);
            }

        }

        return resultList;
    }

    public void saveExamenBactereologia(Bacteriologia bac) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(bac);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void savePacientes(Pacientes o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            System.out.println("[LOG]Nombre:" + o.getNombre() + " Edad:" + o.getEdad());
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void saveOrina(Orina o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
     public void saveHeces(Heces o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
      public void saveOrinaFisicoQuimico(OrinaFisicoQuimico o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
       public void saveOrinaMicroscopico(OrinaMicroscopico o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void saveDoctores(Doctores o) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            System.out.println("[LOG]" + o.getNombre());
            session.save(o);
            tx.commit();
            System.out.println("[LOG]Records inserted sucessessfully");
        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Pacientes getPacienteObject(String strPaciente) {

        //Se obtiene el id del paciente
        String[] parametros;
        parametros = strPaciente.split(":");
        Pacientes p = new Pacientes();
        p.setIdpaciente(Integer.parseInt(parametros[0].toString().trim()));

        return p;
    }

    public Doctores getDoctorObject(String strDoctor) {
        //Se obtiene el id del doctor
        String[] parametros;
        parametros = strDoctor.split(":");
        Doctores d = new Doctores();
        d.setIddoctor(Integer.parseInt(parametros[0].toString().trim()));
        return d;
    }
}
