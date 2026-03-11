import java.util.*;
public class BusPassengers_4 {
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int currentPassenger=0;
        int max=0;
        for (int i =0;i<n;i++)
        {
            int leave =sc.nextInt();
            int enter =sc.nextInt();
            currentPassenger-=leave;
            currentPassenger+=enter;
            if (currentPassenger>max)
            {
                max=currentPassenger;
            }
        }
        System.out.println("max passenger :"+max);

    }
}
