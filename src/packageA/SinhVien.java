package packageA;

public class SinhVien {
    private int id;
    private String name;
    private int tuoi;
    double diemToan;
    double diemVan;
    double diemAnh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public SinhVien(int id, String name, int tuoi, double diemToan, double diemVan, double diemAnh) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public void inThongTin() {
        System.out.println("SV " + id + " - " + name);
        System.out.println("Tuoi la: " + tuoi);
        System.out.println("diem toan: " + diemToan);
        System.out.println("diem anh" + diemAnh);
        System.out.println("diem van " + diemVan);
        System.out.println("Trung Binh Cong : " + tinhTrungBinhCong());
        System.out.println("Xep loai " + xepLoai());
    }

    public double tinhTrungBinhCong() {
        return (diemVan + diemAnh + diemToan) / 3;
    }

    public String xepLoai() {
        String xepLoai = null;
        if (diemVan == 0.0 || diemToan == 0.0 || diemAnh == 0.0) {
            xepLoai = "Yếu";
        } else if (tinhTrungBinhCong() < 5) {
            xepLoai = "Yếu";
        } else if (tinhTrungBinhCong() >= 5 && tinhTrungBinhCong() < 7) {
            xepLoai = "Trung Bình";
        } else if (tinhTrungBinhCong() >= 7 && tinhTrungBinhCong() < 9) {
            xepLoai = "Khá";
        } else if (tinhTrungBinhCong() >= 9) {
            xepLoai = "Giỏi";
        }
        return xepLoai;
    }
}
