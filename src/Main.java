public class Main {
    public static void main(String[] args) {

        int amount = 5000;
        int bonus = 20;
        int miles = (amount / bonus);

        System.out.println("За покупку билета на сумму " + amount + " рублей" + " Вам начислено " + miles + " бонусных миль");
    }
}