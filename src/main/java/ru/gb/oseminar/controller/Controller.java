package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;
//Создать метод в Контроллере, в котором агрегируются
//функции получения списка студентов (их id) и преподавателя (его id)
//и формирования учебной группы, путем вызова метода из сервиса
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void creteUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName,lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
}
