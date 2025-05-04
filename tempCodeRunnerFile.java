public class bubblesort
{
   
        void bs(int a[]) {
            int n = a.length; // Declare n correctly
    
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] < a[j + 1]) { // Sorting in descending order
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
    
            // Print sorted array
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }
    
        public static void main(String args[]) {
            int arr[] = {4, 1, 3, 5};
    
            // Create an instance of Main
            bubblesort obj = new bubblesort();
            obj.bs(arr);
        }
    }
    
    

