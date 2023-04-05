package case_study.service.imp;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IServiceFacility;
import case_study.util.Read.ReadHouse;
import case_study.util.Read.ReadRoom;
import case_study.util.Read.ReadVilla;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class ServiceFacility implements IServiceFacility {
    @Override
    public void display() {
        LinkedHashMap<Room, Integer> roomList = ReadRoom.readRoom("src/case_study/data/dataRoom.csv");
        for (Map.Entry<Room, Integer> temp : roomList.entrySet()
        ) {
            System.out.println(temp);
        }
        LinkedHashMap<House, Integer> houseList = ReadHouse.readHouse("src/case_study/data/dataHouse.csv");
        for (Map.Entry<House, Integer> temp : houseList.entrySet()
        ) {
            System.out.println(temp);
        }
        LinkedHashMap<Villa, Integer> villaList = ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        for (Map.Entry<Villa, Integer> temp : villaList.entrySet()
        ) {
            System.out.println(temp);
        }

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void choice() {
        Scanner sc = new Scanner(System.in);
        String choose;
        do {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new Room");
            System.out.println("3. Add new House");
            System.out.println("4. Return to main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    ServiceVilla.addVilla();
                    break;
                case "2":
                    ServiceRoom.addRoom();
                    break;
                case "3":
                    ServiceHouse.addHouse();
                    break;
                case "4":
                    break;

            }
        } while (!choose.equals("4"));
    }
}
