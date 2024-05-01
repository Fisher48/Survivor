public class Exponentiation {

    public static int expon(int N, int M){
        if (M > 1) {
            M--;
            int temp = N;
            N *= expon(temp, M);
        }
        return N;
    }

    public static int sumOfTheDigits(int N) {
        int sum = 0;
        if (N >= 1) {
            sum = N % 10;
            N /= 10;
            sum += sumOfTheDigits(N);
        }
        return sum;
    }
}


