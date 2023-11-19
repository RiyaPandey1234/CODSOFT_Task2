import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects=sc.nextInt();
        if(numSubjects<=0){
            System.out.println("please enter the valid number of subjects: ");
            return;
        }

        int totalmarks=0;
        int maxMarksPerSubject = 100;

        for(int i=1;i<=numSubjects; i++){
            System.out.println("Enter the marks obtained in subjects: "+i+" (out of 100): ");
            int marks=sc.nextInt();
            if(marks < 0 || marks > maxMarksPerSubject ){
                System.out.println(" marks should be in the range of 0 to 100, please enter valis marks!!!!!");
                i--;
            }
            else{
                totalmarks +=marks;
            }
        }

        double averagePercentage=(double)totalmarks /(numSubjects * maxMarksPerSubject)*100;
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: "+ averagePercentage+"%");
        String grade;

        if(averagePercentage>=90){
            grade="A+";
        }

        else if(averagePercentage>=80){
            grade="A";
        }
        else if(averagePercentage>=70){
            grade="B";
        }
        else if(averagePercentage>=60){
            grade="C";
        }
        else if(averagePercentage>=50){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("Grade: "+ grade);
    }
}