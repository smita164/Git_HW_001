public class HW_002 {

    public static void main(String[] args) {

            int arr[] = {5, 2, 8, 7, 1};
            int temp = 0;

            //Calculate length of array arr
            int length = sizeof(arr) / sizeof(arr[0]);


            //Sort the array in ascending order
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
}