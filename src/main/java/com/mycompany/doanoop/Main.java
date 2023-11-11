/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doanoop;

/**
 *
 * @author Smilee
 */
public class Main {

    public static void main(String[] args) {
        
        PhuongTien[] phuongtien = new PhuongTien[5];
        phuongtien[0]= new PhuongTien("99999", 4 ,"xe hơi");
        phuongtien[1]= new PhuongTien("77777", 2 , "xe máy" );
        phuongtien[2]= new PhuongTien("55555", 2 , "xe máy" );
        phuongtien[3]= new PhuongTien("66666", 2 , "xe máy" );
        phuongtien[4]= new PhuongTien("11111", 2 , "xe máy" );
        DanhSachPhuongTien danhsach = new DanhSachPhuongTien(phuongtien , phuongtien.length);  
       
       
        
        
        
        ThanhPho[] thanhpho = new ThanhPho[2];
        thanhpho[0]=new ThanhPho("Hồ Chí Minh" , "Nóng", "28" ,"Tiếng Việt");
        thanhpho[1]=new ThanhPho("Hà Nội" , "Nóng", "29" ,"Tiếng Việt" );
        DanhSachThanhPho pho = new DanhSachThanhPho(thanhpho , thanhpho.length);
        pho.showMenu();
      
    }
}
