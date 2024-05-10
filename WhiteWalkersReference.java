public class WhiteWalkersReference {

    public static boolean findWlakers(String village) {
        int dig = 0;
        // переменная, хранящая первую цифру в паре.
        // делаем её исходно 0, чтобы первая цифра в строке
        // заведомо не попадала к ней в "пару-10".

        int wnum = 0; // количество ходоков в текущей паре цифр

        boolean has10 = false; // глобальный флажок, выявлены ли в деревне Ходоки

        // Цикл: начинаем посимвольный перебор исходной строки -- в символ ch
        for (int i = 0; i < village.length(); i++) {
            char ch = village.charAt(i);
            if (ch >= '0' && ch <= '9') { // ch --цифра, то
                if (Integer.parseInt(String.valueOf(ch)) + dig == 10) {
                    if (wnum != 3) {
                        return false;
                    }
                    has10 = true; // тонкий момент :)
                    // если пара не соответствует всем требованиям,
                    // прекращаем работу предыдущей инструкцией
                }
                    dig = Integer.parseInt(String.valueOf(ch)); // стартуем следующую пару
                    wnum = 0;
                } else if (village.charAt(i) == '=') {
                    wnum += 1;
                }
        }
        return has10;
    }
}
