package Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series+=ch;
        }

        System.out.println("Total string will be : "+series);// it will print from a to z
        // there is memory problem for this in every iteration it is creating the new object and pointing to the new object
        // there is will be waste of memory until the final result -> it will be like O(n^2) space complexity

        // we will reduce the size by using the StringBuilder

        StringBuilder builder=new StringBuilder();// StringBuilder is also like the string class
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
          builder.append(ch);
        }
        System.out.println(builder.toString());// here also it will give the same result as the above, but it will not create the new object in each iteration it will just modify the previous one
        System.out.println(builder.reverse());

        // in this also there will be more methods to use in this StringBuilder class



    }
}
