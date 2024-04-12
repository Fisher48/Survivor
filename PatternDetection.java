import java.util.*;

public class Level1 {

    public static boolean LineAnalysis(String line) {
        String reverse = "";
        if (line.charAt(0) != '*' || line.charAt(line.length()-1) != '*'){
            return false;
        }

        for (int i = line.length()-1; i >= 0; i--) {
            reverse += String.valueOf(line.charAt(i));
        }

        if (reverse.toString().equals(line)) {
            return true;
        }
        return false;
    }
}
