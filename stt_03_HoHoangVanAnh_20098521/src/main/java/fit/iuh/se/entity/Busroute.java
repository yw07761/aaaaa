package fit.iuh.se.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
@Table(name = "Busroute")
public class Busroute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Route Code is required")
    private int route_code;

    @NotBlank(message = "Route Name is required")
    private String route_name;

    @NotBlank(message = "Distance is required")
    private int distance;

    @NotBlank(message = "start_location is required")
    private String start_location;

    @NotBlank(message = "finish_location is required")
    private String finish_location;

    @NotBlank(message = "price is required")
    private long price;

    private Date start_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoute_code() {
        return route_code;
    }

    public void setRoute_code(int route_code) {
        this.route_code = route_code;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getStart_location() {
        return start_location;
    }

    public void setStart_location(String start_location) {
        this.start_location = start_location;
    }

    public String getFinish_location() {
        return finish_location;
    }

    public void setFinish_location(String finish_location) {
        this.finish_location = finish_location;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
}
