/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import entities.*;
import java.util.*;
import DAO.*;
import org.hibernate.*;
import quanlyphongmach.Main;
/**
 *
 * @author Duong Python
 */
public class PhieuKhamBenhDao {
       public List<Phieukhambenh> findAll(){
      
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
         
            return sf.createCriteria(Phieukhambenh.class).list();
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        } finally{
            sf.close();
        }
        
    }
    
    public Phieukhambenh find(int stt){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
            
        return (Phieukhambenh) sf.get(Phieukhambenh.class, stt);
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        }finally{
            sf.close();
        }
        
    }
    
    public boolean delete(Phieukhambenh bn){
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
    
    public boolean save(Phieukhambenh bn){
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
    public boolean update(Phieukhambenh bn){
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
