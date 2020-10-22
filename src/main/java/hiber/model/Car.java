package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column
    @GeneratedValue
    private Long id;
    @Column
    private String model;
    @Column
    private int series;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "user_id")
//    private User user;

    public Car(String model, int series) {
        this.model=model;
        this.series=series;
    }

    public Car() {

    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
