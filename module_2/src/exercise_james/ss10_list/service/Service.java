package exercise_james.ss10_list.service;

import exercise_james.ss10_list.Fruit;
import exercise_james.ss10_list.repository.IRepository;
import exercise_james.ss10_list.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements IService {
    IRepository iRepository = new Repository();

    @Override
    public void disPlay() {
        List<Fruit> fruitList = iRepository.getAll();
        for (Fruit s : fruitList
        ) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        String nameFruit;
        System.out.println("input name fruit");
        nameFruit = sc.nextLine();
        String kindOfFruit;
        System.out.println("input kind of fruit");
        kindOfFruit = sc.nextLine();
        String manuDate;
        System.out.println("input manu date");
        manuDate = sc.nextLine();
        String expDate;
        System.out.println("input exp date");
        expDate = sc.nextLine();
        String origin;
        System.out.println("input origin");
        origin = sc.nextLine();
        int cost;
        System.out.println("input cost");
        cost = Integer.parseInt(sc.nextLine());
        Fruit fruit = new Fruit(nameFruit, kindOfFruit, manuDate, expDate, origin, cost);
        iRepository.add(fruit);
    }
}
