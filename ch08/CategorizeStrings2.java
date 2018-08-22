import javax.swing.*;
public class CategorizeStrings2
{
    public static void main(String[] args)
    {
        final int MAXSTR = 10;
        final String QUIT = "QUIT";
        String input;
        String input2;
        int space = 0;
        int oneWord = 0;
        int twoWords = 0;
        int moreWords = 0;
        String[] oneWordStr = new String[MAXSTR];
        String[] twoWordsStr = new String[MAXSTR];
        String[] moreWordsStr = new String[MAXSTR];

        input = JOptionPane.showInputDialog(null,
                "Enter any string up to " + MAXSTR + " strings." +
                        "\nEnter " + QUIT + " to quit.");

        while (!input.equals(QUIT) && (oneWord + twoWords + moreWords < MAXSTR))
        {
            for (int i = 0; i < input.length(); ++i)
            {
                if (input.charAt(i) == ' ')
                {
                    ++space;
                }
            }
            if (space == 0)
            {
                oneWordStr[oneWord] = input;
                ++oneWord;
            }
            else if(space == 1)
            {
                twoWordsStr[twoWords] = input;
                ++twoWords;
            }
            else
            {
                moreWordsStr[moreWords] = input;
                ++moreWords;
            }
            if (oneWord + twoWords + moreWords < MAXSTR)
            {
                input = JOptionPane.showInputDialog(null,
                        "Enter any string up to " + MAXSTR + " strings." +
                                "\nEnter " + QUIT + " to quit.");
            }
        }
        input2 = JOptionPane.showInputDialog(null, "What do you want to display?" +
                "\nO for one word." +
                "\nT for two words." +
                "\nM for more than two words." +
                "\n" + QUIT + " to quit.");
        while (!input2.equals(QUIT))
        {
            switch (input2.toUpperCase()) {
                case "O":
                    display(oneWordStr, oneWord);
                    break;
                case "T":
                    display(twoWordsStr, twoWords);
                    break;
                case "M":
                    display(moreWordsStr, moreWords);
                    break;
                default:
                    display(oneWordStr, oneWord);
                    display(twoWordsStr, twoWords);
                    display(moreWordsStr, moreWords);
                    break;
            }
            input2 = JOptionPane.showInputDialog(null, "What do you want to display?" +
                    "\nO for one word." +
                    "\nT for two words." +
                    "\nM for more than two words." +
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
