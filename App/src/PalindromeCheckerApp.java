import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;
        while (left < right)
        {
            if (input.charAt(left) != input.charAt(right))
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome)
        {
            System.out.println("Palindrome");
        } else
        {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}