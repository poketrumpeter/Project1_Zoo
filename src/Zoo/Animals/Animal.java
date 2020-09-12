package Zoo.Animals;

public interface Animal {

    String getName(); // method to grab the name of an animal

    String getSpecies(); // Method to get the specific species of an animal

    Boolean getAsleep(); //method to check if animal is awake or not

    void Sleep(String time); //method to have the animal go to sleep

    void wakeUp(String time); //method to wake an animal up

    void Eat(String time); //Method to have the animals eat food

    void Roam(String time); //Method to have animal roam in their enclosure

    //Each animal will have a specific method for sleeping, waking up, eating, and roaming
}


