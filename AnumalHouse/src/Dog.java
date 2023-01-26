public class Dog {
    public static void Askforfood(){
        if (Storage.dogfood > 0) {
            Man.Givedogfood();
            System.out.println("Парень дал еду собаке");
        } else {
            System.out.println("Корма нет");
            Man.Buydogfood();
            Man.Givedogfood();
            System.out.println("Парень дал псу покушать");
        }
    }
}
