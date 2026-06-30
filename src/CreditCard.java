public class CreditCard {

    private int balance;
    private int cardNumber;

    public CreditCard(int startBalance, int cardNumber) {
        this.cardNumber = cardNumber;
        if (startBalance < 0){
            throw new IllegalArgumentException("!!!Начальный баланс не может быть меньше 0!!!");
        }
        this.balance = startBalance;
    }

    public void deposit(int amount){
        if (amount <= 0){
            System.out.println("!!!Нельзя положить на баланс нулевую или отрицательную сумму!!!");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(int amount){
        if (amount <= 0){
            System.out.println("!!!Нельзя снять нулевую или отрецательную сумму!!!");
            return false;
        }
        if (amount > balance){
            System.out.println("На счете " + cardNumber + " недостаточно средств");
            return false;
        }
        balance -= amount;
        return true;
    }
    public void getInfo(){
        System.out.println("Номер счета: " + cardNumber);
        System.out.println("Баланс: " + balance);
        System.out.println("_____________________________");

    }







}