import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random6 extends Random {
    @Override
    public int nextInt(int bound) {
        return 6;
    }
}

class IdGenerateServiceTest {
    @Test
    public void getData() {
        Random random = new Random6();
        IdGenerateService service = new IdGenerateService(random);
        String result = service.getData();
        assertEquals("CODE6", result);
    }

    @Test
    public void getData2() {
        SpyRandom spy = new SpyRandom();
        IdGenerateService service = new IdGenerateService(spy);
        service.getData();
        spy.verify(1);
    }
}

class SpyRandom extends Random {
    private int count;

    @Override
    public int nextInt(int bound) {
        count++;
        return 6;
    }

    public void verify(int expectedCount) {
        assertEquals(count, expectedCount);
    }
}
