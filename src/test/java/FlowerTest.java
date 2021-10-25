import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(5);
        flower.setSepalLength(3);
        flower.setColor(new int[]{1, 2, 3});
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(5, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType(){
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength(){
        assertEquals(3, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor(){
        int[] expectedColor = new int[]{1, 2, 3};
        int[] receivedColor = flower.getColor();
        assertTrue(Arrays.equals(expectedColor, receivedColor));
    }
}