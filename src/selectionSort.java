    public class selectionSort {
        static void selectionSort(int[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                /* Find the minimum in the list[i..list.length-1] */
                int currentMin = list[i];
                int currentMinIndex = i;

                for (int j = i + 1; j < list.length; j++) {
                    if (currentMin > list[j]) {
                        currentMin = list[j];
                        currentMinIndex = j;
                    }
                }

                /* Swap list[i] with list[currentMinIndex] if necessary */
                if (currentMinIndex != i) {
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;
                }
            }
        }

        public static void main(String[] args) {
            int[] list = {6,8,7,1,9,6,4,3,2};
            selectionSort(list);
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
        }
    }
