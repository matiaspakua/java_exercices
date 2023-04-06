package main.java.exercises;
/*
This method takes an integer numRows as input and returns a list of lists representing 
the first numRows rows of Pascal's triangle. The method first checks if numRows is zero, 
and if so, it returns an empty list. Otherwise, it initializes the triangle with the 
first row, which contains only the number 1. Then, it iterates from the second row up 
to the numRows-th row, and for each row it constructs a list of integers by adding the 
corresponding elements from the previous row. Finally, it adds the new row to the 
triangle and returns the complete triangle after all rows have been constructed.
*/
public class PascalTriangle{
    public List<Integer> generatePascalTriangle(int numRows) {
        List<Integer> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int left = triangle.get(i-1).get(j-1);
                int right = triangle.get(i-1).get(j);
                row.add(left + right);
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}