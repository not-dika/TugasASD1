# TugasASD1
Hitunglah luas segitiga apabila diketahui alasnya 15cm dan tingginya 23cm.\
Apabila hasil perhitungannya merupakan bilangan genap, maka munculkan\
status ‘Genap’, apabila hasilnya merupakan bilangan ganjil, maka munculkan\
status ‘Ganjil’

### Model Logika :
1. Mendefinisikan panjang alas segitiga
2. Mendefinisikan tinggi segitiga
3. Menghitung luas sesuai dengan rumusnya
4. Membuat pecabangan dengan menggunakan modulus pada luas untuk menentukan genap atau ganjil
5. Menuliskan hasil perhitungan dengan keterangan genap atau ganjil

### Pseudocode :
```java
public class main {
    public static void main(String[] args) {
        int alas = 11;
        int tinggi = 23;
        int luas = alas * tinggi / 2;
        if (luas % 2 == 0) {
            System.out.println("Luas: " + luas + " Genap");
        } else {
            System.out.println("Luas: " + luas + " Ganjil");
        }
    }
}
```
