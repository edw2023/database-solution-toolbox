package com.pw.db.solution.toolbox.util;

import java.util.Random;

public class TestDataGenerator {

    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "David", "Eve"};
    private static final String[] EMAIL_DOMAINS = {"example.com", "test.com", "sample.net"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Miami"};
    private static final String[] COUNTRIES = {"USA", "Canada", "UK", "Australia", "Germany"};
    private static final String[] OCCUPATIONS = {"Engineer", "Teacher", "Doctor", "Designer", "Manager"};
    private static final String[] INDUSTRIES = {"IT", "Education", "Healthcare", "Art", "Finance"};
    private static final String[] MARITAL_STATUSES = {"Single", "Married", "Divorced"};
    private static final String[] EDUCATION_LEVELS = {"High School", "Bachelor's Degree", "Master's Degree", "PhD"};
    private static final String[] INTERESTS = {"Reading", "Traveling", "Sports", "Cooking", "Music"};
    private static final String[] PRODUCT_CATEGORIES = {"Electronics", "Clothing", "Books", "Home Appliances", "Toys"};
    private static final String[] CARD_TYPES = {"Visa", "MasterCard", "American Express"};

    private static final Random random = new Random();

    public static String generateRandomItem(String[] items) {
        int index = random.nextInt(items.length);
        return items[index];
    }

    public static String generateRandomName() {
        return generateRandomItem(NAMES);
    }

    public static String generateRandomEmail() {
        int nameIndex = random.nextInt(NAMES.length);
        int domainIndex = random.nextInt(EMAIL_DOMAINS.length);
        return NAMES[nameIndex].toLowerCase() + "@" + EMAIL_DOMAINS[domainIndex];
    }

    public static int generateRandomAge() {
        return random.nextInt(50) + 20; // Generates ages between 20 and 69
    }

    public static String generateRandomCity() {
        return generateRandomItem(CITIES);
    }

    public static String generateRandomCountry() {
        return generateRandomItem(COUNTRIES);
    }

    public static String generateRandomMaritalStatus() {
        return generateRandomItem(MARITAL_STATUSES);
    }

    public static String generateRandomEducationLevel() {
        return generateRandomItem(EDUCATION_LEVELS);
    }

    public static String generateRandomOccupation() {
        return generateRandomItem(OCCUPATIONS);
    }

    public static String generateRandomIndustry() {
        return generateRandomItem(INDUSTRIES);
    }

    public static String generateRandomInterest() {
        return generateRandomItem(INTERESTS);
    }

    public static String generateRandomProductCategory() {
        return generateRandomItem(PRODUCT_CATEGORIES);
    }

    public static String generateRandomCardType() {
        return generateRandomItem(CARD_TYPES);
    }

    // ... Add more methods for other fields

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String name = generateRandomName();
            String email = generateRandomEmail();
            int age = generateRandomAge();
            String city = generateRandomCity();
            String country = generateRandomCountry();
            String maritalStatus = generateRandomMaritalStatus();
            String educationLevel = generateRandomEducationLevel();
            String occupation = generateRandomOccupation();
            String industry = generateRandomIndustry();
            String interest = generateRandomInterest();
            String productCategory = generateRandomProductCategory();
            String cardType = generateRandomCardType();

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
            System.out.println("Marital Status: " + maritalStatus);
            System.out.println("Education Level: " + educationLevel);
            System.out.println("Occupation: " + occupation);
            System.out.println("Industry: " + industry);
            System.out.println("Interest: " + interest);
            System.out.println("Product Category: " + productCategory);
            System.out.println("Card Type: " + cardType);
            System.out.println("------------------------");
        }
    }
}