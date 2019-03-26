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
    
    private String seriesAndNumber;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthday;
    private String secondName;
    private LocalDate dateOfIssue;
    private String issuingAuthority;
    
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

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public String getSecondName() {
        return secondName;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

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
    
    public Passport(String seriesAndNumber, String name, String surname, LocalDate birthday, String secondName, LocalDate dateOfIssue, String issuingAuthority) {
        this(seriesAndNumber, name, surname, "", birthday, secondName, dateOfIssue, issuingAuthority);
    }
    
    public Passport(String seriesAndNumber, String name, String surname, String patronymic, LocalDate birthday, LocalDate dateOfIssue, String issuingAuthority) {
        this(seriesAndNumber, name, surname, patronymic, birthday, "", dateOfIssue, issuingAuthority);
    }
     
}
