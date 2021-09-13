package net.braniumacademy.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Test {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        ArrayList<TaskAssignment<Employee, Task>> taskAssignments = new ArrayList<>();
        createFakeData(taskAssignments);
        showTaskAssignment(taskAssignments);
    }

    private static void createFakeData(ArrayList<TaskAssignment<Employee, Task>> taskAssignments) {
        try {
            Employee employee1 = new Employee("NV001", "Lê Thanh Hoàng",
                    dateFormat.parse("12/11/2000"), 15000);
            Employee employee2 = new Employee("NV002", "Lê Thanh Hà",
                    dateFormat.parse("12/10/2000"), 17000);
            Employee employee3 = new Employee("NV003", "Lê Trần Hà",
                    dateFormat.parse("12/12/2000"), 14000);
            Task task1 = new Task("T001", "Lắp rap iPhone 15 Pro Max", "Làm theo ca");
            Task task2 = new Task("T002", "Lắp rap Macbook Pro", "Làm theo ca");
            taskAssignments.add(new TaskAssignment<>(employee1, task1,
                    dateFormat.parse("15/10/2023"), 10, 0, 16, 0));
            taskAssignments.add(new TaskAssignment<>(employee1, task2,
                    dateFormat.parse("15/10/2023"), 18, 0, 22, 0));
            taskAssignments.add(new TaskAssignment<>(employee2, task1,
                    dateFormat.parse("15/10/2023"), 8, 0, 12, 0));
            taskAssignments.add(new TaskAssignment<>(employee2, task2,
                    dateFormat.parse("15/10/2023"), 14, 0, 16, 0));
            taskAssignments.add(new TaskAssignment<>(employee3, task1,
                    dateFormat.parse("15/10/2023"), 8, 0, 12, 0));
            taskAssignments.add(new TaskAssignment<>(employee3, task2,
                    dateFormat.parse("15/10/2023"), 14, 0, 16, 0));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void showTaskAssignment(ArrayList<TaskAssignment<Employee, Task>> taskAssignments) {
        System.out.printf("%-10s%-20s%-10s%-30s%-20s\n",
                "Mã NV", "Tên NV", "Mã CV", "Tên CV", "Thời gian");
        for (var e : taskAssignments) {
            String time = String.format("%02d:%02d to %02d:%02d",
                    e.getStartHour(), e.getStartMinute(), e.getEndHour(), e.getEndMinute());
            System.out.printf("%-10s%-20s%-10s%-30s%-20s\n",
                    e.getEmployee().getId(), e.getEmployee().getFullName(),
                    e.getTask().getId(), e.getTask().getName(), time);
        }
    }
}
