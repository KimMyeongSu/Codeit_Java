import java.util.ArrayList;

public class CreditCalculator {

    public static void main(String[] args) {

        GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));
        gradeCalc.print();

    }
}


class Course {
    static final int CREDIT_MAJOR =3;
    static final int CREDIT_GENERAL =2;
    String courseName;
    int courseCredit;
    String grade;

    public Course (String name, int courseCredit,String grade){
        this.courseName = name;
        this.courseCredit = courseCredit;
        this.grade = grade;
    }

}
class GradeCalculator {

    ArrayList <Course> coursesList = new ArrayList<>(); //과목객체를 저장할 ArrayList
    String name;
    double averageGrade;
    int totalCredit;

    public GradeCalculator (String name, double averageGrade,int totalCredit) {
        this.name = name;
        this.averageGrade=averageGrade;
        this.totalCredit=totalCredit;
    }

   public void  addCourse(Course course) {
            coursesList.add(course);

    }

     public void print(){

         System.out.println("직전 학기 성적: "+averageGrade+" (총 "+totalCredit+"학점)");
         System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n",thisSemsterGrade(),newTotalCredit());
         System.out.printf("전체 예상 학점: %.10f (총 %d학점)",totalExpectationGrade(),totalCredit+newTotalCredit());
    }
     private int newTotalCredit(){
         //총 크레딧을 반환 시켜주는 메소드
     int result =0;
         for (int i =0; i < coursesList.size(); i++) {
            result += coursesList.get(i).courseCredit;
         }
         return result;
     }
    private double newAverageGrade () {
       //총 점수를 구해서 반환해주는 메소드
         double result=0;
        for (int i =0; i < coursesList.size(); i++) {
            result += coursesList.get(i).courseCredit *  converter(coursesList.get(i).grade);
        }

         return result;
    }
    private double converter (String grade) {
         //등급값을 숫자로 변환시켜서 반환해 주는 메소드
         double result =0;
         char temp = grade.charAt(0);
        switch (temp){
            case 'A' :
                result = 4;
                break;
            case 'B' :
                result = 3;
                break;
            case 'C' :
                result = 2;
                break;
            case 'D' :
                result = 1;
                break;
            case 'F' :
                result = 0;
                break;
        }

        if (grade.length() ==2) {return (result + 0.5);}
         return result;
    }

    private double thisSemsterGrade() { // 이번학기 성적 반환 메소드
         double result =newAverageGrade()/newTotalCredit();
        return result;
         }


    private double totalExpectationGrade() { //전체 예상학점 반환 메소드
         double result = ((thisSemsterGrade()*newTotalCredit()+(averageGrade*totalCredit)) / (newTotalCredit()+totalCredit));
         return result;
    }

}