import java.util.*;
public class ChatModeration {
    
    public static String chat_moderation_system(String str)
    {
        int count =1;
        for (int i =1;i<str.length();i++)
        {
             
            if(str.charAt(i)==str.charAt(i-1))
            {
                count+=1;
            
            if (count>2)
            {
                return "Spam";
            }
        }
        else {
            count =1;
        }

           
        }
        return "Safe";
    }
public static void main (String[]args)
{   System.out.print("ENter your string :");
    Scanner sc = new Scanner (System.in);
    String str= sc.next();
    System.out.print(chat_moderation_system(str));
}

}

