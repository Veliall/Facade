package ru.netology;

/**
 * @author Igor Khristiuk
 */
public class Main {

    public static void main(String[] args) {

        BinOps bins = new BinOps();

        System.out.println(bins.sum("001", "101"));
        System.out.println(bins.mult("001", "101"));
    }
}
