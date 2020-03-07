import java.util.Scanner;

public class Test 
{
    private static int outnumber=0;
    private static int variable=0;
    private static int variable1=0;
    private static int activeUser=0;
    
    public static void main(String[] args)
    {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        User method=new User();
        Message method1=new Message();
        Post method2=new Post();
        System.out.println("           =>Welcome to the application of social interaction.<=\n");
        System.out.println("Firstly,Please create a new Account");
        method.addNewUser();method1.addBox();method.birthDayMessage();method2.addBox1();
        
        while(outnumber!=-1)
        {
            method.screen();
            System.out.print("\nPlease enter a process number:");
            variable=inputInt.nextInt();
            switch(variable)
            {
                case 1:
                {
                    int handle;
                    method1.showInbox();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 2:
                {
                    int handle;
                    method1.showOutbox();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 3:
                {
                    int handle;
                    method.sendMessage();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 4:
                {
                    int handle;
                    method2.sharePost();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 5:
                {
                    int handle;
                    method2.showTimeLine();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 6:
                {
                    int handle;
                    method1.showContactList();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 7:
                {
                    int handle;
                    method1.showNotifications();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 8:
                {
                     int handle;
                    method.follow();
                    //method.sendNotifications();method.sendNotifications1();method.sendContactList();method.sendFollowBox();
                    System.out.print("\n1-Main menu\n2-Log out\nPlease enter a process number:");
                    handle=inputInt.nextInt();
                    if(handle==2)
                    {
                        outnumber=-1;
                    }
                    break;
                }
                case 9:
                {
                    System.out.print("1-Create New User\n2-Change User\nPlease choose a process:");
                    variable1=inputInt.nextInt();
                    if(variable1==1)
                    {
                        method.addNewUser();method1.addBox();method.birthDayMessage();method2.addBox1();
                        activeUser=((method.users.size())-1);
                    }
                    else
                    {
                        for(int n=0;n<method.users.size();n++)
                            {
                                System.out.println("Users:("+(n+1)+")-"+method.users.get(n).get(0));
                            }
                        System.out.print("Please choose a user:");
                        activeUser=(inputInt.nextInt()-1);
                    }
                    break;
                }
                case -1:
                {
                    outnumber=-1;
                    break;
                }
                
            }
        }
        System.out.println(method1.contactList);
        System.out.println("Please comeback as soon as possible.");
    }
    public static int getActiveUser()
    {
        return activeUser;
    }
    public static void setActiveUser(int x)
    {
         activeUser=x;
    }
    public static int getVariable()
    {
        return variable;
    }
    public static void setVariable(int x)
    {
         variable=x;
    }
}
