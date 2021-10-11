package lesson5;

public class RandomExamples {
    public static void main(String[] args) {
        //BANK ACCOUNT
        BankTransaction bt = new BankTransaction();
        bt.sendMoney(50);
        bt.sendMoney(100);

        System.out.println("Money remaining: " + bt.balance);

        bt.balance = 100000000;

        System.out.println("Money remaining: " + bt.balance);

    }
}

 class BankTransaction {

    public int balance = 100;

    public void sendMoney(int money) {

        if(balance - money >= 0 ) {
            balance = balance - money;
            System.out.println("Money was sent!");
        } else {
            System.out.println("Not enough money!");
        }


    }
 }