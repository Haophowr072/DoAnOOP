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
		xuat();
		System.out.println("Nhập thành phố cần xóa");
		String thanhpho =sc.nextLine();
		for(int i=0 ; i<soLuongtp ; i++) {
			if(dstp[i].getTen().equals(thanhpho)) {
				for(int j=i; j<soLuongtp-1 ;j++) {
					dstp[j] = dstp[j+1];
					dstp = Arrays.copyOf( dstp, soLuongtp-1) ;
				}
				System.out.println("Xóa thành công");
				soLuongtp--;
				return;
			}
		}
		
	}


	@Override
	public void sua() {
		xuat();
		System.out.println("Nhập thành phố cần sửa");
		String thanhpho =sc.nextLine();
		for(int i=0; i<soLuongtp ; i++) {
			if(dstp[i].getTen().equals(thanhpho)) {
				dstp[i].nhap();
				System.out.println("Sửa thành công");
				return;
			}
		}
	}


	@Override
	public void timKiem() {
		System.out.println("Nhập thành phố cần tìm");
		String thanhpho = sc.nextLine();
		for(int i=0 ; i<soLuongtp; i++) {
			if(dstp[i].getTen().equals(thanhpho)) {
			dstp[i].xuat();
			return;
			}
		}
		
	}


	@Override
	



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
	
	public void showMenu() {
		System.out.println("MENU THÀNH PHỐ");
		int chon=0;
		do {
			System.out.println("1. Thêm thành phố ");
			System.out.println("2. Xóa thành phố ");
			System.out.println("3. Sửa thành phố ");
			System.out.println("4. Tìm kiếm thành phố ");
			System.out.println("5. Xuất danh sách thành phố ");
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
