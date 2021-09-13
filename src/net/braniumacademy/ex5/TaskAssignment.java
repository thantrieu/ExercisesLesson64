package net.braniumacademy.ex5;

import java.util.Date;
import java.util.Objects;

public class TaskAssignment<E, T> {
    private E employee;
    private T task;
    private Date date;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    public TaskAssignment() {
    }

    public TaskAssignment(E employee, T task, Date date) {
        this.employee = employee;
        this.task = task;
        this.date = date;
    }

    public TaskAssignment(E employee, T task, Date date,
                          int startHour, int startMinute, int endHour, int endMinute) {
        this.employee = employee;
        this.task = task;
        this.date = date;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    public E getEmployee() {
        return employee;
    }

    public void setEmployee(E employee) {
        this.employee = employee;
    }

    public T getTask() {
        return task;
    }

    public void setTask(T task) {
        this.task = task;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskAssignment)) return false;
        TaskAssignment<?, ?> that = (TaskAssignment<?, ?>) o;
        return startHour >= that.startHour && startMinute == that.startMinute
                && endHour <= that.endHour && endMinute == that.endMinute
                && Objects.equals(employee, that.employee) && Objects.equals(task, that.task)
                && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, task, date, startHour, startMinute, endHour, endMinute);
    }
}
