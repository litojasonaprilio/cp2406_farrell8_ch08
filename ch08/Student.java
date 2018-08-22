public class Student
{
    private String stuId;
    private CollegeCourse[] collegeCourses = new CollegeCourse[5];

    public String getStuId()
    {
        return stuId;
    }
    public void setStuId(String id)
    {
        stuId = id;
    }

    public CollegeCourse getCollegeCourses(int i)
    {
        return collegeCourses[i];
    }
    public void setCollegeCourses(CollegeCourse course, int i)
    {
        collegeCourses[i] = course;
    }
}
