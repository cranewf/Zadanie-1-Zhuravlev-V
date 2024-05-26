public class Main {

    public static void main(String[] args) {
        int price = 15_000;  // цена билета
        int cashback = 20; // кол-во рублей для возврата 1 мили
        int bonus = price/cashback;

        System.out.println("За покупку билета Вам начисленно " + bonus + " миль");
    }
}

