package Strings;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str="abcd";
        Permutations("",str);
        System.out.println(PermutationRet("",str));
        System.out.println("No of permutations can amke from the given String: "+countPermutations("",str));

    }
    public static void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       char ch=up.charAt(0);
      for(int i=0;i<=p.length();i++){
          String f=p.substring(0,i);
          String s=p.substring(i,p.length());
          Permutations(f+ch+s,up.substring(1));
      }
    }

    public static ArrayList<String> PermutationRet(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
         for(int i=0;i<=p.length();i++){
              String f=p.substring(0,i);
              String s=p.substring(i,p.length());
              ans.addAll(PermutationRet(f+ch+s,up.substring(1)));

         }
         return ans;

    }
    public static int countPermutations(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
          count=count+countPermutations(f+ch+s,up.substring(1));
        }

        return count;
    }
}
