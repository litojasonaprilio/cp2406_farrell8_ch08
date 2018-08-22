public class DemoSalesperson
{
    public static void main(String[] args)
    {
        Salesperson[] salespeople = new Salesperson[10];
        int i;
        for (i = 0; i < salespeople.length; ++i)
        {
            salespeople[i] = new Salesperson(9999, 0);
        }
        for (i = 0; i < salespeople.length; ++i)
        {
            System.out.println("ID number: " + salespeople[i].getIdNum() +
                    "\nSales value: " + salespeople[i].getAnnualSales());
        }
    }
}
