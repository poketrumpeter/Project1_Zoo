package Zoo.Animals;

//This is the implementation for the Cat class
//This is the base class that will be a subclass of the Feline Abstract class
//This class provides implementations for getName(), getSpecies(), wakeUp(), and eat()

public class Cat extends Feline{

    public Cat(String name) {
        super(name);
    }

    //Overridden function that will return the specific species of animal
    @Override
    public String getSpecies() {
        return "cat";
    }

    //Overridden function to indicate the animal is woken up
    //Will output string to the console and update the awake variable

    @Override
    public void wakeUp() {
        StringBuffer wake = new StringBuffer(getName()); //String buffer to form output string
        wake.append(" the cat wakes up slowly with a gentle purr. The cat looks up to the Zookeeper with a cute look.");

        System.out.println(wake);
        setAsleep(false);
    }

    //Overridden function to indicate that the cat is fed.
    //Will output a string to the console when zookeeper feeds the cat
    //this method overrides the eat function provided in Feline class because Cat is different than Lion and Tiger
    @Override
    public void Eat() {
        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the cat sips milk and eats its food slow and quiet");

        System.out.println(eat);

    }

    @Override
    public void makeNoise() {
        //Purr
        StringBuffer purr = new StringBuffer(getName());
        purr.append(" the cat purrs quietly at the zookeeper");

        System.out.println(purr);
    }
}
