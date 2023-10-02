package com.mycompany.doanoop;

import java.util.Scanner;

public class ThanhPho {
      private String ten;
      private String khiHau;
      private String nhietDo;
      private String ngonNgu;
      private String ngayDen;
      private String ngayDi;
      
    public ThanhPho() {
    	this.ten = "";
		this.khiHau = "";
		this.nhietDo = "";
		this.ngonNgu = "";
		this.ngayDen = "";
		this.ngayDi = "";
    }
    
   
	public ThanhPho(String ten, String khiHau, String nhietDo, String ngonNgu, String ngayDen, String ngayDi) {
		this.ten = ten;
		this.khiHau = khiHau;
		this.nhietDo = nhietDo;
		this.ngonNgu = ngonNgu;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
	}
	

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getKhiHau() {
		return khiHau;
	}

	public void setKhiHau(String khiHau) {
		this.khiHau = khiHau;
	}

	public String getNhietDo() {
		return nhietDo;
	}

	public void setNhietDo(String nhietDo) {
		this.nhietDo = nhietDo;
	}

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public String getNgayDen() {
		return ngayDen;
	}

	public void setNgayDen(String ngayDen) {
		this.ngayDen = ngayDen;
	}

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}
	
	public void nhap () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten : ");
		ten = sc.nextLine();
		System.out.println("Nhap khi hau : ");
		khiHau = sc.nextLine();
		System.out.println("Nhap nhiet do : ");
		nhietDo = sc.nextLine();
		System.out.println("Nhap ngay den : ");
		ngayDen = sc.nextLine();
		System.out.println("Nhap ngay di : ");
		ngayDi = sc.nextLine();
	}
      
     public void xuat () {
    	 System.out.println(" Ten la : " + ten);
    	 System.out.println(" Khi hau la : " + khiHau);
    	 System.out.println(" Nhiet do la : " + nhietDo);
    	 System.out.println(" Ngon ngu  : " + ngonNgu);
    	 System.out.println(" Ngay den la : " + ngayDen);
    	 System.out.println(" Ngay di  : " + ngayDi);
     }
	

	}


