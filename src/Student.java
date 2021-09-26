import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String form;
    private ArrayList<Mark> marks = new ArrayList<>();

    public Student(String name, String form) {
        this.name = name;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setMark (Mark mark) {
        marks.add(mark);
    }

    public void setMark (MarkEnum markEnum, SubjectEnum subject) {
      Mark mark = new Mark(new Date(), markEnum, subject);
      marks.add(mark);
    }

    @Override
    public String toString() {
        return getName() + " " + getForm();
    }
}
