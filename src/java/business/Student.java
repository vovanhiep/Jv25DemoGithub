package business;

public class Student {

    int studentId;
    String studentName;
    String batch;

    //contructor
    public Student(int studentId, String studentName, String batch) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.batch = batch;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

}
