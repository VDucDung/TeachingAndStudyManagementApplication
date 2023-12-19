package Actors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

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
        ArrayList<Student> infoCl1 = new ArrayList<>();
        ArrayList<Student> infoCl2 = new ArrayList<>();
        ArrayList<Student> infoCl3 = new ArrayList<>();
        ArrayList<Student> infoCl4 = new ArrayList<>();
        ArrayList<Student> infoCl5 = new ArrayList<>();

        //Them sinh vien
        //sv lop 1
        for (int i = 1; i <= 20; i++) {
            String studentID = "SV002" + String.format("%02d", i);
            String name = generateRandomName();
            String gender = "Nữ";
            String major = generateRandomMajor();
            String address = generateRandomAddress();
            String phoneNumber = generateRandomPhoneNumber();

            infoCl1.add(new Student(studentID, name, gender, major, address, phoneNumber));
        }
//        infoCl1.add(new Student("SV001", "Vũ Đức Dũng", "Nam", "Công nghệ thông tin", "Bắc Ninh", "0957842310"));
//        infoCl1.add(new Student("SV002", "Nguyễn Thị Hương", "Nữ", "Quản trị kinh doanh", "Hà Nội", "0987654321"));
//        infoCl1.add(new Student("SV003", "Trần Văn An", "Nam", "Kỹ thuật điện tử", "Hải Phòng", "0909123456"));
//        infoCl1.add(new Student("SV004", "Phạm Thị Mai", "Nữ", "Ngôn ngữ Anh", "Hồ Chí Minh", "0978123456"));
//        infoCl1.add(new Student("SV005", "Lê Văn Hoàng", "Nam", "Khoa học máy tính", "Đà Nẵng", "0918234567"));
//        infoCl1.add(new Student("SV006", "Nguyễn Thị Thủy", "Nữ", "Quản lý du lịch", "Nha Trang", "0928345678"));
//        infoCl1.add(new Student("SV007", "Bùi Văn Nam", "Nam", "Kế toán", "Hải Dương", "0938456789"));
//        infoCl1.add(new Student("SV008", "Hoàng Thị Lan", "Nữ", "Y học cổ truyền", "Hà Nam", "0948567890"));
//        infoCl1.add(new Student("SV009", "Trần Văn Minh", "Nam", "Môi trường", "Quảng Ninh", "0968678901"));
//        infoCl1.add(new Student("SV010", "Nguyễn Thị Huệ", "Nữ", "Luật", "Nam Định", "0978789012"));
//        infoCl1.add(new Student("SV011", "Lê Văn Hùng", "Nam", "Văn hóa học", "Vĩnh Phúc", "0988890123"));
//        infoCl1.add(new Student("SV012", "Nguyễn Thị Mai", "Nữ", "Quản trị nhân sự", "Hà Nội", "0812340987"));
//        infoCl1.add(new Student("SV013", "Phạm Thị Trang", "Nữ", "Công nghệ thông tin", "Hải Dương", "0987123456"));
//        infoCl1.add(new Student("SV014", "Nguyễn Thị Hà", "Nữ", "Quản trị kinh doanh", "Hà Tĩnh", "0978234567"));
//        infoCl1.add(new Student("SV015", "Lê Thị Hương", "Nữ", "Kỹ thuật điện tử", "Ninh Bình", "0968345678"));
//        infoCl1.add(new Student("SV016", "Trần Thị Linh", "Nữ", "Ngôn ngữ Anh", "Lào Cai", "0958456789"));
//        infoCl1.add(new Student("SV017", "Nguyễn Thị Diệu", "Nữ", "Khoa học máy tính", "Bình Thuận", "0948567890"));
//        infoCl1.add(new Student("SV018", "Phạm Thị Hồng", "Nữ", "Quản lý du lịch", "Hậu Giang", "0938678901"));
//        infoCl1.add(new Student("SV019", "Lê Thị Hoa", "Nữ", "Kế toán", "Sơn La", "0928789012"));
//        infoCl1.add(new Student("SV020", "Nguyễn Thị Mai", "Nữ", "Y học cổ truyền", "Bắc Giang", "0918890123"));

        //sv lop 2
        for (int i = 21; i <= 40; i++) {
            String studentID = "SV002" + String.format("%02d", i);
            String name = generateRandomName();
            String gender = "Nữ";
            String major = generateRandomMajor();
            String address = generateRandomAddress();
            String phoneNumber = generateRandomPhoneNumber();

            infoCl2.add(new Student(studentID, name, gender, major, address, phoneNumber));
        }
        //sv lop 3
        for (int i = 41; i <= 60; i++) {
            String studentID = "SV004" + String.format("%02d", i);
            String name = generateRandomName();
            String gender = generateRandomGender();
            String major = generateRandomMajor();
            String address = generateRandomAddress();
            String phoneNumber = generateRandomPhoneNumber();

            infoCl3.add(new Student(studentID, name, gender, major, address, phoneNumber));
        }
        //sv lop 4
        for (int i = 61; i <= 80; i++) {
            String studentID = "SV006" + String.format("%02d", i);
            String name = generateRandomName();
            String gender = "Nữ";
            String major = generateRandomMajor();
            String address = generateRandomAddress();
            String phoneNumber = generateRandomPhoneNumber();

            infoCl4.add(new Student(studentID, name, gender, major, address, phoneNumber));
        }
        //sv lop 5
        for (int i = 81; i <= 100; i++) {
            String studentID = "SV008" + String.format("%02d", i);
            String name = generateRandomName();
            String gender = "Nữ";
            String major = generateRandomMajor();
            String address = generateRandomAddress();
            String phoneNumber = generateRandomPhoneNumber();

            infoCl5.add(new Student(studentID, name, gender, major, address, phoneNumber));
        }
        //them lop
        clList.add(new Classrooms("CL001", "CL.1", "803A1", "1-2-3-4 Thứ 3", infoCl1));
        clList.add(new Classrooms("CL002", "CL.2", "803A1", "7-8-9-10 Thứ 3", infoCl2));
        clList.add(new Classrooms("CL003", "CL.3", "803A1", "1-2-3-4 Thứ 4", infoCl3));
        clList.add(new Classrooms("CL004", "CL.4", "803A1", "1-2-3-4 Thứ 5", infoCl4));
        clList.add(new Classrooms("CL005", "CL.5", "803A1", "7-8-9-10 Thứ 5", infoCl5));

        return clList;
    }

    //Tạo dữ liệu ngẫu nhiên
    private static String generateRandomName() {
        String[] firstNames = {"Trần", "Lê", "Phạm", "Hoàng", "Nguyễn", "Võ", "Ngô", "Đặng", "Bùi", "Huỳnh", "Vũ"};
        String[] lastNames = {"Thị", "Văn", "Duy", "Hồng", "Linh", "Quốc", "Minh", "Hải", "Phương", "Thu", "Dũng", "Giang", "Hằng", "Nga"};

        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        return firstName + " " + lastName;
    }

    private static String generateRandomGender() {
        String[] genders = {"Nam", "Nữ"};

        Random random = new Random();
        return genders[random.nextInt(genders.length)];
    }

    private static String generateRandomMajor() {
        String[] majors = {"Kỹ thuật phần mềm", "Khoa học máy tính", "Công nghệ thông tin", "Hệ thống thông tin"};

        Random random = new Random();
        return majors[random.nextInt(majors.length)];
    }

    private static String generateRandomAddress() {
        String[] cities = {"Hải Phòng", "Hồ Chí Minh", "Đà Nẵng", "Nha Trang", "Hải Dương", "Hà Nam", "Quảng Ninh", "Nam Định", "Vĩnh Phúc", "Bắc Giang", "Bắc Ninh"};

        Random random = new Random();
        return cities[random.nextInt(cities.length)];
    }

    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        return "09" + (10000000 + random.nextInt(90000000));
    }
}
