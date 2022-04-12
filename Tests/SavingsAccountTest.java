import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {



    @Test
    public void testDefaultConstructor() {
        SavingsAccount sa1 = new SavingsAccount(0.025);
        assertEquals(10.0, sa1.getBalance());
    }

    @Test
    public void testBalanceConstructorLow() {
        SavingsAccount sa1 = new SavingsAccount(5, 0.02);
        assertEquals(10.0, sa1.getBalance());
    }

    @Test
    public void testBalanceConstructorHigh() {
        SavingsAccount sa1 = new SavingsAccount(25, 0.025);
        assertEquals(25.0, sa1.getBalance());
    }

    @Test
    public void testInterest() {
        SavingsAccount sa1 = new SavingsAccount(25, 0.025);
        double expected = 25.625;
        sa1.addInterest();
        double actual = sa1.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    public void withdrawDoesNotHaveEnough() {
        SavingsAccount sa1 = new SavingsAccount(5, 0.02);
        sa1.withdraw(4);
        assertEquals(10.0, sa1.getBalance());
    }

    @Test
    public void withdrawHasEnough() {
        SavingsAccount sa1 = new SavingsAccount(35, 0.02);
        sa1.withdraw(4);
        assertEquals(31, sa1.getBalance());
    }

    @Test
    public void withdrawDoesNotHaveEnoughTwo() {
        SavingsAccount sa1 = new SavingsAccount(25, 0.02);
        sa1.withdraw(16);
        assertEquals(25, sa1.getBalance());
    }
}