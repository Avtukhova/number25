package ru.netology;

import com.codeborne.selenide.Configuration;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;


public class CardDeliveryTest {

    @BeforeEach
    void setUp() {

        Configuration.browser = "chrome";
        open("http://localhost:9999");
    }


}
