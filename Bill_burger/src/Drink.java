import java.util.Scanner;

public class Drink extends Restaurant {
    private String type;
    private String size;
    private boolean ice;
    private double price = 0;
    private boolean deluxe;
    public  Drink(){
        this( false);
    }

    public Drink(boolean deluxe){
        this("Water", "S", true, deluxe);
    }
    public Drink(String type, String size, boolean ice, boolean deluxe){
        this.type = type;
        this.size = size;
        this.ice = ice;
        this.deluxe = deluxe;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isIce() {
        return ice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isDeluxe() {
        return deluxe;
    }

    public double drinkPrice(String size, boolean deluxe){
        if(deluxe){
            return 0;}
        return switch(size.toUpperCase().charAt(0)){
            case 'S' -> 1.00;
            case 'M' -> 1.25;
            case 'L' -> 1.5;
            default -> 0;
        };
    }
    public void orderDrink(boolean deluxe){
        System.out.println("Select drink");
        Scanner d = new Scanner(System.in);
        System.out.println("Please enter the type of drink that you would like: ");
        this.type = d.nextLine();

        Scanner s = new Scanner(System.in);
        System.out.println("Select a size(Small or Medium or Large)");
        this.size = s.nextLine();
        this.price += drinkPrice(this.size, deluxe);

        Scanner i = new Scanner(System.in);
        System.out.println("Would you like ice? Yes or No");
        String drinkIce = i.nextLine();
        if(drinkIce.toUpperCase().charAt(0) == 'N'){
            this.ice = false;
        };

        System.out.printf("You have selected %s %s size drink as %s and total is $ %.2f %n",(ice)?"iced":"",size,type,price);
    }
}
