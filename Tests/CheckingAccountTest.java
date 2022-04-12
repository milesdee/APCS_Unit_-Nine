import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {


    @Test
    void deposit() {
        CheckingAccount c = new CheckingAccount(100);
        double expected = 104.50;
        c.deposit(5);
        double actual = c.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void withdrawGood() {
        CheckingAccount c = new CheckingAccount(100);
        double expected = 89.5;
        c.withdraw(10);
        double actual = c.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void withdrawBad() {
        CheckingAccount c = new CheckingAccount(100);
        double expected = 100;
        c.withdraw(99.6);
        double actual = c.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void transferGood() {
        CheckingAccount a = new CheckingAccount(100);
        CheckingAccount b = new CheckingAccount(200);
        a.transfer(50, b);
        assertEquals(49.5, a.getBalance());
        assertEquals(249.5, b.getBalance());
    }

    @Test
    void transferBad() {
        CheckingAccount a = new CheckingAccount(100);
        CheckingAccount b = new CheckingAccount(200);
        a.transfer(99.6, b);
        assertEquals(100, a.getBalance());
        assertEquals(200, b.getBalance());
    }
}