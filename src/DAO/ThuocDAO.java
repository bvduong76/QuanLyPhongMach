/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import entities.*;
import DAO.*;
import java.util.*;
import org.hibernate.*;
import quanlyphongmach.Main;
/**
 *
 * @author Duong Python
 */
public class ThuocDAO {
    public List<Thuoc> findAll(){
      
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
         
            return sf.createCriteria(Thuoc.class).list();
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        } finally{
            sf.close();
        }
        
    }
    
    public Thuoc find(String name){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
            
        return (Thuoc) sf.get(Thuoc.class, name);
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        }finally{
            sf.close();
        }
        
    }
    
    public boolean delete(Thuoc bn){
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
    
    public boolean save(Thuoc bn){
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
    public boolean update(Thuoc bn){
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
