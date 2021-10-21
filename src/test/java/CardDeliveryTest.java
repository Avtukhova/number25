

import lombok.Data;
import lombok.RequiredArgsConstructor;



public class CardDeliveryTest {

    @Data
    @RequiredArgsConstructor

    public class RegistrationInfo {
        private final String city;
        private final String name;
        private final String phone;
    }
}
