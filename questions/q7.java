package questions;

class BankAccount {

    int balance = 1000;

    void deposit(int amount) {

        balance = balance + amount;

        System.out.println(
            Thread.currentThread().getName()
            + " Deposited: " + amount
            + " Balance: " + balance
        );
    }

    void withdraw(int amount) {

        balance = balance - amount;

        System.out.println(
            Thread.currentThread().getName()
            + " Withdraw: " + amount
            + " Balance: " + balance
        );
    }
}

class DepositTask implements Runnable {

    BankAccount acc;

    DepositTask(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {

        for(int i=1; i<=5; i++) {

            acc.deposit(500);
        }
    }
}

class WithdrawTask implements Runnable {

    BankAccount acc;

    WithdrawTask(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {

        for(int i=1; i<=5; i++) {

            acc.withdraw(300);
        }
    }
}

public class q7 {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(
            new DepositTask(acc),
            "DepositThread"
        );

        Thread t2 = new Thread(
            new WithdrawTask(acc),
            "WithdrawThread"
        );

        t1.start();
        t2.start();
    }
}
