import java.util.*;

public class Level1 {
   public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
       int[] reorderedSalaries = new int[N];
       int[] copyIds = new int[N];
       for (int i = 0; i < N; i++) {
           copyIds[i] = ids[i];
       }
       Arrays.sort(salary);
       Arrays.sort(copyIds);
           for (int i = 0; i < N; i++) {
               for (int j = 0; j < N; j++) {
                   if (copyIds[i] == ids[j]) {
                       reorderedSalaries[j] = salary[i];
                       break;
                   }
               }
           }
       return reorderedSalaries;
    }
}


