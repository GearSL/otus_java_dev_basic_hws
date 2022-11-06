package kz.ibr.homeworks.lesson23.test.units;

import kz.ibr.homeworks.lesson23.resources.MoneyToStr;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyToStrTest {
    private static final long V_12L = 12L;
    private static final long V_123L = 123L;
    private static final double V_11D = 11D;
    private static final double V_12D = 12D;
    private static final double V_11_12D = 11.12D;
    private static final double V_12_11D = 12.11D;
    private static final double V_300D = 300D;
    private static final double V_400D = 400D;
    private static final double V_700D = 700D;
    private static final double V_800D = 800D;
    private static final double V_50D = 50D;
    private static final double V_13D = 13D;
    private static final double V_14D = 14D;
    private static final double V_15D = 15D;
    private static final double V_16D = 16D;
    private static final double V_17D = 17D;
    private static final double V_18D = 18D;
    private static final double V_19D = 19D;
    private static final double V_31D = 31D;
    private static final long V_978637287197540L = 978637287197540L;
    private static final long V_234978637287197540L = 234978637287197540L;
    private static final double V_32D = 32D;
    private static final double V_2000D = 2000D;
    private static final double V_5000D = 5000D;
    private static final double V_1000000D = 1000000D;
    private static final double V_2000000D = 2000000D;
    private static final double V_5000000D = 5000000D;
    private static final double V_1000000000D = 1000000000D;
    private static final double V_2000000000D = 2000000000D;
    private static final double V_5000000000D = 5000000000D;
    private static final double V_1000000000000D = 1000000000000D;
    private static final double V_2000000000000D = 2000000000000D;
    private static final double V_5000000000000D = 5000000000000D;
    private static final double V_1D = 1D;
    private static final double V_2D = 2D;
    private static final double V_3D = 3D;
    private static final double V_4D = 4D;
    private static final double V_5D = 5D;
    private static final double V_6D = 6D;
    private static final double V_7D = 7D;
    private static final double V_8D = 8D;
    private static final double V_9D = 9D;
    private static final double V_123D = 123D;
    private static final double V_1_1D = 1.1D;
    private static final double V_1_01D = 1.01D;
    private static final double V_1_02D = 1.02D;
    private static final double V_1_10D = 1.10D;
    private static final double V_1_11D = 1.11D;
    private static final double V_1_12D = 1.12D;
    private static final double V_1_13D = 1.13D;
    private static final double V_1_14D = 1.14D;
    private static final double V_2_02D = 2.02D;
    private static final double V_5_05D = 5.05D;
    private static final double V_5_0005D = 5.0005D;
    private static final double V_777_77D = 777.77D;
    private static final double V_1234567_89D = 1234567.89D;

    private MoneyToStr moneyToStrRUR;
    private MoneyToStr moneyToStrRURRUS;
    private MoneyToStr moneyToStrCustom;

    /** setUp. */
    @Before
    public void setUp() {
        moneyToStrRURRUS =
                new MoneyToStr(
                        MoneyToStr.Currency.RUR,
                        MoneyToStr.Language.RUS,
                        MoneyToStr.Pennies.NUMBER);
        moneyToStrCustom =
                new MoneyToStr(
                        MoneyToStr.Currency.RUR,
                        MoneyToStr.Language.RUS,
                        MoneyToStr.Pennies.NUMBER,
                        new String[] {
                                "евро", "евро", "евро", "M", "евроцент", "евроцента", "евроцентов", "M"
                        });
    }

    /** checkRURRUS. */
    @Test
    public void checkRURRUS() {
        assertEquals("триста рублей 00 копеек", moneyToStrRURRUS.convert(V_300D));
        assertEquals(
                "девятьсот семьдесят восемь триллионов шестьсот тридцать семь миллиардов двести восемьдесят семь миллионов с"
                        + "то девяносто семь тысяч пятьсот сорок рублей 12 копеек",
                moneyToStrRURRUS.convert(V_978637287197540L, V_12L));
        assertEquals(
                "двести тридцать четыре ??? девятьсот семьдесят восемь триллионов шестьсот тридца"
                        + "ть семь миллиардов двести восемьдесят семь миллионов сто девяносто семь тысяч пятьсот сорок рублей 12 копеек",
                moneyToStrRURRUS.convert(V_234978637287197540L, V_12L));
        assertEquals(
                "семьсот семьдесят семь рублей 77 копеек", moneyToStrRURRUS.convert(V_777_77D));
    }

    /** checkEURRUSCustom. */
    @Test
    public void checkEURRUSCustom() {
        assertEquals("триста евро 00 евроцентов", moneyToStrCustom.convert(V_300D));
        assertEquals(
                "девятьсот семьдесят восемь триллионов шестьсот тридцать семь миллиардов двести восемьдесят семь миллионов с"
                        + "то девяносто семь тысяч пятьсот сорок евро 12 евроцентов",
                moneyToStrCustom.convert(V_978637287197540L, V_12L));
        assertEquals(
                "двести тридцать четыре ??? девятьсот семьдесят восемь триллионов шестьсот тридца"
                        + "ть семь миллиардов двести восемьдесят семь миллионов сто девяносто семь тысяч пятьсот сорок евро 12 евроцентов",
                moneyToStrCustom.convert(V_234978637287197540L, V_12L));
    }
}
