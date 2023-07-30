public class Main {
    public static void main(String[] args) {
        int start = 150;
        int add = 1350;
        int sum = start + add;
        int bonus;

        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int balance = sum + bonus;

        System.out.println("Итоговый счёт:" + balance);
    }
}
