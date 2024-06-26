import java.util.*;

public class RestoreSalarySheet {

   public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
       int[] copyIds = Arrays.copyOf(ids, N);
       Arrays.sort(salary);
       Arrays.sort(copyIds);
       int[] reorderedSalaries = new int[N];
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


