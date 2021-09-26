import java.util.Date;

public class Mark {
    private Date date;
    private MarkEnum mark;
    private SubjectEnum subject;

    public Mark(Date date, MarkEnum mark, SubjectEnum subject) {
        this.date = date;
        this.mark = mark;
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public MarkEnum getMark() {
        return mark;
    }

    public SubjectEnum getSubject() {
        return subject;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMark(MarkEnum mark) {
        this.mark = mark;
    }

    public void setSubject(SubjectEnum subject) {
        this.subject = subject;
    }
}
