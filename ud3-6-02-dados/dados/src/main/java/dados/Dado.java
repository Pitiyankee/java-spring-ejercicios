package dados;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dado {

    private Random random;

    public Dado(Random random) {
        this.random = random;
    }

    public int tirar() {
        return random.nextInt(6) + 1;
    }
}