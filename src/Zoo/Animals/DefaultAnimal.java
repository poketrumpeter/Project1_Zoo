package Zoo.Animals;

/*
* There are great examples of encapsulation in this class. Most of the attributes that all animals share will
* be in this default animal class. All the attributes will be private because we dont want these attributes to
* changed unless we want it to. The only way other classes can access these attributes is through the getter.
*
* Even the setter method is protected because it should not have to be used outside of the animal methods. This
* prevents the setters of these attributes from being used incorrectly somewhere else in the code.
* */

abstract public class DefaultAnimal implements Animal {

    private final String name;
    private Boolean asleep = true; //Boolean to tell if an animal is asleep

    public DefaultAnimal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Boolean getAsleep() {
        return asleep;
    }

    protected void setAsleep(Boolean asleep) {
        this.asleep = asleep;
    }

    public void respondToCommand(){ //Simple function that will allow animals to respond to commands from the zooKeeper

    }
}
