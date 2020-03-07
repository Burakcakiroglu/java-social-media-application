import java.util.ArrayList;

public class Message 
{
    private static int process;
    Test method=new Test();
    public static ArrayList<ArrayList<String>> inbox=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> outbox=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> followBox=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> notifications=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> contactList=new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> message=new ArrayList<ArrayList<String>>();
    
    public void showInbox()
    {
        System.out.println("\n=========================================================================================\n");    
        if(inbox.get(Test.getActiveUser()).isEmpty())
                {
                    System.out.println("=>Inbox is Empty");
                }
            else
                {
                        for(int n=0;n<inbox.get(Test.getActiveUser()).size();n++)
                    {
                        System.out.println("Inbox Messages:"+(n+1)+"-"+inbox.get(Test.getActiveUser()).get(n));
                    }
                }
    }
    public void showOutbox()
    {
        System.out.println("\n=========================================================================================\n");    
        if(outbox.get(Test.getActiveUser()).isEmpty())
                {
                    System.out.println("=>Outbox is Empty");
                }
            else
                {
                        for(int n=0;n<outbox.get(Test.getActiveUser()).size();n++)
                    {
                        System.out.println("Outbox Messages:"+(n+1)+"-"+inbox.get(Test.getActiveUser()).get(n));
                    }
                }
    }
    
    
    public  void addBox()
   {
       ArrayList<String> box=new ArrayList<>();
       ArrayList<Integer> box1=new ArrayList<>();
       inbox.add(box);
       outbox.add(box);
       followBox.add(box);
       notifications.add(box);
       contactList.add(box);
       message.add(box);
      
       
   }
    public void showNotifications()
    {
        System.out.println("\n=========================================================================================\n");    
        if(notifications.get(Test.getActiveUser()).isEmpty())
                {
                    System.out.println("=>Notification box is Empty");
                }
            else
                {
                        for(int n=0;n<notifications.get(Test.getActiveUser()).size();n++)
                    {
                        System.out.println("Notification:"+(n+1)+"-"+notifications.get(Test.getActiveUser()).get(n));
                    }
                }
    }
    public void showContactList()
    {
        System.out.println("\n=========================================================================================\n");    
        if(contactList.get(Test.getActiveUser()).isEmpty())
                {
                    System.out.println("=>Contact List box is Empty");
                }
            else
                {
                        for(int n=0;n<contactList.get(Test.getActiveUser()).size();n++)
                    {
                        System.out.println("Contact List:"+(n+1)+"-" + contactList.get(Test.getActiveUser()).get(n));
                    }
                }
    }
    public void setNotifications(int number,String number1)
    {
        notifications.get(number).add(number1);
    }
     public void setContactList(int number,String number1)
    {
        contactList.get(number).add(number1);
    }
      public void setFollowBox(int number,String number1)
    {
        followBox.get(number).add(number1);
    }
    
}

    
     

    
