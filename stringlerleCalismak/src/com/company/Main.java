package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "     Bugün hava çok güzel.      ";
        System.out.println(mesaj);

        /*
        System.out.println("Eleman sayısı :" + mesaj.length());
        System.out.println("5. eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));  //geçici olarak birleştirme. kalıcı olması için değişkene atamalısın.
        System.out.println(mesaj.startsWith("B"));  // mesaj "A" ile başlıyorsa true döndürür yoksa false.
        System.out.println(mesaj.endsWith(".")); // mesaj ne ile bitiyor ona bakar(bool)

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);// belirli karakterleri alır.(5 dahil değil)
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a")); // "a" yı arar ilk indeksi döndürür.
        System.out.println(mesaj.indexOf("av")); // "av" arar ve bulduğu ilk hafin indeksini aiır.
        System.out.println(mesaj.lastIndexOf("e")); //aramaya sağdan başlar.
        */

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj); //boşluk karakteri terine tire ile değiştirir.
        System.out.println(mesaj.substring(2)); //x indexli karakterinden itibaren parçala(dahil)
        System.out.println(mesaj.substring(2,4)); //2 den 4 e kadar parçala bu aralığı al (2 dahil 4 değil).

        for (String kelime: mesaj.split(" ")){ //boşluk karakterine göre kelime kelime böler.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); //büyük harfe çevirir

        //mesajın başına ve sonuna boşluklar koyduk.

        System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları siler.


    }
}
