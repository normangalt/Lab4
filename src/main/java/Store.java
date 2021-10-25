import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Store {
    private FlowerBucket[] storage;

    Store(FlowerBucket[] flowerBucket){
        this.storage = flowerBucket;
    }

    public FlowerPack[] search(FlowerType flowerType){
        /// Prints all available packs of flowers for the given type.
        FlowerPack[] flowerPacksArray = new FlowerPack[55];
        for (int index = 0; index < this.storage.length;index++){
            FlowerBucket flowerBucket = this.storage[index];
            int lenght = flowerBucket.lenght();
            for (int indexJ = 0; indexJ < lenght; indexJ++){
                FlowerPack flowerPack = flowerBucket.getByIndex(indexJ);
                FlowerType flowerTypePack = flowerPack.getFlower().getFlowerType();
                if (flowerType == flowerTypePack){
                    flowerPacksArray[index + indexJ] = flowerPack;
                    System.out.println(flowerPack);
                }
            }
        }
        return flowerPacksArray;
    }
}
