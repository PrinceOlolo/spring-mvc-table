package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = Arrays.asList(
        new Car("Lada", 9, "cherry-colored"),
                new Car("Tesla", 3, "white"),
                new Car("Tractor", 10, "blue"),
                new Car("Catafalque", 666, "Pink"),
                new Car("telega", 13, "brown")
    );

    @Override
    public List<Car> getCarList(int count){
        if (count == 0) {
            return  carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }






}
