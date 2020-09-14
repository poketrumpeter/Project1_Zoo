package Zoo.Animals;

abstract public class Fish extends DefaultAnimal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public String getClassification() {
        return "Fish";
    }

    @Override
    public void Roam() {

        StringBuffer roam =  new StringBuffer(getName());
        roam.append(" the ");
        roam.append(getSpecies());
        roam.append(" swims quickly in its tank");

        System.out.println(roam);

    }

    //most fish dont swim in a normal way so they will continue to swim but will slow down and enter a restful state
    //this method will be overridden by clownfish because clownfish sleep in an anenome

    @Override
    public void Sleep() {

        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" slows its function but is still alert resting but not fully asleep");

        System.out.println(sleep);

        setAsleep(true);

    }
}
