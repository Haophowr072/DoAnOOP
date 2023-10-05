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
		System.out.println("Nhập số lượng cần thêm ");
		int so = sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<so ; i++) {
			dspt = Arrays.copyOf(dspt , soLuongpt+1);
			dspt[soLuongpt]= new PhuongTien();
			dspt[soLuongpt].nhap();
			soLuongpt++;
		}
		System.out.println(" Thêm thành công ");
		
	}

	public void xoa() {
		xuat();
		System.out.println(" Nhập biển số xe cần xóa ");
		String bienso =sc.nextLine(); 
		for(int i=0 ; i<soLuongpt ; i++) {
			if(dspt[i].getBienKiemSoat().equals(bienso)) {
				for(int j=i; j<soLuongpt-1; j++) {
					dspt[j]=dspt[j+1];
					dspt = Arrays.copyOf(dspt, soLuongpt-1);
				}
				System.out.println(" Xóa thành công ");
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
		System.out.println("MENU PHƯƠNG TIỆN");
		int chon=0;
		do {
			System.out.println("1. Thêm phương tiện ");
			System.out.println("2. Xóa phương tiện ");
			System.out.println("3. Sửa phương tiện ");
			System.out.println("4. Tìm kiếm phương tiện ");
			System.out.println("5. Xuất danh sách phương tiện ");
			System.out.println("6. Thoát ");
			System.out.println("Vui lòng chọn");
			chon = sc.nextInt();
			sc.nextLine();
			switch(chon){
				case 1:
					them();
					break;
					
				case 2:
					xoa();
					break;
					
				case 3 :
					sua();
					break;
					
				case 4:
					timKiem();
					break;
					
				case 5:
					xuat();
					break;
				case 6:
					return;
					
				default :
					System.out.println("Nhập sai !! vui lòng chọn lại ");
					break;
			}
		} while(chon!=0);
	}
}
