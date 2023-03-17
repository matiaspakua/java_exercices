// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static final int MAX_CONTRAINT = 100000;
    public int solution(int[] A) {

        if(checkArrayLimitContraints(A) == false){
            throw new Exeption();
        }
        int n = A.length;
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                present[A[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        int smallesIntergerNotInList = n + 1;
        return smallesIntergerNotInList > MAX_CONTRAINT ? MAX_CONTRAINT : smallesIntergerNotInList;   
    }

    private boolean checkArrayLimitContraints(int[] arrayToCheck){
        boolean result = true;
        int minContraint = -1000000;
        int maxContraint = 1000000;

        for (int i = 0; i < arrayToCheck.length; i++){
            if(arrayToCheck[i] > maxContraint || arrayToCheck[i] < minContraint ){
                result = false;
                break;
            }
        }
        return result;
    }
}
