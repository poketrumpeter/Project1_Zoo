package Animals;

//This will be the base implementation for an animal class
// This class is an abstract class to help with design by contract
//Most of its methods will be overridden for specific subclasses
abstract public class Animal {
    private String name;
    private Boolean isAsleep;

    //Abstract class animal will not need a constructor because it will not be instantiated.

    //Method to allow animals to get the private member name
    //Also will be used for when the Zookeeper roll calls the animals
    public String getName() {
        return name;
    }

    /*
    method to allow the animal to go to sleep. This method applies to all animals and
    thus will not need to be overridden. Sleep will set animal member isAsleep to True.

    I could change this based on how the zookeeper will wake all the animals.
     */


    public void sleep(){
        System.out.println(name + " goes to sleep");
        isAsleep = true;
    }

    abstract public void wakeUp(int time);

    abstract public void eat();

    abstract public void roam();

    //Each animal will have a specific method for sleeping, waking up, eating, and roaming
}
