package com.mycompany.doanoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
    @Override
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
    public void datVe(){
        System.out.println ("\n------------Nhập thông tin thành viên---------------");
        System.out.print("Nhập số lượng thành viên muốn nhập: ");
        int k = sc.nextInt();
        dstv = Arrays.copyOf(dstv,n+k);
        for (int i=0;i<k;i++)
        {
            dstv[n+i]= new HanhKhach();
            dstv[n+i].nhap();

            System.out.println();
        }
        n+=k;
        System.out.println("-------------Đặt thành công-----------\n");
    }
    public void ghiFile(){
        try{
            FileWriter fw = new FileWriter("data.txt");
            fw.write(toString());
            fw.close();
            System.out.println("Xuất file thành công");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void docFile(){
        try{
            BufferedReader input = new BufferedReader(new FileReader("input.txt"));
            String line = input.readLine();
            while (line!=null){
                String[] arr = line.split(",");
                dstv = Arrays.copyOf(dstv, n+1);
                if(arr[0].equals("HK")){
                    dstv[n++] = new HanhKhach(arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7]);
                }else {
                    dstv[n++] = new HuongDanVien(arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7]);
                }
                line = input.readLine();
            }
            input.close();
            System.out.println("Đọc file thành công");
        }catch (Exception ex) {
            System.out.println(ex);
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
            System.out.println("6. Xuất file danh sách thành viên");
            System.out.println("7. Thêm danh sách thành viên mới từ file ");
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
                    ghiFile();
                    break;
                case 7:
                    docFile();
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
    public String toString() {
        String str;
        str = "Danh sách thành viên ";
        for(int i=0; i<dstv.length; i++){
            str+= "\n\nThành viên thứ "+(i+1) + ":";
            str+= dstv[i].toString();
        }
        return str;
    }
}
