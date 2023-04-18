public class ReverseString {

    public String reverseString(String text) {

        StringBuilder reverseText = new StringBuilder();
        int sizeText;

        sizeText = text.length();
        char vetor[] = text.toCharArray();

        for (int i = sizeText - 1; i >= 0; i--) {
            reverseText.append(vetor[i]);
        }

        return reverseText.toString();
    }
}
