public class ternaryOperators {
    public static void main(String[] args) {
        
        // ternart operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;
        
        int score = 70;
        
        // variable =       (condition) ? ifTrue : ifFalse;
        String passOrFail = (score>=60) ? "PASS" : "FAIL";
        System.out.println(passOrFail); // PASS
    }
}
