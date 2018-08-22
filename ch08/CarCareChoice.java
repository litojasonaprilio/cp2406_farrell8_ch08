import javax.swing.*;
public class CarCareChoice
{
    public static void main(String[] args)
    {
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int x, y, z = 0;
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
            if (input.equals(services[y]))
            {
                found = true;
                z = y;
            }
        }
        if (found)
        {
            JOptionPane.showMessageDialog(null, services[z] + " is $" + prices[z]);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid item.");
        }
    }
}
