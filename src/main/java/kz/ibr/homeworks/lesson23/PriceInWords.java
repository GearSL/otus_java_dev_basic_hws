package kz.ibr.homeworks.lesson23;

import kz.ibr.homeworks.lesson23.resources.Currency;
import kz.ibr.homeworks.lesson23.resources.Price;


public class PriceInWords {
    public static void main(String[] args) {
//        Scanner consoleInput = new Scanner(System.in);
//        int price;
//
//        System.out.println("Write you price: ");
//        price = consoleInput.nextInt();
//
//        System.out.println("Your price: " + price);

        long n = 111L;
        System.out.println(Price.priceStringWithCurrency(n, Currency.RUB));
        System.out.println("**************");

        n = 123456789;
        System.out.println(Price.priceStringWithCurrency(n, Currency.RUB));
        System.out.println("**************");

        n = 10101010110001L;
        System.out.println(Price.priceStringWithCurrency(n, Currency.RUB));
        System.out.println("**************");

        n = 999999993;
        System.out.println(Price.priceStringWithCurrency(n, Currency.RUB));
        System.out.println("**************");
    }
}
