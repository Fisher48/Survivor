import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        int sum = 0;
        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == ' ') {
                sum += 0;
                continue;
            }
            if (Line.charAt(i) == '%' || Line.charAt(i) == '2' || Line.charAt(i) == 'm' || Line.charAt(i) == '0'
                    || Line.charAt(i) == 'Z'){
                sum += 22;
                continue;
            }
            if (Line.charAt(i) == '&' || Line.charAt(i) == '#' || Line.charAt(i) == 'A' || Line.charAt(i) == 'y') {
                sum += 24;
                continue;
            }
            if (Line.charAt(i) == '+' || Line.charAt(i) == 'v' || Line.charAt(i) == 'x' || Line.charAt(i) == 'r') {
                sum += 13;
                continue;
            }
            if (Line.charAt(i) == ',' || Line.charAt(i) == '-' || Line.charAt(i) == '^') {
                sum += 7;
                continue;
            }
            if (Line.charAt(i) == '1' || Line.charAt(i) == 'V' || Line.charAt(i) == 'z' || Line.charAt(i) == 'w') {
                sum += 19;
                continue;
            }
            if (Line.charAt(i) == '7' || Line.charAt(i) == 'L' || Line.charAt(i) == 'T' || Line.charAt(i) == 'l') {
                sum += 16;
                continue;
            }
            if (Line.charAt(i) == '8' || Line.charAt(i) == 'P' || Line.charAt(i) == 'U' || Line.charAt(i) == 'a'
                    || Line.charAt(i) == '3' || Line.charAt(i) == 'e') {
                sum += 23;
                continue;
            }
            if (Line.charAt(i) == '=' || Line.charAt(i) == 'Y') {
                sum += 14;
                continue;
            }
            if (Line.charAt(i) == '>' || Line.charAt(i) == '\\' || Line.charAt(i) == '/' || Line.charAt(i) == '<') {
                sum += 10;
                continue;
            }
            if (Line.charAt(i) == 'C' || Line.charAt(i) == 'o' || Line.charAt(i) == 'j' || Line.charAt(i) == 'F') {
                sum += 20;
                continue;
            }
            if (Line.charAt(i) == 'D' || Line.charAt(i) == 'E' || Line.charAt(i) == 'O'
                    || Line.charAt(i) == '9' || Line.charAt(i) == 'W' || Line.charAt(i) == '6') {
                sum += 26;
                continue;
            }
            if (Line.charAt(i) == 'I' || Line.charAt(i) == 'J' || Line.charAt(i) == '[' || Line.charAt(i) == ']'
                    || Line.charAt(i) == 'n' || Line.charAt(i) == 'X' || Line.charAt(i) == 'f'
                    || Line.charAt(i) == '{' || Line.charAt(i) == '}') {
                sum += 18;
                continue;
            }
            if (Line.charAt(i) == 'b' || Line.charAt(i) == 'd' || Line.charAt(i) == 'p' || Line.charAt(i) == 'q'
                    || Line.charAt(i) == 'G' || Line.charAt(i) == 'S' || Line.charAt(i) == 'H' || Line.charAt(i) == 'N') {
                sum += 25;
                continue;
            }
            if (Line.charAt(i) == 'g') {
                sum += 30;
                continue;
            }
            if (Line.charAt(i) == 'h' || Line.charAt(i) == 's' || Line.charAt(i) == 'K'
                    || Line.charAt(i) == '4' || Line.charAt(i) == 'k') {
                sum += 21;
                continue;
            }
            if (Line.charAt(i) == 't' || Line.charAt(i) == 'c' || Line.charAt(i) == 'u' || Line.charAt(i) == '*') {
                sum += 17;
                continue;
            }
            if (Line.charAt(i) == '!' || Line.charAt(i) == '~') {
                sum += 9;
                continue;
            }
            if (Line.charAt(i) == '\'' || Line.charAt(i) == '`') {
                sum += 3;
                continue;
            }
            if (Line.charAt(i) == '?' || Line.charAt(i) == 'i') {
                sum += 15;
                continue;
            }
            if (Line.charAt(i) == 'Q') {
                sum += 31;
                continue;
            }
            if (Line.charAt(i) == '"') {
                sum += 6;
                continue;
            }
            if (Line.charAt(i) == '(' || Line.charAt(i) == ')' || Line.charAt(i) == '|'){
                sum += 12;
                continue;
            }
            if (Line.charAt(i) == '.') {
                sum += 4;
                continue;
            }
            if (Line.charAt(i) == ':') {
                sum += 8;
                continue;
            }
            if (Line.charAt(i) == '@') {
                sum += 32;
                continue;
            }
            if (Line.charAt(i) == 'R' || Line.charAt(i) == 'M') {
                sum += 28;
                continue;
            }
            if (Line.charAt(i) == '5') {
                sum += 27;
                continue;
            }
            if (Line.charAt(i) == ';') {
                sum += 11;
                continue;
            }
            if (Line.charAt(i) == '_') {
                sum += 8;
                continue;
            }
            if (Line.charAt(i) == '$' || Line.charAt(i) == 'B') {
                sum += 29;
                continue;
            }
            if (Line.charAt(i) == '6') {
                sum += 26;
            } else {
                sum += 23;
            }
        }
        return sum;
    }
}


