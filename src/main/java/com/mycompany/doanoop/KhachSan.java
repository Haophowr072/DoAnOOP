package com.mycompany.doanoop;

import java.util.Scanner;

public class KhachSan extends CoSoKinhDoanh {
	
	private String ngayDen;
	private String ngayDi;
	private int donGia;
	
	public static int idKS = 1;
	
	public static String idKS() {
		return "KS" + (idKS++);
	}
	
	public KhachSan()
	{
		super(idKS());
	}
	
	
	
	public KhachSan(String ngayDen, String ngayDi, int donGia) {
		super(idKS());
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.donGia = donGia;
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
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ngay den:");
		this.ngayDen=sc.nextLine();
		System.out.println("Nhap ngay di:");
		this.ngayDi=sc.nextLine();
		System.out.println("Nhap don gia:");
		int donGia=sc.nextInt();
		sc.nextLine();
				
	}
	
	public void xuat()
	{
		super.xuat();
		System.out.println("Ngay den: " + ngayDen);
		System.out.println("Ngay di: " + ngayDi);
		System.out.println("Don gia: " + donGia);

		
	}
}

