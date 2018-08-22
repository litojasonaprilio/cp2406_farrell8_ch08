public class Salesperson
{
    private int idNum;
    private double annualSales;

    public Salesperson(int id, double sales)
    {
        idNum = id;
        annualSales = sales;
    }

    public int getIdNum()
    {
        return idNum;
    }
    public void setIdNum(int id)
    {
        idNum = id;
    }

    public double getAnnualSales()
    {
        return annualSales;
    }
    public void setAnnualSales(double sales)
    {
        annualSales = sales;
    }
}
