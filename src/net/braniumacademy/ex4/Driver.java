package net.braniumacademy.ex4;

import java.util.Objects;

public class Driver {
    private String id;
    private String fullName;
    private float experience;

    public Driver() {
    }

    public Driver(String id) {
        this.id = id;
    }

    public Driver(String id, String fullName, float experience) {
        this.id = id;
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
