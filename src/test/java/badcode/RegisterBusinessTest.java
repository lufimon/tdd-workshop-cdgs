package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterBusinessTest {
    @Test
    @DisplayName("Exception with First name is required")
    public void case01() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () -> {
            business.register(null, new Speaker());
        });
        assertEquals("First name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception with Last name is required")
    public void case02() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("test");
            business.register(null, speaker);
        });
        assertEquals("Last name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception with email is required")
    public void case03() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("test");
            speaker.setLastName("test");
            business.register(null, speaker);
        });
        assertEquals("Email is required.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception with email DomainEmailInvalidException()")
    public void case04() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(DomainEmailInvalidException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("test");
            speaker.setLastName("test");
            speaker.setEmail("test");
            business.register(null, speaker);
        });
        assertNull(exception.getMessage());
    }

    @Test
    @DisplayName("Exception with Can't save a speaker.")
    public void case05() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(SaveSpeakerException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("test");
            speaker.setLastName("test");
            speaker.setEmail("test@gmail.com");
            business.register(null, speaker);
        });
        assertEquals("Can't save a speaker.", exception.getMessage());
    }

    @Test
    @DisplayName("Exception with Speaker doesn't meet our standard rules.")
    public void case06() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(SpeakerDoesntMeetRequirementsException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("test");
            speaker.setLastName("test");
            speaker.setEmail("test@test.com");
            business.register(null, speaker);
        });
        assertEquals("Speaker doesn't meet our standard rules.", exception.getMessage());
    }

    @Test
    @DisplayName("save success")
    public void case07() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("test");
        speaker.setLastName("test");
        speaker.setEmail("test@gmail.com");
        int id = business.register(speaker1 -> 1000, speaker);
        assertEquals(1000, id);
    }

    @Test
    @DisplayName("exp 1 year")
    public void case08() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("test");
        speaker.setLastName("test");
        speaker.setEmail("test@gmail.com");
        speaker.setExp(1);
        int id = business.register(speaker1 -> 1000, speaker);
        assertEquals(1000, id);
    }

    @Test
    @DisplayName("exp 3 year")
    public void case09() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("test");
        speaker.setLastName("test");
        speaker.setEmail("test@gmail.com");
        speaker.setExp(3);
        int id = business.register(speaker1 -> 1000, speaker);
        assertEquals(1000, id);
    }

    @Test
    @DisplayName("exp 5 year")
    public void case10() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("test");
        speaker.setLastName("test");
        speaker.setEmail("test@gmail.com");
        speaker.setExp(5);
        int id = business.register(speaker1 -> 1000, speaker);
        assertEquals(1000, id);
    }

    @Test
    @DisplayName("exp 9 year")
    public void case11() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("test");
        speaker.setLastName("test");
        speaker.setEmail("test@gmail.com");
        speaker.setExp(9);
        int id = business.register(speaker1 -> 1000, speaker);
        assertEquals(1000, id);
    }
}
