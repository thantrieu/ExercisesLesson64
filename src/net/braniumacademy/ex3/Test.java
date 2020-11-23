package net.braniumacademy.ex3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<StudentRegistering> registerings = new ArrayList<>();
        // tạo danh sách môn học
        Subject java = new Subject("S1", "Java", 3);
        Subject cpp = new Subject("S2", "C++", 4);
        Subject python = new Subject("S3", "Python", 3);

        // tạo thông tin đăng ký cho từng môn học
        StudentRegistering javaRegistering = new StudentRegistering(java, 120);
        StudentRegistering cppRegistering = new StudentRegistering(cpp, 70);
        StudentRegistering pythonRegistering = new StudentRegistering(python, 156);

        // tạo danh sách ghép cặp môn học và số sinh viên đăng kí
        add(registerings, javaRegistering);
        add(registerings, cppRegistering);
        add(registerings, pythonRegistering);
        add(registerings, javaRegistering); // thử thêm trùng lặp

        // hiển thị danh sách sau khi thêm:
        showRegisteringList(registerings);
    }

    /**
     * phương thức dùng để hiển thị danh sách sinh viên đăng kí của
     * từng môn học
     *
     * @param registerings danh sách chứa thông tin cần hiển thị
     */
    private static void showRegisteringList(List<StudentRegistering> registerings) {
        System.out.println("=======================================");
        for (var item : registerings) {
            System.out.println(item);
        }
    }

    /**
     * phương thức dùng để thêm một bản ghi chứa thông tin đăng kí
     * của một môn học nào đó. Nếu môn học đó đã tồn tại trong danh sách
     * thì không thêm vào danh sách nữa.
     *
     * @param list danh sách đăng ký
     * @param obj  đối tượng chứa thông tin đăng ký cần xem xét
     */
    private static void add(List<StudentRegistering> list, StudentRegistering obj) {
        if (!list.contains(obj)) {
            list.add(obj);
        } else {
            System.out.println("Đối tượng \"" + obj + "\" đã tồn tại trong danh sách");
        }
    }
}
