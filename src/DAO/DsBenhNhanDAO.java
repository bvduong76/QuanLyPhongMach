/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.*;
import entities.*;
import java.io.Serializable;
import org.hibernate.*;
import quanlyphongmach.*;
/**
 *
 * @author Duong Python
 */
public class DsBenhNhanDAO {
    
    public List<Dsbenhnhan> findAll(){
      
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
         
            return sf.createCriteria(Dsbenhnhan.class).list();
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        } finally{
            sf.close();
        }
        
    }
    
    public Dsbenhnhan find(String name){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
            
        return (Dsbenhnhan) sf.get(Dsbenhnhan.class, name);
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        }finally{
            sf.close();
        }
        
    }
    
    public boolean delete(Dsbenhnhan bn){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try {
            sf.beginTransaction();
            sf.delete(bn);
            sf.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            sf.getTransaction().rollback();
            return false;
        }
    }
    
    public boolean save(Dsbenhnhan bn){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try {
            sf.beginTransaction();
            sf.save(bn);
            sf.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            sf.getTransaction().rollback();
            return false;
        }
    }
    public boolean update(Dsbenhnhan bn){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try {
            sf.beginTransaction();
            sf.update(bn);
            sf.getTransaction().commit();
            return true;
        } catch (Exception e) {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            sf.getTransaction().rollback();
            return false;
        }
    }
}
