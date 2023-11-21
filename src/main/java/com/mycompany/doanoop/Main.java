
package com.mycompany.doanoop;

import java.util.Scanner;

/**
 * @author Hào
 */
public class Main {

    public static void main(String[] args) {
		TourDuLich tdl[] = new TourDuLich[5];
		//Co so kinh doanh
		CoSoKinhDoanh cskd1[] = new CoSoKinhDoanh[3];
		cskd1[0] = new NhaHang("Memory Đà Lạt","24B đường Hùng Vương, Phường 10, Tp Đà Lạt","4 Sao","Gia Dinh 4 Nguoi","24/11/2023",500000);
		cskd1[1] = new NhaHang("The Thai Cuisine","74 Yersin, phường 10, TP Đà Lạt","5 Sao","Mot Nguoi","24/11/2023",120000);
		cskd1[2] = new KhachSan("De La Sol Villa Đà Lạt","91 Đường Hùng Vương, Phường 11, Đà Lạt","3 Sao","23/11/2023","26/11/2023",400000);
		DanhSachCoSoKinhDoanh dscskd1 = new DanhSachCoSoKinhDoanh(cskd1,cskd1.length);

		ThanhPho tp1[] = new ThanhPho[1];
		tp1[0] = new ThanhPho("TP. Đà Lạt","Lạnh","16 doC","Tiếng việt");
		DanhSachThanhPho dstp1 = new DanhSachThanhPho(tp1,tp1.length);

		ConNguoi[] cn1 = new ConNguoi[5];
		cn1[0] = new HanhKhach("Nguyễn Hoàng","11/10/1998","Ho Chi Minh","0987654321","985161635","VIP","18");
		cn1[1] = new HanhKhach("Hoàng Thanh","18/02/1995","Ha Noi","0987654123","231551623","TV","10");
		cn1[2] = new HanhKhach("Thành Nguyễn","16/04/1993","Ha Noi","0987665544","526846231","TV","12");
		cn1[3] = new HanhKhach("Nguyễn Trân","28/09/1994","Ho Chi Minh","0988877755","135186486","VIP","14");
		cn1[4] = new HuongDanVien("Trung Trần","12/03/1989","Ho Chi Minh","0923456789","21616556","3 nam","12/03/1986");
		DanhSachThanhVien dstv1 = new DanhSachThanhVien(cn1,cn1.length);

		PhuongTien pt1[] = new PhuongTien[2];
		pt1[0] = new PhuongTien("F9-2012",2,"Xe may");
		pt1[1] = new PhuongTien("51A-28888",4,"Xe hoi");
		DanhSachPhuongTien dspt1 = new DanhSachPhuongTien(pt1,pt1.length);

		tdl[0] = new TourDuLich("Buu Long","23/12/2021","24/12/2021",9890000,dstv1,dspt1,dstp1,dscskd1);



		CoSoKinhDoanh cskd2[] = new CoSoKinhDoanh[5];
		cskd2[0] = new NhaHang("Tan Pham","253 Ly Thai To, Quan 5, TPHCM","5 Sao","Gia Dinh 5 Nguoi","20/12/2021",400000);
		cskd2[1] = new NhaHang("Huu Chien","144 Au Co, Quan Tan Binh, TPHCM","4 Sao","Gia Dinh 4 Nguoi","21/12/2021",480000);
		cskd2[2] = new NhaHang("Quan Tran","20 An Duong Vuong, Quan 5, TPHCM","5 Sao","Mot Nguoi","22/12/2021",200000);
		cskd2[3] = new KhachSan("Le Na","332 Ba Thang Hai, Quan 5, TPHCM","5 Sao","20/12/2021","21/12/2021",680000);
		cskd2[4] = new KhachSan("Doan Duy","23 Ly Thuong Kiet, Quan 5, TPHCM","4 Sao","21/12/2021","22/12/2021",420000);
		DanhSachCoSoKinhDoanh dscskd2 = new DanhSachCoSoKinhDoanh(cskd2,cskd2.length);

		ThanhPho tp2[] = new ThanhPho[1];
		tp2[0] = new ThanhPho("TPHCM","Nhiet Doi Gio Mua","32 doC","Tieng Viet, Tieng Anh");
		DanhSachThanhPho dstp2 = new DanhSachThanhPho(tp2,tp2.length);

		ConNguoi[] cn2 = new ConNguoi[3];
		cn2[0] = new HanhKhach("Nguyen Trung","11/03/1994","Ho Chi Minh","0987654365","98516455","TV","09");
		cn2[1] = new HanhKhach("Hoang Kieu","27/02/1998","Ha Noi","0987694511","231551654","TV","10");
		cn2[2] = new HuongDanVien("Mai Nguyen","12/03/1989","Ho Chi Minh","0923456789","21616556","3 nam","12/03/1986");
		DanhSachThanhVien dstv2 = new DanhSachThanhVien(cn2,cn2.length);

		PhuongTien pt2[] = new PhuongTien[3];
		pt2[0] = new PhuongTien("59B-3012",2,"Xe may");
		pt2[1] = new PhuongTien("86A-15922",4,"Xe hoi");
		pt2[2] = new PhuongTien("019E-922",160,"Xe lua");
		DanhSachPhuongTien dspt2 = new DanhSachPhuongTien(pt2,pt2.length);

		tdl[1] = new TourDuLich("Dia dao Cu Chi","20/12/2021","22/12/2021",6999000,dstv2,dspt2,dstp2,dscskd2);



		CoSoKinhDoanh cskd3[] = new CoSoKinhDoanh[4];
		cskd3[0] = new NhaHang("Phuoc Hai","352 Phuoc Hai, Ba Ria Vung Tau","3 Sao","Gia Dinh 4 Nguuoi","25/12/2021",320000);
		cskd3[1] = new NhaHang("Lan Rung","221 Truong Cong Dinh, Ba Ria Vung Tau","4 Sao","Mot Nguoi","26/12/2021",200000);
		cskd3[2] = new KhachSan("Fusion Suites","12-14 Thuy Van, Ba Ria Vung Tau","4 Sao","25/12/2021","26/12/2021",410000);
		cskd3[3] = new KhachSan("Green Garden","2 Truong Cong Dinh, Ba Ria Vung Tau","5 Sao","26/12/2021","27/12/2021",500000);
		DanhSachCoSoKinhDoanh dscskd3 = new DanhSachCoSoKinhDoanh(cskd3,cskd3.length);

		ThanhPho tp3[] = new ThanhPho[1];
		tp3[0] = new ThanhPho("Ba Ria Vung Tau","Nhiet Doi Gio Mua","30 doC","Tieng Viet, Tieng Anh");
		DanhSachThanhPho dstp3 = new DanhSachThanhPho(tp3,tp3.length);

		ConNguoi[] cn3 = new ConNguoi[4];
		cn3[0] = new HanhKhach("Thanh Nguyen","24/04/1993","Ha Noi","0987648632","526846414","TV","16");
		cn3[1] = new HanhKhach("Thanh Thao","27/02/1994","Ho Chi Minh","0988874541","135186963","TV","09");
		cn3[2] = new HanhKhach("Tran Tien","25/09/1993","Ho Chi Minh","0987658974","985161321","VIP","18");
		cn3[3] = new HuongDanVien("Thanh Tra","19/11/1987","Ho Chi Minh","0956432189","516846115","4 nam","19/11/1983");
		DanhSachThanhVien dstv3 = new DanhSachThanhVien(cn3,cn3.length);

		PhuongTien pt3[] = new PhuongTien[3];
		pt3[0] = new PhuongTien("MH-221",120,"May bay");
		pt3[1] = new PhuongTien("F2-2222",2,"Xe may");
		pt3[2] = new PhuongTien("BV-299432.TS",46,"Tau thuy");
		DanhSachPhuongTien dspt3 = new DanhSachPhuongTien(pt3,pt3.length);

		tdl[2] = new TourDuLich("Doi con heo","25/12/2021","27/12/2021",11500000,dstv3,dspt3,dstp1,dscskd3);



		CoSoKinhDoanh cskd4[] = new CoSoKinhDoanh[4];
		cskd4[0] = new NhaHang("Vo Thi Sau","23 Tran Nhan Tong, Ha Noi","5 Sao","Gia Dinh 4 Nguoi","12/12/2021",360000);
		cskd4[1] = new NhaHang("Kim Ma","52 Dinh Tien Hoang, Ha Noi","4 Sao","Gia Dinh 4 Nguoi","13/12/2021",280000);
		cskd4[2] = new NhaHang("Cau Giay","450 Phan Dinh Phung, Ha Noi","5 Sao","Mot Nguoi","14/12/2021",300000);
		cskd4[3] = new KhachSan("Le Loi","332 Hoang Dieu, Ha Noi","5 Sao","12/12/2021","14/12/2021",700000);
		DanhSachCoSoKinhDoanh dscskd4 = new DanhSachCoSoKinhDoanh(cskd4,cskd4.length);

		ThanhPho tp4[] = new ThanhPho[1];
		tp4[0] = new ThanhPho("Ha Noi","Nhiet Doi Gio Mua","28 doC","Tieng Viet, Tieng Anh");
		DanhSachThanhPho dstp4 = new DanhSachThanhPho(tp4,tp4.length);

		ConNguoi[] cn4 = new ConNguoi[4];
		cn4[0] = new HanhKhach("Thanh Nam","16/02/1995","Ha Noi","0987650234","231551469","TV","10");
		cn4[1] = new HanhKhach("Phuc Nguyen","24/11/1998","Ho Chi Minh","0987661463","526847510","TV","12");
		cn4[2] = new HanhKhach("Thanh Hoai","24/09/1994","Ho Chi Minh","0988876655","135188896","VIP","25");
		cn4[3] = new HuongDanVien("Nguyen My","29/07/1988","Ho Chi Minh","0976534156","156181515","2 nam","29/07/1986");
		DanhSachThanhVien dstv4 = new DanhSachThanhVien(cn4,cn4.length);

		PhuongTien pt4[] = new PhuongTien[4];
		pt4[0] = new PhuongTien("MH-341",120,"May bay");
		pt4[1] = new PhuongTien("MH-531",160,"May bay");
		pt4[2] = new PhuongTien("60B-62018",8,"Xe hoi");
		pt4[3] = new PhuongTien("60B-1028",2,"Xe may");
		DanhSachPhuongTien dspt4 = new DanhSachPhuongTien(pt4,pt4.length);

		tdl[3] = new TourDuLich("Pho co Ha Noi","12/12/2021","14/12/2021",12500000,dstv4,dspt4,dstp4,dscskd4);



		CoSoKinhDoanh cskd5[] = new CoSoKinhDoanh[5];
		cskd5[0] = new NhaHang("Phu Thinh","352 Nguyen Chi Thanh, Da Nang","4 Sao","Gia Dinh 4 Nguoi","08/12/2021",220000);
		cskd5[1] = new NhaHang("Quang Trung","22 Quang Trung, Da Nang","5 Sao","Mot Nguoi","09/12/2021",200000);
		cskd5[2] = new KhachSan("Thien Thoi","111 Yen Bai, Da Nang","4 Sao","08/12/2021","09/12/2021",320000);
		cskd5[3] = new KhachSan("Green Garden","19 Hoang Van Thu, Da Nang","5 Sao","09/12/2021","10/12/2021",540000);
		DanhSachCoSoKinhDoanh dscskd5 = new DanhSachCoSoKinhDoanh(cskd5,cskd5.length);

		ThanhPho tp5[] = new ThanhPho[1];
		tp5[0] = new ThanhPho("Đà nẵng","Nhiệt đới gió mùa","30 doC","Tiếng Việt, Tiếng Anh");
		DanhSachThanhPho dstp5 = new DanhSachThanhPho(tp5,tp5.length);

		ConNguoi[] cn5 = new ConNguoi[9];
		cn5[0] = new HanhKhach("Phát Thanh","18/03/1997","Ho Chi Minh","0987653698","98511204","TV","16");
		cn5[1] = new HanhKhach("Kiều Trung","24/02/1993","Ha Noi","0987695697","231558971","TV","08");
		cn5[2] = new HanhKhach("Thái Nguyên","24/04/1993","Ha Noi","0987648465","526848910","TV","12");
		cn5[3] = new HanhKhach("Đoàn Trường","27/02/1997","Ho Chi Minh","0988879870","135189314","VIP","23");
		cn5[4] = new HanhKhach("Tân Nguyễn","11/05/1996","Ho Chi Minh","0987655670","985166931","VIP","21");
		cn5[5] = new HanhKhach("Hoàng Tân","18/12/1994","Ha Noi","0987652583","231554762","TV","01");
		cn5[6] = new HanhKhach("Thanh Nam","16/04/2000","Ha Noi","0987660138","526848901","TV","18");
		cn5[7] = new HanhKhach("Nam Thành","28/12/1994","Ho Chi Minh","0988879999","135187744","VIP","17");
		cn5[8] = new HuongDanVien("Nguyễn Trà","26/07/1990","Ho Chi Minh","0976531144","156187964","2 nam","29/07/1988");
		DanhSachThanhVien dstv5 = new DanhSachThanhVien(cn5,cn5.length);

		PhuongTien pt5[] = new PhuongTien[4];
		pt5[0] = new PhuongTien("MH102",120,"Máy bay");
		pt5[1] = new PhuongTien("Vietjack201",80,"Máy bay");
		pt5[2] = new PhuongTien("BV-532193.TS",32,"Tàu thủy");
		pt5[3] = new PhuongTien("20A-60213",4,"Xe hơi");
		DanhSachPhuongTien dspt5 = new DanhSachPhuongTien(pt5,pt5.length);

		tdl[4] = new TourDuLich("Núi ngũ hành sơn","08/12/2023","10/12/2023",13950000,dstv5,dspt5,dstp5,dscskd5);

		DanhSachTourDuLich dstdl = new DanhSachTourDuLich(tdl,tdl.length);
		DanhSachThanhVien dstv = new DanhSachThanhVien();
		DanhSachPhuongTien dspt = new DanhSachPhuongTien();
		DanhSachThanhPho dstp = new DanhSachThanhPho();
		DanhSachCoSoKinhDoanh dscskd = new DanhSachCoSoKinhDoanh();


		Scanner sc = new Scanner(System.in);
		int x = 0;
		do {
			System.out.println("==============Menu Danh Sach Tour Du Lich ===============");
			System.out.println("1. Quản lý tour du lịch");
			System.out.println("2. Quản lý thành viên");
			System.out.println("3. Quản lý thành phố");
			System.out.println("4. Quản lý cơ sở kinh doanh");
			System.out.println("5. Quản lý phương tiện");
			System.out.println("0. Thoát");
			System.out.print("Vui lòng chọn: ");
			x  = sc.nextInt();
			switch (x) {
				case 0:
					return;
				case 1:
					dstdl.showMenu();
					break;
				case 2:
					dstv.showMenu();
					break;
				case 3:
					dstp.showMenu();
					break;
				case 4:
					dscskd.showMenu();
					break;
				case 5:
					dspt.showMenu();
					break;
				default:
					System.out.println("Nhập sai vui lòng nhập lại: ");
					break;
			}
		} while (x != 0);
	}
      
    }

}
