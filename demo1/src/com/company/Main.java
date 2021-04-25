package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hi guys!");
        System.out.println("ikinci satır" +
                "birleşik mi ki");

        // ne kadar boşluk koyduğun önemli değil
        // çünkü kod her zaman ; ile bitiyor (satır sonuna ; koymak zorundasınnnn!!!!)
        // case sensitive = büyük-küçük harf duyarlı
        // S.o dediğinde direkt geliyor!
        // Kodu çalıştırmadan önce build etmelisin!!!!!!!!!!!!!!!!!

        // VARİABLES ATAMA
        // <veritipi>.<değişken adı> = <değer>

        //VeriTipleri(kapladığı alan(byte) artan sırayla)
        //boolean -> true,false
        //char -> single character(unicode)  Tek tırnakla yazılmalı çift tırnak olunca string algılıyor.!!!!!!!!!!!!!!

        //byte  -32768 to 32767
        //short  -2147483648 to 217483647
        //int
        //long

        //float
        //double

        int sayi = 15;
        if (sayi < 20) {
            System.out.println("yirmiden büyüktür.");
        } else if (sayi == 20) {
            System.out.println("Yirmiye eşittir.");
        } else {
            System.out.println("yirmiden büyüktür.");
        }

    }
}
