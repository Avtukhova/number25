package ru.netology;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        String dateOfMeeting = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return dateOfMeeting;
    }



}







