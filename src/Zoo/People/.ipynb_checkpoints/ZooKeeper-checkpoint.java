package Zoo.People;

// subclass zooKeeper
public class zooKeeper extends zooEmployee {
//all methods return a command, nothing else
    
    //simply prints out the day of arrival
    public void arrive() {
        Stringbuffer arrive = new StringBuffer(getName());
        arrive.append(" arrives at Zoo on day ");
        arrive.append(getDay());
        
        System.out.println(arrive);
    }
    
    //This method will wake the animals and calls animal's wakeUp method by returning a string command
    public string wakeAnimals() {
        Stringbuffer wake = new StringBuffer(getName());
        wake.append(" wakes the animals.")
            
        System.out.println(wake);
        
        return "Wake up" //command returned to call animal method from main program
    }
    
    //This method will roll call the animals and calls animal's getName method by returning a string command
    public string rollCall() {
        Stringbuffer rollcall = new StringBuffer(getName());
        rollcall.append(" takes attendance of the animals.")
            
        System.out.println(rollcall);
        
        return "Attendance" //command returned to call animal method from main program
    }
    
    //This method will feed the animals and calls animal's Eat method by returning a string command
    public string feedAnimals() {
        Stringbuffer feed = new StringBuffer(getName());
        feed.append(" feeds the animals.")
            
        System.out.println(feed);
        
        return "Eat" //command returned to call animal method from main program
    }
    
    //This method will excercise the animals and calls animal's Roam or  method by returning a string command
    public string exerciseAnimals() {
        Stringbuffer exercise = new StringBuffer(getName());
        exercise.append(" lets the animals roam free.")
            
        System.out.println();
        
        return "Exercise" //command returned to call animal method from main program
    }
    
    //This method will wake the animals and calls animal's wakeUp method by returning a string command
    public string putAnimalsToBed() {
        Stringbuffer sleep = new StringBuffer(getName());
        sleep.append(" puts the animals to sleep.")
            
        System.out.println(sleep);
        
        return "Sleep" //command returned to call animal method from main program
    }

}
