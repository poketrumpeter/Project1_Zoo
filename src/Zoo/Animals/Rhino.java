package Zoo.Animals;

public class Rhino extends Pachyderm{

    public Rhino(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "rhino";
    }

    @Override
    public void wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the rhino slowly rises and curiously looks at the zookeeper");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Roam() {

        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the rhino defensively runs around its enclosure wary of the Zookeeper");

        System.out.println(roam);

    }

    @Override
    public void makeNoise() {
        StringBuffer squeal = new StringBuffer(getName());
        squeal.append(" the rhino squeals at the zookeeper");

        System.out.println(squeal);
    }
}
