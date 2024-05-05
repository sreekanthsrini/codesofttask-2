import java.util.Scanner;

public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER YOUR 5 SUBJECTS MARKS");
        System.out.print("TAMIL:");
        int tamil=obj.nextInt();
        System.out.print("ENGLISH:");
        int english=obj.nextInt();
        System.out.print("MATHS:");
        int maths=obj.nextInt();
        System.out.print("SCIENCE:");
        int science=obj.nextInt();
        System.out.print("SOCIAL:");
        int sst=obj.nextInt();
        int totalmarks=tamil+english+maths+science+sst;
        System.out.println("TOTAL MARKS"+totalmarks);
        float average=totalmarks/5;
        System.out.println("AVERAGE"+average);

        if (average>=90) 
        {
            System.out.println("GRADE : A");
            
        }
        else if (average>=80) {
            System.out.println("GRADE:B");
            
        }
        else{
            System.out.println("GRADE:c");
        }
        
        
        
        
        
    }
    
}
