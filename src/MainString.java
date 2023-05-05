public class MainString {
    static String sentence = "This is a global variable sentence.";
    public static void main(String[] args) {
        // Show: 'Sentence: This is a global variable sentence.'
        System.out.println("sentence: '" + sentence + "'");
        // Show: String length: xx (xx is number)
        System.out.println("String length: " + sentence.length());
        // Show: Words in a sentence xx
        System.out.println("Words in a sentence: " + sentence.split(" ").length);
        // Show: T h i s   i s   a   g l o b a l   v a r i a b l e   s e n t e n c e .
        for(char c : sentence.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println(); // reavahetus

        // Substring from sentence
        // This is
        System.out.println(sentence.substring(0, 7)); // first 7 character
        // a global variable sentence.
        System.out.println(sentence.substring(8)); // from 8 to end
        // global
        System.out.println(sentence.substring(10, 16)); // inside string
        // TASK: The length of the fourth word. Regardless of the word in the sentence
        // Pikem variant
        String[] words = sentence.split(" "); // split from spaces
        int wordLength = words[3].length();
        System.out.println("Fourth word lenght: " + wordLength);
        // Lühem variant
        System.out.println("Fourth word lenght: " + sentence.split(" ")[3].length());

    }
}
