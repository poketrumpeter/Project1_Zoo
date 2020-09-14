package Zoo.People;

// Abstract class zooEmployee
abstract public class ZooEmployee {
    private String name; //name of the employee
    private String job; //name of the job employee has
    private Boolean arrived;
    private int day; //day of zooEmployee working

    public ZooEmployee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
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

    //simply prints out the day of arrival
    public void arrive(String time) {
        StringBuffer arrive = new StringBuffer(getName());
        arrive.append(" the ");
        arrive.append(this.job);
        arrive.append(" arrives at Zoo on day ");
        arrive.append(getDay());
        arrive.append(" at ");
        arrive.append(time);

        System.out.println(arrive);

        //return "";
    }

    public void setDay(int day) {
        this.day = day;
    }

}
