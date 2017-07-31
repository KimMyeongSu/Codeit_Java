import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        SavingsAccount sa = new SavingsAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();

        ba.deposit(1000);
        sa.deposit(1000);
        mba.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(sa);
        accounts.add(mba);


        for (BankAccount account : accounts) {
           account.deposit(1000);
        }

/*
        BankAccount sa2 = new SavingsAccount();
        BankAccount sa3 = sa;
        //자식 인스턴스를 부모 클래스로 형변환 했으므로 업캐스팅 .


        sa.addInterest();
        ((SavingsAccount)sa3).addInterest();
        ((SavingsAccount)sa2).addInterest();
        System.out.println(((SavingsAccount)accounts.get(1)).name);
        //부모클래스를 자식클래스로 형변환 했으므로 다운 캐스팅 . */
    }
}

class BankAccount {
    String name = "BankAccount";
    private int balance; //잔액

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 출금
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // 입금
    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }

}

class SavingsAccount extends BankAccount {
    String name = "SavingsAccount";
    private double interest;

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void addInterest() {
        setBalance((int) (getBalance() * (1 + interest)));
    }
}


class MinimumBalanceAccount extends BankAccount {
    String name = "MinimumBalanceAccount";
    private int minimum;

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    @Override
    public boolean withdraw(int amount) {
        if (getBalance() - amount < minimum) {
            System.out.println("적어도 " + minimum + "원은 남겨야 합니다.");
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }
}