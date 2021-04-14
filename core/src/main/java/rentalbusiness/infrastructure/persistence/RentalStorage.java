package rentalbusiness.infrastructure.persistence;

import rentalbusiness.models.Rental;

public interface RentalStorage {
    void persistRental(Rental rental);
}
