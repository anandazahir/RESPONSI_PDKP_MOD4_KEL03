package com.pdkpkel3;

import java.util.Scanner;

public class dekrip {
    static String dekriptor() {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        String kataDkrip = "";
        int shift = -3;
        for (int i = 0; i < kata.length(); i++) {
            char he = kata.charAt(i);
            if (Character.isLetter(he)) {
                if (Character.isLowerCase(he)) {
                    char c = (char) (he + shift);
                    if (c > 'z') {
                        kataDkrip += (char) (he - (26 - shift));
                    } else {
                        kataDkrip += c;
                    }
                } else if (Character.isUpperCase(he)) {
                    char c = (char) (he + shift);
                    if (c > 'Z') {
                        kataDkrip += (char) (he - (26 - shift));
                    } else {
                        kataDkrip += c;
                    }
                }
            } else {
                kataDkrip += he;
            }
        }
        System.out.println("Hasil Dekripsi: "+kataDkrip);
        return kataDkrip;
    }
}
