import java.util.Scanner;
class RomanToInteger
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int num = 0;
        int sum = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = getValue(roman.charAt(i));
            if (value < sum) {
                num -= value;
            } else {
                num += value;
            }

            sum = value;
        }
        System.out.println("The number is: " + num);
    }
    static int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
