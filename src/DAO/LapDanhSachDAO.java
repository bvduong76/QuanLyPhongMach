/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Dskhambenh;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import quanlyphongmach.Main;

/**
 *
 * @author Duong Python
 */
public class LapDanhSachDAO {
    public List<Dskhambenh> findAll(){
      
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
         
            return sf.createCriteria(Dskhambenh.class).list();
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        } finally{
            sf.close();
        }
        
    }
    public Dskhambenh find(int bn){
        Session sf = HibernateUtil.getSessionFactory().openSession();
        try{
            
        return (Dskhambenh) sf.get(Dskhambenh.class, bn);
        }catch (HibernateException e)
        {
            Main.date = new Date();
             Main.addLog(Main.dateFormat.format(Main.date) + e.toString());
            return null;
        }finally{
            sf.close();
        }
        
    }
    
        
    
    
    public boolean delete(Dskhambenh bn){
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
    
    public boolean save(Dskhambenh bn){
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
    public boolean update(Dskhambenh bn){
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
