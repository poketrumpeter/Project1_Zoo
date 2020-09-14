package Zoo.People;

import Zoo.Animals.Animal;

import java.util.ArrayList;

// subclass zooKeeper
public class ZooKeeper extends ZooEmployee {

    public ZooKeeper(String name) {
        super(name, "Zookeeper");
    }
    
    //This method will wake the animals
    //Will output that the Zookeeper is going to wake the animals at a specific time.
    //It will then iterate through a list of animals and call the animals wake up function

    public void  wakeAnimals(ArrayList<Animal> animalList, String time) {
        StringBuffer wake = new StringBuffer(getName());
        wake.append(" goes to wake the animals at ");
        wake.append(time);
            
        System.out.println(wake);
        System.out.println();

        for(Animal  currentAnimal : animalList){

            System.out.println(getName() + " goes to wake up " + currentAnimal.getName() + " the " +
                    currentAnimal.getSpecies());

            currentAnimal.wakeUp(); //will call each animals wakeUp method

            System.out.println();

        }

    }
    
    //This method will roll call the animals and calls animal's getName method by returning a string command
    public void rollCall(ArrayList<Animal> animalList, String time) {
        StringBuffer rollcall = new StringBuffer(getName());
        rollcall.append(" takes attendance of the animals at ");
        rollcall.append(time);
            
        System.out.println(rollcall);
        System.out.println();

        //For loop to call the animals make noise function
        for (Animal currentAnimal : animalList){

            System.out.println(getName() + " checks if " + currentAnimal.getName() + " the " +
                    currentAnimal.getSpecies() + " is in the zoo");

            currentAnimal.makeNoise();
            System.out.println();

        }

    }
    
    //This method will feed the animals and calls animal's Eat method by returning a string command
    public void feedAnimals(ArrayList<Animal> animalList, String time) {
        StringBuffer feed = new StringBuffer(getName());
        feed.append(" feeds the animals at ");
        feed.append(time);
            
        System.out.println(feed);
        System.out.println();
        
        for (Animal currentAnimal : animalList){

            System.out.println(getName() + " goes to feed " + currentAnimal.getName() + " the " +
                    currentAnimal.getSpecies());

            currentAnimal.Eat(); //for each animal run the animal eat function
            System.out.println();

        }
    }
    
    //This method will exercise the animals and calls animal's Roam or  method by returning a string command
    public void exerciseAnimals(ArrayList<Animal> animalList, String time) {
        StringBuffer exercise = new StringBuffer(getName());
        exercise.append(" lets the animals roam free at ");
        exercise.append(time);
            
        System.out.println(exercise);
        System.out.println();
        
        for (Animal currentAnimal : animalList){

            System.out.println(getName() + " goes to exercise " + currentAnimal.getName() + " the " +
                    currentAnimal.getSpecies());

            Boolean state = false; //Boolean to keep track if the
            //Check to see if the animal is a dog for the special case
            if(currentAnimal.getSpecies().equals("dog")){
                //roam or dig

                //While loop will loop until the Pachyderm Roams
                while (!state){
                    state = currentAnimal.Misbehave();
                }
            }

            //Check to see if the animal is a Pachyderm for the Special Case
            else if(currentAnimal.getClassification().equals("Pachyderm")){
                //Charge or Roam

                while(!state){
                    state = currentAnimal.Misbehave();
                }
            }

            //Else run the roam command
            else {
                currentAnimal.Roam();
            }

            System.out.println();
        }
    }
    
    //This method will have the zookeeper put all the animals to sleep
    public void sleepAnimals(ArrayList<Animal> animalList, String time) {
        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" puts the animals to sleep at ");
        sleep.append(time);
            
        System.out.println(sleep);
        System.out.println();
        
        for (Animal currentAnimal : animalList){

            System.out.println(getName() + " goes to put " + currentAnimal.getName() + " the " +
                    currentAnimal.getSpecies() + " to sleep");


            Boolean state = false;

            //Check to see if the animal is a Feline
            if (currentAnimal.getClassification().equals("Feline")){
                //misbehavior function for Felines

                while (!state){

                    state = currentAnimal.Misbehave();

                }
            }
            else{
                currentAnimal.Sleep();
            }

            System.out.println();
        }
    }

}
