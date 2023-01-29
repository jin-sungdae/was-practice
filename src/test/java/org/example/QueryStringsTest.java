package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueryStringsTest {

    @Test
    void createTest() {
        QueryStrings queyStrings = new QueryStrings("operand1=11&operator=*&operand2=55"); // List<QueryString>

        assertThat(queyStrings).isNotNull();
    }

}