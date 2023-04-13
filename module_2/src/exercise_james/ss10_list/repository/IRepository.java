package exercise_james.ss10_list.repository;

import exercise_james.ss10_list.Fruit;

import java.util.List;

public interface IRepository {

    List<Fruit> getAll();


    void add(Fruit fruit);
}
