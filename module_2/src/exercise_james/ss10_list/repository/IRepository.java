package exercise_james.ss10_list.repository;

import exercise_james.ss10_list.fruit_list.service.Fruit;

import java.util.List;

public interface IRepository {

    List<Fruit> getAll();


    void add(Fruit fruit);
}
