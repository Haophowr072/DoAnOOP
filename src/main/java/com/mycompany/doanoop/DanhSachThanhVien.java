package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachThanhVien implements DanhSach{
    private ConNguoi[] dstv;
    private int n;

    Scanner sc = new Scanner(System.in);
    public DanhSachThanhVien(){
        int n = 0;
        dstv = new ConNguoi[0];
    }

    public DanhSachThanhVien(ConNguoi[] dstv, int n) {
        this.dstv = dstv;
        this.n = n;
    }

    /*  HÀM DÙNG CHUNG  */

    public void setup(int i, ConNguoi[] dstv){
        System.out.println("1. Hành khách \n2. Hướng dẫn viên");
        int chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1:
                dstv[i] = new HanhKhach();
                dstv[i].nhap();
                break;
            case 2:
                dstv[i] = new HuongDanVien();
                dstv[i].nhap();
                break;

            default:
                System.out.println("Nhập sai! Vui lòng nhập lại ");
                setup(i,dstv);
                break;
        }
    }

    public void xuat() {
        System.out.println("Danh sách thành viên ");
        for(int i=0; i<n; i++){
            System.out.println("Thành viên thứ " + (i+1) + ":");
            dstv[i].xuat();
            System.out.println("=====================");
        }
    }

    public void them() {
        System.out.println("Nhập số lượng thành viên muốn thêm ");
        int so = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<so; i++){
            dstv = Arrays.copyOf(dstv, n+1);
            setup(i, dstv);
            System.out.println("Thêm thành công");
            n++;
        }
    }


    public void xoa() {
        xuat();
        System.out.println("Nhập mã thành viên cần xóa ");
        String so = sc.nextLine();
        for(int i=0; i<n; i++){
            if(dstv[i].getId().equals(so)){
                for(int j=i; j<n-1; j++){
                    dstv[j] = dstv[j+1];
                    dstv = Arrays.copyOf(dstv, n-1);
                }
                n--;
                System.out.println("----------Xóa thành công-----------");
                return;
            }

        }
        System.out.println("Không tìm thấy ID " + so );
        System.out.println();
    }


    public void sua() {
        xuat();
        System.out.println("Nhập ID thành viên cần sửa");
        String so = sc.nextLine();
        for(int i=0; i<n; i++){
            if(dstv[i].getId().equals(so)){
                setup(i, dstv);
                System.out.println("Sửa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy ID " + so);
        System.out.println();
    }


    public void timKiem() {
        System.out.print("Nhập ID cần tìm:  ");
        String so = sc.nextLine();
        for(int i=0; i<n; i++){
            if(dstv[i].getId().equals(so)){
                System.out.println("Thành viên cần tìm là ");
                dstv[i].xuat();
                return;
            }
        }
    }


    public void showMenu() {
        System.out.println("Menu thành viên");
        int chon = 0;

        do {
            System.out.println("1. Thêm thành viên ");
            System.out.println("2. Sửa thành viên ");
            System.out.println("3. Xóa thành viên ");
            System.out.println("4. Tìm kiếm thành viên ");
            System.out.println("5. Xuất danh sách thành viên ");
            System.out.println("6. Thoát ");
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
                    return;

                default:
                    System.out.println("Nhập sai !! Vui lòng nhập lại ");
                    break;
            }
        }while (n!=0);
    }


    public String toString() {
        String str;
        str = "Danh sách thành viên ";
        for(int i=0; i<n; i++){
            str+= "\n\n Thành viên thứ "+(i+1) + ":";
            str+= dstv[i].toString();
        }
        return str;
    }
}
