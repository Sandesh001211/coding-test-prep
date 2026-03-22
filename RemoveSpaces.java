import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                System.out.print(arr[i]);
            }
        }
    }
}