package main;

public class main {
    public static void main(String[] args) {
        int alas = 15;
        int tinggi = 23;
        double luas = 0.5 * alas * tinggi;
        if (luas % 2 == 0) {
            System.out.println("Luas: " + luas + " Genap");
        } else {
            System.out.println("Luas: " + luas + " Ganjil");
        }
    }
}
