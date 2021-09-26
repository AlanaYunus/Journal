import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Journal {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

   public void setStudent (String name, String form) {
        Student student = new Student (name, form);
        students.add(student);
   }

   public void printStudents () {
       for (Student student : students) {
           System.out.println(student);
       }
   }
    public void printStudents (String form) {
        students.stream()
                .filter(student -> student.getForm().equals(form))
                .forEach(System.out::println);
    }

    public void setMark(String name, Mark mark) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setMark(mark);
            }
        }

    }
    public void setMark(String name, MarkEnum markEnum, SubjectEnum subjectEnum ) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setMark(markEnum, subjectEnum);
            }
        }
    }

    public void printStudentWithMarks (String name, Date date) {
        List<Mark> marks = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                marks = student.getMarks();
            }
        }
        marks = marks.stream().filter(mark -> mark.getDate().equals(date)).collect(Collectors.toList());

        Map<SubjectEnum, List<Mark>> marksBySubject = marks.stream().collect(Collectors.groupingBy(Mark::getSubject));
        for (Map.Entry<SubjectEnum, List<Mark>> item : marksBySubject.entrySet()) {
            System.out.print(item.getKey() + ": ");
            List <Mark> marksBySubject2 = item.getValue();
            for(int i = 0; i < marksBySubject2.size(); i++){
                Mark mark = marksBySubject2.get(i);
                System.out.print(mark.getMark().getMark());
                if(i != marksBySubject2.size()-1){
                    System.out.print(", ");
                }

            }
            System.out.println();
        }
    }

    public void printStudentWithMarks (String name, SubjectEnum subject) {
        List<Mark> marks = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                marks = student.getMarks();
            }
        }
        marks = marks.stream().filter(mark -> mark.getSubject().equals(subject)).collect(Collectors.toList());

        Map<Date, List<Mark>> marksBySubject = marks.stream().collect(Collectors.groupingBy(Mark::getDate));
        for (Map.Entry<Date, List<Mark>> item : marksBySubject.entrySet()) {
            System.out.print(item.getKey() + ": ");
            List <Mark> marksBySubject2 = item.getValue();
            for(int i = 0; i < marksBySubject2.size(); i++){
                Mark mark = marksBySubject2.get(i);
                System.out.print(mark.getMark().getMark());
                if(i != marksBySubject2.size()-1){
                    System.out.print(", ");
                }

            }
            System.out.println();
        }
    }
    }
