import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ATM atm = new ATM();
    atm.deposit(150);
    atm.deposit(150);
    atm.deposit(1000);

    atm.printStatus();
    atm.withdraw(150);
    atm.withdraw(150);
    atm.withdraw(150);
    atm.printStatus();
    atm.withdraw(150);







    }
}