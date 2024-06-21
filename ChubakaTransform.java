import java.util.*;

public class ChubakaTransform {

    public static List<Integer> setTransformation(int[] A){
        ArrayList<Integer> B = new ArrayList<>();
        int k = 0;
        int max = -1;
        for (int i = 0; i <= A.length-1; i++) {
            for (int j = 0; j <= A.length-i-1; j++) {
                k = i + j;
                for (int x = j; x <= k; x++) {
                    if (A[x] > max) {
                        max = A[x];
                    }
                }
                B.add(max);
                max = -1;
            }
        }
        return B;
    }

    public static boolean TransformTransform(int A[], int N){
        List<Integer> B1 = setTransformation(A);
        int[] temp = new int[B1.size()];
        for (int i = 0; i < B1.size(); i++) {
            temp[i] = B1.get(i);
        }
        List<Integer> B2 = setTransformation(temp);
        boolean isEvenSum = false;
        int sumAfterDoubleTransf = 0;
        for (int i = 0; i < B2.size(); i++){
            sumAfterDoubleTransf += B2.get(i);
        }
        if (sumAfterDoubleTransf % 2 == 0) {
            isEvenSum = true;
        }
        return isEvenSum;
    }
}


