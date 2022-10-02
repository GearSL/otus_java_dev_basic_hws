package kz.ibr.homeworks.lesson23.resources;

import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;

public class Price {

    public static String priceStringWithCurrency(long price, Currency currency){
        return switch (currency){
            case RUB -> priceWithRubCurrency(price);
            case EUR -> priceWithEurCurrency(price);
            case USD -> priceWithUsdCurrency(price);
        };
    }

    private static String priceWithRubCurrency (long price){
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);
        String priceInWords = nf.format(price);
        long lastDigit = price % 10;

        if (lastDigit == 1){
            return String.format("%s рубль", priceInWords);
        } else if (lastDigit > 1 && lastDigit < 5) {
            return String.format("%s рубля", priceInWords);
        } else {
            return String.format("%s рублей", priceInWords);
        }
    }

    private static String priceWithUsdCurrency (long price){
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"), RuleBasedNumberFormat.SPELLOUT);
        String priceInWords = nf.format(price);

        return String.format("%s EUR", priceInWords);
    }

    private static String priceWithEurCurrency (long price){
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"), RuleBasedNumberFormat.SPELLOUT);
        String priceInWords = nf.format(price);

        return String.format("%s USD", priceInWords);
    }
}
