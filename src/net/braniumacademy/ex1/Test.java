package net.braniumacademy.ex1;

public class Test {
    public static void main(String[] args) {
        Pair<String, String> hello = new Pair<>("Hello", "Xin chào");
        Pair<String, String> one = new Pair<>("1", "One");
        Pair<String, String> veryGood = new Pair<>("Very good", "Rất tốt");

        System.out.println(hello);
        System.out.println(one);
        System.out.println(veryGood);
    }
}
