package Zoo;

import Zoo.Animals.*;
import Zoo.People.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) { //Main Zoo Implementation for Project 1

        //First Before doing anything, we need to create our animals that will exist in the Zoo.
        //Also make an animal list object to contain all our animals
        System.out.println("Welcome to the new Age Zoo!(Working Title)");

        ArrayList<Animal> animals = new ArrayList<Animal>();


        System.out.println("Receiving Animal for the new Zoo");
        System.out.println();

        //Adding Dogs to the Zoo
        Animal dog1 = new Dog("Cleo"); //Should default name of Dog to Darren
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
        Animal hippo2 = new Hippo("Samantha"); //Name should change to Hector

        animals.add(hippo1);
        animals.add(hippo2);

        //Adding Sharks to the zoo
        Animal shark1 = new Shark("Sally");
        Animal shark2 = new Shark("Sam");

        animals.add(shark1);
        animals.add(shark2);

        //Adding Clownfish to the Zoo
        Animal clownfish1 = new ClownFish("Sully"); //Name should change to Carly
        Animal clownfish2 = new ClownFish("Christie");

        animals.add(clownfish1);
        animals.add(clownfish2);

        System.out.println();
        System.out.println("There are now " + animals.size() + " animals in the zoo!!");

        //So now that we have populated the zoo with animals, we can create a zooKeeper to tend to them


        //Great the zookeeper has been made, now let's give them stuff to do!

        //Take in User input to see how many days we are going to look at this zoo.

        System.out.println("how many Days would you like to spend at the zoo?");

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

            //Zookeeper arrives, Every 4th day, the zookeeper will arrive late

            //Now that the Zookeeper has Arrived, he can wake the animals


        }








    }
}
