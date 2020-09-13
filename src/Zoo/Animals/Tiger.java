package Zoo.Animals;

public class Tiger extends Feline{

    private final String name;

    public Tiger(String name) {
        if(name.startsWith("t") || name.startsWith("T")){
            System.out.println(name + " is a great name for a tiger");
            this.name = name;
        }
        else {
            System.out.println("A better name for a tiger would be Tammy");
            this.name = "Tammy";
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "tiger";
    }

    @Override
    public void wakeUp(String time) {

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the tiger wakes up and snarls and sharply roars at the zookeeper");

        System.out.println(wake);

        setAsleep(false);

    }
}
