import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;



public class OurFirstTest {
    private final Logger LOGGER = LogManager.getLogger(OurFirstTest.class);

    @Test
    public void commentTesting() {

        LOGGER.info("Privet");

    }

}
