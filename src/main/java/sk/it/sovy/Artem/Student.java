package sk.it.sovy.Artem;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private String favoriteLanguage;

    private String[] operatingSystems; // an array of multiple options

    private LinkedHashMap<String, String> countryOptions;  // first string - key, second string - value

    public Student() {

        // populate country options: user ISO country code
        countryOptions = new LinkedHashMap<>();  // collection of name valued pairs
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "USA");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }  // ob submit - Spring will call setCountry

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {  // when form is loaded - Spring will call student.getcountryOptions()
        this.countryOptions = countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}