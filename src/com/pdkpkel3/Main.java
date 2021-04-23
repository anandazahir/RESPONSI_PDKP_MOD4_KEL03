package com.pdkpkel3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dekrip dekripsi = new dekrip();
        menu();
        int metode = 0;
        do {
            metode = input.nextInt();
            switch (metode) {
                case (1):
                    System.out.println("Masukkan kata yang ingin dienkripsi:");
                    enkripsi();
                    break;
                case (2):
                    System.out.println("Masukkan kode yang ingin didekripsi:");
                    dekripsi.dekriptor();
                    break;
                case (3):
                    System.out.println("Program Dihentikan");
                    break;
                default:
                    System.out.println("[Mohon pilih antara 1, 2, atau 3]"+
                            "\nPilih metode: ");
                    metode = 0;
                    break;
            }
        } while (metode==0);
    }

    static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Praktikum DKP: Responsi Modul 4"+
                "\nShift 1: Kelompok 3"+
                "\n1. Ananda Muhammad Zahir (21120120140115)"+
                "\n2. Didan Hasan Murtaqi (21120120140103)"+
                "\n3. Juliant Raffa (21120120130127)"+
                "\n4. Sachiko Fitria Ramandanti (21120120140103)"+
                "\n "+
                "\n[[[ PROGRAM ENKRIPSI & DEKRIPSI ]]]"+
                "\n1. Enkripsi"+
                "\n2. Dekripsi"+
                "\n3. Keluar"+
                "\nPilih metode: ");
    }

    static String enkripsi() {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        String kataEnkrip = "";
        int shift = 3;
        for (int i=0; i<kata.length(); i++) {
            char he = kata.charAt(i);
            if (Character.isLetter(he)) {
                if (Character.isLowerCase(he)) {
                    char c = (char) (he+shift);
                    if (c>'z') {
                        kataEnkrip += (char) (he-(26-shift));
                    } else {
                        kataEnkrip += c;
                    }
                } else if (Character.isUpperCase(he)) {
                    char c = (char) (he+shift);
                    if(c>'Z') {
                        kataEnkrip += (char) (he-(26-shift));
                    } else {
                        kataEnkrip += c;
                    }
                }
            } else {
                kataEnkrip += he;
            }
        }
        System.out.println("Hasil Enkripsi: "+kataEnkrip);
        return kataEnkrip;
    }
}