package OOP.Singleton;

public class singelton {
    private singelton(){

    }
    private static singelton instance;
    public static singelton getInstance(){

        // check whether 1 obj is created or not
         if(instance==null){
             instance=new singelton();
         }
         return instance;
    }
}// singelton class is we can create only one object
