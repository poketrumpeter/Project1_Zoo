package Zoo.Animals;

//class Canine is an abstract class which implements the animal interface
abstract public class Canine extends DefaultAnimal{

    public Canine(String name) {
        super(name);
    }

    @Override
    public String getClassification() {
        return "Canine";
    }

    //Overridden Roam Method for Canines
    @Override
    public void Roam() {
        //the Canine will roam around the Enclosure
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the ");
        roam.append(getSpecies());
        roam.append(" runs around its enclosure");


        System.out.println(roam); //prints output to indicate that the animal is roaming
    }

    @Override
    public void Sleep() {
        //Method to have the specific animal go to sleep
        StringBuffer sleep = new StringBuffer(getName()); //String buffer to creat output string
        sleep.append( " the ");
        sleep.append(getSpecies());
        sleep.append(" goes to sleep with it's friends dreaming happy dreams");

        System.out.println(sleep); //prints the contents of String Buffer

        setAsleep(true); //Setting sleep status of animal to True

    }
}
