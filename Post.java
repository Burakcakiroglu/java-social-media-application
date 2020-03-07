import java.util.ArrayList;
import java.util.*;
public class Post 
{
    public static String variableStr;
    public static ArrayList<ArrayList<String>> post=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<Integer>> like=new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<String>> timeLine=new ArrayList<ArrayList<String>>();
    private int likenumber;
    Scanner input = new Scanner(System.in);
    Message method=new Message();
    Administrator method1=new Administrator();
    
    
    public void sharePost()
   {
       System.out.println("=========================================================================================");
         for(int n=0;n<post.get(Test.getActiveUser()).size();n++)
        {
            System.out.println((n+1) + ".Share:" +post.get(Test.getActiveUser()).get(n)+"\n");
        }
         if(User.users.get(Test.getActiveUser()).isEmpty())
        {
            System.out.println("Share post past is Empty");
        }
         System.out.println("What dou you want to share?");
         variableStr=(input.nextLine() + "(Time Date:" + method1.getThisClock()+")");
         timeLine.get(Test.getActiveUser()).add(variableStr);
         post.get(Test.getActiveUser()).add(variableStr);
        System.out.println("=========================================================================================");
   }
      public void like()
        {
           likenumber++;
        }
      
      public void unlike()
      {
        if (likenumber > 0)
            {
                likenumber--;
            }
       }
      
      public void likeNumber()
      {
          
      }
      public void showTimeLine()
      {
          System.out.println("TimeLine:");
          for(int n=0;n<method.followBox.get(Test.getActiveUser()).size();n++)
        {
            {
                System.out.println("Post:"+timeLine.get(Test.getActiveUser()).get(n));
            }
            
        }
      }
          public  void addBox1()
          {
            ArrayList<String> box=new ArrayList<>();
            ArrayList<Integer> box1=new ArrayList<>();  
            post.add(box);
            like.add(box1);
            timeLine.add(box);
          }
          public void setTimeLine(int number,String number1)
                {
                  timeLine.get(number).add(number1);
                }

}
