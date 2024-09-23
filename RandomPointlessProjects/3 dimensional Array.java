import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][][] numbers = new int[3][3][3];

        byte count = 0;
        
        for(byte i = 0; i < 3; i++) {
            for(byte I = 0; I < 3; I++) {
                for(byte o = 0; o < 3; o++) {
                    numbers[i][I][o] = count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
