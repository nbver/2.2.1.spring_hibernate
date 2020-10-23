package hiber.dao;

import hiber.model.Car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
 //   @Qualifier("car")
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    public long getCArIdByModelAndSeries(String model, int series) {
        Session session = sessionFactory.getCurrentSession();
        TypedQuery<Car> query = session.createQuery(
                "from Car where model = :modelParam and series = :seriesParam");
        query.setParameter("modelParam", model);
        query.setParameter("seriesParam",  series);
        List<Car> list = query.getResultList();
        if (list.isEmpty()) {
            return 1;
        }
        Car car = list.get(0);
        long returnValue = car.getId();
        return returnValue;
    }
}
