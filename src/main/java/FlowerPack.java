import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice(){
        return this.flower.getPrice() * this.amount;
    }
}
