/*public class Vawel_constant {
    public static void main(String[] args) {
        String str = "dimpal";
        char c = str.charAt(0);
        if(c=='a'|| c=='e'||c=='o'||c=='i'||c=='u' ||c=='A'|| c=='E'||c=='O'||c=='I'||c=='U')
        {
          System.out.println("vawel" + str);
        }
        else
        {
            System.out.println( " constant "+ str);
        }
    }
}
*/
public class Vawel_constant {
    public static void main(String[] args) {
        String str = "apply";
        char c = str.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
            {
            System.out.println("vowel: " + str);
        } 
        else 
        {
            System.out.println("consonant: " + str);
        }
    }
}

