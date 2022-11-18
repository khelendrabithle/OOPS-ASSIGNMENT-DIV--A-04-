public class Assignment {
    String StudentName;
    double AssignmentMark;
    double StudentMark;
    String Grade;

    Assignment(String StudentName , double AssignmentMark , double StudentMark){
        this.StudentName=StudentName;
        this.AssignmentMark=AssignmentMark;
        this.StudentMark=StudentMark;
        this.Grade=Grade;
    }
    Assignment(){
        AssignmentMark=100;
    }
    double Accessor(){
        return  CalculateGrade();
    } 
    private double getStudentMarK() {
        return StudentMark;
    }

    double Mutator(){
        Assignment a = new Assignment();
        a.getStudentMarK();
        if(StudentMark < AssignmentMark || StudentMark>0){
            return StudentMark;
        }else {
            System.out.println("Enter the Valid Marks");
        }
        return -1;
    }


    double CalculateGrade(){
        double Grade= (StudentMark/AssignmentMark)*100;
        if(Grade<50){
            System.out.printf("fail");
        } else if (Grade>=50 && Grade<=64) {
            System.out.printf("Pass");
        } else if (Grade>=65 && Grade<=74) {
            System.out.printf("credit");
        } else if (Grade>=75 && Grade<=84) {
            System.out.printf("distinction");
        }else {
            System.out.printf("high distinction");
        }
        return Grade;
    }

    public static void main(String[] args) {
        Assignment a = new Assignment("Khelendra",30,30);
        a.Mutator();
        a.CalculateGrade();
    }

}