package case_study.service.imp;

import case_study.format.FormatIdFacility;
import case_study.format.FormatNameFacility;
import case_study.model.House;
import case_study.model.Room;
import case_study.util.Read.ReadRoom;
import case_study.util.Write.WriteRoom;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class ServiceRoom {
    public static void addRoom() {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = ReadRoom.readRoom("src/case_study/data/dataRoom.csv");

        String id = null;
        do {
            System.out.println("Nhập id");
            id = sc.nextLine();
            if (FormatIdFacility.regexRoom(id)) {
                break;
            }
        } while (true);
        String name;
        do {
            System.out.println("Nhập tên phòng");
            name = sc.nextLine();
            if (FormatNameFacility.formatNameFacilityVilla(name)) {
                break;
            }
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
        String serviceFree;
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        serviceFree = sc.nextLine();

        Room room = new Room(id, name, areaUse, price, peopleMax, date, serviceFree);
        roomIntegerLinkedHashMap.put(room, 0);
        WriteRoom.writeRoom("src/case_study/data/dataRoom.csv", roomIntegerLinkedHashMap);

    }
}
