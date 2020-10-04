package October_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Oct_3 {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Twitter.
    //
    //Implement an autocomplete system. That is, given a query string s
    // and a set of all possible query strings, return all strings in the
    // set that have s as a prefix.
    //
    //For example, given the query string de and the set of strings [dog,
    // deer, deal], return [deer, deal].
    //
    //Hint: Try preprocessing the dictionary into a more efficient data
    // structure to speed up queries.

    public static void main(String[] args){
        HashMap<String, ArrayList<String>> words = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String[] wordArr = {"dog", "deer", "deal"};

        for (String s : wordArr) {
            for (int j = 0; j < s.length(); j++) {
                String currKey = s.substring(0, j + 1);
                if (!words.containsKey(currKey)) {
                    words.put(currKey, new ArrayList<>());
                }
                if (!words.get(currKey).contains(s)) {
                    words.get(currKey).add(s);
                }
            }
        }

        String input = scan.nextLine();
        while(!input.equals("")){
            if (words.get(input) != null){
                System.out.println(Arrays.toString(words.get(input).toArray()));
            }
            else{
                System.out.println("No Results");
            }

            input = scan.nextLine();
        }
    }

}
