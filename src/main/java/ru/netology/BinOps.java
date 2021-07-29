package ru.netology;

/**
 * @author Igor Khristiuk
 */
public class BinOps {

    public String sum(String a, String b) {
        int term0 = Integer.parseInt(a, 2);
        int term1 = Integer.parseInt(b, 2);
        int result = term0 + term1;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int term0 = Integer.parseInt(a, 2);
        int term1 = Integer.parseInt(b, 2);
        int result = term0 * term1;
        return Integer.toBinaryString(result);
    }
}
