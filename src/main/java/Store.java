import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class Store {
    private FlowerBucket[] storage;

    Store(FlowerBucket[] flowerBucket){
        this.storage = flowerBucket;
    }

    public List<FlowerPack> search(FlowerType flowerType){
        /// Prints all available packs of flowers for the given type.
        List<FlowerPack> flowerPacksList = new ArrayList<>();
        for (FlowerBucket flowerBucket : this.storage) {
            int length = flowerBucket.lenght();
            for (int indexJ = 0; indexJ < length; indexJ++) {
                FlowerPack flowerPack = flowerBucket.getByIndex(indexJ);
                FlowerType flowerTypePack = flowerPack.getFlower().getFlowerType();
                if (flowerType == flowerTypePack) {
                    flowerPacksList.add(flowerPack);
                    System.out.println(flowerPack);
                }
            }
        }
        return flowerPacksList;
    }
}
