import java.util.ArrayList;

public class ITECCourse {

        private String name;
        private int code;
        private ArrayList<String> students;
        private int maxStudents;
        private int room;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getRoom() {return room;}

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setRoom(int room) {this.room = room;}

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    ITECCourse(String courseName, int courseCode, int courseMaxStudents, int roomNum){
            this.name = courseName;
            this.code = courseCode;
            this.students = new ArrayList<String>();
            this.maxStudents = courseMaxStudents;
            this.room = roomNum;
        }

        void addStudent(String studentName){
            if(students.size() == maxStudents) {
                System.out.println("Course is full - can't add " + studentName);
            }
            else{
                students.add(studentName);
            }
        }

        void removeStudent(String studentName){
            if (students.contains(studentName)) {
                students.remove(studentName);
                System.out.println(studentName + " was un-enrolled from " + this.name);
            } else{
                System.out.println(studentName + " was not found in " + this.name);

            }
        }

//    void writeCourseInfo(){
//        System.out.println("Course Name: " + name);
//        System.out.println("Course Code: " + code);
//        System.out.println("Students enrolled ");
//        System.out.println("Room number " + room);
//        for (String student : students){
//            System.out.println(student);
//        }
//        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
//        System.out.println("The max number of students for this course is " + maxStudents);
//
//    }
    int getNumberOfStudents(){
        return this.students.size();
    }

    int availability(){
        int avail = getMaxStudents() - getNumberOfStudents();
        return avail;
    }

    @Override
    public String toString() {
        return "\nITECCourse\n" +
                "\nName ='" + name + '\'' +
                "\nCode = " + code +
                "\nStudents = " + students +
                "\nMaxStudents = " + maxStudents +
                "\nRoom = " + room +
                "\nAvailable spots " + availability() + "\n\n";
    }
}
