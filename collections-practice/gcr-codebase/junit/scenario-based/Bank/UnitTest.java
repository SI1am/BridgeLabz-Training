// package ScenarioBased;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() {
        Bank account = new Bank(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Bank account = new Bank(1000);
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-200)
        );
        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
        Bank account = new Bank(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Bank account = new Bank(500);
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(800)
        );
        assertEquals("Insufficient funds.", exception.getMessage());
    }
}