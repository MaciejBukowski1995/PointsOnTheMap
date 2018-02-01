package home;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Point {
    private @Id @GeneratedValue Long id;
    private double longitude;
    private double altitude;

    private Point() {}

    public Point(double longitude, double altitude) {
        this.longitude = longitude;
        this.altitude = altitude;
    }
}