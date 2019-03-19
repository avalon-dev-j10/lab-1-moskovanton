package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    public static void main(String args[]) {
        
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person(new Passport("4004 847513", "Иван", "Иванов", "Иванович", LocalDate.of(1992, 03, 10), LocalDate.of(2011, 03, 10), "65 ОМ Кировского р-на г.С-Пб"), 
                                new Address("Россия", "Санкт-Петербург", "Вокзальная", "126", 3, 341, 165767));
        Person smith = new Person(new Passport("4007 346723", "John", "Smith", LocalDate.of(1999, 01, 03), "Edward", LocalDate.of(2010, 03, 12), "16 ОМ р-на Чертаново г.Москва"), 
                                new Address("Россия", "Москва", "Новоселов", "12", 455, 233345));

        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        
        String s1 = ivanov.getFullName();
        String s2 = smith.getFullName();
        String s3 = ivanov.getAddress();
        String s4 = smith.getAddress();
        
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s4);
        
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
