package ru.mirea.task27;

public class City {
    String Country;
    String City;

    public City(String country, String city) {
        this.Country = country;
        this.City = city;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }
}
