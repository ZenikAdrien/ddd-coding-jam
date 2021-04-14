package rentalbusiness.usecases;

import org.junit.jupiter.api.Test;
import rentalbusiness.infrastructure.persistence.ItemStorage;
import rentalbusiness.models.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsultItemStock {

    @Test
    public void test() {
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

        Integer stock = ConsultItemStock.execute("Avatar", mockItemStorage);
        assertEquals(5, stock);
    }
}
