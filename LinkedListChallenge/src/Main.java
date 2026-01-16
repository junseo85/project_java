import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String town;
        int distance;
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        itinerary(placesToVisit);
        town = placesToVisit.getFirst();
        System.out.println(town);


        boolean isTrue = true;
        while(isTrue){
            printActions();
            String word = scanner.nextLine();
            switch (word.toUpperCase()){
                case "F" -> town = forward(placesToVisit,town);
                case "B" -> town = backward(placesToVisit,town);
                case "L" -> printItinerary(placesToVisit);
                case "Q" -> isTrue = false;
            }
            System.out.println("current location: "+ town);

        }

    }
    public static void itinerary(LinkedList<String> list){
        list.add("Adelaide");
        list.add("Alice Springs");
        list.add("Brisbane");
        list.add("Darwin");
        list.add("Melbourne");
        list.add("Perth");
    }


    public static String forward(LinkedList<String> list, String town){
        //var iterator = list.listIterator(list.indexOf(town));
        return list.get(list.indexOf(town)+1);
    }

    public static String backward(LinkedList<String> list, String town){
        var iterator = list.listIterator(list.indexOf(town));
        return iterator.previous();
    }


    public static void printActions(){
        System.out.println("Available actions (select word or letter):\n" +
                "(F)orward\n" +
                "(B)ackward\n" +
                "(L)ist Places\n" +
                "(M)enu\n" +
                "(Q)uit");
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        int distance = 0;
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            switch (town){
                case "Adelaide" -> distance = 1374;
                case "Alice Springs" -> distance = 2771;
                case "Brisbane" -> distance = 917;
                case "Darwin" -> distance = 3972;
                case "Melbourne" -> distance = 877;
                case "Perth" -> distance = 3923;
                default -> distance = 0;
            }
            System.out.println("--> From: "+ previousTown + " to "+ town +": Distance: "+ distance);


        }
    }

    public static void listPlaces(LinkedList<String> list){
        System.out.println();
    }
}
