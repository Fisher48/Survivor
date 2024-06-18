public class Exponentiation {

    public static int expon(int number, int degree){
        if (degree > 1) {
            degree--;
            int temp = number;
            number *= expon(temp, degree);
        }
        return number;
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


