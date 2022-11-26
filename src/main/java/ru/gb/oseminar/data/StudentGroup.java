package ru.gb.oseminar.data;

import java.util.List;

//Создать класс УчебнаяГруппа
// содержащая в себе поля
// Преподаватель и список Студентов
public class StudentGroup {
    private Teacher teacher;
    private List<Students> studentsList;

    public StudentGroup(Teacher teacher, List<Students> studentsList){
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}
