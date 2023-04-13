package exercise_james.ss10_list.repository;

import exercise_james.ss10_list.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {
    static List<Fruit> fruitList = new ArrayList<>();

    static {
        fruitList.add(new Fruit("bưởi", "vitaminC", "10/2/2023", "20/2/2022", "trung quốc", 10000));
        fruitList.add(new Fruit("chanh", "vitaminC", "10/2/2023", "20/2/2022", "việt nam", 10000));
        fruitList.add(new Fruit("cam", "vitaminC", "10/2/2023", "20/2/2022", "trung quốc", 10000));
        fruitList.add(new Fruit("vải", "vitaminC", "10/2/2023", "20/2/2022", "trung quốc", 10000));
    }

    @Override
    public List<Fruit> getAll() {
        return fruitList;
    }

    @Override
    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }


}
