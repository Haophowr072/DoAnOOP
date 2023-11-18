/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doanoop;

import java.util.Scanner;

/**
 *
 * @author huy
 */
public class PhuongTien {
    private String bienKiemSoat;
    private int soChoNgoi;
    private String loaiPhuongTien;
    
    public PhuongTien() {
        this.bienKiemSoat = "" ;
        this.soChoNgoi = 0 ;
        this.loaiPhuongTien = "";
    }
 
 
    public PhuongTien(String bienKiemSoat, int soChoNgoi, String loaiPhuongTien) {
        this.bienKiemSoat = bienKiemSoat;
        this.soChoNgoi = soChoNgoi;
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập biển kiểm soát ");
        bienKiemSoat = sc.nextLine() ;
        System.out.println(" Nhập số chỗ ngồi ");
        soChoNgoi = sc.nextInt() ;
        sc.nextLine();
        System.out.println(" Nhập loại phương tiện ");
        loaiPhuongTien = sc.nextLine() ;
    }
    
    public void xuat(){
        System.out.println("Biển kiểm soát  : " + bienKiemSoat );
        System.out.println("Số chỗ ngồi  : " + soChoNgoi );
        System.out.println("Loại phương tiện : " + loaiPhuongTien );
    }
    
    public String toString() {
		return "\n Biển kiểm soát : " + bienKiemSoat + "\n Số chỗ ngồi " + soChoNgoi + "\n Loại phương tiện " + loaiPhuongTien  ;
	}
}


