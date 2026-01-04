import java.util.Scanner;

public class Burger extends Restaurant {
    private String type;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;
    private String topping5;
    private int max_topping = 3;
    private double price = 0;
    private int count = 1;
    private boolean deluxe;

    public Burger(){
        this("beef",0.0, false);
    }

    public Burger(String type, double price, boolean deluxe) {
        this.type = type;
        this.price = price;
        this.deluxe = deluxe;
    }

    public String getType() {
        return type;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public String getTopping5() {
        return topping5;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDeluxe() {
        return deluxe;
    }

    public void burgerType(){
        System.out.println("Choose type or burger");
        Scanner b = new Scanner(System.in);
        System.out.println("Enter type of burger-Type(Beef, Chicken, Veggie)");
        this.type = b.nextLine();
        //check for deluxe order
        Scanner d = new Scanner(System.in);
        System.out.println("Would you like your burger to be deluxe order? Yes or No");
        String deluxeOrNot = d.nextLine();
        this.deluxe = deluxeOrNot.toUpperCase().equals("YES");
        super.setDeluxe(this.deluxe);
        this.price += burgerPrice(this.type, this.deluxe);
        System.out.println(type + " burger selected");
    }
    public void customize(boolean deluxe){
        if (deluxe){
            max_topping = 5;
        }
        System.out.println("add toppings");
        Scanner t = new Scanner(System.in);
        while(count <= max_topping){
            if (deluxe){
                System.out.println("Enter topping to add. Topping(Onion, Mushroom, Lettuce, Pepper, Pickle)-Max 5- Q to quit");
            }else{
            System.out.println("Enter topping to add. Topping(Onion, Mushroom, Lettuce, Pepper, Pickle)-Max 3- Q to quit");}
            String addTopping = t.nextLine();
            if ("Qq".contains(addTopping)){
                break;
            }
            if(count == 5){
                this.topping5 = addTopping;
                this.price += toppingPrice(topping5, this.deluxe);
                break;}
            else if(count == 4){
                this.topping4 = addTopping;
                this.price += toppingPrice(topping4,this.deluxe);
                this.count +=1;
                }
            else if(count == 3){
                this.topping3 = addTopping;
                this.price += toppingPrice(topping3, this.deluxe);
                this.count +=1;

            }else if (count ==2) {
                this.topping2 = addTopping;
                this.price += toppingPrice(topping2, this.deluxe);
                this.count +=1;
            }else{
                this.topping1 = addTopping;
                this.price += toppingPrice(topping1, this.deluxe);
                this.count +=1;
            }
        }

    }
    public double toppingPrice(String topping, boolean deluxe){
        if (deluxe){return 0;}
        return switch(topping.toUpperCase()){
            case "ONION" -> 1.25;
            case "MUSHROOM" -> 1.00;
            case "LETTUCE" -> 1.5;
            case "PEPPER" ->1.5;
            case "PICKLE" ->1.25;
            default -> 0;
        };
    }
    public double burgerPrice(String type, boolean deluxe){
        if(deluxe){return 12.00;}
        return switch(type.toUpperCase().charAt(0)){
            case 'C' -> 4.50;
            case 'V' -> 4.25;
            default -> 4.75;
        };
    }
    public void selectBurger(){
        burgerType();//if deluxe order then price is $12

        customize( this.deluxe);//if deluxe order then max topping = 5 and no additional cost
        System.out.printf("Total price of %s burger: $ %.2f%n",type,price);
        System.out.println("Topping selected: ");
        if(topping1 != null){System.out.println(topping1) ;}
        if(topping2 != null){System.out.println(topping2) ;}
        if(topping3 != null){System.out.println(topping3) ;}
        if(topping4 != null){System.out.println(topping4) ;}
        if(topping5 != null){System.out.println(topping5) ;}

    }
}
