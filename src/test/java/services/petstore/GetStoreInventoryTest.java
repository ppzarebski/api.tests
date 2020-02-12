package services.petstore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class GetStoreInventoryTest {

    @DisplayName("should get store inventory")
    @Test
    void getStoreInventoryTest() {
        var inv = PetstoreService.getStoreInventory();
        assertThat(inv.body()).isNotNull();
    }
}