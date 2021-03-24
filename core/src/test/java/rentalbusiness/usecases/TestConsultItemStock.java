package rentalbusiness.usecases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsultItemStock {

    @Test
    public void test() {
        Integer stock = ConsultItemStock.execute("Avatar");
        assertEquals(5, stock);
    }
}
