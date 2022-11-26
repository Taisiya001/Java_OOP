package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudentGroup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.creteUser("Petr", "Ivanov", "Anton");
        controller.creteUser("Ion", "Mask", "Joe");
        controller.creteUser("Joe", "Doe", "Djek");
        controller.showAllStudents();
        List<StudentGroup> StudentGroups  = controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L), controller.getOnlyStudents());
        controller.showStudyGroups(StudentGroups);
    }
}
