package com.mycompany.doanoop;

import java.util.Scanner;
public class CoSoKinhDoanh {
	private String id;
	private String ten;
	private String diaChi;
	private String sao;
	
	public CoSoKinhDoanh(String id)
	{
		this.id = id;
		this.ten="";
		this.diaChi="";
		this.sao="";
	}
	public CoSoKinhDoanh(String id, String ten,String diaChi,String sao )
	{
		this.id = id;
		this.ten=ten;
		this.diaChi=diaChi;
		this.sao=sao;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSao() {
		return sao;
	}
	public void setSao(String sao) {
		this.sao = sao;
	}
	
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ten:");
		this.ten=sc.nextLine();
		System.out.println("Nhap dia chi:");
		this.diaChi=sc.nextLine();
		System.out.println("Nhap sao:");
		this.sao=sc.nextLine();
				
	}
	
	public void xuat()
	{
		System.out.println("ID: " + id);
		System.out.println("Ten: " + ten);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Ten: " + sao);

		
	}
	

}