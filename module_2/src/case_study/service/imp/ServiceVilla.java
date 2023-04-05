package case_study.service.imp;

import case_study.format.FormatIdFacility;
import case_study.format.FormatNameFacility;
import case_study.model.Villa;
import case_study.util.Read.ReadVilla;
import case_study.util.Write.WriteVilla;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ServiceVilla {
    public static void addVilla() {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        String id;
        do {
            System.out.println("Nhập id");
            id = sc.nextLine();
            if (FormatIdFacility.regexVilla(id)) {
                break;
            }
            System.out.println("Yêu cầu nhập đúng format");
        } while (true);
        String name;
        do {
            System.out.println("Nhập tên phòng");
            name = sc.nextLine();
            if (FormatNameFacility.formatNameFacilityVilla(name)) {
                break;
            }
            System.out.println("yêu cầu nhập đúng ");
        } while (true);
        int areaUse;
        do {
            System.out.println("Nhập diện tích sử dụng");
            System.out.println("Diện tích sử dụng phải lớn hơn 30");
            areaUse = Integer.parseInt(sc.nextLine());
        } while (areaUse < 30);
        float price;
        System.out.println("Nhập giá phòng");
        price = Float.parseFloat(sc.nextLine());
        int peopleMax;
        do {
            System.out.println("Nhập số lượng người");
            System.out.println("Số người tối đa là 20 người");
            peopleMax = Integer.parseInt(sc.nextLine());
        } while (peopleMax < 0 || peopleMax > 20);
        String date;
        System.out.println("Nhập thời gian thuê");
        date = sc.nextLine();
        String standardRoom;
        System.out.println("Nhập hạng phòng");
        standardRoom = sc.nextLine();
        int pool;
        do {
            System.out.println("Nhập diện tích hồ bơi");
            System.out.println("Diện tích hồ bơi phải lớn hơn 30");
            pool = Integer.parseInt(sc.nextLine());
        } while (pool < 30);
        int floor;
        do {
            System.out.println("Nhập số tầng");
            floor = Integer.parseInt(sc.nextLine());
        } while (floor < 0);

        Villa villa = new Villa(id, name, areaUse, price, peopleMax, date, standardRoom, pool, floor);
        villaIntegerLinkedHashMap.put(villa, 0);
        WriteVilla.writeVilla("src/case_study/data/dataVilla.csv", villaIntegerLinkedHashMap);

    }


}
