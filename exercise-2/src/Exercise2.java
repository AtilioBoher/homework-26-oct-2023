import java.util.Arrays;

public class Exercise2 {

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    aux = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = aux;
                }
            }
        }
    }

    private static int[] parseValues(String[] args) {
        int n = args.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            try {
                nums[i] = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        if (args.length == 0 || args.length == 1) {
            System.out.println("Error: not enough numbers to order");
            return;
        }

        int[] nums = parseValues(args);

        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}