public class TwelveInts
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int length = nums.length;
        System.out.println("From first to last: ");
        for (int x = 0; x < length; ++x)
        {
            System.out.print(nums[x]);
            if (x != length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println("From last to first: ");
        for (int y = length - 1; y >= 0; --y)
        {
            System.out.print(nums[y]);
            if (y != 0)
                System.out.print(", ");
        }
    }
}
