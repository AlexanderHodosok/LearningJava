package PetHouse;

public class Cat extends Pet {


    public Cat(Woman master) {
        this.master = master;
    }

    public void askForFood() {
        master.giveFood();
    }
}
