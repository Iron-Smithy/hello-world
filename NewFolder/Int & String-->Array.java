import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String lett = "1357924680";
        String[] letters = new String[lett.length()];

        for (int i = 0; i < lett.length(); i++) {
            letters[i] = String.valueOf(lett.charAt(i));
        }

        System.out.println(Arrays.toString(letters));
        
        String numb = "1357924680";
        int[] numbers = new int[numb.length()];

        for (int i = 0; i < numb.length(); i++) {
            numbers[i] = Character.getNumericValue(numb.charAt(i));
        }

        System.out.println(Arrays.toString(numbers));
    }
}    
