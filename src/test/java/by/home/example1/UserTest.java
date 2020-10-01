package by.home.example1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.core.JsonProcessingException;

class UserTest {

    @Test
    void userSay() {
        User user = new User();
        assertEquals("stringa", user.userSay("string"));

    }

    @Test
    public void testSampleToJson() throws JsonProcessingException {

        User user = new User();

        SampleDataObject sampleDataObject = new SampleDataObject("test", 1);

        String json = user.toJson(sampleDataObject);

        assertEquals("{\"name\":\"test\",\"number\":1}", json);

    }
}