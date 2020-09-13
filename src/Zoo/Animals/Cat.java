package Zoo.Animals;

//This is the implementation for the Cat class
//This is the base class that will be a subclass of the Feline Abstract class
//This class provides implementations for getName(), getSpecies(), wakeUp(), and eat()

public class Cat extends Feline{

    private final String name;

    //Constructor will check the quality of a given name.
    //If the name of the cat doesnt start with a C, give it a default name
    public Cat(String name) {
        if(name.startsWith("c") || name.startsWith("C")){ //checking if the cat has a good name
            System.out.println(name + " is a great name for a Cat!");
            this.name = name;
        }
        else{
            System.out.println("A better name for a cat would be Crystal");
            this.name = "Crystal";
        }
    }

    //Overridden function that will return the name of a given animal object
    @Override
    public String getName() {
        return this.name;
    }

    //Overridden function that will return the specific species of animal
    @Override
    public String getSpecies() {
        return "cat";
    }

    //Overridden function to indicate the animal is woken up
    //Will output string to the console and update the awake variable

    @Override
    public void wakeUp(String time) {
        StringBuffer wake = new StringBuffer("At "); //String buffer to form output string
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the cat wakes up slowly with a gentle purr. The cat looks up to the Zookeeper with a cute look.");

        System.out.println(wake);
        setAsleep(false);
    }

    //Overridden function to indicate that the cat is fed.
    //Will output a string to the console when zookeeper feeds the cat
    //this method overrides the eat function provided in Feline class because Cat is different than Lion and Tiger
    @Override
    public void Eat(String time) {
        StringBuffer eat = new StringBuffer("At ");
        eat.append(time);
        eat.append(", ");
        eat.append(this.name);
        eat.append(" the cat sips milk and eats its food slow and quiet");

        System.out.println(eat);

    }
}
