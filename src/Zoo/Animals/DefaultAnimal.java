package Zoo.Animals;

abstract public class DefaultAnimal implements Animal {
    private Boolean asleep = true; //Boolean to tell if an animal is asleep

    public Boolean getAsleep() {
        return asleep;
    }

    protected void setAsleep(Boolean asleep) {
        this.asleep = asleep;
    }
}
