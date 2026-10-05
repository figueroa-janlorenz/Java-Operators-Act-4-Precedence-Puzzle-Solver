package precedencepuzzlesolver;

public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;
        
        //Predicted: True
        System.out.println((a + b*2) > 10 && a < b + 3);
        
        //Predicted:6
        int c = 5;
        System.out.println(++c + 2*3);
        
        //Predicted false
        int d = 4;
        System.out.println(d++ > 4 || d*2 == 10);
    }
    
}
