package com.mycompany.doanoop;

import java.util.Scanner;
/**
 *
 * @author huy
 */
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
		System.out.println("Nhập tên : ");
		ten = sc.nextLine();
		System.out.println("Nhập khí hậu : ");
		khiHau = sc.nextLine();
		System.out.println("Nhập nhiệt độ : ");
		nhietDo = sc.nextLine();
		System.out.println("Nhập ngôn ngữ");
		ngonNgu = sc.nextLine();
		System.out.println("Nhập ngày đến : ");
		ngayDen = sc.nextLine();
		System.out.println("Nhập ngày đi : ");
		ngayDi = sc.nextLine();
	}
      
     public void xuat () {
    	 System.out.println(" Tên là : " + ten);
    	 System.out.println(" Khí hậu là : " + khiHau);
    	 System.out.println(" Nhiệt độ là : " + nhietDo);
    	 System.out.println(" Ngôn ngữ  : " + ngonNgu);
    	 System.out.println(" Ngày đến : " + ngayDen);
    	 System.out.println(" Ngày đi  : " + ngayDi);
     }
	

	}


