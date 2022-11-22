/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class Birthday {

    public static void main(String[] args) {
        int caf = 20, cat = 0, cyt = 6, cyf = 55, cr = 96, cas = 149, cys = 160;
        for (int i = 1; i <= 24; i++) {
            if (i > 6 && i % 2 == 1) {
                caf--;
                cas--;
                cat += 2;
            }
            if (i == 7 || i == 9 || i == 11) {
                cyt -= 2;
                cyf++;
                cys++;
            }
            if (i >= 13 && i % 2 == 1) {
                cr++;
            }
            for (int j = 1; j <= 171; j++) {
                if (4 < i && i <= 20) {
                    if (j == 3 || j == 4 || j == 9 || j == 10 || j == 31 || j == 32 || j == 43 || j == 44 || j == 75 || j == 76 || j == 89 || j == 90 || j == 94 || j == 95 || j == 110 || j == 111 || j == 120 || j == 121 || j == 126 || j == 127 || j == 130 || j == 131) {
                        System.out.print("*");
                    } else if ((i == 12 || i == 13) && 4 < j && j < 9) {
                        System.out.print("*");
                    } else if (j == caf || j == caf + 1 || j == caf + cat || j == caf + cat + 1) {
                        System.out.print("*");
                    } else if ((i == 15 || i == 16) && j >= 17 && j <= 24) {
                        System.out.print("*");
                    } else if ((i >= 5 && i <= 8) && ((j >= 31 + (i - 5) * 2 && j <= 34 + (i - 5) * 2) || (j >= 43 + (i - 5) * 2 && j <= 46 + (i - 5) * 2) || (j >= 130 + (i - 5) * 2 && j <= 133 + (i - 5) * 2))) {
                        System.out.print("*");
                    } else if ((i >= 9 && i <= 12) && ((j >= 37 - (i - 9) * 2 && j <= 40 - (i - 9) * 2) || (j >= 49 - (i - 9) * 2 && j <= 52 - (i - 9) * 2))) {
                        System.out.print("*");
                    } else if ((i >= 5 && i <= 12) && (j == cyf || j == cyf + 1 || j == cyf + cyt + 2 || j == cyf + cyt + 3)) {
                        System.out.print("*");
                    } else if ((i >= 13 && i <= 20) && (j == 59 || j == 60)) {
                        System.out.print("*");
                    } else if (i >= 5 && i <= 7 && ((j >= 75 + (i - 5) * 2 && j <= 78 + (i - 5) * 2) || (j >= 94 + (i - 5) * 2 && j <= 97 + (i - 5) * 2))) {
                        System.out.print("*");
                    } else if (i >= 8 && i <= 10 && ((j >= 79 - (i - 8) * 2 && j <= 82 - (i - 8) * 2) || (j >= 98 - (i - 8) * 2 && j <= 101 - (i - 8) * 2))) {
                        System.out.print("*");
                    } else if (i >= 11 && i <= 15 && j >= 75 + (i - 11) * 2 && j <= 78 + (i - 11) * 2) {
                        System.out.print("*");
                    } else if (i >= 16 && i <= 20 && j >= 83 - (i - 16) * 2 && j <= 86 - (i - 16) * 2) {
                        System.out.print("*");
                    } else if (i >= 11 && i <= 20 && (j == cr || j == cr + 1)) {
                        System.out.print("*");
                    } else if ((i == 5 || i == 6) && j >= 104 && j <= 117) {
                        System.out.print("*");
                    } else if ((i == 12 || i == 13) && j >= 122 && j <= 125) {
                        System.out.print("*");
                    } else if (i >= 17 && i <= 20 && j >= 136 - (i - 17) * 2 && j <= 139 - (i - 17) * 2) {
                        System.out.print("*");
                    } else if (i > 8 && i <= 16 && (j == 138 || j == 139)) {
                        System.out.print("*");
                    } else if (j == cas || j == cas + 1 || j == cas + cat || j == cas + cat + 1) {
                        System.out.print("*");
                    } else if ((i == 15 || i == 16) && j >= 146 && j <= 153) {
                        System.out.print("*");
                    } else if ((i >= 5 && i <= 12) && (j == cys || j == cys + 1 || j == cys + cyt + 2 || j == cys + cyt + 3)) {
                        System.out.print("*");
                    } else if (i >= 13 && i <= 20 && (j == 164 || j == 165)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        int y = 60, yt = 8;
//        for (int i = 1; i <= 20; i++) {
//            if (i <= 8 && i % 2 == 1) {
//                yt -= 2;
//                y++;
//            }
//            for (int j = 1; j <= 171; j++) {
//                if (i >= 1 && i <= 16) {
//                    if (j == 76 || j == 75 || j == 72 || j == 71 || j == 59 || j == 60 || j == 101 || j == 102 || j == 111 || j == 112) {
//                        System.out.print("*");
//                    } else if (i <= 8 && (j == y || j == y + 1 || j == y + yt + 2 || j == y + yt + 3)) {
//                        System.out.print("*");
//                    } else if ((i == 1 || i == 2 || i == 8 || i == 9 || i == 15 || i == 16) && 77 <= j && j <= 86) {
//                        System.out.print("*");
//                    } else if ((i == 1 || i == 2) && j >= 96 && j <= 107) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                } else if ((i == 18 || i == 19) && (j == 80 || j == 81)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
