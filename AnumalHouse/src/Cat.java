public class Cat {
    public static void Askforfood(){
        if (Storage.catfood > 0) {
            Woman.Givecatfood();
            System.out.println("Девушка дала еду коту");
        } else {
            System.out.println("Корма нет");
            Woman.Buycatfood();
            Woman.Givecatfood();
            System.out.println("Девушка дала коту покушать");
        }
    }
}
