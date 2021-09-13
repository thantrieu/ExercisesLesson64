package net.braniumacademy.ex4;

import java.util.Objects;

public class DriverAssignment<Driver, Router> {
    private Driver driver;
    private Router router;
    private int numOfTurn;

    public DriverAssignment() {
    }

    public DriverAssignment(Driver driver) {
        this.driver = driver;
    }

    public DriverAssignment(Driver driver, Router router) {
        this.driver = driver;
        this.router = router;
    }

    public DriverAssignment(Driver driver, Router router, int numOfTurn) {
        this.driver = driver;
        this.router = router;
        this.numOfTurn = numOfTurn;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public int getNumOfTurn() {
        return numOfTurn;
    }

    public void setNumOfTurn(int numOfTurn) {
        this.numOfTurn = numOfTurn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverAssignment)) return false;
        DriverAssignment<?, ?> that = (DriverAssignment<?, ?>) o;
        return Objects.equals(driver, that.driver) && Objects.equals(router, that.router);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, router);
    }

    @Override
    public String toString() {
        return "DriverAssignment{" +
                "driver=" + driver +
                ", router=" + router +
                ", numOfTurn=" + numOfTurn +
                '}';
    }
}
