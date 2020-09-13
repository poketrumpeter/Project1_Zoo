package Zoo.Animals;

//class Feline is a subclass of class Animal
//This class will have some overidden function
abstract public class Feline extends DefaultAnimal{

    //Overridden Method to implement Roam().
    //This method will take in a string for the time and output a string to the console
    //This string will indicate that the animal has roamed around its enclosure.
    @Override
    public void Roam(String time) {
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" The ");
        roam.append(getSpecies());
        roam.append(" walks gracefully around its enclosure for ");
        roam.append(time);
        roam.append(" minutes");

        System.out.println(roam);
    }

    //Overridden Method to implement Sleep()
    //This method will take in a time and output a string
    //It will output a string to show the animal has gone to sleep
    //This method also sets the asleep member to True

    @Override
    public void Sleep(String time) {
        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" finds a nice spot, gets in a cozy position and falls asleep alone at ");
        sleep.append(time);

        System.out.println(sleep); //outputs the contents of sleep to the console

        setAsleep(true); //Sets objects asleep variable to true

    }

    //This overwritten method will be implemented by the feline class
    //This wont apply to the Cat object because the Cat class will override it

    @Override
    public void Eat(String time) {
        StringBuffer eat = new StringBuffer("At ");
        eat.append(time);
        eat.append(", " );
        eat.append(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" devours the raw meat while eyeing the zookeeper as a tasty meal");

        System.out.println(eat);
    }
}
