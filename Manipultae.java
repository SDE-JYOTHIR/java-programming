import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Concatenation
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        String str3 = str1.concat(str2);
        System.out.println("Concatenation of " + str1 + " and " + str2 + " = " + str3);

        // Length of the string
        System.out.print("Enter a string to find its length: ");
        String str4 = scanner.nextLine();
        int length = str4.length();
        System.out.println("Length of '" + str4 + "' = " + length);

        // To uppercase
        System.out.print("Enter a string to convert to uppercase: ");
        String str5 = scanner.nextLine();
        String uppercase = str5.toUpperCase();
        System.out.println("'" + str5 + "' in uppercase = " + uppercase);

        // Replace a character by other
        System.out.print("Enter a string to replace a character: ");
        String str6 = scanner.nextLine();
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Enter the character to replace it with: ");
        char newChar = scanner.next().charAt(0);
        scanner.nextLine();
        String replaced = str6.replace(oldChar, newChar);
        System.out.println("'" + str6 + "' with '" + oldChar + "' replaced by '" + newChar + "' = " + replaced);

        // Convert a string to a character array
        System.out.print("Enter a string to convert to a character array: ");
        String str7 = scanner.nextLine();
        char[] charArray = str7.toCharArray();
        System.out.print("Character array of '" + str7 + "' = ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Index position of substring
        System.out.print("Enter a string to find a substring in: ");
        String str8 = scanner.nextLine();
        System.out.print("Enter a substring to find its index position in '" + str8 + "': ");
        String substring = scanner.nextLine();
        int index = str8.indexOf(substring);
        if (index != -1) {
            System.out.println("Index position of '" + substring + "' in '" + str8 + "' = " + index);
        } else {
            System.out.println("'" + substring + "' not found in '" + str8 + "'");
        }

        // StringBuffer concatenation and insertion of substring
        System.out.print("Enter the first string for StringBuffer concatenation: ");
        String sbStr1 = scanner.nextLine();
        System.out.print("Enter the second string for StringBuffer concatenation: ");
        String sbStr2 = scanner.nextLine();
        StringBuffer sb1 = new StringBuffer(sbStr1);
        StringBuffer sb2 = new StringBuffer(sbStr2);
        sb1.append(sb2);
        System.out.println("Concatenation of " + sb1 + " and " + sb2 + " = " + sb1);

        System.out.print("Enter a position to insert a substring into '" + sb1 + "': ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a substring to insert into '" + sb1 + "': ");
        String substring2 = scanner
