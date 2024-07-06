package pl.tmielecki.creditcard;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Collections;

import static org.assertj.core.api.Assertions.*;

public class AssertJPLaygroundTest {

    @Test
    void timeAssertion(){
        assertThat(Instant.now()).isInThePast();
    }

    @Test
    void listAssertion(){
        assertThat(Collections.emptyList()).isEmpty();
    }

    @Test
    void stringAssertions(){
        assertThat("Hello World").contains("Hello").hasSize(11);
    }
}
