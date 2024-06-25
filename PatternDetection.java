import java.util.*;

public class PatternDetection {

    public static final char EDGE_ELEMENT = '*';

    public static boolean LineAnalysis(String line) {
        StringBuilder reverse = new StringBuilder();
        if (line.charAt(0) != EDGE_ELEMENT || line.charAt(line.length()-1) != EDGE_ELEMENT) {
            return false;
        }
        for (int i = line.length()-1; i >= 0; i--) {
            reverse.append(line.charAt(i));
        }
        return reverse.toString().equals(line);
    }
}
