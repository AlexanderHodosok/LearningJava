public class Man {
    public static void Givedogfood() {
        System.out.println("Парень взял 1 кг собачьего корма из кладовки");
        Storage.Minusdogfood();
    }
    public static void Buydogfood() {
        System.out.println("Парень купил 5 кг собачьего корма и пополнил ими кладовку");
        Storage.Plusdogfood();
    }

}
