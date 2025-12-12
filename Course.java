/* This is the Course class */
public class Course {

    // Attributes
    private String name;
    private String subjectNumber;
    private String meetingTime; 
    /*
     * constructor
     * param name
     * param subjectNumber
     * param meetingTime
     */
    public Course(String name, String subjectNumber, String meetingTime) {
        this.name = name;
        this.subjectNumber = subjectNumber;
        this.meetingTime = meetingTime; 
    }
    /*
     * accessors
     * return name
     */
    public String getName() {
        return this.name;
    }
    /*
     * accessors
     * return subjectNumber
     */
    public String getSubjectNumber() {
        return this.subjectNumber;
    }
    /*
     * accessors
     * return meetingTime
     */
    public String getMeetingTime() {
        return this.meetingTime;
    }
    /*
     * toString override
     */
    public String toString() {
        return this.subjectNumber + ": " + this.name + " " + this.meetingTime; 
    }

    public static void main(String[] args) {
        Course csc120 = new Course("OOP", "CSC120", "TR 10:50");
        System.out.println(csc120);
    }
    
}
