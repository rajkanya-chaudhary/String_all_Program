public class Largest_String {

    public static void main(String[] args) {
        String str = " Hi I am dimpal chaudhary";
              // Use StringBuilder to efficiently create a large string
                StringBuilder largeString = new StringBuilder();
        
                // Define the number of repetitions
                int repetitions = 1000000; // 1 million times
        
                // Append the small string multiple times to create a large string
                for (int i = 0; i < repetitions; i++) {
                    largeString.append(str);
                }
        
                // Convert StringBuilder to String
                String finalLargeString = largeString.toString();
        
                // Print the large string
                System.out.println(finalLargeString);
            }
        }
        

