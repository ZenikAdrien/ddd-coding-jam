package rentalbusiness.usecases;

import org.junit.jupiter.api.Test;
import rentalbusiness.infrastructure.persistence.ItemStorage;
import rentalbusiness.infrastructure.persistence.RentalStorage;
import rentalbusiness.models.Item;
import rentalbusiness.models.Rental;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestMakeRentalOfItem {

    @Test
    public void testRent() {
        ItemStorage mockItemStorage = new ItemStorage() {
            private Item AVATAR = new Item();
            {
                AVATAR.name = "Avatar";
                AVATAR.stock = 5;
            }
            @Override
            public Item findByName(String name) {
                if ("Avatar".equals(name)) {
                    return AVATAR;
                }
                return null;
            }
        };

        RentalStorage mockRentalStorage = new RentalStorage() {
            @Override
            public void persistRental(Rental rental) {
            }
        };

        Rental rental = MakeRentalOfItem.execute("Avatar", mockItemStorage, mockRentalStorage);
        assertNotNull(rental);
        assertEquals("Avatar", rental.itemName);
        assertEquals("2021-04-14", rental.startDate);
        assertNull(rental.endDate);
    }
}
