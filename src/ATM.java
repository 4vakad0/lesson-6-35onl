public class ATM {


    int balance;
    int count20;
    int count50;
    int count100;


    public boolean deposit(int depositSum) {
        if (depositSum <= 0) {
            System.out.println("!!!Нельзя положить на баланс нулевую или отрицательную сумму!!!");
            return false;
        }

        int need100 = depositSum / 100;
        int remainder = depositSum % 100;

        int need50 = remainder / 50;
        remainder = remainder % 50;

        int need20 = remainder / 20;
        remainder = remainder % 20;

        if (remainder != 0){
            System.out.println("Невозможно положить указанную сумму");
            return false;
        }

        count100 += need100;
        count50 += need50;
        count20 += need20;

        System.out.println("Сумма " + depositSum + " $ успешно внесена");
        balance += depositSum;
        return true;
    }

    public  boolean withdraw(int withdrawSum) {
        int amount = withdrawSum;
        if (withdrawSum <= 0) {
            System.out.println("Невозможно снять отрицательную сумму");
            return false;
        }

        if (withdrawSum > balance) {
            System.out.println("Недостаточно средств в банкомате");
            return false;
        }

        int temp100 = count100;
        int temp50 = count50;
        int temp20 = count20;

        int need100 = 0;
        int need50 = 0;
        int need20 = 0;

        need100 = Math.min(temp100, withdrawSum / 100);
        withdrawSum -= need100 * 100;
        need50 = Math.min(temp50, withdrawSum / 50);
        withdrawSum -= need50 * 50;
        need20 = Math.min(temp20, withdrawSum / 20);
        withdrawSum -= need20 * 20;

        if (withdrawSum != 0) {
            System.out.println("Невозможно снять указанную сумму");
            return false;
        }
        count100 -= need100;
        count50 -= need50;
        count20 -= need20;
        System.out.println("Выдача успешна");
        System.out.println("Выдано " + amount + " $");
        balance -= amount;
        return true;
    }
    public void printStatus() {
        System.out.println("--- Состояние банкомата ---");
        System.out.println("Купюр по 100: " + count100);
        System.out.println("Купюр по 50: " + count50);
        System.out.println("Купюр по 20: " + count20);
        System.out.println("Общая сумма в банкомате: " + balance);
        System.out.println("---------------------------");
    }



}
