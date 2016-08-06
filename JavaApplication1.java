/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        int i=0,count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char[] username=a.toCharArray();
        int n=a.length();
        
        if(n>=8&&n<30)
        {
        for(i=0;i<a.length()-1;i++)
        {
            if(username[0]>=65&&username[0]<=90||username[0]>=97&&username[0]<=122)
            {
                if(username[i+1]<=0&&username[i+1]>=9||username[i+1]=='_'||username[0]>=65&&username[0]<=90||username[0]>=97&&username[0]<=122)
                {
                    continue;
                   // count++;
                    //System.out.println("count="+count);
                }
              
            }
            else
            {
                System.out.println("Invalid");
                break;
            }
            
        }
          System.out.println("valid");
        
        if(i==a.length())
        {
              System.out.println("valid");
        }
       
        }
    }
}
