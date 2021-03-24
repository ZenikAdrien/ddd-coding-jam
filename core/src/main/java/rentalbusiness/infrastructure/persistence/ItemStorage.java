package rentalbusiness.infrastructure.persistence;

import rentalbusiness.models.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemStorage {
    private static Map<String, Item> storage = new HashMap<>();
    static {
        Item avatar = new Item();
        avatar.stock = 5;
        storage.put("Avatar", avatar);
    }

    public static Item findByName(String name) {
        return storage.get(name);
    }
}
