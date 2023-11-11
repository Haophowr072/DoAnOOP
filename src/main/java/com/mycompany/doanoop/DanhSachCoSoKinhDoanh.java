package com.mycompany.doanoop;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachCoSoKinhDoanh implements DanhSach {
	private CoSoKinhDoanh[] cskd;
	private int n;
	Scanner sc=new Scanner(System.in);
	
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
		System.out.println("Nhap ma cskd can xoa: ");
		String ma= sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(cskd[i].getId().equals(ma)) {
				for(int j=i;j<n-1;j++)
				{
					cskd[j]=cskd[j+1];
					cskd= Arrays.copyOf(cskd, n-1);
				}
				n--;
			}
		}
		 System.out.println("Id kh tim thay" );
	     System.out.println();
		
	}

	@Override
	public void sua() {
		System.out.println("Nhap id cskd can sua: ");
		String ma=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(cskd[i].getId().equals(ma))
			{
				cskd[i].nhap();
				System.out.println("Sua thanh cong");
				return;
				
			}
			
		}
		System.out.println("Id kh tim thay" );
	    System.out.println();

		
	}

	@Override
	public void timKiem() {
		System.out.println("Nhap id can tim kiem: ");
		String ma =sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(cskd[i].getId().equals(ma))
			{
				System.out.println("Csdk can tim la: ");
				cskd[i].xuat();
				return;
			}
		}
		System.out.println("Id kh tim thay" );
	    System.out.println();
		
	}

	@Override
	public void showMenu() {
		System.out.println("Menu co so kinh doanh");
		
        int chon = 0;

        do {
            System.out.println("1. Thêm cskd ");
            System.out.println("2. Sửa cskd ");
            System.out.println("3. Xóa cskd ");
            System.out.println("4. Tìm kiếm cskd ");
            System.out.println("5. Xuất danh sách cskd ");
            System.out.println("6. Xuất file danh sách cskd");
            System.out.println("7. Thêm danh sách cskd mới từ file ");
            System.out.println("8. Thoát ");
            System.out.print("Vui lòng chọn :  ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    xuat();
                    break;
                case 6:
                   // ghiFile();
                    break;
                case 7:
                    //docFile();
                    break;
                case 8:
                    return;

                default:
                    System.out.println("Nhập sai !! Vui lòng nhập lại ");
                    break;
            }
        }while (n!=0);
		
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
