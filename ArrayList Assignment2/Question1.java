import java.util.ArrayList;

class Question1 {
    public static ArrayList<Integer> primenumsUnder( int n ) {
        ArrayList<Integer> primenums = new ArrayList<Integer>();
        //adding all the numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            primenums.add(i);
        }

        for (int i = 0; i <= primenums.size()-1; i++) {
            int p = primenums.get(i);
            for (int x = i+1; x <= primenums.size()-1; x++) {
                if (primenums.get(x) % p == 0) {
                    primenums.remove(x);
                    x--;
                }
            }
        }
        return primenums;
    }
    
    
    public static void main (String[] args) {
        System.out.println(primenumsUnder(100));
    }
}

