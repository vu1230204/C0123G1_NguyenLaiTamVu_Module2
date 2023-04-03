package case_study.service.imp;

import case_study.format.FormatIdFacility;
import case_study.model.House;
import case_study.util.Read.ReadHouse;
import case_study.util.Write.WriteHouse;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ServiceHouse {

    public static void addHouse() {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = ReadHouse.readHouse("src/case_study/data/dataHouse.csv");
        Scanner sc = new Scanner(System.in);
        String id = null;
        do {
            System.out.println("Nhập id");
            id = sc.nextLine();
            if (FormatIdFacility.regexHouse(id)) {
                break;
            }
        } while (true);
        String name = "House";
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
        String standardRooom;
        System.out.println("Nhập hạng phòng");
        standardRooom = sc.nextLine();
        int floor;
        do {
            System.out.println("Nhập số tầng");
            System.out.println("Số tầng phải lớn hơn 0");
            floor = Integer.parseInt(sc.nextLine());
        } while (floor < 0);
        House house = new House(id, name, areaUse, price, peopleMax, date, standardRooom, floor);
        houseIntegerLinkedHashMap.put(house, 0);
        WriteHouse.writeHouse("src/case_study/data/dataHouse.csv", houseIntegerLinkedHashMap);

    }
}

