package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachPhuongTien implements DanhSach {
	private PhuongTien dspt[];
	private int soLuongpt ;
	Scanner sc = new Scanner(System.in);
	
	public DanhSachPhuongTien() {
		int soLuongpt = 0;
		dspt = new PhuongTien[0];
	}

	public DanhSachPhuongTien(PhuongTien[] dspt, int soLuongpt) {
		this.dspt = dspt;
		this.soLuongpt = soLuongpt;
	}

	

	public void them() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phuong tien can them ");
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

	public void xoa() {
		xuat();
		System.out.println(" Nhap bien so xe can xoa ");
		String bienso =sc.nextLine(); 
		for(int i=0 ; i<soLuongpt ; i++) {
			if(dspt[i].getBienKiemSoat().equals(bienso)) {
				for(int j=i; j<soLuongpt -1; j++) {
					dspt[j]=dspt[j+1];
					dspt = Arrays.copyOf(dspt, soLuongpt-1);
					System.out.println("Xoa thanh cong");
				}
				soLuongpt--;
				return;
			}
			
		}
		
		
	}

	public void sua() {
		xuat();
		System.out.println("Nhập biển số xe cần sửa");
		String bienso =sc.nextLine();
		for(int i=0; i<soLuongpt ; i++) {
			if(dspt[i].getBienKiemSoat().equals(bienso)) {
				dspt[i].nhap();
				System.out.println("Sửa thành công");
				return;
			}
		}
	}

	public void timKiem() {
		xuat();
		System.out.println("Nhập biển số xe cần tìm ");
		String bienso = sc.nextLine();
		for(int i=0 ; i<soLuongpt ; i++) {
			if(dspt[i].getBienKiemSoat().equals(bienso)) {
				dspt[i].xuat();
				return;
			}
		}
		
		
	}

	public void xuat() {
		if(dspt.length==0) {
			System.out.println("Danh sach phuong tien trong ");
		}
		else {
			System.out.println("Danh sach phuong tien ");
			for(int i = 0 ; i<soLuongpt ; i++) {
				System.out.println("Phuong tien thu  "  + (i+1) + " : ");
				System.out.println("Phuong tien co bien so xe : "+ dspt[i].getBienKiemSoat());
				System.out.println("So cho ngoi : "+ dspt[i].getSoChoNgoi());
				System.out.println("Loai phuong tien la : "+ dspt[i].getLoaiPhuongTien());
				System.out.println();
			}
		}
		
	}
	
	public void showMenu() {
		
		
		
	}

	

}
