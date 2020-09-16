package Zoo.Animals;

import java.util.Random;

abstract public class Pachyderm extends DefaultAnimal{

    public Pachyderm(String name) {
        super(name);
    }

    @Override
    public String getClassification() {
        return "Pachyderm";
    }

    @Override
    public void Sleep() {

        StringBuffer sleep = new StringBuffer(getName());
        sleep.append(" the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep wary of predators");

        System.out.println(sleep);

        setAsleep(true);

    }

    @Override
    public void Eat() {

        StringBuffer eat = new StringBuffer(getName());
        eat.append(" the ");
        eat.append(getSpecies());
        eat.append(" consumes the leaves and plants that the zookeeper gives it.");

        System.out.println(eat);

    }
    public void Charge(){
        StringBuffer charge = new StringBuffer(getName());
        charge.append(" the ");
        charge.append(getSpecies());
        charge.append(" ignores the command to roam and charges at the zookeeper");

        System.out.println(charge);
    }

    @Override
    public Boolean Misbehave() {
        //Charge or Roam
        //Get Random Int
        //25% chance that Pachyderm would charge

        Random randomNum = new Random();

        int pachydermChoice = randomNum.nextInt(3);

        if (pachydermChoice == 1){
            //25% chance of returning 0 so this will tell us that the Pachyderm will Charge
            Charge();

            System.out.println("The zookeeper will need to try again!");
            return false; //allows the zookeeper to know if the Pachyderm charged
        }
        else{ //indicates that pachyderm will roam not charge
            Roam();
            return true; //allows the zookeeper to know if the Pachyderm roamed

        }
    }
}
