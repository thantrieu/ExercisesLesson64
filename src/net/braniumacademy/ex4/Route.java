package net.braniumacademy.ex4;

import java.util.Objects;

public class Route {
    private int id;
    private String name;
    private float distance;
    private int stopPoint;

    public Route() {
    }

    public Route(int id) {
        this.id = id;
    }

    public Route(int id, String name, float distance, int stopPoint) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.stopPoint = stopPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(int stopPoint) {
        this.stopPoint = stopPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;
        Route route = (Route) o;
        return id == route.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                ", stopPoint=" + stopPoint +
                '}';
    }
}
