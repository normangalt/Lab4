import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowerType;

    Flower(FlowerType FlowerType){
        this.flowerType = FlowerType;
    }

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }
}
