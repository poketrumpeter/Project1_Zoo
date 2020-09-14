package Zoo.Animals;

public class ClownFish extends Fish{

    public ClownFish(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "clownfish";
    }

    @Override
    public void wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the clownfish wakes and exits it's anemone cautious of predators");

        System.out.println(wake);

        setAsleep(false);

    }

    @Override
    public void Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the clownfish nibbles on the fish food the zookeeper gives it");

        System.out.println(eat);

    }

    //Clownfish specific Sleep function. Clownfish sleep in an ananome unlike most fish
    @Override
    public void Sleep() {

        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the clownfish settles down in its anemone and falls asleep");

        System.out.println(sleep);

        setAsleep(true);

    }

    @Override
    public void makeNoise() {
        StringBuffer chirpPop = new StringBuffer(getName());
        chirpPop.append(" the clownfish chirps and pops");

        System.out.println(chirpPop);
    }
}
