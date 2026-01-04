public class Restaurant {
    private double total;
    private String burger;
    private String drink;
    private String side;
    private boolean deluxe;

    public boolean isDeluxe() {
        return deluxe;
    }

    public void setDeluxe(boolean deluxe) {
        this.deluxe = deluxe;
    }

    public Restaurant(){
        this(0, "burger", "drink", "side", false);

    }

    public Restaurant(int total, String burger, String drink, String side, boolean deluxe) {
        this.total = total;
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        this.deluxe = deluxe;
    }

    public void order(){

        System.out.println("Welcome to the Bill burger restaurant!");
        //order burger

        Burger orderBurger = new Burger();
        orderBurger.selectBurger();
        this.burger = orderBurger.getType();
        this.deluxe = orderBurger.isDeluxe();
        this.total += orderBurger.getPrice();
        //order drink
        Drink orderDrink = new Drink();
        orderDrink.orderDrink(this.deluxe);
        this.drink = orderDrink.getType();
        this.total += orderDrink.getPrice();
        //order side
        SideItem orderSideItem = new SideItem();
        orderSideItem.orderSide(this.deluxe);
        this.side = orderSideItem.getType();
        this.total += orderSideItem.getPrice();
        System.out.printf("** You ordered %s burger with %s %s %s and %s. Total: %.2f **%n",burger,(orderDrink.isIce())?"iced":"",orderDrink.getSize(),drink,side,total);


    }

}
