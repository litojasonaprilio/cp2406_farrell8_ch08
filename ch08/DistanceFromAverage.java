import javax.swing.*;
public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        String input;
        double[] nums = new double[20];
        final int QUIT = 99999;
        double num;
        int x = 0, y;
        double total = 0;
        double avg;
        double diff;

        input = JOptionPane.showInputDialog(null, "Enter any number of double values up to 20." +
                "\nEnter " + QUIT + " to quit.");
        num = Double.parseDouble(input);
        while (num != QUIT)
        {
            nums[x] = num;
            total += nums[x];
            ++x;
            input = JOptionPane.showInputDialog(null, "Enter next number of double values up to 20." +
                    "\nEnter " + QUIT + " to quit.");
            num = Double.parseDouble(input);
        }
        if (x == 0)
        {
            JOptionPane.showMessageDialog(null,"No input given.");
        }
        else
        {
            avg = total / x;
            StringBuffer message = new StringBuffer("Number of inputs: " + x +
                    "\nTotal: " + total +
                    "\nAverage : " + avg +
                    "\nLists:\n");
            for (y = 0; y < x; ++y)
            {
                diff = avg - nums[y];
                message.append(nums[y]).append(" has ").append(diff).append(" away from average.");
                message.append("\n");
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
