public class DemoSalesperson2
{
    public static void main(String[] args)
    {
        Salesperson[] salespeople = new Salesperson[10];
        int i;
        int idStart = 111;
        int salesStart = 25000;
        final int salesIncrease = 5000;

        for (i = 0; i < salespeople.length; ++i)
        {
            salespeople[i] = new Salesperson(idStart, salesStart);
            ++idStart;
            salesStart += salesIncrease;
        }

        for (i = 0; i < salespeople.length; ++i)
        {
            System.out.println("ID number: " + salespeople[i].getIdNum() +
            "\nSales value: " + salespeople[i].getAnnualSales());
        }
    }
}
