package PetHouse;

public class Dog extends Pet {




    public Dog(Man master) {
        this.master = master;
    }

    public void askForFood() {
        master.giveFood();
    }
}
