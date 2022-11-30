package ru.gb.oseminar.data;

import java.util.Comparator;

//Реализовать компаратор сравнивающий студентов по Фамилии и Имен
public class StudentGroupComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        if (s1.getLastName().equalsIgnoreCase(s2.getLastName())) {
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
        return s1.getLastName().compareTo(s2.getLastName());
    }

}



