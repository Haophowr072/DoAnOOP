package com.mycompany.doanoop;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachCoSoKinhDoanh implements DanhSach {
	private CoSoKinhDoanh[] cskd;
	private int n;
	
	public DanhSachCoSoKinhDoanh()
	{
		n=0;
		cskd=new CoSoKinhDoanh[0];
	}

	public DanhSachCoSoKinhDoanh(CoSoKinhDoanh[] cskd, int n) {
		this.cskd = cskd;
		this.n = n;
	}

	public void setup(int i, CoSoKinhDoanh[] cskd)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Khach san \n2. Nha Hang");
		int chon = sc.nextInt();
		switch (chon) {
		case 1:
			cskd[i]=new KhachSan();
			cskd[i].nhap();
			break;
		case 2:
			cskd[i]=new NhaHang();
			cskd[i].nhap();
			break;
		default: 
			System.out.println("Nhap sai vui long nhap lai ");
			setup(i,cskd);
			break;
		}
	}
	@Override
	public void them() {
		System.out.println("So luong cskd muon them");
		Scanner sc=new Scanner(System.in);
		int so= sc.nextInt();
		sc.nextLine();
		for(int i=0; i<so;i++)
		{
			cskd=Arrays.copyOf(cskd, n+1);
			setup(i, cskd);
			System.out.println("Them thanh cong");
			n++;
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

	@Override
	public void xuat() {
		System.out.println("Danh sach cskd");
		for(int i=0;i<n;i++)
		{
			cskd[i].xuat();
			System.out.println();
		}
		
	}
	
	
	
	
}
