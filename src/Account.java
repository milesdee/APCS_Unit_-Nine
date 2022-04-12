public class Account
{
    private String name;
    private double balance;

    public Account() {
        System.out.println("Made a new account");
    }
    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    public boolean equals(Object obj){
        Account b = (Account) obj;
        return (this.balance == b.balance && this.name.equals(b.name));

    }

    public String toString() {
        return name + ", " + balance;
    }
}
