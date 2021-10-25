import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack){
        this.flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : this.flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public FlowerPack getByIndex(int index){
        return this.flowerPacks.get(index);
    }
    public int lenght(){
        return flowerPacks.size();
    }
}
