package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

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
}
