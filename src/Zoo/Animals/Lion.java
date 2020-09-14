package Zoo.Animals;

public class Lion extends Feline{

    public Lion(String name) {
        super(name);
    }

    //Overridden method to return the species "Lion" of the Lion animal
    @Override
    public String getSpecies() {
        return "lion";
    }

    //Method wakeUp() is used to indicate the the lion has woken up
    //This function will update the alseep variable to false and output a string to the console
    @Override
    public void wakeUp() {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the lion is awoken and roars at the zookeeper");
        System.out.println(wake);
    }

    @Override
    public void makeNoise() {
        StringBuffer roar = new StringBuffer(getName());
        roar.append(" the lion roars at the zookeeper");

        System.out.println(roar);
    }
}
