public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //constructors
    public Customer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(){
    this("default name",0,"default@email.com");
    }
    public Customer(String name, String emailAddress){
    this(name, -1, emailAddress);
    }

    public String name(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
}
