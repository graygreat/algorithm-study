import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class OptionalTest {

    @Test
    public void optionalNullObject() {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        assertFalse(empty.isPresent());
    }

    @Test
    public void optionalOfObject() throws Exception {
        //given
        String name = "happybennie";

        //when
        Optional<String> optionalOf = Optional.of(name);

        //then
        assertTrue(optionalOf.isPresent());
    }

    @Test
    public void Optional에_null_필요() throws Exception {
        //given
        String name = "happybennie";

        //when
        Optional<String> optionalOf = Optional.ofNullable(name);

        //then
        assertTrue(optionalOf.isPresent());
    }

    @Test
    public void null이_아닐_때_출력() throws Exception {
        //given
        Optional<String> optionalOf = Optional.of("happybennie");

        //when

        //then
        optionalOf.ifPresent(name -> System.out.println(name));

    }

    @Test
    public void orElse_사용하기() throws Exception {
        //given
        String name = null;

        //when
        Optional<String> ofNullable = Optional.ofNullable(name);
        name = ofNullable.orElse("hellobennie");

        //then
        assertEquals("hellobennie", name);
    }

    @Test
    public void orElseGet_사용하기() throws Exception {
        //given
        String name = null;

        //when
        Optional<String> ofNullable = Optional.ofNullable(name);
        name = ofNullable.orElseGet(() -> "happy");

        //then
        assertEquals("happy", name);
    }

    @Test
    void whenOrElseGetAndOrElse_1() {
        String name = null;
        String defaultText = Optional.ofNullable(name).orElseGet(this::getDefault);
        assertEquals("HappyMommy", defaultText);
        defaultText = Optional.ofNullable(name).orElse(getDefault());
        assertEquals("HappyMommy", defaultText);
    }

    @Test
    void whenOrElseGetAndOrElse_2() {
        String name = "HappyDaddy";
        String defaultText = Optional.ofNullable(name).orElseGet(this::getDefault);
        assertEquals("HappyDaddy", defaultText);
        defaultText = Optional.ofNullable(name).orElse(getDefault());
        assertEquals("HappyDaddy", defaultText);
    }

    public String getDefault() {
        System.out.println("getDefault");
        return "HappyMommy";
    }

    @Test
    public void orElseThrow사용() throws Exception {
        //given
        String name = null;

        //then
        Optional.ofNullable(name).orElseThrow(IllegalAccessError::new);
    }

    @Test
    public void get사용() throws Exception {
        //given
        String name = null;

        //when
        Optional<String> optionalName = Optional.ofNullable(name);

        //then
        assertEquals("bennie", optionalName.get());
    }

    @Test
    public void fileter를_사용한_조건부_리턴() throws Exception {
        //given
        Integer year = 2019;

        //when
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2019 = yearOptional.filter(y -> y == 2019).isPresent();

        //then
        assertTrue(is2019);
    }

    /**
    public boolean priceIsInRange(Modem modem) {
        boolean isInRange = false;
        if (modem != null && modem.getPrice() != null
     && (modem.getPrice() >= 10 && modem.getPrice() <= 15)) {
            isInRange = true;
        }
        return isInRange;
    }
     **/
    /**
    public boolean priceIsInRange(Modem modem) {
        return Optional.ofNullable(modem).map(Modem::getPrice).filter(p -> p <= 15).isPresent();
    }
     **/
}
