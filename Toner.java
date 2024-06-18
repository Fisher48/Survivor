import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        int sumOfTheTonerConsumption = 0;
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == ' ') {
                sumOfTheTonerConsumption += 0;
                continue;
            }
            if (Line.charAt(i) == '%' || Line.charAt(i) == '2' || Line.charAt(i) == 'm' || Line.charAt(i) == '0'
                    || Line.charAt(i) == 'Z'){
                sumOfTheTonerConsumption += 22;
                continue;
            }
            if (Line.charAt(i) == '&' || Line.charAt(i) == '#' || Line.charAt(i) == 'A' || Line.charAt(i) == 'y') {
                sumOfTheTonerConsumption += 24;
                continue;
            }
            if (Line.charAt(i) == '+' || Line.charAt(i) == 'v' || Line.charAt(i) == 'x' || Line.charAt(i) == 'r') {
                sumOfTheTonerConsumption += 13;
                continue;
            }
            if (Line.charAt(i) == ',' || Line.charAt(i) == '-' || Line.charAt(i) == '^') {
                sumOfTheTonerConsumption += 7;
                continue;
            }
            if (Line.charAt(i) == '1' || Line.charAt(i) == 'V' || Line.charAt(i) == 'z' || Line.charAt(i) == 'w') {
                sumOfTheTonerConsumption += 19;
                continue;
            }
            if (Line.charAt(i) == '7' || Line.charAt(i) == 'L' || Line.charAt(i) == 'T' || Line.charAt(i) == 'l') {
                sumOfTheTonerConsumption += 16;
                continue;
            }
            if (Line.charAt(i) == '8' || Line.charAt(i) == 'P' || Line.charAt(i) == 'U' || Line.charAt(i) == 'a'
                    || Line.charAt(i) == '3' || Line.charAt(i) == 'e') {
                sumOfTheTonerConsumption += 23;
                continue;
            }
            if (Line.charAt(i) == '=' || Line.charAt(i) == 'Y') {
                sumOfTheTonerConsumption += 14;
                continue;
            }
            if (Line.charAt(i) == '>' || Line.charAt(i) == '\\' || Line.charAt(i) == '/' || Line.charAt(i) == '<') {
                sumOfTheTonerConsumption += 10;
                continue;
            }
            if (Line.charAt(i) == 'C' || Line.charAt(i) == 'o' || Line.charAt(i) == 'j' || Line.charAt(i) == 'F') {
                sumOfTheTonerConsumption += 20;
                continue;
            }
            if (Line.charAt(i) == 'D' || Line.charAt(i) == 'E' || Line.charAt(i) == 'O'
                    || Line.charAt(i) == '9' || Line.charAt(i) == 'W' || Line.charAt(i) == '6') {
                sumOfTheTonerConsumption += 26;
                continue;
            }
            if (Line.charAt(i) == 'I' || Line.charAt(i) == 'J' || Line.charAt(i) == '[' || Line.charAt(i) == ']'
                    || Line.charAt(i) == 'n' || Line.charAt(i) == 'X' || Line.charAt(i) == 'f'
                    || Line.charAt(i) == '{' || Line.charAt(i) == '}') {
                sumOfTheTonerConsumption += 18;
                continue;
            }
            if (Line.charAt(i) == 'b' || Line.charAt(i) == 'd' || Line.charAt(i) == 'p' || Line.charAt(i) == 'q'
                    || Line.charAt(i) == 'G' || Line.charAt(i) == 'S' || Line.charAt(i) == 'H' || Line.charAt(i) == 'N') {
                sumOfTheTonerConsumption += 25;
                continue;
            }
            if (Line.charAt(i) == 'g') {
                sumOfTheTonerConsumption += 30;
                continue;
            }
            if (Line.charAt(i) == 'h' || Line.charAt(i) == 's' || Line.charAt(i) == 'K'
                    || Line.charAt(i) == '4' || Line.charAt(i) == 'k') {
                sumOfTheTonerConsumption += 21;
                continue;
            }
            if (Line.charAt(i) == 't' || Line.charAt(i) == 'c' || Line.charAt(i) == 'u' || Line.charAt(i) == '*') {
                sumOfTheTonerConsumption += 17;
                continue;
            }
            if (Line.charAt(i) == '!' || Line.charAt(i) == '~') {
                sumOfTheTonerConsumption += 9;
                continue;
            }
            if (Line.charAt(i) == '\'' || Line.charAt(i) == '`') {
                sumOfTheTonerConsumption += 3;
                continue;
            }
            if (Line.charAt(i) == '?' || Line.charAt(i) == 'i') {
                sumOfTheTonerConsumption += 15;
                continue;
            }
            if (Line.charAt(i) == 'Q') {
                sumOfTheTonerConsumption += 31;
                continue;
            }
            if (Line.charAt(i) == '"') {
                sumOfTheTonerConsumption += 6;
                continue;
            }
            if (Line.charAt(i) == '(' || Line.charAt(i) == ')' || Line.charAt(i) == '|'){
                sumOfTheTonerConsumption += 12;
                continue;
            }
            if (Line.charAt(i) == '.') {
                sumOfTheTonerConsumption += 4;
                continue;
            }
            if (Line.charAt(i) == ':') {
                sumOfTheTonerConsumption += 8;
                continue;
            }
            if (Line.charAt(i) == '@') {
                sumOfTheTonerConsumption += 32;
                continue;
            }
            if (Line.charAt(i) == 'R' || Line.charAt(i) == 'M') {
                sumOfTheTonerConsumption += 28;
                continue;
            }
            if (Line.charAt(i) == '5') {
                sumOfTheTonerConsumption += 27;
                continue;
            }
            if (Line.charAt(i) == ';') {
                sumOfTheTonerConsumption += 11;
                continue;
            }
            if (Line.charAt(i) == '_') {
                sumOfTheTonerConsumption += 8;
                continue;
            }
            if (Line.charAt(i) == '$' || Line.charAt(i) == 'B') {
                sumOfTheTonerConsumption += 29;
                continue;
            }
            if (Line.charAt(i) == '6') {
                sumOfTheTonerConsumption += 26;
            } else {
                sumOfTheTonerConsumption += 23;
            }
        }
        return sumOfTheTonerConsumption;
    }
}


