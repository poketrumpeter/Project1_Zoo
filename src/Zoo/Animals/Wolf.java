package Zoo.Animals;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Wolf extends Canine{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "wolf";
    }

    @Override
    public void wakeUp() {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the wolf wakes up and snarls at the zookeeper at");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override //Overridden function of Eat for the Wolf, Will output a string to console
    public void Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" ferociously devours his meals while eyeing the zookeeper");
        System.out.println(eat);

    }

    @Override
    public void makeNoise() {
        StringBuffer howl = new StringBuffer(getName());
        howl.append(" the wolf howls at the zookeeper");

        System.out.println(howl);
    }
}
