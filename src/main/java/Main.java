package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        int first = 200;
        int second = 300;

        SqrService service = new SqrService();

        int result = service.calcSqr(first, second);

        System.out.println("Корней найдено: " + result);

    }
}