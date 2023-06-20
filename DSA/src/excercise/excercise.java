package excercise;

public class excercise {

    public int sumOfSquaring(int x, int y) {
        int sum = 0;
        for (int i = x; i != y + ((x < y) ? 1 : -1); i += ((x - y) > 0 ? -1 : 1)) {
            sum += i * i;
        }
        return sum;
    }

    public double sumOfSomething(int n) {
        double sum = 100;
        for (int i = 1; i <= n; i++) {
            sum += (double) (n * (n + 1)) / ((n + 1) * (n + 2));
        }
        return sum;
    }

    public int greatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }

    public int leastCommonMultiple(int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }
}

