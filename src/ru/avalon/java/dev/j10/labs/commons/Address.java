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
    private String country;         //Страна проживания
    private String city;            //Город
    private String street;          //Улица
    private String houseNumber;     //Номер дома
    private int hullNumber;         //Номер корпуса
    private int apartmentNumber;    //Номер квартиры
    private int index;              //Индекс
    
    /*  TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
    */
    //Метод, возвращающий страну проживания
    public String getCountry() {
        return country;
    }
    //Метод, возвращающий город
    public String getCity() {
        return city;
    }
    //Метод, возвращающий улицу
    public String getStreet() {
        return street;
    }
    //Метод, возвращающий номер дома
    public String getHouseNumber() {
        return houseNumber;
    }
    //Метод, возвращающий номер корпуса
    public int getHullNumber() {
        return hullNumber;
    }
    //Метод, возвращающий номер квартиры
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    //Метод, возвращающий индекс
    public int getIndex() {
        return index;
    }
    //Полный конструктор
    public Address(String country, String city, String street, String houseNumber, int hullNumber, int apartmentNumber, int index) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.hullNumber = hullNumber;
        this.apartmentNumber = apartmentNumber;
        this.index = index;
    }
    //Конструктор без номера корпуса
    public Address(String country, String city, String street, String houseNumber, int apartmentNumber, int index) {
        this(country, city, street, houseNumber, 0, apartmentNumber, index);
    }
    //Конструктор без номеров корпуса и квартиры 
    public Address(String country, String city, String street, String houseNumber, int index) {
        this(country, city, street, houseNumber, 0, 0, index);
    }
    
}
