package kata2;
import java.util.ArrayList;

public class MostRepeated{
   
   public static int mostRepeated(int[] array){
      ArrayList<Integer> isRepeated = new ArrayList<>();
      int j = 0;
      int[][] ocurrences = new int[array.length][2];
      int mostRep;
      int frequency;
      for (int i = 0; i < array.length; i++){
         if (isRepeated.contains(array[i])){
            for (int k = 0; k < j; k++){
               if (array[i] == ocurrences[k][0]){
                  ocurrences[k][1]++;    
               }  
            }
            
         }
         else{
            isRepeated.add(array[i]);
            ocurrences[j][0] = array[i];
            ocurrences[j][1]++;
            j++;
         }
      }
      mostRep = ocurrences[0][0];
      frequency = ocurrences[0][1];
      for (int i = 0; i < j; i++){
         if (ocurrences[i][1] > frequency){
            frequency = ocurrences[i][1];
            mostRep = ocurrences[i][0];
         }   
      }
      return mostRep;    
   }
}


