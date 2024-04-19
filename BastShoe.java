import java.util.*;

public class Level1 {

    public static StringBuffer sb = new StringBuffer();
    static List<String> changes = new ArrayList<>();

    public static String BastShoe(String command) {
        String currentString = "";

        class Operations {
            public void add(String addingString) {
                sb.append(addingString);
                changes.add("+  " + addingString);
                if (changes.size() > 1) {
                    String[] currentString = changes.get(changes.size() - 2).split("  ");
                    if (currentString[0].equals("undo")) {
                        while (changes.size() != 1) {
                            changes.removeFirst();
                        }
                    }
                }
            }

            public void delete(int numberOfSymbols) {
                if (numberOfSymbols > sb.length() - 1) {
                    changes.add("-  " + sb);
                    sb.delete(0, sb.length());
                } else {
                    changes.add("-  " + sb.substring(sb.length() - numberOfSymbols, sb.length()));
                    sb.delete(sb.length() - numberOfSymbols, sb.length());
                }
                if (changes.size() > 1) {
                    String[] currentString = changes.get(changes.size() - 2).split("  ");
                    if (currentString[0].equals("undo")) {
                        while (changes.size() != 1) {
                            changes.removeFirst();
                        }
                    }
                }
            }

            public String getSymbol(int indexOfSymbol) {
                return String.valueOf(sb.charAt(indexOfSymbol));
            }

            public void undo() {
                String[] currentString = new String[2];
                for (int i = changes.size() - 1; i >= 0; i--) {
                    currentString = changes.get(i).split("  ");
                    if (!currentString[0].equals("undo")) {
                        if (currentString[0].equals("+")) {
                            sb.delete(sb.length() - currentString[1].length(), sb.length());
                        } else {
                            sb.append(currentString[1]);
                        }
                        changes.set(i, "undo  " + changes.get(i));
                        break;
                    }
                }
            }

            public void redo() {
                String[] currentString = changes.getFirst().split("  ");
                int index = -1;
                for (int j = 0; j <= changes.size() - 1; j++) {
                    currentString = changes.get(j).split("  ");

                    if (currentString[0].equals("undo")) {
                        index = j;
                        break;
                    }
                }
                if (currentString.length > 2) {
                    if (currentString[1].equals("+")) {
                        sb.append(currentString[2]);
                    } else {
                        sb.delete(sb.length() - currentString[2].length(), sb.length());
                    }
                    changes.set(index, currentString[1] + "  " + currentString[2]);
                }
            }
        }
        String[] command1 = new String[3];

        command1[0] = command.substring(0, 1);
        if (command1[0].equals("1") || command1[0].equals("2") || command1[0].equals("3")) {
            command1[1] = command.substring(2);
        }
        Operations operations = new Operations();
        String charStr = "";
        switch (command1[0]) {
            case ("1"):
                operations.add(command1[1]);
                break;
            case ("2"):
                operations.delete(Integer.parseInt(command1[1]));
                break;
            case ("3"):
                if (Integer.parseInt(command1[1]) > sb.length() - 1) {
                    charStr = "";
                } else {
                    charStr = operations.getSymbol(Integer.parseInt(command1[1]));
                }
                break;
            case ("4"):
                operations.undo();
                break;
            case ("5"):
                operations.redo();
            default:
        }

        if (command1[0].equals("3")) {
            currentString = charStr;
        } else {
            currentString = String.valueOf(sb);
        }
        return currentString;
    }
}


