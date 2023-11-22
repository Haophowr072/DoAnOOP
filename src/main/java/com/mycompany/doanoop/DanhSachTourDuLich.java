package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachTourDuLich implements DanhSach {
    private TourDuLich tdl[];

    private int soLuong;

    public DanhSachTourDuLich(TourDuLich[] tdl, int soLuong) {
        this.tdl = tdl;
        this.soLuong = soLuong;
    }
    public DanhSachTourDuLich(){
        soLuong = 0;
        tdl = new TourDuLich[0];
    }
    public void them() {
        tdl = Arrays.copyOf(tdl, soLuong +1 );
        tdl[soLuong] = new TourDuLich();
        tdl[soLuong++].nhap();
    }


    public void xoa() {

    }

    public void sua() {
        System.out.println("Danh sách tour: ");
        for(int i=0; i<tdl.length; i++){
            System.out.println("Tour thứ " + (i+1)+ ":" + tdl[i].getTenTour());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn sửa tour thứ ");
        tdl[sc.nextInt()-1].showMenu();
    }


    public void timKiem() {

    }

    public void xuat(){
        System.out.println("\n-------Danh sách tour");
        for(int i=0;i<tdl.length;i++){
            System.out.println("Tour thứ " +(i+1)+ ": " + tdl[i].getTenTour());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn xem chi tiết tour thứ: ");
        tdl[sc.nextInt()-1].xuat();
    }

    public void xuatAll(){
        System.out.println("*************************************************");
        System.out.println("===========Danh sách tour du lịch===============");
        for(int i=0;i<tdl.length;i++){
            System.out.println("Tour " + (i+1) + ": ");
            tdl[i].xuat();
            System.out.println("\n*************************************************");
        }
    }

    public void datVe(){
        System.out.println("\n-------Danh sách tour");
        for(int i=0;i<tdl.length;i++){
            System.out.println("Tour thứ " +(i+1)+ ": " + tdl[i].getTenTour());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn đặt vé tour thứ: ");
        int k = sc.nextInt();
        if(k>tdl.length){
            System.out.println("Khong tim thay");
            return;
        }
        tdl[k-1].datVe();
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("==============Menu Danh Sach Tour Du Lich ===============");
            System.out.println("1. Thêm tour");
            System.out.println("2. Chỉnh sửa tour du lịch");
            System.out.println("3. Xóa tour");
            System.out.println("4. Tìm kiếm tour");
            System.out.println("5. Chi tiết tour du lịch");
            System.out.println("6. Xuất tất cả danh sách tour");
            System.out.println("7. Đặt vé tour ");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");
            x  = sc.nextInt();
            switch (x) {
                case 0:
                    break;
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
                    xuatAll();
                    break;
                case 7:
                    datVe();
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại: ");
                    break;
            }
        } while (x != 0);
    }

}
