import java.util.*;

public class ChubakaTransform {

    public static List<Integer> setTransformation(int[] A){
        ArrayList<Integer> B = new ArrayList<>();
        int max = -1;
        for (int i = 0; i <= A.length-1; i++) {
            for (int j = 0; j <= A.length-i-1; j++) {
                int k = i + j;
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
        // Создаем временный список, чтобы прогнать его еще раз через Метод Трансформации.
        // Так как этого требует условие задания (Двойная Трансформация).
        for (int i = 0; i < B1.size(); i++) {
            temp[i] = B1.get(i);
        }
        List<Integer> B2 = setTransformation(temp);
        int sumAfterDoubleTransf = 0;
        for (int i = 0; i < B2.size(); i++){
            sumAfterDoubleTransf += B2.get(i);
        }
        return sumAfterDoubleTransf % 2 == 0;
    }
}


