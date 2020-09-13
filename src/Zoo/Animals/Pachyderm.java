package Zoo.Animals;

abstract public class Pachyderm extends DefaultAnimal{

    @Override
    public void Sleep(String time) {

        StringBuffer sleep = new StringBuffer("At ");
        sleep.append(time);
        sleep.append(", ");
        sleep.append(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep wary of predators");

        System.out.println(sleep);

        setAsleep(true);

    }

    @Override
    public void Eat(String time) {

        StringBuffer eat = new StringBuffer("At ");
        eat.append(time);
        eat.append(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" consumes the leaves and plants that the zookeeper gives it.");

        System.out.println(eat);

    }
}
