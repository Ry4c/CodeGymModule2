package Exercise;

public class Exercise {
    public static int fryingTimes(int rolls) {
        int times;
        times = (rolls % 9 == 0) ? rolls / 9 : rolls / 9 + 1;
        return times;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }

    public static double biggestInThree(double num1, double num2, double num3) {
        if (num1 > num2) {
            if (num1 > num3) return num1;
            else return num3;
        } else {
            if (num2 > num3) return num2;
            else return num3;
        }
    }

    public static String triangleType(double edge1, double edge2, double edge3) {
        if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
            if (edge1 == edge3 && edge1 == edge2) return "tam giac deu";
            return "tam giac can";
        } else {
            if (Math.pow(edge1, 2) + Math.pow(edge2, 2) == Math.pow(edge3, 2)
                    || Math.pow(edge2, 2) + Math.pow(edge3, 2) == Math.pow(edge1, 2)
                    || Math.pow(edge1, 2) + Math.pow(edge3, 2) == Math.pow(edge2, 2))
                return "tam giac vuong";
            return "dech co loai nao";
        }
    }

    public static boolean isSquareNumber(int number) {
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt == number)
            return true;
        return false;
    }

    public static void showSquareNum(int num1, int num2) {
        for (int i = num1; i != num2 + ((num1 < num2) ? 1 : -1); i += ((num1 < num2) ? 1 : -1)) {
            if (isSquareNumber(i))
                System.out.println("i");
        }
    }

    public static int sumOfThree(int n, int s) {
        int count = 0;
        if (n < s / 3) return 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s - i - j >0 && s - i - j < n) count++;
            }
        }
        return count;
    }
}
