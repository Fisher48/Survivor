import java.util.*;

public class BastShoe2 {

    private static List<String> allChanges = new ArrayList<>();
    private static List<String> numbOfOperations = new ArrayList<>();
    private static int count = 0;
    private static StringBuffer stringBuffer = new StringBuffer();
    private static final char ADDING = '1';
    private static final char DELETE = '2';
    private static final char GET_SYMBOL = '3';
    private static final String UNDO = "4";
    private static final String REDO = "5";

    public static String add(String command) {
        stringBuffer.append(command.substring(2));
        allChanges.add(String.valueOf(stringBuffer));
        numbOfOperations.add(String.valueOf(command.charAt(0)));
        count = allChanges.size()-1;
        return String.valueOf(stringBuffer);
    }

    public static String del(String command) {
        int N = Integer.parseInt(command.substring(2));
        if (N > stringBuffer.length()) {
            stringBuffer.delete(0, stringBuffer.length());
            count = allChanges.size()-1;
            return String.valueOf(stringBuffer);
        }
        stringBuffer.delete(stringBuffer.length() - N, stringBuffer.length());
        allChanges.add(String.valueOf(stringBuffer));
        numbOfOperations.add(String.valueOf(command.charAt(0)));
        count = allChanges.size()-1;
        return String.valueOf(stringBuffer);
    }

    public static String insert(String command) {
        int N = Integer.parseInt(command.substring(2));
        return String.valueOf(stringBuffer.charAt(N));
    }

    public static String BastShoe(String command) {

        if (command.charAt(0) == ADDING) {
            return BastShoe2.add(command);
        }

        if (command.charAt(0) == DELETE) {
            return BastShoe2.del(command);
        }

        if (command.charAt(0) == GET_SYMBOL) {
            return BastShoe2.insert(command);
        }

        if (command.equals(UNDO)) {
            if (numbOfOperations.get(count).equals("1") || numbOfOperations.get(count).equals("2")) {
                count--;
                allChanges.add(allChanges.get(count));
                numbOfOperations.add(command);
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(allChanges.get(count));
                return allChanges.get(count);
            } else {
                return allChanges.get(count);
            }
        }
        if (command.equals(REDO)) {
            if (count != allChanges.size()-1 && !numbOfOperations.get(count+1).contains(UNDO)) {
                count++;
            }
            if (numbOfOperations.get(count).equals(UNDO)){
                allChanges.add(allChanges.get(count));
                numbOfOperations.add(command);
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(allChanges.get(count));
                return allChanges.get(count);
            } else {
                allChanges.add(allChanges.get(count));
                numbOfOperations.add(command);
                stringBuffer.delete(0,stringBuffer.length());
                stringBuffer.append(allChanges.get(count));
                return allChanges.get(count);
            }

        }
        return command;
    }
}


