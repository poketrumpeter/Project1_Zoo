package Zoo.Animals;

public class Elephant extends Pachyderm{

    public Elephant(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "elephant";
    }

    @Override
    public void wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the elephant wakes up and slowly gets up. It gives a little honk with a smile");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Roam() {

        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the elephant slowly walks around its enclosure looking to play with its friends");

        System.out.println(roam);

    }

    @Override
    public void makeNoise() {
        StringBuffer trumpet = new StringBuffer(getName());
        trumpet.append(" the elephant makes a trumpet sound with its trunk");

        System.out.println(trumpet);
    }
}
