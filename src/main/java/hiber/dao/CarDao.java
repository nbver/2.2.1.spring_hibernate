package hiber.dao;

import hiber.model.Car;

public interface CarDao {
    void add(Car car);

    long getCArIdByModelAndSeries(String model, int series);
}
