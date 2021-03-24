package rentalbusiness.usecases;

import org.junit.jupiter.api.Test;
import rentalbusiness.models.Rental;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestRentItem {

    @Test
    public void testRent() {
        Rental rental = RentItem.execute("Avatar");
        assertNotNull(rental);
        assertEquals("Avatar", rental.itemName);
        assertEquals("2021-04-14", rental.startDate);
        assertNull(rental.endDate);
        // Question: what do we do with the stock?
    }
}
