package Zoo.Animals;

//class Feline is a subclass of class Animal
//This class will have some overidden function
abstract public class Feline implements Animal{

    private Boolean isAsleep;

    @Override
    public Boolean getAsleep() {
        return isAsleep;
    }

    public void setAsleep(Boolean asleep) {
        isAsleep = asleep;
    }

    @Override
    public void Roam(String time) {

    }

    @Override
    public void Sleep(String time) {

    }
}
