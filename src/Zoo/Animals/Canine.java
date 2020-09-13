package Zoo.Animals;

//class Canine is an abstract class which implements the animal interface
abstract public class Canine extends DefaultAnimal{

    //Overridden Roam Method for Canines
    @Override
    public void Roam(String time) {
        //the Canine will roam around the Enclosure
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the ");
        roam.append(getSpecies());
        roam.append(" runs around its enclosure for ");
        roam.append(time);
        roam.append(" minutes");

        System.out.println(roam); //prints output to indicate that the animal is roaming
    }

    @Override
    public void Sleep(String time) {
        //Method to have the specific animal go to sleep
        StringBuffer sleep = new StringBuffer("At "); //String buffer to creat output string
        sleep.append(time);
        sleep.append(", ");
        sleep.append(getName());
        sleep.append( " the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep with it's friends dreaming happy dreams");

        System.out.println(sleep); //prints the contents of String Buffer

        setAsleep(true); //Setting sleep status of animal to True

    }
}
