package entities;
// Generated Apr 23, 2016 9:34:56 PM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * Dsbenhnhan generated by hbm2java
 */
public class Dsbenhnhan  implements java.io.Serializable {


     private String hoTen;
     private String gioiTinh;
     private Integer namSinh;
     private String diaChi;
     private Set phieukhambenhs = new HashSet(0);
     private Set dskhambenhs = new HashSet(0);

    public Dsbenhnhan() {
    }

	
    public Dsbenhnhan(String hoTen) {
        this.hoTen = hoTen;
    }
    public Dsbenhnhan(String hoTen, String gioiTinh, Integer namSinh, String diaChi, Set phieukhambenhs, Set dskhambenhs) {
       this.hoTen = hoTen;
       this.gioiTinh = gioiTinh;
       this.namSinh = namSinh;
       this.diaChi = diaChi;
       this.phieukhambenhs = phieukhambenhs;
       this.dskhambenhs = dskhambenhs;
    }
   
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Integer getNamSinh() {
        return this.namSinh;
    }
    
    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Set getPhieukhambenhs() {
        return this.phieukhambenhs;
    }
    
    public void setPhieukhambenhs(Set phieukhambenhs) {
        this.phieukhambenhs = phieukhambenhs;
    }
    public Set getDskhambenhs() {
        return this.dskhambenhs;
    }
    
    public void setDskhambenhs(Set dskhambenhs) {
        this.dskhambenhs = dskhambenhs;
    }




}


