package ru.gb.oseminar.service;

import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

//Создать класс УчебнаяГруппаСервис, в котором реализована функция
//(входные параметры - (Teacher, List<Strudent>)) формирования из
//Студентов и Преподавателя УчебнойГруппы и возвращения его
public class StudentGroupService  {
    private  final List<StudentGroup> studyGroupList;


    public StudentGroupService() {
        this.studyGroupList = new ArrayList<>();

    }

    public void completeStudyGroup(Teacher teacher, List<Students> studentsList) {
        this.studyGroupList.add(new StudentGroup(teacher, studentsList));
    };


    public List<StudentGroup> getStudyGroupList() {
        return studyGroupList;
    }
}


