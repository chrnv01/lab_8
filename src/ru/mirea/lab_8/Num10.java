package ru.mirea.lab_8;

public class Num10 {
    public static int reverseNumber(int num, int res) {
        if (num == 0) {
            return res;
        }

        res = res * 10 + num % 10;
        return reverseNumber(num / 10, res);
    }

    public static void main(String[] args) {
        int n = 31043; // заданное число
        int result = reverseNumber(n, 0);
        System.out.println(result);
    }
}
