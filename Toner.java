import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        int sumTonerConsumption = 0;
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == ' ') {
                sumTonerConsumption += 0;
                continue;
            }
            if (Line.charAt(i) == '%' || Line.charAt(i) == '2' || Line.charAt(i) == 'm' || Line.charAt(i) == '0'
                    || Line.charAt(i) == 'Z'){
                sumTonerConsumption += 22;
                continue;
            }
            if (Line.charAt(i) == '&' || Line.charAt(i) == '#' || Line.charAt(i) == 'A' || Line.charAt(i) == 'y') {
                sumTonerConsumption += 24;
                continue;
            }
            if (Line.charAt(i) == '+' || Line.charAt(i) == 'v' || Line.charAt(i) == 'x' || Line.charAt(i) == 'r') {
                sumTonerConsumption += 13;
                continue;
            }
            if (Line.charAt(i) == ',' || Line.charAt(i) == '-' || Line.charAt(i) == '^') {
                sumTonerConsumption += 7;
                continue;
            }
            if (Line.charAt(i) == '1' || Line.charAt(i) == 'V' || Line.charAt(i) == 'z' || Line.charAt(i) == 'w') {
                sumTonerConsumption += 19;
                continue;
            }
            if (Line.charAt(i) == '7' || Line.charAt(i) == 'L' || Line.charAt(i) == 'T' || Line.charAt(i) == 'l') {
                sumTonerConsumption += 16;
                continue;
            }
            if (Line.charAt(i) == '8' || Line.charAt(i) == 'P' || Line.charAt(i) == 'U' || Line.charAt(i) == 'a'
                    || Line.charAt(i) == '3' || Line.charAt(i) == 'e') {
                sumTonerConsumption += 23;
                continue;
            }
            if (Line.charAt(i) == '=' || Line.charAt(i) == 'Y') {
                sumTonerConsumption += 14;
                continue;
            }
            if (Line.charAt(i) == '>' || Line.charAt(i) == '\\' || Line.charAt(i) == '/' || Line.charAt(i) == '<') {
                sumTonerConsumption += 10;
                continue;
            }
            if (Line.charAt(i) == 'C' || Line.charAt(i) == 'o' || Line.charAt(i) == 'j' || Line.charAt(i) == 'F') {
                sumTonerConsumption += 20;
                continue;
            }
            if (Line.charAt(i) == 'D' || Line.charAt(i) == 'E' || Line.charAt(i) == 'O'
                    || Line.charAt(i) == '9' || Line.charAt(i) == 'W' || Line.charAt(i) == '6') {
                sumTonerConsumption += 26;
                continue;
            }
            if (Line.charAt(i) == 'I' || Line.charAt(i) == 'J' || Line.charAt(i) == '[' || Line.charAt(i) == ']'
                    || Line.charAt(i) == 'n' || Line.charAt(i) == 'X' || Line.charAt(i) == 'f'
                    || Line.charAt(i) == '{' || Line.charAt(i) == '}') {
                sumTonerConsumption += 18;
                continue;
            }
            if (Line.charAt(i) == 'b' || Line.charAt(i) == 'd' || Line.charAt(i) == 'p' || Line.charAt(i) == 'q'
                    || Line.charAt(i) == 'G' || Line.charAt(i) == 'S' || Line.charAt(i) == 'H' || Line.charAt(i) == 'N') {
                sumTonerConsumption += 25;
                continue;
            }
            if (Line.charAt(i) == 'g') {
                sumTonerConsumption += 30;
                continue;
            }
            if (Line.charAt(i) == 'h' || Line.charAt(i) == 's' || Line.charAt(i) == 'K'
                    || Line.charAt(i) == '4' || Line.charAt(i) == 'k') {
                sumTonerConsumption += 21;
                continue;
            }
            if (Line.charAt(i) == 't' || Line.charAt(i) == 'c' || Line.charAt(i) == 'u' || Line.charAt(i) == '*') {
                sumTonerConsumption += 17;
                continue;
            }
            if (Line.charAt(i) == '!' || Line.charAt(i) == '~') {
                sumTonerConsumption += 9;
                continue;
            }
            if (Line.charAt(i) == '\'' || Line.charAt(i) == '`') {
                sumTonerConsumption += 3;
                continue;
            }
            if (Line.charAt(i) == '?' || Line.charAt(i) == 'i') {
                sumTonerConsumption += 15;
                continue;
            }
            if (Line.charAt(i) == 'Q') {
                sumTonerConsumption += 31;
                continue;
            }
            if (Line.charAt(i) == '"') {
                sumTonerConsumption += 6;
                continue;
            }
            if (Line.charAt(i) == '(' || Line.charAt(i) == ')' || Line.charAt(i) == '|'){
                sumTonerConsumption += 12;
                continue;
            }
            if (Line.charAt(i) == '.') {
                sumTonerConsumption += 4;
                continue;
            }
            if (Line.charAt(i) == ':') {
                sumTonerConsumption += 8;
                continue;
            }
            if (Line.charAt(i) == '@') {
                sumTonerConsumption += 32;
                continue;
            }
            if (Line.charAt(i) == 'R' || Line.charAt(i) == 'M') {
                sumTonerConsumption += 28;
                continue;
            }
            if (Line.charAt(i) == '5') {
                sumTonerConsumption += 27;
                continue;
            }
            if (Line.charAt(i) == ';') {
                sumTonerConsumption += 11;
                continue;
            }
            if (Line.charAt(i) == '_') {
                sumTonerConsumption += 8;
                continue;
            }
            if (Line.charAt(i) == '$' || Line.charAt(i) == 'B') {
                sumTonerConsumption += 29;
                continue;
            }
            if (Line.charAt(i) == '6') {
                sumTonerConsumption += 26;
            } else {
                sumTonerConsumption += 23;
            }
        }
        return sumTonerConsumption;
    }
}


