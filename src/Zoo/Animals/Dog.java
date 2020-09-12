package Zoo.Animals;

public class Dog extends Canine {

    private final String name; //Every Dog will have a name

    public Dog(String name) { //constructor to confirm good name for dog


        if (name.startsWith("d") || name.startsWith("D")){
            System.out.println(name + " is a great name for a Dog");
            this.name = name;
        }
        else{
            System.out.println("A better name for a dog would be Darren");
            this.name = "Darren";
        }
        setAsleep(true);

    }

    //Overridden function for GetName in order to get the name of the Dog
    @Override
    public String getName() {
        return this.name;
    }

    //Overridden Function to return Dog as the Species
    @Override
    public String getSpecies() {
        return "dog";
    }

    //Overridden function to Wake up the Dog when the Zookeep er goes to wake the animals
    @Override
    public void wakeUp(String time) {
        StringBuffer wake = new StringBuffer(name);
        wake.append(" the dog wakes up and barks happily at ");
        wake.append(time);

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Eat(String time) {
        StringBuffer eat = new StringBuffer(this.name);
        eat.append( "the dog happily and quickly consumes its food then smiles at the zookeeper at ");
        eat.append(time);

        System.out.println(eat);



    }
}
