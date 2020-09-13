package Zoo;

import Zoo.Animals.*;

public class testZoo {
    public static void main(String[] args) {

        //Test for Each new Animal

        //CANINES

        Animal dog1 = new Dog("Dick");
        dog1.wakeUp("6:00");

        Animal dog2 = new Dog("Lyla");
        dog2.Sleep("8:00 PM");

        Animal wolf1 = new Wolf("Will");
        wolf1.Roam("30");

        Animal wolf2 = new Wolf("Barry");
        wolf2.Eat("10:00 AM");

        // FELINES

        Animal cat1 = new Cat("Callie");
        cat1.wakeUp("8:00 PM");

        Animal lion1 = new Lion("Lulu");
        lion1.Eat("1:00 PM");

        Animal cat2 = new Cat("Juju");
        cat2.Eat("2:00 PM");

        Animal tiger1 = new Tiger("Tom");
        tiger1.Roam("60");

        Animal tiger2 = new Tiger("Saul");
        tiger2.Sleep("4:30 PM");




    }
}
