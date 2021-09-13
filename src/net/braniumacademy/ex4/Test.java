package net.braniumacademy.ex4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<DriverAssignment<Driver, Route>> driverAssignments = new ArrayList<>();
        createFakeData(driverAssignments);
        showDriverAssignment(driverAssignments);
    }

    private static void createFakeData(ArrayList<DriverAssignment<Driver, Route>> driverAssignments) {
        Driver driver1 = new Driver("NV001", "Ngô Văn Thành", 5.5f);
        Driver driver2 = new Driver("NV002", "Lê Văn Tuấn", 1.5f);
        Driver driver3 = new Driver("NV003", "Quách Tĩnh", 7.5f);
        Route route1 = new Route(1, "Giáp Bát - Nhổn", 15, 30);
        Route route2 = new Route(2, "Giáp Bát - Nam Thăng Long", 16, 32);
        Route route3 = new Route(3, "Bách Khoa - Đại học Mỏ", 14, 28);
        Route route4 = new Route(4, "Bờ Hồ - Yên Phụ", 8, 16);
        driverAssignments.add(new DriverAssignment<>(driver1, route1, 8));
        driverAssignments.add(new DriverAssignment<>(driver1, route2, 5));
        driverAssignments.add(new DriverAssignment<>(driver1, route3, 15));
        driverAssignments.add(new DriverAssignment<>(driver1, route4, 25));
        driverAssignments.add(new DriverAssignment<>(driver2, route1, 35));
        driverAssignments.add(new DriverAssignment<>(driver2, route3, 4));
        driverAssignments.add(new DriverAssignment<>(driver3, route1, 6));
        driverAssignments.add(new DriverAssignment<>(driver3, route2, 15));
        driverAssignments.add(new DriverAssignment<>(driver3, route3, 9));
    }

    private static void showDriverAssignment(ArrayList<DriverAssignment<Driver, Route>> driverAssignments) {
        System.out.printf("%-10s%-30s%-10s%-20s%-15s\n",
                "Mã Tuyến", "Tên Tuyến", "Mã LX", "Tên LX", "Số lượt");
        for (var d : driverAssignments) {
            System.out.printf("%-10s%-30s%-10s%-20s%-15s\n", d.getRouter().getId(),
                    d.getRouter().getName(), d.getDriver().getId(),
                    d.getDriver().getFullName(), d.getNumOfTurn());
        }
    }
}
