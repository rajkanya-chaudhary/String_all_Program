/*public class String_conut_word {
    public static int count_word(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
         int count = 0;
         for(int i= 0;i<str.length();i++)
         {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
         }
         return count + 1;
    }
    public static void main(String[] args) {
        String str =  " dimpal chaudhary i like coding";
        int wordCount = count_word(str);
        System.out.println("The number of words in the string is: " + wordCount);


    }
    
}
*/
public class String_conut_word {
    public static int count_word(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "dimpal chaudhary i like coding";
        int wordCount = count_word(str);
        System.out.println("The number of words in the string is: " + wordCount);
    }
}

