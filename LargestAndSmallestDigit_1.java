class LargestAndSmallestDigit
{
    public static void largest_smallest_digit(int n)
    {
        int max_digit=Integer.MIN_VALUE;
        int min_digit=Integer.MAX_VALUE;
        while (n>0)
        {
           int digit= n%10;
           max_digit=Math.max(max_digit,digit);
           min_digit=Math.min(min_digit, digit);
           n =n/10;

        }
        System.out.println(min_digit +" "+max_digit);
    }
    public static void main(String[] args) {
        largest_smallest_digit(23456);
    }
}