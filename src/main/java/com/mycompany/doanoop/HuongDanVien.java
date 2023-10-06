package com.mycompany.doanoop;

import java.util.Scanner;

/**
 *
 * @author Hào
 */
public class HuongDanVien extends ConNguoi {
    private String kinhNghiem;
    private String ngayVaoLam;
    private static int idHDVCur = 1;

    public static String idHDV(){
        return "HDV" + (idHDVCur++);
    }

    public HuongDanVien(){
        super(idHDV());
        this.kinhNghiem = "";
        this.ngayVaoLam = "";
    }

    public HuongDanVien(String ten, String ngaySinh, String diaChi, String sdt, String CCCD, String kinhNghiem, String ngayVaoLam) {
        super(idHDV(), ten, ngaySinh, diaChi, sdt, CCCD);
        this.kinhNghiem = kinhNghiem;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kinh nghiệm ");
        kinhNghiem = sc.nextLine();
        System.out.println("Nhập ngày vào làm ");
        ngayVaoLam = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\nKinh nghiệm: " + kinhNghiem + "\nNgày vào làm: " + ngayVaoLam;
    }
}
