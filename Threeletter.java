/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threeletter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

      public class Threeletter 
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("C:\\Users\\21CSE076\\Documents\\NetBeansProjects\\threeletter\\src\\threeletter\\dhfkjd.txt");   
      String[] words=null;                     
      int wc=0;
       try (FileReader fr = new FileReader(f1)) {
           BufferedReader br = new BufferedReader(fr);
           String s;
           while((s=br.readLine())!=null)
           {
               words=s.split(" ");
               if(words.length==3)
               {
                   wc++;
               }
           }}
      System.out.println("Number of words in the file:" +wc);   
   }
}
    
    

