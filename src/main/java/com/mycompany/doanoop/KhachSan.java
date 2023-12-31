package com.mycompany.doanoop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	
	public KhachSan( String ten,String diaChi,String sao, String ngayDen, String ngayDi, int donGia) {
		super(idKS(), ten, diaChi, sao);
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
		System.out.println("Nhập ngày đến:");
		ngayDen=sc.nextLine();
		System.out.println("Nhập ngày đi:");
		ngayDi=sc.nextLine();
		System.out.println("Nhập đơn giá:");
		donGia=sc.nextInt();
		sc.nextLine();
				
	}
	
	public void xuat()
	{
		super.xuat();
		System.out.println("Ngày đến: " + ngayDen);
		System.out.println("Ngày đi: " + ngayDi);
		System.out.println("Đơn giá: " + donGia);

		
	}
	@Override
	public void tinhTien()
	{
		 try {
			Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
			Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
			long startValue = startDate.getTime();
			long endValue = endDate.getTime();
			long tinh = endValue - startValue;
			long result = tinh/(24*60*60*1000);
			System.out.println(" Tổng tiền : "+ (result*donGia) );
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	 @Override
	    public String toString() {
	        return super.toString() + "\nNgày đến: " + ngayDen + "\nNgày đi: " + ngayDi +"\nĐơn giá: "+ donGia;
	    }
}

