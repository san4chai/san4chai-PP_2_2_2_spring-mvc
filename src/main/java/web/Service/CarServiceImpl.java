package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    public List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Camry", 2015));
        carList.add(new Car("Toyota", "Fielder", 2010));
        carList.add(new Car("Toyota", "Auris", 2015));
        carList.add(new Car("Nissan", "Sunny", 2005));
        carList.add(new Car("Nissan", "Murano", 2018));
        carList.add(new Car("Nissan", "Patrol", 2008));
        carList.add(new Car("Honda", "Stream", 2009));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count < 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList.stream().collect(Collectors.toList());
        }
    }
}