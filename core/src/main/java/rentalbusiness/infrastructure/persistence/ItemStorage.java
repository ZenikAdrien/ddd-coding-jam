package rentalbusiness.infrastructure.persistence;

import rentalbusiness.models.Item;

import java.util.HashMap;
import java.util.Map;

public interface ItemStorage {
    Item findByName(String name);
}
