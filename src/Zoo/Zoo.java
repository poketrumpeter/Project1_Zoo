package Zoo;

import Zoo.Animals.*;
import Zoo.People.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) throws FileNotFoundException { //Main Zoo Implementation for Project 1

        PrintStream originalOutput = System.out;
        PrintStream fileOutput = new PrintStream("./dayatthezoo.out");

        System.setOut(fileOutput);

        //First Before doing anything, we need to create our animals that will exist in the Zoo.
        //Also make an animal list object to contain all our animals
        System.out.println("Welcome to the new Age Zoo!(Working Title)");

        ArrayList<Animal> animals = new ArrayList<>();


        System.out.println("Receiving Animal for the new Zoo");
        System.out.println();

        //Adding Dogs to the Zoo
        Animal dog1 = new Dog("Darren"); //Should default name of Dog to Darren
        Animal dog2 = new Dog("Dhalia");

        animals.add(dog1);
        animals.add(dog2);

        //Adding Wolves to the Zoo
        Animal wolf1 = new Wolf("Willy");
        Animal wolf2 = new Wolf("Wanda");

        animals.add(wolf1);
        animals.add(wolf2);

        //Adding Cats to the Zoo
        Animal cat1 = new Cat("Cleo");
        Animal cat2 = new Cat("Carlos");

        animals.add(cat1);
        animals.add(cat2);

        //Adding lions to the Zoo
        Animal lion1 = new Lion("Lex");
        Animal lion2 = new Lion("Leah");

        animals.add(lion1);
        animals.add(lion2);

        //Adding tigers to the Zoo
        Animal tiger1 = new Tiger("Terry");
        Animal tiger2 = new Tiger("Thalia");

        animals.add(tiger1);
        animals.add(tiger2);

        //Adding Rhinos to the zoo
        Animal rhino1 = new Rhino("Ryan");
        Animal rhino2 = new Rhino("Rachel");

        animals.add(rhino1);
        animals.add(rhino2);

        //Adding elephants to the Zoo
        Animal elephant1 = new Elephant("Ella");
        Animal elephant2 = new Elephant("Eddie");

        animals.add(elephant1);
        animals.add(elephant2);

        //Adding Hippos to the Zoo
        Animal hippo1 = new Hippo("Hilda");
        Animal hippo2 = new Hippo("Harry"); //Name should change to Hector

        animals.add(hippo1);
        animals.add(hippo2);

        //Adding Sharks to the zoo
        Animal shark1 = new Shark("Sally");
        Animal shark2 = new Shark("Sam");

        animals.add(shark1);
        animals.add(shark2);

        //Adding Clownfish to the Zoo
        Animal clownfish1 = new ClownFish("Carla"); //Name should change to Carly
        Animal clownfish2 = new ClownFish("Christie");

        animals.add(clownfish1);
        animals.add(clownfish2);

        System.out.println("There are now " + animals.size() + " animals in the zoo!!");

        //So now that we have populated the zoo with animals, we can create a zooKeeper to tend to them

        ZooKeeper zooKeeper = new ZooKeeper("Fester");

        //Great the zookeeper has been made, now let's give them stuff to do!

        //Take in User input to see how many days we are going to look at this zoo.

        System.out.println("how many Days would you like to spend at the zoo?");
        originalOutput.println("how many days");

        Scanner input = new Scanner(System.in);

        int days = input.nextInt();

        //Whatever the User Input will be the Number of Days that the Program will run

        String time = "";
        //Main For Loop that will Loop througout the day.
        for (int i = 0; i < days; i++){

            //Start the day at 8:00 Am and end the day at 6:00 PM
            time = "8:00 AM"; // Initializes time to starting time each day

            //Print out string indicating time and day

            System.out.println("Welcome to the Zoo! It is now " + time + " on day: " + (i+1) + "!");
            System.out.println();

            //Zookeeper arrives, Every 4th day, the zookeeper will arrive late

            zooKeeper.setDay(i+1);
            zooKeeper.arrive(time);

            System.out.println();
            //Now that the Zookeeper has Arrived, he can wake the animals


            //Zookeeper.arrives, check to make sure he arrives
            //If Zookeeper.arrives = "whatever", then continue
            //if he hasnt arirved wait


            //Time is now 8:30

            time = "8:30 AM";

            //Zookeeper.wakeAnimals

            zooKeeper.wakeAnimals(animals, time); //Zookeeper goes to wake up animals and give them the Wake up Command


            //time is not 10:00
            time = "10:00 AM";

            //Zookeeper.rollCall

            zooKeeper.rollCall(animals, time);

            //Zookeeper feeds animals at noon

            time = "12:00 PM";

            zooKeeper.feedAnimals(animals, time);

            //Zookeeper Exercises the Animals at 2:30
            time = "2:30 PM";

            zooKeeper.exerciseAnimals(animals, time);

            //Zookeeper will put animals to sleep at 5:30 before leaving
            time = "5:30 PM";

            zooKeeper.sleepAnimals(animals, time);

            System.out.println();

            //All animals are asleep now so the Zookeeper can leave for the day
            System.out.println(zooKeeper.getName() + " has completed all tasks. They leave the zoo and " +
                    "lock up for the night");

            System.out.println();

            //Ask user if they would like to go to the zoo another day

            System.out.println("Would you like to spend another day at the zoo? reply yes or no");
            originalOutput.println("anotherDay?");

            String response = input.next();

            if (response.equals("yes") || response.equals("y") && days != 6){}

            else{ break;}


        }








    }
}
