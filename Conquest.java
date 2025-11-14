import java.util.*;
import java.util.LinkedList;

public class Conquest {

    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int[][] square = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();

        // Высадка десанта и захват первых точек
        for (int i = 0; i < L * 2; i += 2) {
            int x = battalion[i] - 1;
            int y = battalion[i + 1] - 1;
            square[x][y] = 1;
            queue.add(new int[]{x, y});
        }

        // Определяем ограничение по направлению (вверх, вниз, влево, вправо)
        int[][] directions = { {0, 1}, {1, 0}, {-1, 0}, {0, -1} };

        int maxDay = 1;

        // Выполняем захват карты, пока очередь не будет пустой
        while (!queue.isEmpty()) {
            // Берем текущую координату из очереди
            int[] cell = queue.poll();
            int currRow = cell[0]; // текущая колонка
            int currCol = cell[1]; // текущий столбец
            // День захвата на текущей ячейке карты
            int days = square[currRow][currCol];

            // Проходим по направлениям (вверх, вниз, влево, вправо)
            // И захватывает соседние координаты на карте (при условии, что они в пределах границы)
            for (int[] direction : directions) {
                int neighborRow = currRow + direction[0];
                int neighborCol = currCol + direction[1];
                // Проверяем что в пределах границ и мы еще не посещали эту точку
                if (neighborRow >= 0 && neighborRow < N && neighborCol >= 0 && neighborCol < M
                        && square[neighborRow][neighborCol] == 0) {
                    // Устанавливаем новый день захвата на карте для соседа
                    square[neighborRow][neighborCol] = days + 1;
                    maxDay = Math.max(maxDay, days + 1); // обновляем максимальный день захвата
                    queue.add(new int[]{neighborRow, neighborCol}); // добавляем соседа в очередь, для последующего захвата от него
                }
            }
        }

        return maxDay;
    }
}


