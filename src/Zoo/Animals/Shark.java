package Zoo.Animals;

public class Shark extends Fish{

    private final String name;

    public Shark(String name) {
        if(name.startsWith("s") || name.startsWith("S")){
            System.out.println(name + " is a great name for a shark");
            this.name = name;
        }
        else{
            System.out.println("A better for a shark would Sally");
            this.name = "Sally";
        }

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSpecies() {
        return "shark";
    }

    @Override
    public void wakeUp(String time) {

        StringBuffer wake = new StringBuffer("At ");
        wake.append(time);
        wake.append(", ");
        wake.append(this.name);
        wake.append(" the shark smells blood in the water and wakes up to find fresh food");

        System.out.println(wake);

        setAsleep(false);
    }

    @Override
    public void Eat(String time) {

        StringBuffer eat = new StringBuffer("At ");
        eat.append(time);
        eat.append(", ");
        eat.append(this.name);
        eat.append(" the shark chases and devours the raw meat, cautiously placed in its tank");

        System.out.println(eat);

    }
}
