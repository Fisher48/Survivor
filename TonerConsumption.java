import java.util.*;

public class TonerConsumption {

    public static final int DEFAULT_CONSUMPTION = 23;

    public static int getConsumption(String Line) {
        Map<Character, Integer> costBySymbols = new HashMap<>();
        costBySymbols.put(' ',0);
        costBySymbols.put('%',22); costBySymbols.put('2',22); costBySymbols.put('m',22); costBySymbols.put('0',22); costBySymbols.put('Z',22);
        costBySymbols.put('&',24); costBySymbols.put('#',24); costBySymbols.put('A',24); costBySymbols.put('y',24);
        costBySymbols.put('+',13); costBySymbols.put('v',13); costBySymbols.put('x',13); costBySymbols.put('r',13);
        costBySymbols.put(',',7); costBySymbols.put('-',7); costBySymbols.put('^',7);
        costBySymbols.put('1',19); costBySymbols.put('V',19); costBySymbols.put('z',19); costBySymbols.put('w',19);
        costBySymbols.put('7',16); costBySymbols.put('L',16); costBySymbols.put('T',16); costBySymbols.put('l',16);
        costBySymbols.put('8',23); costBySymbols.put('P',23); costBySymbols.put('U',23); costBySymbols.put('a',23); costBySymbols.put('3',23); costBySymbols.put('e',23);
        costBySymbols.put('=',14); costBySymbols.put('Y',14);
        costBySymbols.put('>',10); costBySymbols.put('\\',10); costBySymbols.put('/',10); costBySymbols.put('<',10);
        costBySymbols.put('C',20); costBySymbols.put('o',20); costBySymbols.put('j',20); costBySymbols.put('F',20);
        costBySymbols.put('D',26); costBySymbols.put('E',26); costBySymbols.put('O',26);
        costBySymbols.put('9',26); costBySymbols.put('W',26); costBySymbols.put('6',26);
        costBySymbols.put('I',18); costBySymbols.put('J',18); costBySymbols.put('[',18); costBySymbols.put(']',18);
        costBySymbols.put('n',18); costBySymbols.put('X',18); costBySymbols.put('f',18); costBySymbols.put('{',18); costBySymbols.put('}',18);
        costBySymbols.put('b',25); costBySymbols.put('d',25); costBySymbols.put('p',25); costBySymbols.put('q',25);
        costBySymbols.put('G',25); costBySymbols.put('S',25); costBySymbols.put('H',25); costBySymbols.put('N',25);
        costBySymbols.put('g',30);
        costBySymbols.put('h',21); costBySymbols.put('s',21); costBySymbols.put('K',21); costBySymbols.put('4',21); costBySymbols.put('k',21);
        costBySymbols.put('t',17); costBySymbols.put('c',17); costBySymbols.put('u',17); costBySymbols.put('*',17);
        costBySymbols.put('!',9); costBySymbols.put('~',9);
        costBySymbols.put('\'',3); costBySymbols.put('`',3);
        costBySymbols.put('?',15); costBySymbols.put('i',15);
        costBySymbols.put('Q',31);
        costBySymbols.put('"',6);
        costBySymbols.put('(',12); costBySymbols.put(')',12); costBySymbols.put('|',12);
        costBySymbols.put('.',4);
        costBySymbols.put(':',8);
        costBySymbols.put('@',32);
        costBySymbols.put('R',28); costBySymbols.put('M',28);
        costBySymbols.put('5',27);
        costBySymbols.put(';',11);
        costBySymbols.put('_',8);
        costBySymbols.put('$',29); costBySymbols.put('B',29);

        int sumTonerConsumption = 0;
        for (char symbol : Line.toCharArray()) {
            sumTonerConsumption += costBySymbols.getOrDefault(symbol, DEFAULT_CONSUMPTION);
        }
        return sumTonerConsumption;
    }
}


