package Database;

import BaseClasses.Account;
import BaseClasses.SubjectClass;
import BaseClasses.Student;
import BaseClasses.Teacher;
import Database.DBEngine;
import java.util.ArrayList;
import java.util.Random;

public class DBConnector {

    //methods
    public static ArrayList<Student> getStudentList() {

        //Du lieu test
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(new Student("2021603748", new Account("Student", "va748"), "Nguyễn Việt Anh", "Nam", "CL.1", "Công nghệ thông tin", "16", "Hà Nội", "0947124720"));
        stList.add(new Student("2021603749", new Account("Student", "dd749"), "Vũ Đức Dũng", "Nam", "CL.2", "Công nghệ thông tin", "16", "Bắc Ninh", "0832124720"));
        stList.add(new Student("2021603750", new Account("Student", "xt750"), "Trần Xuân Thành", "Nam", "CL.3", "Công nghệ thông tin", "16", "Bắc Giang", "0987225620"));
        stList.add(new Student("2021603751", new Account("Student", "qt751"), "Phan Quang Trường", "Nam", "CL.4", "Công nghệ thông tin", "16", "Thái Nguyên", "0813124720"));
        stList.add(new Student("2021603752", new Account("Student", "vk752"), "Phạm Văn Kiên", "Nam", "CL.5", "Công nghệ thông tin", "16", "Thái Bình", "0957678790"));
        stList.add(new Student("2021603753", new Account("Student", "pd753"), "Phan Đình Đạt", "Nam", "CL.1", "Công nghệ thông tin", "16", "Hà Nội", "012345678"));

        for (int i = 1; i <= 60; i++) {
            stList.add(generateStudent("20216037" + String.format("%03d", i), "CL.1"));
            stList.add(generateStudent("20226037" + String.format("%03d", i), "CL.2"));
            stList.add(generateStudent("20236037" + String.format("%03d", i), "CL.3"));
            stList.add(generateStudent("20246037" + String.format("%03d", i), "CL.4"));
            stList.add(generateStudent("20256037" + String.format("%03d", i), "CL.5"));
        }

        return stList;
    }

    private static Student generateStudent(String id, String stClass) {
        Random random = new Random();
        String[] names = {"Anh", "Dũng", "Thanh", "Trường", "Kiên", "Nam", "Trọng", "Hải", "Thu", "Minh", "Thảo", "Bình"};
        String[] cities = {"Hà Nội", "Bắc Ninh", "Bắc Giang", "Thái Nguyên", "Thái Bình", "Nam Định"};

        String randomName = names[random.nextInt(names.length)];
        String randomGender = random.nextBoolean() ? "Nam" : "Nữ";
        String randomBatch = String.valueOf(16 + random.nextInt(3));
        String randomCity = cities[random.nextInt(cities.length)];
        String randomPhone = "09" + (random.nextInt(90000000) + 10000000);

        return new Student(id, new Account("Student", "pass" + id), "Nguyễn " + randomName, randomGender, stClass, "Công nghệ thông tin", randomBatch, randomCity, randomPhone);
    }

    public static ArrayList<Teacher> getTeacherList() {

        ArrayList<Teacher> tcList = new ArrayList<>();

        tcList.add(new Teacher("GV001", new Account("Teacher", "nhungnh888"), "Nguyễn Hồng Nhung", "0522914078", "nhungnhhaui@gmail.com"));
        tcList.add(new Teacher("GV002", new Account("Teacher", "anhtt999"), "Trần Anh Tuấn", "012345678", "anhtthaui@gmail.com"));

        return tcList;
    }

    public static ArrayList<SubjectClass> getClassList() {
        ArrayList<SubjectClass> clList = new ArrayList<>();
        SubjectClass cl1 = new SubjectClass("CL001", "CL.1", "803A1", "1-2-3-4 Thứ 3");
        SubjectClass cl2 = new SubjectClass("CL002", "CL.2", "803A1", "7-8-9-10 Thứ 3");
        SubjectClass cl3 = new SubjectClass("CL003", "CL.3", "803A1", "1-2-3-4 Thứ 4");
        SubjectClass cl4 = new SubjectClass("CL004", "CL.4", "803A1", "1-2-3-4 Thứ 5");
        SubjectClass cl5 = new SubjectClass("CL005", "CL.5", "803A1", "7-8-9-10 Thứ 5");

        //Tạo ngẫu nhiên
        for (var lst : getStudentList()) {
            if (lst.getStClass().equals("CL.1")) {
                cl1.getStudents().add(lst);
            } else if (lst.getStClass().equals("CL.2")) {
                cl2.getStudents().add(lst);
            } else if (lst.getStClass().equals("CL.3")) {
                cl3.getStudents().add(lst);
            } else if (lst.getStClass().equals("CL.4")) {
                cl4.getStudents().add(lst);
            } else if (lst.getStClass().equals("CL.5")) {
                cl5.getStudents().add(lst);
            }
        }
        clList.add(cl1);
        clList.add(cl2);
        clList.add(cl3);
        clList.add(cl4);
        clList.add(cl5);
        return clList;
    }

    public static void main(String args[]) {
        try {
            DBEngine.writeObjectToFile("C:\\Database\\STUDENT.txt", getStudentList());
            DBEngine.writeObjectToFile("C:\\Database\\TEACHER.txt", getTeacherList());
            DBEngine.writeObjectToFile("C:\\Database\\CLASSES.txt", getClassList());
            System.out.println("GHI FILE THANH CONG!");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
