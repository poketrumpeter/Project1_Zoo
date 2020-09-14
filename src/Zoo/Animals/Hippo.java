package Zoo.Animals;

public class Hippo extends Pachyderm{

    public Hippo(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "hippo";
    }

    @Override
    public void makeNoise() {
        StringBuffer grunt = new StringBuffer(getName());
        grunt.append(" the hippo gives a low grunt");

        System.out.println(grunt);
    }

    @Override
    public void wakeUp() {

        StringBuffer wake = new StringBuffer(getName());
        wake.append(" the Hippo wakes up and slowly gets out of the water");

        System.out.println(wake);

        setAsleep(false);

    }

    @Override
    public void Roam() {
        StringBuffer roam = new StringBuffer(getName());
        roam.append(" the hippo slowly wades in the water");

        System.out.println(roam);
    }


}
