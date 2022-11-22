/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class HwCheckCharater {

    // 1: begin with an upper case letter
    public boolean checkBeUpChar(String s) {
        if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
            return true;
        } else {
            return false;
        }
    }

    // 2: begin with a lower case letter
    public boolean checkBeLowChar(String s) {
        if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
            return true;
        } else {
            return false;
        }
    }

    // 3: begin with a digit 
    public boolean checkBeDigit(String s) {
        if (s.charAt(0) >= 48 && s.charAt(0) <= 57) {
            return true;
        } else {
            return false;
        }
    }

    // 4: end with an upper case letter
    public boolean checkEnUpChar(String s) {
        if (s.charAt(s.length() - 1) >= 65 && s.charAt(s.length() - 1) <= 90) {
            return true;
        } else {
            return false;
        }
    }

    // 5: end with a lower case letter
    public boolean checkEnLowChar(String s) {
        if (s.charAt(s.length() - 1) >= 97 && s.charAt(s.length() - 1) <= 122) {
            return true;
        } else {
            return false;
        }
    }

    // 6. end with a digit
    public boolean checkEnDigit(String s) {
        if (s.charAt(s.length() - 1) >= 48 && s.charAt(s.length() - 1) <= 57) {
            return true;
        } else {
            return false;
        }
    }

    // 7: begin with an upper case vowel
    public boolean checkBeUpVowel(String s) {
        if (s.charAt(0) == 'U' || s.charAt(0) == 'E' || s.charAt(0) == 'O' || s.charAt(0) == 'A' || s.charAt(0) == 'I' || s.charAt(0) == 'Y') {
            return true;
        } else {
            return false;
        }
    }

    // 8: begin with a lower case vowel
    public boolean checkBeLowVowel(String s) {
        if (s.charAt(0) == 'u' || s.charAt(0) == 'e' || s.charAt(0) == 'o' || s.charAt(0) == 'a' || s.charAt(0) == 'i' || s.charAt(0) == 'y') {
            return true;
        } else {
            return false;
        }
    }

    // 9: begin with an upper case consonant
    public boolean checkBeUpConsonant(String s) {
        if (s.charAt(0) >= 65 && s.charAt(0) <= 90 && s.charAt(0) != 'U' && s.charAt(0) != 'E' && s.charAt(0) != 'O' && s.charAt(0) != 'A' && s.charAt(0) != 'I' && s.charAt(0) != 'Y') {
            return true;
        } else {
            return false;
        }
    }

    // 10: begin with a lower case consonant
    public boolean checkBeLowConsonant(String s) {
        if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
            if (s.charAt(0) == 'u' || s.charAt(0) == 'e' || s.charAt(0) == 'o' || s.charAt(0) == 'a' || s.charAt(0) == 'i' || s.charAt(0) == 'y') {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // 11: contain at least a digit
    public boolean checkConDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }

    // 12: contain exactly m low vowel
    public boolean checkmLowVowel(String s, int m) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'y') {
                cnt++;
            }
        }
        if (cnt == m) {
            return true;
        } else {
            return false;
        }
    }

    // 13: contain exactly m low consonant
    public boolean checkmLowConsonant(String s, int m) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) != 'u' && s.charAt(i) != 'e' && s.charAt(i) != 'o' && s.charAt(i) != 'a' && s.charAt(i) != 'i' && s.charAt(i) != 'y') {
                    cnt++;
                }
            }
        }
        if (cnt == m) {
            return true;
        } else {
            return false;
        }
    }

    // 14: return the number contained in string
    public int NuminStr(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                num = num * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return num;
    }

    // 15: return the sum of all digits in string
    public int SumDiinStr(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return sum;
    }

    // 16: standard name
    public boolean StandardName(String s) {
        if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    // 17: upper case string
    public boolean checkUpStr(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                cnt++;
            }
        }
        if (cnt == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    // 18: lower case string
    public boolean checkLowStr(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                cnt++;
            }
        }
        if (cnt == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    // 19: digit string
    public boolean checkDiStr(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                cnt++;
            }
        }
        if (cnt == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    // 20: character string
    public boolean checkCharStr(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                cnt++;
            }
        }
        if (cnt == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}

class TestCharacter{
    public static void main(String[] args) {
        String s = "ello";
        HwCheckCharater hw = new HwCheckCharater();
        System.out.println(hw.StandardName(s));
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
    }
}
