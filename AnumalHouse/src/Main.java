public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Storage storage1 = new Storage(0,1);
        Storage storage2 = new Storage(1,0);
        CatFood catfood = new CatFood();
        DogFood dogfood = new DogFood();

        System.out.println("Кот попросил еды у хозяйки");
        cat.Askforfood();
        System.out.println("Пес попросил покушать у хозяина");
        dog.Askforfood();




    }
}