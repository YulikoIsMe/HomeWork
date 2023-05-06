package HW16;

public class task2 {
    public class VowelExtractor {
        public static String extractVowels(String input) {
            StringBuilder vowels = new StringBuilder();
            String lowerCaseInput = input.toLowerCase();

            for (int i = 0; i < lowerCaseInput.length(); i++) {
                char currentChar = lowerCaseInput.charAt(i);
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                        currentChar == 'o' || currentChar == 'u') {
                    vowels.append(currentChar);
                }
            }

            return vowels.toString();
        }

        public static void main(String[] args) {
            String exampleString = "Java drives me crazy!!!";
            String extractedVowels = extractVowels(exampleString);
            System.out.println(extractedVowels);
        }
    }
}
