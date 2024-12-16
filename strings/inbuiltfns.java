package strings;

public class inbuiltfns {
    public static void main(String[] args) {
        // 1. String Initialization
        String str = " Hello, Java World! ";  // String with leading and trailing spaces

        // 2. Length of the string
        System.out.println("Length: " + str.length());  // Output: 20 (counting spaces as well)

        // 3. Check if the string is empty
        System.out.println("Is empty: " + str.isEmpty());  // Output: false (not empty)

        // 4. Comparing strings (case-sensitive)
        String str2 = "hello, java world!";
        System.out.println("Equals (case-sensitive): " + str.equals(str2));  // Output: false (case-sensitive comparison)

        // 5. Comparing strings (ignore case)
        // Trim both strings to ensure no spaces affect the comparison
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2.trim()));  // Output: true (ignoring case and trimming spaces)

        // 6. Character at a specific position
        System.out.println("Character at index 7: '" + str.charAt(7) + "'");  // Output: space (' '), as it's at index 7

        // 7. Comparing strings lexicographically
        System.out.println("Compare to: " + str.compareTo(str2));  // Output: negative number (str < str2 lexicographically)

        // 8. Checking if string contains a substring
        System.out.println("Contains 'Java': " + str.contains("Java"));  // Output: true (contains 'Java')

        // 9. Check if string starts with a certain prefix
        System.out.println("Starts with ' Hello': " + str.startsWith(" Hello"));  // Output: true (starts with ' Hello')

        // 10. Check if string ends with a certain suffix
        System.out.println("Ends with 'World! ': " + str.endsWith("World! "));  // Output: true (ends with 'World! ')

        // 11. Extract a substring (from index 1 to the end)
        System.out.println("Substring (from index 1): " + str.substring(1));  // Output: "Hello, Java World! "

        // 12. Extract a substring (from index 1 to 5)
        System.out.println("Substring (from index 1 to 5): " + str.substring(1, 6));  // Output: "Hello"

        // 13. Replace a character with another character
        System.out.println("Replace 'o' with 'O': " + str.replace('o', 'O'));  // Output: " HellO, Java WOrld! "

        // 14. Replace all occurrences of a substring using regex
        System.out.println("Replace 'Java' with 'Python': " + str.replaceAll("Java", "Python"));  // Output: " Hello, Python World! "

        // 15. Replace the first occurrence of a substring
        System.out.println("Replace first 'Java' with 'Python': " + str.replaceFirst("Java", "Python"));  // Output: " Hello, Python World! "

        // 16. Convert the string to lowercase
        System.out.println("To Lower Case: " + str.toLowerCase());  // Output: " hello, java world! "

        // 17. Convert the string to uppercase
        System.out.println("To Upper Case: " + str.toUpperCase());  // Output: " HELLO, JAVA WORLD! "

        // 18. Trim leading and trailing whitespaces
        System.out.println("Trimmed String: '" + str.trim() + "'");  // Output: "Hello, Java World!" (trimmed spaces)

        // 19. Find index of a character
        System.out.println("Index of 'J': " + str.indexOf('J'));  // Output: 8 (J is at index 8)

        // 20. Find index of a substring
        System.out.println("Index of 'Java': " + str.indexOf("Java"));  // Output: 8 (Java starts at index 8)

        // 21. Find the last index of a character
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));  // Output: 14 (last 'o' is at index 14)

        // 22. Find the last index of a substring
        System.out.println("Last index of 'Java': " + str.lastIndexOf("Java"));  // Output: 8 (last 'Java' starts at index 8)

        // 23. Check if the string matches a regular expression
        System.out.println("Matches regex '[a-zA-Z\\s]+': " + str.matches("[a-zA-Z\\s]+"));  // Output: false (contains punctuation)

        // 24. Split the string based on a delimiter
        String[] words = str.split(" ");
        System.out.println("Split by space:");
        for (String word : words) {
            System.out.println(word);  // Output: "Hello,", "Java", "World!"
        }

        // 25. Join multiple strings
        String joined = String.join("-", "2024", "11", "21");
        System.out.println("Joined string: " + joined);  // Output: "2024-11-21"

        // 26. Convert an object to string
        int number = 123;
        System.out.println("String representation of number: " + String.valueOf(number));  // Output: "123"

        // 27. Format a string with placeholders
        System.out.println("Formatted String: " + String.format("Hello, %s!", "Alice"));  // Output: "Hello, Alice!"

        // 28. StringBuilder examples
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder Append: " + sb.toString());  // Output: "Hello World!"

        sb.insert(5, ",");
        System.out.println("StringBuilder Insert: " + sb.toString());  // Output: "Hello, World!"

        sb.delete(5, 6);
        System.out.println("StringBuilder Delete: " + sb.toString());  // Output: "HelloWorld!"

        sb.reverse();
        System.out.println("StringBuilder Reverse: " + sb.toString());  // Output: "!dlroWolleH"
    }
}