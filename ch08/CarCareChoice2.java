import javax.swing.*;
public class CarCareChoice2
{
    public static void main(String[] args)
    {
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int x, y, p = 0;
        boolean found = false;
        StringBuilder menu = new StringBuilder("List of services: \n");
        for (x = 0; x < services.length; ++x)
        {
            menu.append(services[x]);
            menu.append("\n");
        }
        String input = JOptionPane.showInputDialog(null, menu);
        for (y = 0; y < services.length; ++y)
        {
            if (input.length() >= 3)
            {
                if (input.substring(0, 3).equals(services[y].substring(0, 3)))
                {
                    found = true;
                    p = y;
                }
            }
        }
        if (found)
        {
            JOptionPane.showMessageDialog(null, services[p] + " is $" + prices[p]);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid item.");
        }
    }
}
