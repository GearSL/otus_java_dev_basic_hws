package kz.ibr.homeworks.lesson23.resources;


import java.nio.charset.StandardCharsets;

public class MoneyToStr {
    private static final int INDEX_3 = 3;
    private static final int INDEX_2 = 2;
    private static final int INDEX_1 = 1;
    private static final int INDEX_0 = 0;
    private static org.w3c.dom.Document xmlDoc;
    private static final int NUM0 = 0;
    private static final int NUM1 = 1;
    private static final int NUM2 = 2;
    private static final int NUM3 = 3;
    private static final int NUM4 = 4;
    private static final int NUM5 = 5;
    private static final int NUM6 = 6;
    private static final int NUM7 = 7;
    private static final int NUM8 = 8;
    private static final int NUM9 = 9;
    private static final int NUM10 = 10;
    private static final int NUM11 = 11;
    private static final int NUM14 = 14;
    private static final int NUM100 = 100;
    private static final int NUM1000 = 1000;
    private static final int NUM10000 = 10000;
    private static final String CURRENCY_LIST =
            """
                    <CurrencyList>
                    \s
                     <RUS>
                     <item value="minus" text="минус"/>
                     <item value="0" text="ноль"/>
                     <item value="1000_10" text="тысяч,миллионов,миллиардов,триллионов"/>
                     <item value="1000_1" text="тысяча,миллион,миллиард,триллион"/>
                     <item value="1000_234" text="тысячи,миллиона,миллиарда,триллиона"/>
                     <item value="1000_5" text="тысяч,миллионов,миллиардов,триллионов"/>
                     <item value="10_19" text="десять,одиннадцать,двенадцать,тринадцать,четырнадцать,пятнадцать,шестнадцать,семнадцать,восемнадцать,девятнадцать"/>
                     <item value="1" text="одна,один,один,одна"/>
                     <item value="2" text="две,два,два,две"/>
                     <item value="3_9" text="три,четыре,пять,шесть,семь,восемь,девять"/>
                     <item value="100_900" text="сто ,двести ,триста ,четыреста ,пятьсот ,шестьсот ,семьсот ,восемьсот ,девятьсот "/>
                     <item value="20_90" text="двадцать ,тридцать ,сорок ,пятьдесят ,шестьдесят ,семьдесят ,восемьдесят ,девяносто "/>
                     <item value="pdv" text="в т.ч. НДС "/>
                     <item value="pdv_value" text="18"/>
                     </RUS>
                     <ENG>
                     <item value="minus" text="minus"/>
                     <item value="0" text="zero"/>
                     <item value="1000_10" text="thousand,million,billion,trillion"/>
                     <item value="1000_1" text="thousand,million,billion,trillion"/>
                     <item value="1000_234" text="thousand,million,billion,trillion"/>
                     <item value="1000_5" text="thousand,million,billion,trillion"/>
                     <item value="10_19" text="ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen"/>
                     <item value="1" text="one,one,one,one"/>
                     <item value="2" text="two,two,two,two"/>
                     <item value="3_9" text="three,four,five,six,seven,eight,nine"/>
                     <item value="100_900" text="one hundred ,two hundred ,three hundred ,four hundred ,five hundred ,six hundred ,seven hundred ,eight hundred ,nine hundred "/>
                     <item value="20_90" text="twenty-,thirty-,forty-,fifty-,sixty-,seventy-,eighty-,ninety-"/>
                     <item value="pdv" text="including VAT "/>
                     <item value="pdv_value" text="10"/>
                     </ENG>

                     <RUR CurrID="810" CurrName="Российские рубли" language="RUS"
                     RubOneUnit="рубль" RubTwoUnit="рубля" RubFiveUnit="рублей" RubSex="M" RubShortUnit="руб."
                     KopOneUnit="копейка" KopTwoUnit="копейки" KopFiveUnit="копеек" KopSex="F"
                     />
                     <USD CurrID="840" CurrName="Долари США" language="RUS"
                     RubOneUnit="доллар" RubTwoUnit="доллара" RubFiveUnit="долларов" RubSex="M" RubShortUnit="дол."
                     KopOneUnit="цент" KopTwoUnit="цента" KopFiveUnit="центов" KopSex="M"
                     />
                     <EUR CurrID="840" CurrName="Евро ЕС" language="RUS" RubOneUnit="евро" RubTwoUnit="евро" RubFiveUnit="евро" RubSex="M" RubShortUnit="евр." KopOneUnit="цент" KopTwoUnit="цента" KopFiveUnit="центов" KopSex="M" />
                     <RUR CurrID="810" CurrName="Российские рубли" language="ENG"
                     RubOneUnit="ruble" RubTwoUnit="rubles" RubFiveUnit="rubles" RubSex="M" RubShortUnit="RUR."
                     KopOneUnit="kopeck" KopTwoUnit="kopecks" KopFiveUnit="kopecks" KopSex="M"
                     />s
                     <USD CurrID="840" CurrName="Долари США" language="ENG"
                     RubOneUnit="dollar" RubTwoUnit="dollars" RubFiveUnit="dollars" RubSex="M" RubShortUnit="USD."
                     KopOneUnit="cent" KopTwoUnit="cents" KopFiveUnit="cents" KopSex="M"
                     />
                     <EUR CurrID="840" CurrName="Евро ЕС" language="ENG" RubOneUnit="euro" RubTwoUnit="euros" RubFiveUnit="euros" RubSex="M" RubShortUnit="EUR." KopOneUnit="cent" KopTwoUnit="cents" KopFiveUnit="cents" KopSex="M" />
                     </CurrencyList>
                    """;
    private final java.util.Map<String, String[]> messages = new java.util.LinkedHashMap<>();
    private final String rubOneUnit;
    private final String rubTwoUnit;
    private final String rubFiveUnit;
    private final String rubSex;
    private final String kopOneUnit;
    private final String kopTwoUnit;
    private final String kopFiveUnit;
    private final String kopSex;
    private final String rubShortUnit;
    private final Currency currency;
    private final Language language;
    private final Pennies pennies;

    static {
        initXmlDoc(CURRENCY_LIST);
    }

    public static void initXmlDoc(final String xmlData) {
        javax.xml.parsers.DocumentBuilderFactory docFactory =
                javax.xml.parsers.DocumentBuilderFactory.newInstance();
        try {
            javax.xml.parsers.DocumentBuilder xmlDocBuilder = docFactory.newDocumentBuilder();
            xmlDoc =
                    xmlDocBuilder.parse(new java.io.ByteArrayInputStream(xmlData.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception ex) {
            throw new UnsupportedOperationException(ex);
        }
    }

    /** Currency. */
    public enum Currency {
        /** . */
        RUR,
        /** . */
        USD,
        /** . */
        EUR,
        /** . */
        PER10,
        /** . */
        PER100,
        /** . */
        PER1000,
        /** . */
        PER10000,
        /** . */
        Custom
    }

    /** Language. */
    public enum Language {
        /** . */
        RUS,
        /** . */
        ENG
    }

    /** Pennies. */
    public enum Pennies {
        /** . */
        NUMBER,
        /** . */
        TEXT
    }

    /**
     * Inits class with currency. Usage: MoneyToStr money = new MoneyToStr(
     * MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER); Definition for
     * currency is placed into CURRENCY_LIST.xml
     *
     * @param currency the currency (RUR, USD, EUR)
     * @param language the language (RUS, ENG)
     * @param pennies the pennies (NUMBER, TEXT)
     */
    public MoneyToStr(Currency currency, Language language, Pennies pennies) {
        if (currency == null) {
            throw new IllegalArgumentException("currency is null");
        }
        if (language == null) {
            throw new IllegalArgumentException("language is null");
        }
        if (pennies == null) {
            throw new IllegalArgumentException("pennies is null");
        }
        this.currency = currency;
        this.language = language;
        this.pennies = pennies;
        String theISOstr = currency.name();
        org.w3c.dom.Element languageElement =
                (org.w3c.dom.Element) (xmlDoc.getElementsByTagName(language.name())).item(0);
        org.w3c.dom.NodeList items = languageElement.getElementsByTagName("item");
        for (int index = 0; index < items.getLength(); index += 1) {
            org.w3c.dom.Element languageItem = (org.w3c.dom.Element) items.item(index);
            messages.put(
                    languageItem.getAttribute("value"),
                    languageItem.getAttribute("text").split(","));
        }
        org.w3c.dom.NodeList theISOElements =
                xmlDoc.getElementsByTagName(theISOstr);
        org.w3c.dom.Element theISOElement = null;
        for (int index = 0; index < theISOElements.getLength(); index += 1) {
            if (((org.w3c.dom.Element) theISOElements.item(index))
                    .getAttribute("language")
                    .equals(language.name())) {
                theISOElement = (org.w3c.dom.Element) theISOElements.item(index);
                break;
            }
        }
        assert theISOElement != null;
        rubOneUnit = theISOElement.getAttribute("RubOneUnit");
        rubTwoUnit = theISOElement.getAttribute("RubTwoUnit");
        rubFiveUnit = theISOElement.getAttribute("RubFiveUnit");
        kopOneUnit = theISOElement.getAttribute("KopOneUnit");
        kopTwoUnit = theISOElement.getAttribute("KopTwoUnit");
        kopFiveUnit = theISOElement.getAttribute("KopFiveUnit");
        rubSex = theISOElement.getAttribute("RubSex");
        kopSex = theISOElement.getAttribute("KopSex");
        rubShortUnit =
                theISOElement.hasAttribute("RubShortUnit")
                        ? theISOElement.getAttribute("RubShortUnit")
                        : "";
    }

    /**
     * Inits class with currency. Usage: MoneyToStr money = new MoneyToStr(
     * MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
     *
     * @param currency the currency (RUR, USD, EUR)
     * @param language the language (RUS, ENG)
     * @param pennies the pennies (NUMBER, TEXT)
     * @param names the custom names
     */
    public MoneyToStr(Currency currency, Language language, Pennies pennies, String[] names) {
        if (currency == null) {
            throw new IllegalArgumentException("currency is null");
        }
        if (language == null) {
            throw new IllegalArgumentException("language is null");
        }
        if (pennies == null) {
            throw new IllegalArgumentException("pennies is null");
        }
        if (names == null || names.length != 8) {
            throw new IllegalArgumentException("names is null");
        }
        this.currency = currency;
        this.language = language;
        this.pennies = pennies;
        org.w3c.dom.Element languageElement =
                (org.w3c.dom.Element) (xmlDoc.getElementsByTagName(language.name())).item(0);
        org.w3c.dom.NodeList items = languageElement.getElementsByTagName("item");
        for (int index = 0; index < items.getLength(); index += 1) {
            org.w3c.dom.Element languageItem = (org.w3c.dom.Element) items.item(index);
            messages.put(
                    languageItem.getAttribute("value"),
                    languageItem.getAttribute("text").split(","));
        }
        rubOneUnit = names[0];
        rubTwoUnit = names[1];
        rubFiveUnit = names[2];
        rubSex = names[3];
        kopOneUnit = names[4];
        kopTwoUnit = names[5];
        kopFiveUnit = names[6];
        kopSex = names[7];
        rubShortUnit = names[0];
    }

    /**
     * Converts double value to the text description.
     *
     * @param theMoney the amount of money in format major | minor
     * @return the string description of money value
     */
    public String convert(Double theMoney) {
        if (theMoney == null) {
            throw new IllegalArgumentException("theMoney is null");
        }
        Long intPart = theMoney.longValue();
        long fractPart = Math.round((theMoney - intPart) * NUM100);
        if (currency == Currency.PER1000) {
            fractPart = Math.round((theMoney - intPart) * NUM1000);
        }
        return convert(intPart, fractPart);
    }

    /**
     * Converts amount to words. Usage: MoneyToStr money = new
     * MoneyToStr(MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
     * String result = moneyToStr.convert(123D); Expected: result = сто двадцять три гривні 00
     * копійок
     *
     * @param theMoney the amount of money major currency
     * @param thePennies the amount of money minor currency
     * @return the string description of money value
     */
    public String convert(Long theMoney, Long thePennies) {
        if (theMoney == null) {
            throw new IllegalArgumentException("theMoney is null");
        }
        if (thePennies == null) {
            throw new IllegalArgumentException("thePennies is null");
        }
        StringBuilder money2str = new StringBuilder();
        long triadNum = 0L;
        long theTriad;

        long intPart = Math.abs(theMoney);
        if (intPart == 0) {
            money2str.append(messages.get("0")[0]).append(" ");
        }
        do {
            theTriad = intPart % NUM1000;
            money2str.insert(0, triad2Word(theTriad, triadNum, rubSex));
            if (triadNum == 0) {
                if ((theTriad % NUM100) / NUM10 == NUM1) {
                    money2str.append(rubFiveUnit);
                } else {
                    switch (Long.valueOf(theTriad % NUM10).byteValue()) {
                        case NUM1 -> money2str.append(rubOneUnit);
                        case NUM2, NUM3, NUM4 -> money2str.append(rubTwoUnit);
                        default -> money2str.append(rubFiveUnit);
                    }
                }
            }
            intPart /= NUM1000;
            triadNum++;
        } while (intPart > 0);

        if (theMoney < 0) {
            money2str.insert(0, messages.get("minus")[0] + " ");
        }
        if (pennies == Pennies.TEXT) {
            money2str
                    .append(language == Language.ENG ? " and " : " ")
                    .append(
                            thePennies == 0
                                    ? messages.get("0")[0] + " "
                                    : triad2Word(Math.abs(thePennies), 0L, kopSex));
        } else {
            money2str.append(" ").append(Math.abs(thePennies) < 10
                    ? "0" + Math.abs(thePennies)
                    : Math.abs(thePennies)).append(" ");
        }
        if (thePennies >= NUM11 && thePennies <= NUM14) {
            money2str.append(kopFiveUnit);
        } else {
            switch ((byte) (thePennies % NUM10)) {
                case NUM1 -> money2str.append(kopOneUnit);
                case NUM2, NUM3, NUM4 -> money2str.append(kopTwoUnit);
                default -> money2str.append(kopFiveUnit);
            }
        }
        return money2str.toString().trim();
    }

    private String triad2Word(Long triad, Long triadNum, String sex) {
        final StringBuilder triadWord = new StringBuilder(NUM100);

        if (triad == 0) {
            return "";
        }

        triadWord.append(
                concat(new String[] {""}, messages.get("100_900"))[
                        Long.valueOf(triad / NUM100).byteValue()]);
        final long range10 = (triad % NUM100) / NUM10;
        triadWord.append(concat(new String[] {"", ""}, messages.get("20_90"))[(byte) range10]);
        if (language == Language.ENG && triadWord.length() > 0 && triad % NUM10 == 0) {
            triadWord.deleteCharAt(triadWord.length() - 1);
            triadWord.append(" ");
        }

        check2(triadNum, sex, triadWord, triad, range10);
        switch (triadNum.byteValue()) {
            case NUM0:
                break;
            case NUM1:
            case NUM2:
            case NUM3:
            case NUM4:
                if (range10 == NUM1) {
                    triadWord.append(messages.get("1000_10")[triadNum.byteValue() - 1]).append(" ");
                } else {
                    final long range = triad % NUM10;
                    switch ((byte) range) {
                        case NUM1 -> triadWord.append(messages.get("1000_1")[triadNum.byteValue() - 1]).append(" ");
                        case NUM2, NUM3, NUM4 -> triadWord.append(messages.get("1000_234")[triadNum.byteValue() - 1]).append(" ");
                        default -> triadWord.append(messages.get("1000_5")[triadNum.byteValue() - 1]).append(" ");
                    }
                }
                break;
            default:
                triadWord.append("??? ");
                break;
        }
        return triadWord.toString();
    }

    /**
     * @param triadNum the triad num
     * @param sex the sex
     * @param triadWord the triad word
     * @param triad the triad
     * @param range10 the range 10
     */
    private void check2(
            Long triadNum, String sex, StringBuilder triadWord, Long triad, Long range10) {
        final Long range = triad % NUM10;
        if (range10 == 1) {
            triadWord.append(messages.get("10_19")[range.byteValue()]).append(" ");
        } else {
            switch (range.byteValue()) {
                case NUM1:
                    if (triadNum == NUM1) {
                        triadWord.append(messages.get("1")[INDEX_0]).append(" ");
                    } else if (triadNum == NUM2 || triadNum == NUM3 || triadNum == NUM4) {
                        triadWord.append(messages.get("1")[INDEX_1]).append(" ");
                    } else if ("M".equals(sex)) {
                        triadWord.append(messages.get("1")[INDEX_2]).append(" ");
                    } else if ("F".equals(sex)) {
                        triadWord.append(messages.get("1")[INDEX_3]).append(" ");
                    }
                    break;
                case NUM2:
                    if (triadNum == NUM1) {
                        triadWord.append(messages.get("2")[INDEX_0]).append(" ");
                    } else if (triadNum == NUM2 || triadNum == NUM3 || triadNum == NUM4) {
                        triadWord.append(messages.get("2")[INDEX_1]).append(" ");
                    } else if ("M".equals(sex)) {
                        triadWord.append(messages.get("2")[INDEX_2]).append(" ");
                    } else if ("F".equals(sex)) {
                        triadWord.append(messages.get("2")[INDEX_3]).append(" ");
                    }
                    break;
                case NUM3:
                case NUM4:
                case NUM5:
                case NUM6:
                case NUM7:
                case NUM8:
                case NUM9:
                    triadWord.append(concat(new String[]{"", "", ""}, messages.get("3_9"))[
                            range.byteValue()]).append(" ");
                    break;
                default:
                    break;
            }
        }
    }

    private <T> T[] concat(T[] first, T[] second) {
        final T[] result = java.util.Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static void main(String[] args) {
        String amount = "123.25";
        String language = "ENG";
        String currency = "USD";
        String pennies = "TEXT";
        if (args.length == 0) {
            System.out.println(
                    "Usage: java -jar moneytostr.jar --amount=123.25 --language=rus|eng --currency=rur|usd|eur --pennies=text|number");
        } else {
            for (String arg : args) {
                if (arg.startsWith("--amount=")) {
                    amount = arg.substring("--amount=".length()).trim().replace(",", ".");
                } else if (arg.startsWith("--language=")) {
                    language = arg.substring("--language=".length()).trim().toUpperCase();
                } else if (arg.startsWith("--currency=")) {
                    currency = arg.substring("--currency=".length()).trim().toUpperCase();
                } else if (arg.startsWith("--pennies=")) {
                    pennies = arg.substring("--pennies=".length()).trim().toUpperCase();
                }
            }
            String result =
                    new MoneyToStr(
                            Currency.valueOf(currency),
                            Language.valueOf(language),
                            Pennies.valueOf(pennies))
                            .convert(Double.valueOf(amount));
            System.out.println(result);
        }
    }

    public java.util.Map<String, String[]> getMessages() {
        return messages;
    }

    public String getRubShortUnit() {
        return rubShortUnit;
    }

    public Language getLanguage() {
        return language;
    }
}
