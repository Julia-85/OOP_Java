package Seminar4.controller;

import Seminar4.model.Teacher;
import Seminar4.service.TeacherService;
import Seminar4.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    public UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }


    public int getMaxFullName() {
        return teacherService.getMaxFullName();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }

    public void buttonClickID() {
        teacherService.buttonClickID();
    }

}


