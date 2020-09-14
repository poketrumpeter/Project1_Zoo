package Zoo.People;

// Abstract class zooEmployee
abstract public class ZooEmployee {
    private String name; //name of the employee
    private String job; //name of the job employee has
    private int day; //day of zooEmployee working
    
    public String getName() {
        return name;
    }
    
    public void  setName(String name) {
        this.name = name;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }

}
