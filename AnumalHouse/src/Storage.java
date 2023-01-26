public class Storage {
    static int catfood;
    static int dogfood;
    Storage(int catfood, int dogfood) {
        this.catfood = catfood;
        this.dogfood = dogfood;
    }
    public static void Minuscatfood() {
        catfood = catfood - 1;
        System.out.println("Количество кошачьего корма уменьшилось на 1 кг");
    }
    public static void Minusdogfood() {
        dogfood = dogfood - 1;
        System.out.println("Количество собачьего корма уменьшилось на 1 кг");
    }
    public static void Pluscatfood() {
        catfood = catfood + 5;
        System.out.println("Количество кошачьего корма увеличилось на 5 кг");
    }
    public static void Plusdogfood() {
        dogfood = dogfood + 5;
        System.out.println("Количество собачьего корма увеличилось на 5 кг");
    }
}
