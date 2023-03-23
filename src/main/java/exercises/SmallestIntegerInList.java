
/*
The function takes an array of integers A as input and returns the smallest positive integer 
that does not occur in the array.

The implementation uses a boolean array present to keep track of whether each integer from 1 
to n is present in the input array A. The first loop iterates over the elements of A and sets 
the corresponding value in the present array to true if the element is a positive integer less 
than or equal to n. The second loop iterates over the integers from 1 to n and returns the 
first integer that is not present in the present array. If all integers from 1 to n are present 
in the present array, the function returns n + 1.
*/
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
