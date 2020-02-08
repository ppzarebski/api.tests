package services.petstore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetStoreInventoryTest {

    @DisplayName("should get store inventory")
    @Test
    void getStoreInventoryTest() {
        PetstoreService.getStoreInventory();
    }
}
