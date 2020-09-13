package Zoo.Animals;

public class ClownFish extends Fish{

    private final String name;

    public ClownFish(String name) {
        if (name.startsWith("c") || name.startsWith("C")){
            System.out.println(name + " is a great name for a clownfish");
            this.name = name;
        }
        else{
            System.out.println("A better name for a clownfish would be Carly");
            this.name = "Carly";

        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "clownfish";
    }

    @Override
    public void wakeUp(String time) {

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(this.name);
        wake.append(" the clownfish wakes and exits it's anenome cautious of predators");

        System.out.println(wake);

        setAsleep(false);

    }

    @Override
    public void Eat(String time) {

        StringBuffer eat = new StringBuffer("At ");
        eat.append(time);
        eat.append(", ");
        eat.append(this.name);
        eat.append(" the clownfish nibbles on the fish food the zookeeper gives it");

        System.out.println();

    }

    //Clownfish specific Sleep function. Clownfish sleep in an ananome unlike most fish

    @Override
    public void Sleep(String time) {

        StringBuffer sleep = new StringBuffer("At ");
        sleep.append(time);
        sleep.append(this.name);
        sleep.append(" the clownfish settles down in its annome and falls asleep");

        System.out.println(sleep);

        setAsleep(true);


    }
}
