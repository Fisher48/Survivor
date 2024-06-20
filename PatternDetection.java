import java.util.*;

public class Level1 {

    public static boolean LineAnalysis(String line) {
        StringBuilder reverse = new StringBuilder();
        if (line.charAt(0) != '*' || line.charAt(line.length()-1) != '*'){
            return false;
        }
        for (int i = line.length()-1; i >= 0; i--) {
            reverse.append(line.charAt(i));
        }
        return reverse.toString().equals(line);
    }
}
