package Zoo.Animals;

public class Rhino extends Pachyderm{

    private final String name;

    public Rhino(String name) {
        if(name.startsWith("r") || name.startsWith("R")){
            System.out.println(name + "is a great name for a rhino");
            this.name = name;
        }
        else {
            System.out.println("A better name for a rhino would be Ryan");
            this.name = "Ryan";
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "rhino";
    }

    @Override
    public void wakeUp(String time) {

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the rhino slowly rises and curiously looks at the zookeeper");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Roam(String time) {

        StringBuffer roam = new StringBuffer(this.name);
        roam.append(" the rhino defensibly runs around its enclosure wary of the Zookeeper for ");
        roam.append(time);
        roam.append(" minutes");

        System.out.println(roam);

    }
}
