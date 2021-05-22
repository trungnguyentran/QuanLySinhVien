package packageA;

import java.util.ArrayList;
import java.util.List;

public class ClassTest {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Bắc",24,4.6,3.5,7.2);
        SinhVien sv2 = new SinhVien(2,"Khôi",18,5.6,5.5,7.2);
        SinhVien sv3 = new SinhVien(3,"Hồng",26,2.6,8.5,7.2);
        SinhVien sv4 = new SinhVien(4,"Huyền",33,8.6,9.5,8.2);
        SinhVien sv5 = new SinhVien(5,"Thắng",19,4.2,8.5,0.0);

        List<SinhVien> listSV = new ArrayList<>();
        listSV.add(sv1);
        listSV.add(sv2);
        listSV.add(sv3);
        listSV.add(sv4);
        listSV.add(sv5);

        for (SinhVien sv: listSV){
            sv.inThongTin();
        }

    }
}
