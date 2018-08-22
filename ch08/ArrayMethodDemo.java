public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int limit = 7;
        displayAll(nums);
        displayReverse(nums);
        displaySum(nums);
        displayLessThan(nums, limit);
        displayHigherThanAvg(nums);
    }

    public static void displayAll(int[] n)
    {
        System.out.println("The array of 10 integers are: ");
        for (int x = 0; x < n.length; ++x)
        {
            System.out.print(n[x] + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] n)
    {
        System.out.println("The integers in reverse order: ");
        for (int x = n.length - 1; x >= 0; --x)
        {
            System.out.print(n[x] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int[] n)
    {
        int sum = 0;
        for (int x = 0; x < n.length; ++x)
        {
            sum += n[x];
        }
        System.out.println("The sum of the integers: " + sum);
    }

    public static void displayLessThan(int[] n, int limit)
    {
        System.out.println("The limit is: " + limit);
        System.out.println("The integers less than the limit are:");
        for (int x = 0; x < n.length; ++x)
        {
            if (n[x] < limit)
                System.out.print(n[x] + " ");
        }
        System.out.println();
    }

    public static void displayHigherThanAvg(int[] n)
    {
        int x;
        int sum = 0;
        double avg;
        for (x = 0; x < n.length; ++x)
        {
            sum += n[x];
        }
        avg = sum * 1.0 / n.length;
        System.out.println("The average is: " + avg);
        System.out.println("The integers that are higher than the average:");
        for (x = 0; x < n.length; ++x)
        {
            if (n[x] > avg)
                System.out.print(n[x] + " ");
        }
    }
}
