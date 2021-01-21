import java.util.ArrayList;

class Question2 {
    public static ArrayList<Integer> primenumsUnder(int n) {
        ArrayList<Integer> primenums = new ArrayList<Integer>(); //here i am making the arraylist primenums 
        for (int i = 2; i <= n; i++) { //adding all numbers from 2 to n
            primenums.add(i);
        }
        
        for (int i = 0; i <= primenums.size()-1; i++) { 
            int p = primenums.get(i); //primenums.get(0) when i = 0 is 2, so p = 2
            for ( int x = i+1; x <= primenums.size()-1; x++) { //x starts at 1 because i=0
                if (primenums.get(x) % p == 0) { //primenums.get(1) is 3 modulus p, which is 2, equals 1 which is not 0 
                    primenums.remove(x); //so no remove yet
                    x--; // -- to account for the removal 
                }
            }
        }
        return primenums;
    }
    
    public static void goldbachSum(int n) { //any even # is the sum of 2 primes, which two primes add up to even number
        ArrayList<Integer> primenums = primenumsUnder(n); //here i am calling the function i already made earlier
        for (int i = 0; i <= primenums.size()-1; i++) {
            int firstPrime = primenums.get(i);
            int secondPrime = n - firstPrime;
            if (primenums.contains(secondPrime)) {
                System.out.println(firstPrime+ "+" +secondPrime+ "=" +n);
            }
        }
    }
    
    public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) { // i = 4 because 2+2 =4 is the smallest, +=2 because i is the number and for loop adds 2 to go to next even i
            goldbachSum(i); //returns goldbach sum of number i
        }
    }
}

                
                
            
       
        
                
                
            
            
        
    
    
    
    
    
    

  