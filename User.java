import java.util.ArrayList;
import java.util.Scanner;

public class User
{
   private static String name,email,location,birthDay;
   public static ArrayList<ArrayList<String>> users=new ArrayList<ArrayList<String>>();
   Administrator method=new Administrator(); 
   Message method1=new Message();
   Post method2=new Post();
   Scanner input = new Scanner(System.in);
   Scanner inputStr = new Scanner(System.in);
   private static int process;

   public void addNewUser()
   {
       ArrayList<String> user=new ArrayList<>();
       System.out.print("Please enter your name:");
        name=inputStr.nextLine();
        user.add(name);
        System.out.print("Please enter your email:");
        email=inputStr.nextLine();
        user.add(email);
        System.out.print("Please enter your location:");
        location=inputStr.nextLine();
        user.add(location);
        System.out.print("Please enter your birthDay:");
        birthDay=inputStr.nextLine();
        user.add(birthDay);users.add(user);

   }
   public void screen()
   {
       System.out.println("\n=========================================================================================\n");
       System.out.println("Profile Name:"+ users.get(Test.getActiveUser()).get(0));
       System.out.println("Profile Email:"+ users.get(Test.getActiveUser()).get(1));
       System.out.println("Profile Location:"+ users.get(Test.getActiveUser()).get(2));
       System.out.println("Profile Birthday:"+users.get(Test.getActiveUser()).get(3));
       System.out.println("\n=>Show Inbox(1)                                    Create or change user(9)  Sign out(-1) "
                + "\n=>Show Outbox(2)\n=>Send Message(3)\n=>Share Post(4)\n=>Show Timeline(5)\n=>Show Contact List(6)\n"
                + "=>Show Notifications(7)\n=>Follow People(8)");
   }
   
   public void follow()
    {
        System.out.println("\n=========================================================================================\n");
         if(users.size()!=1)
            {
        for(int n=0;n<users.size();n++)
               {
                   if(n!=Test.getActiveUser())
                   {
                       System.out.println("Users:"+(n+1)+"-"+users.get(n).get(0));
                   }
               }
       
                System.out.print("Please enter a number:");
                process=(input.nextInt()-1);
                System.out.print("started following...");
                method1.setNotifications(Test.getActiveUser(),users.get(process).get(0));
                method1.setNotifications(process, users.get(Test.getActiveUser()).get(0));
                method1.setContactList(Test.getActiveUser(), users.get(process).get(0));
                method1.setFollowBox(Test.getActiveUser(), users.get(process).get(0));
            }
         else if(users.size()==1)
         {
            System.out.println("=>Please create new User");
         }
        
    }
   public void sendNotifications()
   {
       method1.setNotifications(Test.getActiveUser(), "You started following "+users.get(process).get(0));
   }
   public void sendNotifications1()
   {
       method1.setNotifications(process, users.get(Test.getActiveUser()).get(0)+" started following you.");
   }
   public void sendContactList()
   {
       method1.setContactList(Test.getActiveUser(), users.get(process).get(0));
   }
   public void sendFollowBox()
   {
       method1.setFollowBox(Test.getActiveUser(), users.get(process).get(0));
   }

   public void sendMessage()
    {
           for(int n=0;n<method1.followBox.get(Test.getActiveUser()).size();n++)
               {
                   System.out.println("Users:"+(n+1)+"-"+method1.followBox.get(Test.getActiveUser()).get(n));
               }       
           if(method1.followBox.get(Test.getActiveUser()).size()!=0)
           {
               System.out.print("=>Please choosen User:");  
               process=input.nextInt();
           }
           
                if(true==(method1.followBox.get(process)).contains(users.get(Test.getActiveUser()).get(0)))
                {
                    System.out.println("Please enter your message:");
                    method1.message.get(process).add(inputStr.nextLine());
                }
                else if(false==(method1.followBox.get(process)).contains(users.get(Test.getActiveUser()).get(0)))
                {
                    System.out.println("=>The User is not following you.");
                }
    }
   
   public void birthDayMessage()
   {
       for(int n=0;n<users.size();n++)
               {
                   if(users.get(n).get(3).equals(method.getThisDayTime()))
                   {
                       method1.notifications.get(n).add("Happy Birthday. /Social media support team/");
                   }
               }
   }
}