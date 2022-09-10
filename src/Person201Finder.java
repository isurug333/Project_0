import java.io.*;
import java.util.*;
import java.net.*;

public class Person201Finder {
    public static void main (String[] args) throws IOException {
        Person201 me = new Person201("Isuru", "Alspaugh", 1);
        Person201[] entries = Person201Utilities.readURL("https://courses.cs.duke.edu/compsci201/fall22/people.txt");
        System.out.println("\nPeople on the same floor: \n");
        List<Person201> floorMates = new ArrayList<Person201>();
        floorMates = Person201Utilities.sameFloor(entries, me);
        Person201Utilities.printPeople(floorMates);
        System.out.println("\nPeople in the same building: \n");
        List<Person201> houseMates = Person201Utilities.sameBuilding(entries, me);
        Person201Utilities.printPeople(houseMates);
    }
}