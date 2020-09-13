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

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the Hippo wakes up and slowly gets out of the water");

        System.out.println(wake);

        setAsleep(false);

    }

    @Override
    public void Roam(String time) {
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the hippo slowly wades in the water for  ");
        roam.append(time);
        roam.append(" minutes");

        System.out.println(roam);
    }
}
