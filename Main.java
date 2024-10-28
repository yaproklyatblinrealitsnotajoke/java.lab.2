import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);


//        System.out.println("Задание 1");
//        Point x1 = new Point(15, 5);
//        Point x2 = new Point(20, -4);
//        Point x3 = new Point(100, 3);
//
//        System.out.println("Точка 1 - " + x1);
//        System.out.println("Точка 2 - " + x2);
//        System.out.println("Точка 3 - " + x3);
//        System.out.println("-------------------------------------------");

//        System.out.println("Задание 2");
//        Point p1 = new Point(1, 3);
//        Point p2 = new Point(23, 8);
//        Point p3 = new Point(5, 10);
//        Point p4 = new Point(25, 10);
//        Line l1 = new Line(p1, p2);
//        Line l2 = new Line(p3, p4);
//        Line l3 = new Line(p1, p4);
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//        System.out.println("Линии после изменения: ");
//        p1.setX(45);
//        p2.setY(78);
//        p3.setX(7);
//        p3.setY(19);
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//        System.out.println("Линии после изменения: ");
//        p2.setX(90);
//        p2.setY(80);
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//
//        System.out.println("-------------------------------------------");

//        System.out.println("Задание 3");
//        int[] a1 = {3, 4, 5};
//        Student s1 = new Student("Вася", a1);
//        Student s2 = new Student("Петя", s1.getO());
//        int[] a2 = s1.getO();
//        a2[0] = 5;
//        s1.setO(a2);
//        System.out.println(s1);
//        System.out.println(s2);
//        Student s3 = new Student("Андрей", s1.getO());
//        int[] a3 = s1.getO();
//        s1.setO(a3);
//        System.out.println("\n");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//        System.out.println("-------------------------------------------");

//        System.out.println("Задание 4.1");
//        Point p10 = new Point(3, 5);
//        Point p11 = new Point(25, 6);
//        Point p12 = new Point(7, 8);
//        System.out.println(p10);
//        System.out.println(p11);
//        System.out.println(p12);
//
//        System.out.println("-------------------------------------------");
//
//        System.out.println("Задание 4.7");
//        int[] a10 = {3, 4, 5};
//        Student s10 = new Student("Вася", a10);
//        Student s11 = new Student("Максим");
//        System.out.println(s10);
//        System.out.println(s11);
//
//        System.out.println("-------------------------------------------");

        System.out.println("Задание 5.6");
        int[] a20 = {3, 4, 5, 4};
        int[] a21 = {5, 5, 5, 5};
        Student s20 = new Student("Вася", a20);
        Student s21 = new Student("Петя", a21);
        double sr1 = s20.sr();
        double sr2 = s21.sr();
        System.out.println("Средний балл Васи - " + sr1);
        System.out.println("Вася - " + s20.otl());

        System.out.println("Средний балл Пети - " + sr2);
        System.out.println("Петя - " + s21.otl());
    }


}
