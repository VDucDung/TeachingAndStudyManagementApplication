package Actors;

import java.io.Serializable;
import java.util.ArrayList;

public class Manager {

    //methods
    public static ArrayList<Student> getStudentList() {

        ArrayList<Student> stList = new ArrayList<>();

        stList.add(new Student("2021604079", new Account("Student", "qe568"), "Nguyễn Việt Anh", "Nam", "KTPM3", "Công nghệ thông tin", 16));
        stList.add(new Student("2021604080", new Account("Student", "12345678"), "Vũ Đức Dũng", "Nam", "KTPM3", "Công nghệ thông tin", 16));

        return stList;
    }

    public static ArrayList<Teacher> getTeacherList() {

        ArrayList<Teacher> tcList = new ArrayList<>();

        tcList.add(new Teacher("GV001", new Account("Teacher", "12345678"), "Vũ Thị Dương", "0123456789", "duongvthaui@gamil.com"));
        tcList.add(new Teacher("GV002", new Account("Teacher", "87654321"), "Nguyễn Thị Nhung", "0123456789", "nhungnthaui@gamil.com"));

        return tcList;
    }

    public static ArrayList<Group> getGroupList() {

        ArrayList<Group> grList = new ArrayList<>();

        return grList;
    }

    public static ArrayList<Classrooms> getClassroomsesList() {

        ArrayList<Classrooms> clList = new ArrayList<>();

        clList.add(new Classrooms("CL001", "CL.1", "803A1", "15/12/2003 1-2-3-4"));
        clList.add(new Classrooms("CL002", "CL.2", "803A1", "16/12/2003 1-2-3-4"));
        clList.add(new Classrooms("CL003", "CL.3", "803A1", "17/12/2003 1-2-3-4"));
        clList.add(new Classrooms("CL004", "CL.4", "803A1", "18/12/2003 1-2-3-4"));
        clList.add(new Classrooms("CL005", "CL.5", "803A1", "19/12/2003 1-2-3-4"));

        return clList;
    }
}
