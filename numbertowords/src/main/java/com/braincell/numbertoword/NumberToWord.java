package com.braincell.numbertoword;

import static java.lang.Math.abs;

/**
 * Created by julfi on 07/09/2017.
 */

public class NumberToWord {

    private static String[] unitsMap = { "zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    private static String[] tensMap = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String GREEN = "\033[1;32m";
    private static final String BLUE = "\033[1;34m";
    private static final String YELLOW = "\033[1;33m";
    private static final String RESET = "\033[0m";

    public static void Check(){
        System.out.println(YELLOW+"[Test] "+GREEN+"Convert 10556444 to Word "+BLUE+Convert(10556444)+RESET);
    }

    public static String Convert(int number)
    {
        if (number == 0)
            return "zero";

        if (number < 0)
            return "minus " + Convert(abs(number));

        String words = "";

        if ((number / 1000000000) > 0)
        {
            words += Convert(number / 1000000000) + " billion ";
            number %= 1000000000;
        }

        if ((number / 1000000) > 0)
        {
            words += Convert(number / 1000000) + " million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0)
        {
            words += Convert(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0)
        {
            words += Convert(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0)
        {
            if (number < 20)
                words += unitsMap[number];
            else
            {
                words += tensMap[number / 10];
                if ((number % 10) > 0)
                    words += "-" + unitsMap[number % 10];
            }
        }

        return words;
    }

}
