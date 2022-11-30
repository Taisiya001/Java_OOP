package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//на выходе должно быть отображение отсортированного списка студентов с указанием группы, в которой он учится
//// пример:
////      Студент 1 - Группа 4
////      Студент 2 - Группа 1
////      Студент 3 - Группа 5
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L),
                new ArrayList<>(
                        Arrays.asList(
                                new Students("Petr", "Zaverin", "Anton"),
                                new Students("Ilon", "Mask", "Joe"),
                                new Students("Joe", "Doe", "Djek")

                        )
                ));

        controller.createTimetable(controller.createTeacher("Bill", "Gaits", "Noname", 222L)
                , new ArrayList<>(
                        Arrays.asList(
                                new Students("Alexey", "Petrov", "Anton"),
                                new Students("Alexey", "Alexeev", "Joe"),
                                new Students("Jony", "Dilindjer", "Djek")

                        )
                ));

        controller.showStudentsInGroups();


    }
}
