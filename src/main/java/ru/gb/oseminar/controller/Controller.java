package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;
//Создать метод в Контроллере, в котором агрегируются
//функции получения списка студентов (их id) и преподавателя (его id)
//и формирования учебной группы, путем вызова метода из сервиса
//в Контроллере реализовать метод принимающий List<StudentGroup> и сортирующий с помощью компаратора,
////    и вызывающий метод view для отображения
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void creteUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName,lastName, patronymic);
    }
    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
        return userService.createUser(firstName, lastName, patronymic, teacherId);
    }
    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
    public List<Students> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public List<StudentGroup> createTimetable(Teacher teacher, List<Students> studentList) {
        return studentGroupService.completeStudyGroup(teacher, studentList);
    }


    public void showStudyGroups(List<StudentGroup> StudentGroups){
        studentView.showStudyGroups(StudentGroups);
    }
    public void showSortStudyGroup(List<Students> studentsList){
        Collections.sort(studentsList, new StudentGroupComparator());
        studentView.showStudents(studentsList);
    }
}
