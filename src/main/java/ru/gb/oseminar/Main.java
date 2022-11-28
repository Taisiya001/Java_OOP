package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudentGroup;

import java.util.List;
//на выходе должно быть отображение отсортированного списка студентов с указанием группы, в которой он учится
//// пример:
////      Студент 1 - Группа 4
////      Студент 2 - Группа 1
////      Студент 3 - Группа 5
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.creteUser("Petr", "Ivanov", "Anton");
        controller.creteUser("Ion", "Mask", "Joe");
        controller.creteUser("Joe", "Doe", "Djek");
        controller.showAllStudents();
        List<StudentGroup> StudentGroups  = controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L), controller.getOnlyStudents());
        controller.showStudyGroups(StudentGroups);
        controller.showSortStudyGroup(controller.getOnlyStudents());
    }
}
