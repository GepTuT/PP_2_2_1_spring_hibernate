package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Id
    @Column(name = "model")
    private String model;


    @Column(name = "series")
    private int series;


    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return new StringBuilder("Model: ")
                .append(this.getModel())
                .append(", Series: ")
                .append(this.getSeries())
                .toString();
    }

}
