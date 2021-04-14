package rentalbusiness.models;

public class RentalFactory {
    public static Rental createRentalFromItem(Item item) {
        Rental rental = new Rental();
        rental.itemName = item.name;
        rental.startDate = "2021-04-14";
        return rental;
    }
}
