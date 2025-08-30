package OOP.ExceptionHandling;

public class Main {
    // Exceptions are non-recoverable
    // exceptions has two types (checked, non-checked)

    // if we are getting an exception at compile time it is a checked exception (ex: file does not exist)
    // unchecked exception is not able to detect at compile time it will found when the programming is running(ex: like arithmetic expression )

    static int divide(int a,int b) throws ArithmeticException{
        // throws keyword is used to if you are using the divide method  may be thrown an exception
     if(b==0){
         throw new ArithmeticException(" Do not divide by zero");// it will throw an exception when it is b==0
     }
     return a/b;
 }
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
//           divide(a,b);
           String name="jagadeesh";
           if(name.equals("jagadeesh")){
               throw new MyException("Name is jagadeeswar not jagadeesh");
           }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }// we create our own myException class
        catch(ArithmeticException e){
            System.out.println(e.getMessage());// it means if exception is an Arithmetic exception this line will print otherwise the exception  catch will print
        }
        catch(Exception e){// here we can write ArithmeticException  instead of Exception also because it is a reference variable which one(method) is to run will depend on the object not the reference variable
            System.out.println(" Normal Exception ");
        }
        finally{
            System.out.println("This will run either there is exception or not ");
        }
    }
}
