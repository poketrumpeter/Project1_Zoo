package Zoo.Animals;

public class Hippo extends Pachyderm{

    private final String name;

    public Hippo(String name) {
        if(name.startsWith("h") || name.startsWith("H")){
            System.out.println(name + " is a great name for a Hippo");
            this.name = name;
        }
        else{
            System.out.println("A better name for a hippo would be Hector");
            this.name = "Hector";

        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "hippo";
    }

    @Override
    public void wakeUp(String time) {

    }

    @Override
    public void Eat(String time) {

    }
}
