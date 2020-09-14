package Zoo.Animals;

import java.util.Random;

public class Dog extends Canine {

    public Dog(String name) {
        super(name);
    }

    //Overridden Function to return Dog as the Species
    @Override
    public String getSpecies() {
        return "dog";
    }

    //Overridden function to Wake up the Dog when the Zookeeper goes to wake the animals
    @Override
    public void wakeUp() {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the dog wakes up and barks happily");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append( " the dog happily and quickly consumes its food then smiles at the zookeeper");

        System.out.println(eat);

    }

    public void Dig(){
        StringBuffer dig = new StringBuffer(getName());
        dig.append(" the dog eagerly digs not caring what the zookeeper is telling it");

        System.out.println(dig);
    }

    @Override
    public void makeNoise() {
        StringBuffer bark = new StringBuffer(getName());
        bark.append(" the dog barks");

        System.out.println(bark);
    }

    @Override
    public Boolean Misbehave() { //Need to randomly generate number to then see if dog roams or digs

        //25% chance the dog will dig instead of roaming
        Random randomNum = new Random();

        int dogChoice = randomNum.nextInt(3);
        if(dogChoice == 0) {// 1/4 possibilities, so we call dog Dig
            Dig();

            System.out.println("The zookeeper will need to try again!");
            return false; //indicate that dog has not roamed yet
        }
        else {
            //either 1, 2, 0r 3
            Roam();
            return true;
        }
    }
}
