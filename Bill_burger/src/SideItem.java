import java.util.Scanner;

public class SideItem extends Restaurant{
    private String type;
    private double price = 0;
    private boolean deluxe;

    public SideItem(){
        this(false);
    }
    public SideItem(boolean deluxe){
        this("side", 0, deluxe);
    }
    public SideItem(String type, double price, boolean deluxe) {
        this.type = type;
        this.price = price;
        this.deluxe = deluxe;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isDeluxe() {
        return deluxe;
    }

    public double sidePrice(String type, boolean deluxe){
        if(deluxe){return 0;}
        return switch(type.toUpperCase().charAt(0)){
            case 'F' -> 1.00;
            case 'O' -> 1.25;
            case 'S' -> 1.5;
            default -> 0;
        };
    }
    public void orderSide(boolean deluxe){
        System.out.println("Choose side");
        Scanner s = new Scanner(System.in);
        System.out.println("Select a side- Option(Fries, Onion Ring or Soup)");
        this.type = s.nextLine();
        this.price += sidePrice(this.type, deluxe);

        System.out.printf("You have selected %s as side and total is $ %.2f %n", type, price);
    }
}
