package school;

public class Score {
    int studentId;   //ÇÐ¹ø
    Subject subject; //°ú¸ñ
    int point;      //Á¡¼ö

    public Score( int studentId, Subject subject, int point){
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String toString(){
        return "ÇÐ¹ø:" + studentId + "," + subject.getSubjectName() + ":" + point;
    }
}