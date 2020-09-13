package Zoo.Animals;

public class Elephant extends Pachyderm{

    private final String name;

    public Elephant(String name) {
        if(name.startsWith("e") || name.startsWith("E")){
            System.out.println(name + " is a great name for an Elephant");
            this.name = name;
        }
        else {
            System.out.println("A better anme for an elephant would be Ellie");
            this.name = "Ellie";
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "Elephant";
    }

    @Override
    public void wakeUp(String time) {

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the elephant wakes up and slowly gets up. It gives a little honk with a smile");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Roam(String time) {

        StringBuffer roam = new StringBuffer(this.name);
        roam.append(" the elephant slowly walks around its enclosure looking to play with its friends for ");
        roam.append(time);
        roam.append(" minutes");

    }
}
