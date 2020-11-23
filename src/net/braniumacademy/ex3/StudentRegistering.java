package net.braniumacademy.ex3;

import java.util.Objects;

public class StudentRegistering<Subject, Integer> {
    private Subject subject;
    private Integer numberStudentRegister;

    public StudentRegistering() {
    }

    public StudentRegistering(Subject subject, Integer numberStudentRegister) {
        this.subject = subject;
        this.numberStudentRegister = numberStudentRegister;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getNumberStudentRegister() {
        return numberStudentRegister;
    }

    public void setNumberStudentRegister(Integer numberStudentRegister) {
        this.numberStudentRegister = numberStudentRegister;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRegistering<?, ?> that = (StudentRegistering<?, ?>) o;
        return Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }

    @Override
    public String toString() {
        return "StudentRegistering{" +
                "subject=" + subject +
                ", numberStudentRegister=" + numberStudentRegister +
                '}';
    }
}
