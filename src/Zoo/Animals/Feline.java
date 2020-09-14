package Zoo.Animals;

//class Feline is a subclass of class Animal
//This class will have some overridden function

import java.util.Random;

abstract public class Feline extends DefaultAnimal{

    public Feline(String name) {
        super(name);
    }

    @Override
    public String getClassification() {
        return "Feline";
    }

    //Overridden Method to implement Roam().
    //This method will take in a string for the time and output a string to the console
    //This string will indicate that the animal has roamed around its enclosure.
    @Override
    public void Roam() {
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" The ");
        roam.append(getSpecies());
        roam.append(" walks gracefully around its enclosure");

        System.out.println(roam);
    }

    //Overridden Method to implement Sleep()
    //This method will take in a time and output a string
    //It will output a string to show the animal has gone to sleep
    //This method also sets the asleep member to True

    @Override
    public void Sleep() {
        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" finds a nice spot, gets in a cozy position and falls asleep alone");

        System.out.println(sleep); //outputs the contents of sleep to the console

        setAsleep(true); //Sets objects asleep variable to true

    }

    //This overwritten method will be implemented by the feline class
    //This wont apply to the Cat object because the Cat class will override it

    @Override
    public void Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" devours the raw meat while eyeing the zookeeper as a tasty meal");

        System.out.println(eat);
    }

    @Override
    public Boolean Misbehave() {

        Random randomNum = new Random(); //creating an instance of random to use later

        int felineChoice = randomNum.nextInt(9); //Special case is 30/30/40 split so we need 10 options

        if (felineChoice <= 2){ //0, 1, or 2 for a 30% probability of roaming

            //Feline Roams, Misbehaving
            Roam();

            System.out.println("The zookeeper will need to try again");

            return false;

        }
        else if(felineChoice <= 5){ //3, 4 or 5 in order to have 30% chance of making noise

            //Feline makes noise, Misbehaving
            makeNoise();

            System.out.println("The zookeeper needs to try again");

            return false;
        }
        else {
            //Feline will go to sleep as normal, 40% chance
            Sleep();
            return true;
        }

    }
}
