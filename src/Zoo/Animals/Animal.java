package Zoo.Animals;

/*
 Clear instance of ABSTRACTION. This is achieved through abstract classes and
 interfaces, in which only the functionality will be provided to the user. In
 this case, the user only knows the method name to call and what they do, but
 do not know the actual implementation an animal might give it.
*/


public interface Animal {

    String getName(); // method to grab the name of an animal

    String getSpecies(); // Method to get the specific species of an animal

    String getClassification();

    Boolean getAsleep(); //method to check if animal is awake or not

    void Sleep(); //method to have the animal go to sleep

    void wakeUp(); //method to wake an animal up

    void Eat(); //Method to have the animals eat food

    void Roam(); //Method to have animal roam in their enclosure

    void makeNoise();

    default Boolean Misbehave(){return true;}

    //Each animal will have a specific method for sleeping, waking up, eating, and roaming
}


