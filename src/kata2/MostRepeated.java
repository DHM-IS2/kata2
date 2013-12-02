package kata2;
import java.util.HashMap;

public class MostRepeated{
   public static int mostRepeated(int[] array){
      int[] noRepNumbers = new int[array.length];
      int j = 0;
      int aux = 0;
      HashMap<Integer,Integer> numbers = new HashMap<>();
      int frequency;
      for (int i = 0; i < array.length; i++) {
         if (!numbers.containsKey(array[i])){
            numbers.put(array[i], 1);
            noRepNumbers[j] = array[i];
            j++;
         }
         else{
            frequency = numbers.get(array[i]);
            numbers.put(array[i], frequency + 1);
         }         
      }
      frequency = 0;
      for (int i = 0; i < j; i++) {
         if (numbers.get(noRepNumbers[i]) > frequency){
            frequency = numbers.get(noRepNumbers[i]);
            aux = noRepNumbers[i];
         }
      }
      return aux;
   }    
}
