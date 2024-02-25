package org.example;

import org.junit.jupiter.api.Test;

class SelectingNumbersTest {

    @Test
    void mustSelectionIntegersFromText() {
        //given
        String text = "342\n5.34\n756\n1.234e+07\n7.234243E-02\n6.09\n3457\n87\n1.0001\n3\n5";
        String excepted = "342\n756\n3457\n87\n3\n5";

        //when
        System.out.println(excepted);
        System.out.println();

        //then
        SelectingNumbers.selectionIntegersFromText(text);
    }

    @Test
    void mustSelectionDoublesFromText() {
        //given
        String text = "342\n5.34\n756\n1.234e+07\n7.234243E-02\n6.09\n3457\n87\n1.0001\n3\n5";
        String excepted = "5.34\n6.09\n1.0001";

        //when
        System.out.println(excepted);
        System.out.println();

        //then
        SelectingNumbers.selectionDoublesFromText(text);
    }

    @Test
    void mustSelectionNumbersInExponentialNotationFromText() {
        //given
        String text = "342\n5.34\n756\n1.234e+07\n7.234243E-02\n6.09\n3457\n87\n1.0001\n3\n5";
        String excepted = "1.234e+07\n7.234243E-02";

        //when
        System.out.println(excepted);
        System.out.println();

        //then
        SelectingNumbers.selectionNumbersInExponentialNotationFromText(text);
    }
}
