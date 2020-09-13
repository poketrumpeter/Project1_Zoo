package Zoo.Animals;

public class Lion extends Feline{

    private final String name;

    //Constructor for Lion animal
    //Will check to see if name starts with L
    //If it does not method will set name to a default name
    public Lion(String name) {
        if(name.startsWith("l") || name.startsWith("L")){
            System.out.println(name + " is a great name for a Lion");
            this.name = name;
        }
        else {
            System.out.println("A better name for a lion would be Leo");
            this.name = "Leo";
        }
    }

    //Simple Overridden Function to return the name of the Lion animal
    @Override
    public String getName() {
        return this.name;
    }

    //Overridden method to return the species "Lion" of the Lion animal
    @Override
    public String getSpecies() {
        return "lion";
    }

    //Method wakeUp() is used to indicate the the lion has woken up
    //This function will update the alseep variable to false and output a string to the console
    @Override
    public void wakeUp(String time) {
        StringBuffer wake = new StringBuffer(this.name);
        wake.append(" the lion is awoken at ");
        wake.append(time);
        wake.append(" and roars at the zookeeper");

        System.out.println(wake);
    }

}
