public class Main {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input = "your_input_string_here"; 
        System.out.println("Most frequently occurring character: " + mostFrequent);
    }

    private static char (String alphabet, String input) {
        int[] frequencyArray = new int[26];

        for (char c : input.toCharArray()) {
            int index = alphabet.indexOf(c);
            if (index != -1) {
                frequencyArray[index]++;
            }
        }

        int maxFrequencyIndex = 0;
        for (int i = 1; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > frequencyArray[maxFrequencyIndex]) {
                maxFrequencyIndex = i;
            }
        }

        return alphabet.charAt(maxFrequencyIndex);
    }
}