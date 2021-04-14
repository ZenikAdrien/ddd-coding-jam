package rentalbusiness.usecases;

import rentalbusiness.infrastructure.persistence.ItemStorage;
import rentalbusiness.models.Item;
import rentalbusiness.models.ItemRepository;

public class ConsultItemStock {
    public static Integer execute(String itemName, ItemStorage storage) {
        Item item = ItemRepository.getItemByName(itemName, storage);
        return item.stock;
    }
}
