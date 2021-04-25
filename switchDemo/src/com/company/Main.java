package com.company;

public class Main {

    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz!");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz!");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz!");
                break;
            case 'F':
                System.out.println("Malesef kaldınız!");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

                //örn. b ve c için aynı şey isteniyorsa

                //case 'B':
                //case 'C':
                //    System.out.println("Mükemmel : Geçtiniz!");
                //    break;

                //şeklinde yazılır.
        }

    }
}
