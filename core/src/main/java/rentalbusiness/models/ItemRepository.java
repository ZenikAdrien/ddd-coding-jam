package rentalbusiness.models;

import rentalbusiness.infrastructure.persistence.ItemStorage;

public class ItemRepository {
    public static Item getItemByName(String name, ItemStorage storage) {
        return storage.findByName(name);
    }
}

