package com.greenfoxacademy.dependencytasks.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String email) {
        int charPoz = findChar(email,'@');
        if (charPoz == -1) {
            return false;
        } else {
            String remainedEmail = email.substring(charPoz + 1, email.length());
            charPoz = findChar(remainedEmail,'.');
            System.out.println(remainedEmail + charPoz);
            if ((charPoz != -1) && (charPoz < remainedEmail.length() - 1)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int findChar(String where, char charToFind) {
        int i=1;
        while ((where.charAt(i) != charToFind) && (i < where.length() - 1)) {
            i++;
        }
        if (i == where.length() - 1) {
            return -1;
        } else {
            return i;
        }
    }

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

}