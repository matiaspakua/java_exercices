package main.java.JavaDataStructures;
public class ArraysMethods {

    public void arrayToUpperCase(String[] input) {
      for(int i = 0; i < input.length; i++) {
        input[i] = input[i].toUpperCase();
      }
    }
  
    public void incrementArray(int[] input) {
      for (int i = 0; i < input.length; i++){
        input[i] = input[i]-1;
      }
    }
  
  }