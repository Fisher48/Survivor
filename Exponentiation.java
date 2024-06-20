public class Exponentiation {

    public static int expon(int number, int degree){
        if (degree > 1) {
            number *= expon(number, degree-1);
        }
        return number;
    }

    public static int sumOfTheDigits(int N) {
        int sum = 0;
        if (N >= 1) {
            sum = N % 10;
            sum += sumOfTheDigits(N / 10);
        }
        return sum;
    }
}


