import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.print("Enter the salary: ");
        Scanner input = new Scanner(System.in);
        int salary=input.nextInt();
// Conditions statements
        if(salary==10000){
            salary=salary+2000;
            System.out.println("Salary : " +salary);
        }
        else if(salary<10000){
            salary=salary+3000;
            System.out.println("Salary : " +salary);
        }
        else{
            salary=salary+4000;
            System.out.println("Salary : " +salary);
        }

//        Loops

        // print numbers from 1 to 10 using different loops

        // For loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        // while loop
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
            i++;
        }while(i<=10);


   }

}
