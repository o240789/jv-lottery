package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors[] colors = Colors.values();
        Random random = new Random();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}