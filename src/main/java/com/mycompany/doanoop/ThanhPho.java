package com.mycompany.doanoop;

import java.util.Scanner;

public class ThanhPho {
      private String ten;
      private String khiHau;
      private String nhietDo;
      private String ngonNgu;

    public ThanhPho() {
    	this.ten = "";
		this.khiHau = "";
		this.nhietDo = "";
		this.ngonNgu = "";
		
    }
    
   
	public ThanhPho(String ten, String khiHau, String nhietDo, String ngonNgu) {
		this.ten = ten;
		this.khiHau = khiHau;
		this.nhietDo = nhietDo;
		this.ngonNgu = ngonNgu;
		
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

	
	public void nhap () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên : ");
		ten = sc.nextLine();
		System.out.println("Nhập khí hậu : ");
		khiHau = sc.nextLine();
		System.out.println("Nhập nhiệt độ : ");
		nhietDo = sc.nextLine();
		System.out.println("Nhập ngôn ngữ");
		ngonNgu = sc.nextLine();
	}
      
     public void xuat () {
    	 System.out.println(" Tên là : " + ten);
    	 System.out.println(" Khí hậu là : " + khiHau);
    	 System.out.println(" Nhiệt độ là : " + nhietDo);
    	 System.out.println(" Ngôn ngữ  : " + ngonNgu);
     }
	

	}


