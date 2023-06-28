public class Main {
    public static void main(String[] args) {

        int account = 300;
        int remittance = 1100;
        int limit = 1000;
        int bonus = 1;

        if (remittance > limit) {
            bonus = (remittance / 100) * bonus;
            account = account + remittance + bonus;
        } else {
            account = account + remittance;
        }
        System.out.print("На счету:");
        System.out.println(account);
        System.out.print("Бонусов:");
        System.out.println(bonus);
    }
}