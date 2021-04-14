package rentalbusiness.usecases;

import rentalbusiness.infrastructure.persistence.ItemStorage;
import rentalbusiness.infrastructure.persistence.RentalStorage;
import rentalbusiness.models.Item;
import rentalbusiness.models.ItemRepository;
import rentalbusiness.models.Rental;
import rentalbusiness.models.RentalFactory;

public class MakeRentalOfItem {
    public static Rental execute(String itemName, ItemStorage itemStorage, RentalStorage rentalStorage) {
        // Query
        Item item = ItemRepository.getItemByName(itemName, itemStorage);
        // Invariant
        if (item == null) {
            throw new RuntimeException("The item does not exist");
        }
        // Recalculate stock availability based on teh active Rental entities
        // => we would need a RentalRepository
        // Creation
        Rental rental = RentalFactory.createRentalFromItem(item);
        // Infrastructure service
        rentalStorage.persistRental(rental);
        return rental;
    }
}
