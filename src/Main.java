import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        CreditCard creditCard1 = new CreditCard(500, 111111111);
        CreditCard creditCard2 = new CreditCard(500, 222222222);
        CreditCard creditCard3 = new CreditCard(500, 333333333);

        creditCard1.deposit(200);
        creditCard2.withdraw(200);
        creditCard3.withdraw(25);

        creditCard1.getInfo();
        creditCard2.getInfo();
        creditCard3.getInfo();





    }
}