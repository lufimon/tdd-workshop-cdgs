import java.util.Random;

public class IdGenerateService {
    private final Random random;

    public IdGenerateService(Random random) {
        this.random = random;
    }

    public String getData() {
        // Dependency
        int id = random.nextInt(10);
        // Result
        return "CODE" + id;
    }
}
