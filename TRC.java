public class TRC {

    public static int[] TRC_sorting(int[] trc, int Lo, int Mid, int Hi) {
        int temp = 0;
        if (Mid > Hi) {
            return trc;
        }
        if (trc[Mid] == 0) {
            temp = trc[Mid];
            trc[Mid] = trc[Lo+1];
            trc[Lo+1] = temp;
            Mid++; Lo++;
        } else if (trc[Mid] == 1) {
            Mid++;
        } else if (trc[Mid] == 2) {
            temp = trc[Mid];
            trc[Mid] = trc[Hi];
            trc[Hi] = temp;
            Hi--;
        }
        return TRC_sorting(trc, Lo, Mid, Hi);
    }

    public static int[] TRC_sort(int[] trc) {
        return TRC_sorting(trc, -1, 0, trc.length-1);
    }

}
