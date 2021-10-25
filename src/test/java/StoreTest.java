import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Store store;
    @BeforeEach
    void setUp() {
        FlowerBucket[] flowerBucket = new FlowerBucket[5];
        FlowerBucket flowerBucketIn =  new FlowerBucket();

        for (int index = 0; index < 5; index++){
            FlowerPack flowerPack = new FlowerPack(index, FlowerType.ROSE);
            flowerBucketIn.addFlowerPack(flowerPack);
            flowerBucket[index] = flowerBucketIn;
        }
        this.store = new Store(flowerBucket);

    }
    @Test
    void search() {
        FlowerType flowerType = FlowerType.ROSE;
        List<FlowerPack> flowerPacksListTest = this.store.search(FlowerType.ROSE);
        assertEquals(flowerPacksListTest.get(0).getFlower().getFlowerType(),
                flowerType);
    }
}