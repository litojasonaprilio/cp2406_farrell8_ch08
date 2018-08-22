public class CollegeCourse
{
    private String id;
    private int credit;
    private char grade;

    public String getId()
    {
        return id;
    }
    public void setId(String idCourse)
    {
        id = idCourse;
    }

    public int getCredit()
    {
        return credit;
    }
    public void setCredit(int creditCourse)
    {
        credit = creditCourse;
    }

    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char letterGrade)
    {
        grade = letterGrade;
    }
}
