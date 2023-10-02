package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachPhuongTien implements DanhSach {
	PhuongTien dspt[];
	int soLuongpt ;
	
	public DanhSachPhuongTien() {
		int soLuongpt = 0;
		dspt = new PhuongTien[0];
	}

	public DanhSachPhuongTien(PhuongTien[] dspt, int soLuongpt) {
		this.dspt = dspt;
		this.soLuongpt = soLuongpt;
	}

	
	
	@Override
	public void them() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so luong phuong tien can them ");
		int so = sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<so ; i++) {
			dspt = Arrays.copyOf(dspt , soLuongpt+1);
			dspt[soLuongpt]= new PhuongTien();
			dspt[soLuongpt].nhap();
			soLuongpt++;
		}
		System.out.println(" Them thanh cong ");
			
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

	@Override
	public void xuat() {
		System.out.println("Danh sach phuong tien  ");
		for(int i=0; i<dspt.length;i++) {
			System.out.println("Danh sach phuong tien thu " + (i+1) + " la ");
			dspt[i].xuat();
			System.out.println("----------------------------------------");
		}
	}
	
	
	

}
