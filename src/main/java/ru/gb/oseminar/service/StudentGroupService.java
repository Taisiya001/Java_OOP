package ru.gb.oseminar.service;

import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

//Создать класс УчебнаяГруппаСервис, в котором реализована функция
//(входные параметры - (Teacher, List<Strudent>)) формирования из
//Студентов и Преподавателя УчебнойГруппы и возвращения его
public class StudentGroupService  {
    public List<StudentGroup> createStudyGroup(Teacher teacher, List<Students> studentsList){
        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(new StudentGroup(teacher, studentsList));
        return studentGroupList;
    }

}

