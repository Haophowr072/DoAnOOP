package com.mycompany.doanoop;

import java.util.Scanner;

public class NhaHang extends CoSoKinhDoanh {
	private String id;
	private String ngay;
	private String combo;
	private String giaCombo;
	
	public static int idNH =1;
	public static String idNH() {
		return "NH" + (idNH++);
	}
	
	public NhaHang()
	{
		super(idNH());
	}

	public NhaHang(String ngay, String combo, String giaCombo) {
		super(idNH());
		this.ngay = ngay;
		this.combo = combo;
		this.giaCombo = giaCombo;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public String getCombo() {
		return combo;
	}

	public void setCombo(String combo) {
		this.combo = combo;
	}

	public String getGiaCombo() {
		return giaCombo;
	}

	public void setGiaCombo(String giaCombo) {
		this.giaCombo = giaCombo;
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ngay :");
		ngay=sc.nextLine();
		System.out.println("Nhap combo:");
		combo=sc.nextLine();
		System.out.println("Nhap gia combo:");
		giaCombo=sc.nextLine();
				
	}
	
	public void xuat()
	{
		super.xuat();
		System.out.println("Ngay: " + ngay);
		System.out.println("Combo: " + combo);
		System.out.println("Gia combo: " + giaCombo);

	}
	
}
