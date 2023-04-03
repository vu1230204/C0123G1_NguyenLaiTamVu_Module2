package case_study.util.Read;

import case_study.model.Room;
import case_study.util.Write.WriteRoom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ReadRoom {
    public static LinkedHashMap<Room, Integer> readRoom;

    public static LinkedHashMap<Room, Integer> readRoom(String path) {
        LinkedHashMap<Room, Integer> roomList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            String[] tempArray;
            Room room;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArray = temp.split(",");
                room = new Room(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2]), Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]), tempArray[5], tempArray[6]);
                int value = Integer.parseInt(tempArray[7]);
                roomList.put(room, value);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            WriteRoom.writeRoom(path, roomList);
        }
        return roomList;
    }
}
