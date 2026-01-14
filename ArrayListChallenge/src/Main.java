import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        ArrayList<String> list = new ArrayList<>();
        while (isTrue) {
            System.out.println("Available actions: \n" +
                    " 0 - to shutdown \n" +
                    " 1 - to add item(s) to list (comma delimited list)\n" +
                    " 2 - to remove any items (comma delimited list)\n" +
                    "Enter a number for which action you want to do: ");
            String num = scanner.nextLine();
            switch (num){
                case "0":
                    System.out.println("exiting");
                    isTrue = false;
                    break;

                case "1":
                    System.out.println("Enter item(s) to add (comma separated):");
                    String inputToAdd = scanner.nextLine();
                    String[] itemsToAdd = inputToAdd.split(",\\s*");
                    list.addAll(Arrays.asList(itemsToAdd));
                    System.out.println("updated list: "+ list);
                    break;

                case "2":
                    System.out.println("Enter item(s) to remove (comma separated):");
                    String inputToRemove = scanner.nextLine();
                    String [] itemToRemove = inputToRemove.split(",\\s*");
                    list.removeAll(Arrays.asList(itemToRemove));
                    System.out.println("updated list: " + list);
                    break;

                default:
                    System.out.println("Invalid number: please try again");
                    break;
            }
        }

    }
}
