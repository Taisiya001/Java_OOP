package ru.gb.oseminar.data;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

//Создать класс УчебнаяГруппа
// содержащая в себе поля
// Преподаватель и список Студентов
public class StudentGroup {
    private Teacher teacher;
    private List<Students> studentsList;
    private  static final AtomicLong studyGroupID = new AtomicLong(0);
    private final Long idStudentGroup;

    public StudentGroup(Teacher teacher, List<Students> studentsList){
        this.teacher = teacher;
        this.studentsList = studentsList;
        this.idStudentGroup = studyGroupID.incrementAndGet();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public Long getIdStudentGroup() {
        return idStudentGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}
