package com.mycompany.doanoop;

import java.util.Scanner;

public class ConNguoi {
    private String id;
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private String sdt;
    private String CCCD;

    public ConNguoi(String id, String ten, String ngaySinh, String diaChi, String sdt, String CCCD) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.CCCD = CCCD;
    }

    public ConNguoi(String id) {
        this.id = id;
        this.ten = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.sdt = "";
        this.CCCD = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    /* PHƯƠNG THỨC NHẬP  */
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên");
        ten = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        diaChi = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        sdt = sc.nextLine();
        System.out.println("Nhập căn cước công dân");
        CCCD = sc.nextLine();
    }

    public void xuat(){
        System.out.println("ID : " + id);
        System.out.println("Họ tên:  " + ten);
        System.out.println("Ngày sinh:  " + ngaySinh);
        System.out.println("Địa chỉ:  " + diaChi);
        System.out.println("Số điện thoại:  " + sdt);
        System.out.println("Căn cước công dân:  " + CCCD);
    }

    @Override
    public String toString() {
        String str;
        str = "ID: " + id + "\nHọ tên: " + ten + "\nNgày sinh" + ngaySinh + "\nĐịa chỉ: " + "\nSố điện thoại: " + sdt + "\nCăn cước công dân: " + CCCD;
        return str;
    }
}
