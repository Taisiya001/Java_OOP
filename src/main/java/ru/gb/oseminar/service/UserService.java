package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private final List<User> Users;

    public UserService() {
        this.Users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User item: this.Users){
            if(item instanceof Students){
                if(id < ((Students) item).getStudentID()){
                    id = ((Students) item).getStudentID();
                }
            }
        }
        this.Users.add(new Students(firstName, lastName,patronymic, ++id));

    }
    public Teacher createUser(String firstName, String lastName, String patronymic, Long ID){
        return new Teacher(firstName,lastName,patronymic,ID);
    }

    @Override
    public List<User> getAll() {
        return this.Users;
    }

    @Override
    public void deleteUser(Long id) {
        for(User item: this.Users){
            if (item instanceof Students){
                if(id.equals(((Students) item).getStudentID())){
                    this.Users.remove(item);
                }
            }
        }
    }
    public List<Students> getAllStudents(){
        List <Students> listStudents = new ArrayList<>();
        for (User user:this.getAll()
        ) {
            if(user instanceof Students){
                listStudents.add((Students) user);
            }
        }
        return listStudents;
    }
}
