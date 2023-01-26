public class Woman {

    public static void Givecatfood() {
        System.out.println("Девушка взяла 1 кг корма из кладовки");
        Storage.Minuscatfood();
    }
    public static void Buycatfood() {
        System.out.println("Девушка купила 5 кг кошачьего корма и пополнила ими кладовку");
        Storage.Pluscatfood();
    }
}
