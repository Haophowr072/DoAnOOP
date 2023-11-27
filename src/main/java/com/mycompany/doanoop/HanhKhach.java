package com.mycompany.doanoop;

import java.util.Scanner;
/**
 *
 * @author Hào
 */

public class HanhKhach extends ConNguoi {
    private String loaiTV;
    private String diemTichLuy;
    private TourDuLich tourDuLich;
    private static String tourDat = "";
    private static int idHKCur = 1;

    public HanhKhach() {
        super(idHK());
        this.loaiTV = "";
        this.diemTichLuy = "";
    }

    public static String idHK(){
        return "HK" + (idHKCur++);
    }
    public HanhKhach( String ten, String ngaySinh, String diaChi, String sdt, String CCCD, String loaiTV, String diemTichLuy) {
        super(idHK(), ten, ngaySinh, diaChi, sdt, CCCD);
        this.loaiTV = loaiTV;
        this.diemTichLuy = diemTichLuy;
    }

    public String getLoaiTV() {
        return loaiTV;
    }

    public void setLoaiTV(String loaiTV) {
        this.loaiTV = loaiTV;
    }

    public String getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(String diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại thành viên ");
        loaiTV = sc.nextLine();
        System.out.println("Nhập điểm tích lũy");
        diemTichLuy = sc.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Loại thành viên: " + loaiTV);
        System.out.println("Điểm tích lũy: " + diemTichLuy);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLoại thành viên: " + loaiTV + "\nĐiểm tích lũy: " + diemTichLuy + "\nTour đã đặt: " + tourDat;
    }
}
