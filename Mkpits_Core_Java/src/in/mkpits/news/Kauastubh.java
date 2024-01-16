package in.mkpits.news;

import java.util;

public class Kauastubh {

	public static void main(String[] args) 
	{
		import java.util.HashMap;

		class Result {

		    /*
		     * Complete the 'login' function below. The function accepts following parameters:
		     *
		     * 1. INTEGER noofDigitsForThePalindrome
		     *
		     * 2. STRING userId
		     *
		     * 3. STRING password
		     */

		    public static void login(int noofDigitsForThePalindrome, String userId, String password) {
		        // Define the array of valid users and passwords
		        HashMap<String, String> validUsers = new HashMap<>();
		        validUsers.put("user1", "pass1");
		        validUsers.put("user2", "pass2");
		        validUsers.put("user3", "pass3");
		        validUsers.put("user4", "pass4");
		        validUsers.put("user5", "pass5");

		        // Check if user_id and password are valid
		        if (validUsers.containsKey(userId) && validUsers.get(userId).equals(password)) {
		            // Generate the palindrome token
		            String tokenId = "token-" + generatePalindrome(noofDigitsForThePalindrome);
		            System.out.println("Welcome " + userId + " and the generated token is: " + tokenId + ".");
		        } else {
		            System.out.println("UserId or password is not valid, pls try again.");
		        }
		    }

		    private static int generatePalindrome(int noofDigits) {
		        int num = 1;
		        while (true) {
		            if (isPalindrome(num)) {
		                if (String.valueOf(num).length() == noofDigits) {
		                    return num;
		                }
		            }
		            num++;
		        }
		    }

		    private static boolean isPalindrome(int num) {
		        String numStr = String.valueOf(num);
		        return numStr.equals(new StringBuilder(numStr).reverse().toString());
		    }
		}

		public class Solution {
		    public static void main(String[] args) {
		        Result.login(3, "user1", "pass1");
		    }
		}

	}

}
