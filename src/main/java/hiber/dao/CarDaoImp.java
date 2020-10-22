package hiber.dao;

import hiber.model.Car;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImp implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
 //   @Qualifier("car")
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }
}
