package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * 
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 *     - именем;
 *     - паспортными данными;
 *     - пропиской по месту жительства.
 *
 */
public class Person {
    
    public Passport passport;   //Паспортные данные человека
    public Address address;     //Прописка человека
    
    /*  TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
    */
    
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

    /**
     * Возвращает полное имя человека.
     * 
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращает Имя, Фамилию и Отчество, разделённые пробелом.
     * 
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * 
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return s - имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        
        String s = passport.getName() + " ";
        if (!passport.getPatronymic().equals("")){
            s += passport.getPatronymic() + " ";
        }
        else if (!passport.getSecondName().equals("")){
            s += passport.getSecondName().charAt(0) + ". "; 
        }
        s += passport.getSurname() + ".";
        return s;
    }
    
    /*  TODO (Проверка №1)
        Невыполняется условие, когда у человека есть только имя и фамилия!
        Исправить!
    */

    /**
     * Возвращает адрес, по которому проживает человек.
     * 
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return s - адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */ 
        String s = address.getCountry() + ", " + address.getCity() + ", " + address.getStreet() + ", д." + address.getHouseNumber() + ", ";
        if (!(address.getHullNumber() == 0)){
            s += "к." + address.getHullNumber() + ", ";
        }
        if (!(address.getApartmentNumber() == 0)){
            s += "кв." + address.getApartmentNumber() + ", ";
        }
        s += "индекс " + address.getIndex() + ".";
        return s;
    }
    //Конструктор
    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

}
