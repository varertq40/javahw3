

/* Задан целочисленный список ArrayList.
Найти мнинмальное, максимальное и среднее из этого списка. */

public class task3 {
    public static void main(String args[]){
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int max = getMax(array);
        System.out.println("Max: "+max);

        int min = getMin(array);
        System.out.println("Min: "+min);

        double avg = getAverage(array);
        System.out.println("Avg: "+avg);
    }
     
      public static int getMax(int[] inputArray){ 
        int maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
             maxValue = inputArray[i]; 
          } 
        } 
        return maxValue; 
    }

      public static int getMin(int[] inputArray){ 
        int minValue = inputArray[0]; 
        for(int i=1;i<inputArray.length;i++){ 
          if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
          } 
        } 
        return minValue; 
    } 

    private static double getAverage(int[] array) {
      long sum = 0;
      for (int i: array) {
          sum += i;
      }
      return array.length > 0 ? (double) sum / array.length : 0;
  }
  }
    
    

