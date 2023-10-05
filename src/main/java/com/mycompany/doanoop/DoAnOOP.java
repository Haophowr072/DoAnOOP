/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doanoop;

/**
 *
 * @author Smilee
 */
public class DoAnOOP {

    public static void main(String[] args) {
        
        PhuongTien[] phuongtien = new PhuongTien[2];
        phuongtien[0]= new PhuongTien("99999", 4 ,"xe hoi");
        phuongtien[1]= new PhuongTien("77777", 2 , "xe may" );
        DanhSachPhuongTien danhsach = new DanhSachPhuongTien(phuongtien , phuongtien.length);  
       
        
        
        
        ThanhPho[] thanhpho = new ThanhPho[2];
        thanhpho[0]=new ThanhPho("Hồ Chí Minh" , "Nóng", "28" ,"Tiếng Việt", " 2/3/2023" , "12/3/2023");
        thanhpho[1]=new ThanhPho("Hà Nội" , "Nóng", "29" ,"Tiếng Việt", "5/6/2023" , "6/6/2023");
        DanhSachThanhPho pho = new DanhSachThanhPho(thanhpho , thanhpho.length);
        pho.showMenu();
        
      
    }
}
