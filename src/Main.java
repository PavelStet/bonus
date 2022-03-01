public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int accountFunds = 1100;
        int bonus = accountFunds >= 1000 ? accountFunds/100 : 0;
        int newBalance = balance + accountFunds+ bonus;
        System.out.println(newBalance);
        System.out.println(bonus);
    }
}