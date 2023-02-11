package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static List<Car> listCar;

    public CarServiceImpl(List<Car> listcar) {
        this.listCar = new ArrayList<>();
        listCar.add(new Car("model1", "White", 2015));
        listCar.add(new Car("model2", "Red", 2016));
        listCar.add(new Car("model3", "Yellow", 2017));
        listCar.add(new Car("model4", "Blue", 2018));
        listCar.add(new Car("model5", "Pink", 2019));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > listCar.size() || count < 0) {
            count = listCar.size();
        }
        return listCar.stream().limit(count).toList();
    }
}
