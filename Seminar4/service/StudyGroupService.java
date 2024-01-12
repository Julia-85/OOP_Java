package Seminar4.service;

import Seminar4.model.StudyGroup;
import Seminar4.model.Teacher;
import Sem3.StudentGroup;

import java.util.List;

public class StudyGroupService extends StudyGroup {
    public StudyGroupService(Integer teacher, List<Integer> students) {
        super(teacher, students);
    }

    public void createStudyGroup(StudyGroup sg){
        System.out.println(sg);

    }
}
