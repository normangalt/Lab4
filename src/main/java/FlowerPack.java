import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(int amount, FlowerType type) {
        this.amount = amount;
        this.flower = new Flower(type);
    }

    public double getPrice(){
        return this.flower.getPrice() * this.amount;
    }
}
