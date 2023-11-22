package com.mycompany.doanoop;

import java.util.Scanner;

/**
 *
 * @author huy
 */
public class TourDuLich {
    private String tenTour = "";
    private String ngayDi = "";
    private String ngayVe = "";
    private int giaTien = 0;
    private String nguoiDat="";
    private DanhSachThanhVien dstv;
    private DanhSachPhuongTien dspt;
    private DanhSachThanhPho dstp;
    private DanhSachCoSoKinhDoanh dscskd;

    Scanner sc = new Scanner(System.in);
    public TourDuLich(){
        dspt = new DanhSachPhuongTien();
        dscskd = new DanhSachCoSoKinhDoanh();
        dstp = new DanhSachThanhPho();
        dstv = new DanhSachThanhVien();
    }

    public TourDuLich(String tenTour, String ngayDi, String ngayVe, int giaTien, String nguoiDat, DanhSachThanhVien dstv, DanhSachPhuongTien dspt, DanhSachThanhPho dstp, DanhSachCoSoKinhDoanh dscskd) {
        this.tenTour = tenTour;
        this.ngayDi = ngayDi;
        this.ngayVe = ngayVe;
        this.giaTien = giaTien;
        this.nguoiDat=nguoiDat;
        this.dstv = dstv;
        this.dspt = dspt;
        this.dstp = dstp;
        this.dscskd = dscskd;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void chinhSuaPT() {
        dspt.showMenu();
    }
    public void chinhSuaTP() {
        dstp.showMenu();
    }
    public void chinhSuaTV() {
        dstv.showMenu();
    }
    public void chinhSuaCSKD() {
        dscskd.showMenu();
    }

    public void nhap(){
        System.out.println("Tên tour du lịch");
        tenTour = sc.nextLine();
        System.out.println("Ngày đi");
        ngayDi = sc.nextLine();
        System.out.println("Ngày về ");
        ngayVe = sc.nextLine();
        System.out.println("Giá tiền tour du lịch");
        giaTien = sc.nextInt();
        sc.nextLine();

        dstv.them();
        dstp.them();
        dspt.them();
        dscskd.them();
    }

    public void xuat(){

        System.out.println("\nTên tour: " + tenTour);
        System.out.println("Ngày: " + ngayDi + " ~ " + ngayVe);
        dstv.xuat();
        dscskd.xuat();
        dstp.xuat();
        dspt.xuat();
        System.out.println("Người đặt vé: " + nguoiDat);
        System.out.println("------Giá tour: " + giaTien + "VND");
    }

    @Override
    public String toString(){
        String str = "Tên tour: " + tenTour + "\nNgày: " + ngayDi + " ~ " + ngayVe + "\n";
        str += dstv.toString() + dscskd.toString() + dstp.toString() + dspt.toString() + "\nNgười đặt vé: " + nguoiDat + "\n------Giá tour: " + giaTien + "\n";
        return str;
    }

    public void datVe(){
        dstv.datVe();
    }

    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================Menu chỉnh sửa tour du lịch====================");
        System.out.println("1. Chỉnh sửa thành phố");
        System.out.println("2. Chỉnh sửa cơ sở kinh doanh");
        System.out.println("3. Chỉnh sửa thành viên");
        System.out.println("4. Chỉnh sửa phương tiện");
        System.out.println("0. Thoát");
        System.out.printf("Vui lòng chọn:");
        switch (sc.nextInt()){
            case 0:
                return;
            case 1:
                chinhSuaTP();
                break;
            case 2:
                chinhSuaCSKD();
                break;
            case 3:
                chinhSuaTV();
                break;
            case 4:
                chinhSuaPT();
                break;
            default:
                System.out.println("Nhập sai vui lòng nhập lại");
                break;
        }
        showMenu();
    }
}
