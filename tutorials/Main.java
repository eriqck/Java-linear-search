package tutorials;

public class Main {



     

    public static void main(String[] args) {

/**
         * @param args
         */
                int N = 2;
        if ( N == 1 ) {
    System.out.println("The number is 1.");
}
else if ( N == 2 || N == 4 || N == 8 ) {
    System.out.println("The number is 2, 4, or 8.");
    System.out.println("(That's a power of 2!)");
}
else if ( N == 3 || N == 6 || N == 9 ) {
    System.out.println("The number is 3, 6, or 9.");
    System.out.println("(That's a multiple of 3!)");
}
else if ( N == 5 ) {
    System.out.println("The number is 5.");
}
else {
    System.out.println("The number is 7 or is outside the range 1 to 9.");
}



        
        }
        
    }

