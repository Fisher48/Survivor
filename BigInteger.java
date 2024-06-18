import java.util.*;

public class BigInteger {
    public static String BigMinus(String s1, String s2) {
        String diff = "";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int len = 0;
        boolean isDiffPositive = true;
        if (s1.equals(s2)) {
            return diff = "0";
        }
        if (s1.length() == s2.length()) {
            boolean isFirstBigger = true;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    isFirstBigger = true;
                    break;
                } else if (s2.charAt(i) >  s1.charAt(i)) {
                    isFirstBigger = false;
                    break;
                }
            }

            if (isFirstBigger) {
                len = c1.length;
                char[] c3 = new char[len];

                for (int i = 0; i < len; i++) {
                    c3[i + len - c2.length] = c2[i];
                }

                for (int i = len - 1; i >= 0; i--) {
                    if (c3[i] == 0) {
                        if (!isDiffPositive) {
                            c1[i] -= 1;
                            isDiffPositive = true;
                            if (c1[i] == '0') {
                                continue;
                            }
                        }
                        diff += c1[i];
                        continue;
                    }
                    if (!isDiffPositive) {
                        c1[i] -= 1;
                    }
                    if (c1[i] - c3[i] > 0) {
                        diff += c1[i] - c3[i];
                        isDiffPositive = true;
                        continue;
                    } else if (c1[i] == c3[i]) {
                        diff += 0;
                        isDiffPositive = true;
                        continue;
                    }
                    if (c1[i] - c3[i] < 0) {
                        diff += c1[i] + 10 - c3[i];
                        isDiffPositive = false;
                    }
                }
            }
            if (!isFirstBigger) {
                len = c2.length;
                char[] c3 = new char[len];

                for (int i = 0; i < len; i++) {
                    c3[i + len - c1.length] = c1[i];
                }

                for (int i = len - 1; i >= 0; i--) {
                    if (c3[i] == 0) {
                        if (!isDiffPositive) {
                            c2[i] -= 1;
                            isDiffPositive = true;
                            if (c2[i] == '0') {
                                continue;
                            }
                        }
                        diff += c2[i];
                        continue;
                    }
                    if (!isDiffPositive) {
                        c2[i] -= 1;
                    }
                    if (c2[i] - c3[i] > 0) {
                        diff += c2[i] - c3[i];
                        isDiffPositive = true;
                        continue;
                    } else if (c2[i] - c3[i] == 0) {
                        isDiffPositive = true;
                        continue;
                    }
                    if (c2[i] - c3[i] < 0) {
                        diff += c2[i] + 10 - c3[i];
                        isDiffPositive = false;
                    }
                }
            }
        }
        if (s1.length() > s2.length()) {
            len = c1.length;
            char[] c3 = new char[len];

            for (int i = 0; i < c2.length; i++) {
                c3[i + len - c2.length] = c2[i];
            }

            for (int i = len - 1; i >= 0; i--) {
                if (c3[i] == 0) {
                    if (!isDiffPositive) {
                        c1[i] -= 1;
                        isDiffPositive = true;
                        if (c1[i] == '0') {
                            continue;
                        }
                    }
                    diff += c1[i];
                    continue;
                }
                if (!isDiffPositive) {
                    c1[i] -= 1;
                }
                if (c1[i] >= c3[i]) {
                    diff += c1[i] - c3[i];
                    isDiffPositive = true;
                    continue;
                }
                if (c1[i] <= c3[i]) {
                    diff += c1[i] + 10 - c3[i];
                    isDiffPositive = false;
                }
            }
        }
        if (s1.length() < s2.length()) {
            len = c2.length;
            char[] c3 = new char[len];

            for (int i = 0; i < c1.length; i++) {
                c3[i + len - c1.length] = c1[i];
            }

            for (int i = len - 1; i >= 0; i--) {
                if (c3[i] == 0) {
                    if (!isDiffPositive) {
                        c2[i] -= 1;
                        isDiffPositive = true;
                        if (c2[i] == '0') {
                            continue;
                        }
                    }
                    diff += c2[i];
                    continue;
                }
                if (!isDiffPositive) {
                    c2[i] -= 1;
                }
                if (c2[i] >= c3[i]) {
                    diff += c2[i] - c3[i];
                    isDiffPositive = true;
                    continue;
                }
                if (c2[i] <= c3[i]) {
                    diff += c2[i] + 10 - c3[i];
                    isDiffPositive = false;
                }
            }
        }
        char[] properDiff = new char[diff.length()];
        for (int i = 0; i <= diff.length() - 1; i++) {
            properDiff[diff.length() - i - 1] = diff.charAt(i);
        }
        for (int i = 0; i <= properDiff.length; i++) {
            if (properDiff[i] == 48) {
                properDiff[i] = ' ';
            } else  {
                break;
            }
        }
        diff = new String(properDiff);
        diff = diff.replaceAll(" ","");
        return diff;
    }
}


