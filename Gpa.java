import java.util.Scanner;
public class Gpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of subjects");
        int total_sub = sc.nextInt();
        float total=0;
        float total_credits=0;
        String grade;
        float result;
        float credits=0;
	float TOTAL=0;
        for(int i=1; i<=total_sub; i++)
        {
            System.out.println("Enter grade");
            grade = sc.next();
	    
            System.out.println("Enter credits of that subject");
            credits= sc.nextFloat();
            if(grade.equals("O") || grade.equals("A+") || grade.equals("A") || grade.equals("B+") ||grade.equals("B") ||  grade.equals("C"))
	    {
             if(grade.equals("O")){
                total=10*credits;
             }
             if(grade.equals("A+")){
                total=9*credits;
             }
             if(grade.equals("A")){
                total=8*credits;
             }
             if(grade.equals("B+")){
                total=7*credits;
             }
             if(grade.equals("B")){
                total=6*credits;
             }
             if(grade.equals("C")){
                total=5*credits;	
             }
	    }							
            else
            System.out.println("invalid entry");
            total_credits +=credits;
	    TOTAL+=total;
            
        }
        result=TOTAL/total_credits;
        System.out.println("Your GPA is:" + result);
        sc.close();
      
    }
}