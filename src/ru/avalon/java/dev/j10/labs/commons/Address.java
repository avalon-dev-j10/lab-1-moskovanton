/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавьте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявлен в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должны быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address   {
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private int hullNumber;
    private int apartmentNumber;
    private int index;
    
    /*  TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
    */

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getHullNumber() {
        return hullNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getIndex() {
        return index;
    }

    public Address(String country, String city, String street, String houseNumber, int hullNumber, int apartmentNumber, int index) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.hullNumber = hullNumber;
        this.apartmentNumber = apartmentNumber;
        this.index = index;
    }

    public Address(String country, String city, String street, String houseNumber, int apartmentNumber, int index) {
        this(country, city, street, houseNumber, 0, apartmentNumber, index);
    }
    
    public Address(String country, String city, String street, String houseNumber, int index) {
        this(country, city, street, houseNumber, 0, 0, index);
    }
    
}
