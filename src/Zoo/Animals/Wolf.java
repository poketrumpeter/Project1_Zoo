package Zoo.Animals;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Wolf extends Canine{

    private final String name; //name is final because we dont want to change it after setting it

    public Wolf(String name) {
        if(name.startsWith("w") || name.startsWith("W")){ //Check to see if name starts with w
            this.name = name; //initializes name of object
            System.out.println(this.name + " is a great name for a Wolf");
        }
        else{
            System.out.println("A better name for a Wolf would be Wally");
            this.name = "Wally"; //initializes a better default name for object
        }

    }

    @Override //
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "wolf";
    }

    @Override
    public void wakeUp(String time) {
        StringBuffer wake = new StringBuffer(this.name);
        wake.append(" the wolf wakes up and snarls at the zookeeper at ");
        wake.append(time);

        System.out.println(wake);

        setAsleep(false);
    }

    @Override //Overridden function of Eat for the Wolf, Will output a string to console
    public void Eat(String time) {

        StringBuffer eat = new StringBuffer(this.name);
        eat.append(" ferociously devours his meals while eyeing the zookeeper at ");
        eat.append(time);

        System.out.println(eat);

    }
}
