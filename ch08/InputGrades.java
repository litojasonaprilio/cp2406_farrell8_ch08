import javax.swing.*;
public class InputGrades
{
    public static void main(String[] args)
    {
        Student[] students = new Student[10];
        String inputId, inputCourse, inputCredit, inputGrade;
        int credits;
        final int COURSENUM = 5;
        boolean isGrade = false;
        char grade = ' ';
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        String message;

        for (int s = 0; s < students.length; ++s)
        {
            Student student1 = new Student();
            inputId = JOptionPane.showInputDialog(null, "Enter ID for student #" + (s + 1));
            student1.setStuId(inputId);
            for (int n = 0; n < COURSENUM; ++n)
            {
                inputCourse = JOptionPane.showInputDialog(null, "Enter course ID #" + (n + 1));
                inputCredit = JOptionPane.showInputDialog(null, "Enter credit hours ID #" + (n + 1));
                credits = Integer.parseInt(inputCredit);
                while (!isGrade)
                {
                    inputGrade = JOptionPane.showInputDialog(null, "Enter grade ID #" + (s + 1));
                    grade = Character.toUpperCase(inputGrade.charAt(0));
                    for (int c = 0; c < grades.length; ++c)
                    {
                        if (grade == grades[c])
                        {
                            isGrade = true;
                        }
                    }
                }
                CollegeCourse course = new CollegeCourse();
                course.setId(inputCourse);
                course.setCredit(credits);
                course.setGrade(grade);
                student1.setCollegeCourses(course, n);
            }
            students[s] = student1;
        }
        for (int i = 0; i < students.length; ++i)
        {
            message = "Student " + (i + 1) + " with ID #" + students[i].getStuId();
            for (int j = 0; j < grades.length; ++j)
            {
                CollegeCourse course = new CollegeCourse();
                course = students[i].getCollegeCourses(j);
                message = message + "\nID: " + course.getId() +
                        "\nCredits: " + course.getCredit() +
                        "\nGrade: " + course.getGrade();
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
