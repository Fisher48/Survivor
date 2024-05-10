import java.util.*;

public class BastShoe2 {

    public static List<String> allChanges = new ArrayList<>();
    public static List<String> numbOfOperations = new ArrayList<>();
    public static int count = 0;
    public static StringBuffer stringBuffer = new StringBuffer();

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

        if (command.charAt(0) == '1') {
            return BastShoe2.add(command);
        }

        if (command.charAt(0) == '2') {
            return BastShoe2.del(command);
        }

        if (command.charAt(0) == '3') {
            return BastShoe2.insert(command);
        }

        if (command.equals("4")) {
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
        if (command.equals("5")) {
            if (count != allChanges.size()-1 && !numbOfOperations.get(count+1).contains("4")) {
                count++;
            }
            if (numbOfOperations.get(count).equals("4")){
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


