package Zoo.Animals;

public class Shark extends Fish{

    public Shark(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "shark";
    }

    @Override
    public void wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the shark smells blood in the water and wakes up to find fresh food");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the shark chases and devours the raw meat, cautiously placed in its tank");

        System.out.println(eat);

    }

    @Override
    public void makeNoise() {
        StringBuffer silence = new StringBuffer(getName());
        silence.append(" the shark silently stares at the Zookeeper because as the " +
                "zookeeper knows, sharks dont make sound");

        System.out.println(silence);
    }
}
