public class MuscleFibers {

    public static int getDuplicates(int[] arr) {

        byte[] buffer = new byte[8192];
        int duplicates = 0;
        for (int num : arr) {
            int index = num / 8;
            int bit = num % 8;
            if ((buffer[index] & (1 << bit)) == 0) {
                buffer[index] |= (byte) (1 << bit);
            }
            else if ((buffer[index + 4096] & (1 << bit)) == 0) {
                    buffer[index + 4096] |= (byte) (1 << bit);
                    duplicates++;
            }
        }
        return duplicates;
    }
}


