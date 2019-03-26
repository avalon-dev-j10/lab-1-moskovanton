package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * 
 * Паспортные данные должны включать:
 *  - серию и номер документа;
 *  - имя;
 *  - фамилию;
 *  - отчество;
 *  - второе имя;
 *  - день рождения;
 *  - дату выдачи;
 *  - орган, выдавший документ.
 * 
 */
public class Passport {
    
    private String seriesAndNumber;     //Серия и номер паспорта
    private String name;                //Имя
    private String surname;             //Фамилия
    private String patronymic;          //Отчество
    private LocalDate birthday;         //Дата рождения
    private String secondName;          //Второе имя
    private LocalDate dateOfIssue;      //Дата выдачи паспорта
    private String issuingAuthority;    //Орган, выдавший документ
    
    /*  TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
    */
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечьте возможность использования класса за
     *    пределами пакета.
     */
    //Метод, возвращающий серию и номер паспорта
    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }
    //Метод, возвращающий имя
    public String getName() {
        return name;
    }
    //Метод, возвращающий фамилию
    public String getSurname() {
        return surname;
    }
    //Метод, возвращающий отчество
    public String getPatronymic() {
        return patronymic;
    }
    //Метод, возвращающий дату рождения
    public LocalDate getBirthday() {
        return birthday;
    }
    //Метод, возвращающий второе имя
    public String getSecondName() {
        return secondName;
    }
    //Метод, возвращающий дату выдачи паспорта
    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }
    //Метод, возвращающий органн, выдавший документ
    public String getIssuingAuthority() {
        return issuingAuthority;
    }
    //Полный конструктор
    public Passport(String seriesAndNumber, String name, String surname, String patronymic, LocalDate birthday, String secondName, LocalDate dateOfIssue, String issuingAuthority) {
        this.seriesAndNumber = seriesAndNumber;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.secondName = secondName;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;
    }
    //Конструктор без отчества
    public Passport(String seriesAndNumber, String name, String surname, LocalDate birthday, String secondName, LocalDate dateOfIssue, String issuingAuthority) {
        this(seriesAndNumber, name, surname, "", birthday, secondName, dateOfIssue, issuingAuthority);
    }
    //Конструктор без второго имени
    public Passport(String seriesAndNumber, String name, String surname, String patronymic, LocalDate birthday, LocalDate dateOfIssue, String issuingAuthority) {
        this(seriesAndNumber, name, surname, patronymic, birthday, "", dateOfIssue, issuingAuthority);
    }
    //Конструктор без отчества и второго имени
    public Passport(String seriesAndNumber, String name, String surname, LocalDate birthday, LocalDate dateOfIssue, String issuingAuthority) {
        this(seriesAndNumber, name, surname, "", birthday, "", dateOfIssue, issuingAuthority);
    }
     
}
