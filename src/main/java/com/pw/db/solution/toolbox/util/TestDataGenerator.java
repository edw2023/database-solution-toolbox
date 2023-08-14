package com.pw.db.solution.toolbox.util;

import com.pw.db.solution.toolbox.util.testData.TestData;

import java.util.Random;

public class TestDataGenerator {


    private static final Random random = new Random();

    public static String generateRandomItem(String[] items) {
        int index = random.nextInt(items.length);
        return items[index];
    }

    public static String generateRandomName() {
        return generateRandomItem(TestData.NAMES);
    }

    public static String generateRandomEmail() {
        int nameIndex = random.nextInt(TestData.NAMES.length);
        int domainIndex = random.nextInt(TestData.EMAIL_DOMAINS.length);
        return TestData.NAMES[nameIndex].toLowerCase() + "@" + TestData.EMAIL_DOMAINS[domainIndex];
    }

    public static int generateRandomAge() {
        return random.nextInt(50) + 20; // Generates ages between 20 and 69
    }

    public static String generateRandomCity(String country) {
        return generateRandomItem(TestData.COUNTRY_CITIES_MAP.get(country));
    }

    public static String generateRandomCountry() {
        return generateRandomItem(TestData.COUNTRIES);
    }

    public static String generateRandomMaritalStatus() {
        return generateRandomItem(TestData.MARITAL_STATUSES);
    }

    public static String generateRandomEducationLevel() {
        return generateRandomItem(TestData.EDUCATION_LEVELS);
    }

    public static String generateRandomOccupation() {
        return generateRandomItem(TestData.OCCUPATIONS);
    }


    public static String generateRandomInterest() {
        return generateRandomItem(TestData.INTERESTS);
    }

    public static String generateRandomCardType() {
        return generateRandomItem(TestData.CARD_TYPES);
    }

    // ... Add more methods for other fields

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String name = generateRandomName();
            String email = generateRandomEmail();
            int age = generateRandomAge();
            String country = generateRandomCountry();
            String city = generateRandomCity(country);
            String maritalStatus = generateRandomMaritalStatus();
            String educationLevel = generateRandomEducationLevel();
            String occupation = generateRandomOccupation();
            String interest = generateRandomInterest();
            String cardType = generateRandomCardType();

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            System.out.println("Country: " + country);
            System.out.println("City: " + city);
            System.out.println("Marital Status: " + maritalStatus);
            System.out.println("Education Level: " + educationLevel);
            System.out.println("Occupation: " + occupation);
            System.out.println("Interest: " + interest);
            System.out.println("Card Type: " + cardType);
            System.out.println("------------------------");
        }
    }
}