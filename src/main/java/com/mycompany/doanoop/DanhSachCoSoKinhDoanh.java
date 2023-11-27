package com.mycompany.doanoop;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachCoSoKinhDoanh implements DanhSach {
	private CoSoKinhDoanh[] cskd;
	private int n;
	Scanner sc = new Scanner(System.in);

	public DanhSachCoSoKinhDoanh() {
		n = 0;
		cskd = new CoSoKinhDoanh[0];
	}

	public DanhSachCoSoKinhDoanh(CoSoKinhDoanh[] cskd, int n) {
		this.cskd = cskd;
		this.n = n;
	}

	public void setup(int i, CoSoKinhDoanh[] cskd) {

		System.out.println("1. Khach san \n2. Nha Hang");
		int chon = sc.nextInt();
		switch (chon) {
		case 1:
			cskd[i] = new KhachSan();
			cskd[i].nhap();
			break;
		case 2:
			cskd[i] = new NhaHang();
			cskd[i].nhap();
			break;
		default:
			System.out.println("Nhap sai vui long nhap lai ");
			setup(i, cskd);
			break;
		}
	}

	public void xuat() {
		xuatKhachSan();
		xuatNhaHang();
	}

	@Override
	public void them() {
		System.out.println("So luong cskd muon them");
		int so = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < so; i++) {
			cskd = Arrays.copyOf(cskd, n + 1);
			setup(n, cskd);
			System.out.println("Them thanh cong");
			n++;
		}

	}

	@Override
	public void xoa() {
		System.out.println("Nhap ma cskd can xoa: ");
		String ma = sc.nextLine();
		for (int i = 0; i < n; i++) {
			if (cskd[i].getId().equals(ma)) {
				for (int j = i; j < n - 1; j++) {
					cskd[j] = cskd[j + 1];
					cskd = Arrays.copyOf(cskd, n - 1);
				}
				n--;
			}
		}
		System.out.println("Id kh tim thay");
		System.out.println();

	}

	@Override
	public void sua() {
		System.out.println("Nhập ID cần sửa: ");
		String ma = sc.nextLine();
		for (int i = 0; i < n; i++) {
			if (cskd[i] instanceof NhaHang) {
				if (cskd[i].getId().equals(ma)) {
					System.out.println("1.Sửa tên nhà hàng");
					System.out.println("2.Sửa địa chỉ");
					System.out.println("3.Sửa sao");
					System.out.println("4.Sửa ngày");
					System.out.println("5.Sửa combo");
					System.out.println("6.Sửa giá combo");
					System.out.println("Vui lòng chọn");
					int so = sc.nextInt();
					sc.nextLine();
					switch (so) {
					case 1:
						System.out.println("Nhập: ");
						String ten = sc.nextLine();
						cskd[i].setTen(ten);
						break;

					case 2:
						System.out.println("Nhập: ");
						String diaChi = sc.nextLine();
						cskd[i].setTen(diaChi);
						break;

					case 3:
						System.out.println("Nhập: ");
						String sao = sc.nextLine();
						cskd[i].setTen(sao);
						break;
					case 4:
						System.out.println("Nhập: ");
						String ngay = sc.nextLine();
						cskd[i].setTen(ngay);
						break;
					case 5:
						System.out.println("Nhập: ");
						String combo = sc.nextLine();
						cskd[i].setTen(combo);
						break;
					case 6:
						System.out.println("Nhập: ");
						String giaCombo = sc.nextLine();
						cskd[i].setTen(giaCombo);
						break;

					}

				}

			} else {
				if (cskd[i].getId().equals(ma)) {
					System.out.println("1.Sửa tên khách sạn");
					System.out.println("2.Sửa địa chỉ");
					System.out.println("3.Sửa sao");
					System.out.println("4.Sửa ngày đến");
					System.out.println("5.Sửa ngày đi");
					System.out.println("6.Sửa đơn giá ");
					System.out.println("Vui lòng chọn");
					int so = sc.nextInt();
					sc.nextLine();
					switch (so) {
					case 1:
						System.out.println("Nhập: ");
						String ten = sc.nextLine();
						cskd[i].setTen(ten);
						break;

					case 2:
						System.out.println("Nhập: ");
						String diaChi = sc.nextLine();
						cskd[i].setTen(diaChi);
						break;

					case 3:
						System.out.println("Nhập: ");
						String sao = sc.nextLine();
						cskd[i].setTen(sao);
						break;
					case 4:
						System.out.println("Nhập: ");
						String ngayDen = sc.nextLine();
						cskd[i].setTen(ngayDen);
						break;
					case 5:
						System.out.println("Nhập: ");
						String ngayDi = sc.nextLine();
						cskd[i].setTen(ngayDi);
						break;
					case 6:
						System.out.println("Nhập: ");
						String donGia = sc.nextLine();
						cskd[i].setTen(donGia);
						break;

					}
					
				}

			}

		}
		System.out.println("Id không tìm thấy");
		System.out.println();
		

	}

	@Override
	public void timKiem() {
		System.out.println("Nhập ID cần tìm kiếm ");
		String ma = sc.nextLine();
		for (int i = 0; i < n; i++) {
			if (cskd[i].getId().equals(ma)) {
				System.out.println("Cơ sở kinh doanh cần tìm : ");
				cskd[i].xuat();
				return;
			}
		}
		System.out.println("Id không tìm thấy");
		System.out.println();

	}

	public void xuatNhaHang() {
		System.out.println("Danh sách nhà hàng");
		for (int i = 0; i < n; i++) {
			if (cskd[i] instanceof NhaHang) {
				cskd[i].xuat();
			}
		}
	}

	public void xuatKhachSan() {
		System.out.println("Danh sách khách sạn");
		for (int i = 0; i < n; i++) {
			if (cskd[i] instanceof KhachSan) {
				cskd[i].xuat();
			}
		}
	}

	public void tinhTien() {
		for (int i = 0; i < cskd.length; i++) {
			if (cskd[i] instanceof NhaHang) {
				System.out.println("Nhà hàng " + cskd[i].getTen() + ": ");
				cskd[i].tinhTien();
				System.out.println();
			} else {
				System.out.println("Khách sạn " + cskd[i].getTen() + ": ");
				cskd[i].tinhTien();
				System.out.println();
			}
		}
	}

	@Override
	public void showMenu() {
		System.out.println();
		System.out.println("Menu cơ sở kinh doanh");

		int chon = 0;

		do {
			System.out.println("1. Thêm mới ");
			System.out.println("2. Sửa  ");
			System.out.println("3. Xóa  ");
			System.out.println("4. Tìm kiếm  ");
			System.out.println("5. Xuất danh sách nhà hàng ");
			System.out.println("6. Xuất danh sách khách sạn");
			System.out.println("7. Xuất danh sách cơ sở kinh doanh");
			System.out.println("8. Tính tiền ");
			System.out.println("0. Thoát ");

			System.out.print("Vui lòng chọn :  ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
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
				xuatNhaHang();
				break;
			case 6:
				xuatKhachSan();
				break;
			case 7:
				xuat();
				break;

			case 8:
				tinhTien();
				break;
			case 0:
				return;

			default:
				System.out.println("Nhập sai !! Vui lòng nhập lại ");
				break;
			}
		} while (n != 0);

	}

	public String toStringNhaHang() {
		String str;
		str = "Danh sách nhà hàng ";
		for (int i = 0; i < cskd.length; i++) {
			if (cskd[i] instanceof NhaHang) {
				str += "\n\nNhà hàng thứ " + (i + 1) + ":";
				str += cskd[i].toString();
			}
		}
		return str;
	}

	public String toStringKhachSan() {
		String str;
		str = "Danh sách khách sạn ";
		for (int i = 0; i < cskd.length; i++) {
			if (cskd[i] instanceof KhachSan) {
				str += "\n\nKhách sạn thứ " + (i + 1) + ":";
				str += cskd[i].toString();
			}
		}
		return str;
	}

	@Override
	public String toString() {
		return toStringKhachSan() + toStringNhaHang();
	}

}
