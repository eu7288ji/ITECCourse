import java.util.ArrayList;

public class ITECCourseManager{

    static ArrayList<ITECCourse> ITECData = new ArrayList<>();

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, 3040);

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        //maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, 3075);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        //datacomCourse.writeCourseInfo();

        //System.out.println("Course name is " + maintenanceCourse.getName());
        //System.out.println("Course code is " + maintenanceCourse.getCode());
        //System.out.println("Course room is " + maintenanceCourse.getRoom());

        //System.out.println("Max students in the course is " + maintenanceCourse.getMaxStudents());

        maintenanceCourse.setMaxStudents(24);
        //System.out.println("The maximum number students is " + maintenanceCourse.getMaxStudents());

        ITECCourse smallCourse = new ITECCourse("Made up name small class", 1234, 3, 3060);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");

        smallCourse.addStudent("Marigold");

        //smallCourse.writeCourseInfo();

        ITECCourse infotechCourse = new ITECCourse("Info Tech Concepts", 1100, 30, 3050);
        infotechCourse.addStudent("Max");
        infotechCourse.addStudent("Nancy");
        infotechCourse.addStudent("Orson");

        //infotechCourse.writeCourseInfo();


        ITECData.add(maintenanceCourse);
        ITECData.add(smallCourse);
        ITECData.add(infotechCourse);

        for(ITECCourse course : ITECData)
        {
            System.out.println(course);
        }
    }
}
