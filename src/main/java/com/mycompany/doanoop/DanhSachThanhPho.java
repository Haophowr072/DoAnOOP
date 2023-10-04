package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachThanhPho implements DanhSach{
	private ThanhPho dstp[];
	private int soLuongtp;
	Scanner sc = new Scanner(System.in);
	
	public DanhSachThanhPho( ) {
		dstp = new ThanhPho[0];
		int soLuongtp = 0;
		
	}
	
	
	public DanhSachThanhPho(ThanhPho[] dstp, int soLuongtp ) {
		this.dstp = dstp;
		this.soLuongtp = soLuongtp;
		
	}


	@Override
	public void them() {
		System.out.println("Số lượng thành phố cần thêm");
		String so = sc.nextLine();
		for(int i=0 ; i<so.length() ; i++) {
			dstp = Arrays.copyOf(dstp , soLuongtp+1);
			dstp[soLuongtp]= new ThanhPho();
			dstp[soLuongtp].nhap();
			soLuongtp++;
		}
		
	}


	@Override
	public void xoa() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sua() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void timKiem() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
	}


	public void xuat() {
		if(dstp.length==0) {
			System.out.println("Danh sach phuong tien trong ");
		}
		else {
			System.out.println("Danh sach phuong tien ");
			for(int i = 0 ; i<soLuongtp ; i++) {
				System.out.println("Thành phố thứ  "  + (i+1) + " : ");
				System.out.println("Tên thành phố : "+ dstp[i].getTen());
				System.out.println("Khí hậu : "+ dstp[i].getKhiHau());
				System.out.println("Nhiệt độ : "+ dstp[i].getNhietDo());
				System.out.println("Ngôn ngữ : "+ dstp[i].getNgonNgu());
				System.out.println("Ngày đến : "+ dstp[i].getNgayDen());
				System.out.println("Ngày đi: "+ dstp[i].getNgayDi());
				System.out.println();
			}
		}
		
	}
	
	
	

}
