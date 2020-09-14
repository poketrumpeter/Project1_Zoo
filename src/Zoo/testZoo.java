package Zoo;

import Zoo.Animals.*;

public class testZoo {
    public static void main(String[] args) {

        //Test for Each new Animal

        //CANINES

        Animal dog1 = new Dog("Dick");
        dog1.wakeUp();

        Animal dog2 = new Dog("Lyla");
        dog2.Sleep();

        Animal wolf1 = new Wolf("Will");
        wolf1.Roam();

        Animal wolf2 = new Wolf("Barry");
        wolf2.Eat();

        // FELINES

        Animal cat1 = new Cat("Callie");
        cat1.wakeUp();

        Animal lion1 = new Lion("Lulu");
        lion1.Eat();

        Animal cat2 = new Cat("Juju");
        cat2.Eat();

        Animal tiger1 = new Tiger("Tom");
        tiger1.Roam();

        Animal tiger2 = new Tiger("Saul");
        tiger2.Sleep();

        //PACHYDERMS


        //FISH



    }
}
