/**
 *       <<< THIS CODE IS NOT COMPLETE >>>
 *   An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 10;

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given interest rate.
     */
    public SavingsAccount(double rate)  {
        super(MINIMUM_BALANCE);
        interestRate = rate;
    }

    /**   <<< COMPLETE THIS METHOD >>>
     *   Constructs a bank account with a given balance
     *   and a given interest rate.
     */
    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        if (initialBalance< MINIMUM_BALANCE){
            setBalance(MINIMUM_BALANCE);
        }
        interestRate = rate;
    }


    /**  <<< COMPLETE THIS METHOD >>>
     *   Adds the earned interest to the account balance.
     */
    public void addInterest()   {
        double interest = interestRate * getBalance();
        deposit(interest);
    }

    /** <<< COMPLETE THIS METHOD>>>
     *  overrides withdraw in the superclass
     *  only allows withdrawal to occur if
     *  resulting balance > MINIMUM_BALANCE
     */
    public void withdraw(double amount)  {
        if(getBalance()>= MINIMUM_BALANCE + amount){
            super.withdraw(amount);
        }
    }
}

