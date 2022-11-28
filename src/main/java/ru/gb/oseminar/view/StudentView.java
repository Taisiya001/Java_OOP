package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;
//в View создать метод для отображения списка студентов
public class StudentView {
    public void sendOnConsole(List<User> User){
        Logger logger = Logger.getAnonymousLogger();
        for(User user: User){
            logger.info(user.toString());
        }
    }
    public void showStudyGroups(List<StudentGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudentGroup group : studyGroups) {
            log.info(group.toString());
        }
    }
    public void showStudents(List<Students> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Students group : studyGroups) {
            log.info(group.toString());
        }
    }
}
