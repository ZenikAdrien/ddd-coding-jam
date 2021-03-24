package rentalbusiness.usecases;

import rentalbusiness.models.Item;
import rentalbusiness.models.ItemRepository;

public class ConsultItemStock {
    public static Integer execute(String itemName) {
        Item item = ItemRepository.getItemByName(itemName);
        return item.stock;
    }
}
