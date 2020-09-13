package Zoo.Animals;

abstract public class Fish extends DefaultAnimal{

    @Override
    public void Roam(String time) {

        StringBuffer roam =  new StringBuffer(getName());
        roam.append(" the ");
        roam.append(getSpecies());
        roam.append(" swims quickly in its tank for ");
        roam.append(time);
        roam.append(" minutes");

        System.out.println(roam);

    }

    //most fish dont swim in a normal way so they will continue to swim but will slow down and enter a restful state
    //this method will be overridden by clownfish because clownfish sleep in an anenome

    @Override
    public void Sleep(String time) {

        StringBuffer sleep = new StringBuffer("At ");
        sleep.append(time);
        sleep.append(", ");
        sleep.append(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" slows its function but is still alert resting but not fully asleep");

        System.out.println(sleep);

        setAsleep(true);

    }
}
