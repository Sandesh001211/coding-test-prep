public class Library_Fine
{
    public static void largest(int num[])
    {
        int allowed=5;
        int fine=0;
        for(int i =0;i<num.length;i++)
        {
               if (num[i]>allowed)
               {
                fine+=num[i]-allowed;
               }

        }
        System.out.println(fine);
      
        
        

    }
    public static void main (String []args)
    {
        int num[]={8,3,10,6};
        largest(num);
    }
}