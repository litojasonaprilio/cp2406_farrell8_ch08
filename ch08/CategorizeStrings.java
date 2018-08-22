import javax.swing.*;
public class CategorizeStrings
{
    public static void main(String[] args)
    {
        final int MAXSTR = 10;
        final int MAXCHAR = 10;
        final String QUIT = "QUIT";
        String input;
        String input2;
        int numShort = 0;
        int numLong = 0;
        String[] shortStr = new String[MAXSTR];
        String[] longStr = new String[MAXSTR];

        input = JOptionPane.showInputDialog(null,
                "Enter any string up to " + MAXSTR + " strings." +
                "\nEnter " + QUIT + " to quit.");

        while (!input.equals(QUIT) && (numShort + numLong < MAXSTR))
        {
            if (input.length() <= MAXCHAR)
            {
                shortStr[numShort] = input;
                ++numShort;
            }
            else
            {
                longStr[numLong] = input;
                ++numLong;
            }
            if (numShort + numLong < MAXSTR)
            {
                input = JOptionPane.showInputDialog(null,
                        "Enter any string up to " + MAXSTR + " strings." +
                                "\nEnter " + QUIT + " to quit.");
            }
        }
        input2 = JOptionPane.showInputDialog(null, "What do you want to display?" +
                "\nS for short strings (<=" + MAXCHAR + " characters)." +
                "\nL for long strings." +
                "\n" + QUIT + " to quit.");
        while (!input2.equals(QUIT))
        {
            if (input2.toUpperCase().equals("S"))
            {
                display(shortStr, numShort);
            }
            else
            {
                display(longStr, numLong);
            }
            input2 = JOptionPane.showInputDialog(null, "What do you want to display?" +
                    "\nS for short strings (<=" + MAXCHAR + " characters)." +
                    "\nL for long strings." +
                    "\n" + QUIT + " to quit.");
        }
        JOptionPane.showMessageDialog(null, "Thank you for using this program.");
    }

    public static void display(String[] strings, int num)
    {
        StringBuffer message = new StringBuffer("Lists:\n");
        if (num == 0)
        {
            JOptionPane.showMessageDialog(null, "List is empty.");
        }
        else
        {
            for (int i = 0; i < num; ++i)
            {
                message.append(strings[i]);
                message.append("\n");
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
