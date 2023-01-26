public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }

    public static void Task1() {
        double R = 333.777;
        double a = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println(a);
    }

    public static void Task2() {
        int T = 14583;
        int sec = T % 60;
        int m = (T - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        System.out.println(h + "ч " + min + "м " + sec + "с");
    }

    public static void Task3() {
        int a = 58;
        int b = 63;
        int c = 45;
        int d = 86;
        int e;
        int f;
        int g;
        if (a < b) {
            e = a;
        } else {
            e = b;
        }
        if (c < d) {
            f = c;
        } else {
            f = d;
        }
        if (e > f) {
            g = e;
        } else {
            g = f;
        }
        System.out.println(g);
    }

    public static void Task4() {
        int a = 69;
        int b = 56;
        int c = 180 - a - b;
        if (c == 90) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }

    public static void Task5() {
        int n = 100;
        int sum = 0;
        for (int a = 1; a <= n; a++) {
            sum = sum + a;
        }
        System.out.println(sum);
    }
    public static void Task6() {
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            sum += a * a;
        }
        System.out.println(sum);
    }

    public static void Task7() {
        int a = 124;
        int b = 3456;
        int c = a/100;
        int d = (a/10)%10;
        int e = a%10;
        int f = b/1000;
        int g = (b/100)%10;
        int k = (b/10)%10;
        int x = b%10;
        System.out.println(c + " " + d + " " + e + " " + "и " + f + " " + g + " " + k + " " + x);
    }
}
