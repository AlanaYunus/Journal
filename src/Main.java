import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.setStudent("Габидуллин Рашид", "5Б" );
        journal.setStudent("Абдуллаев Муртаза", "6Б" );
        journal.setStudent("Пенько Савва", "5А" );
        journal.setStudent("Нанидзаде Лолита", "5В" );
        journal.setStudent("Нанидзаде Гаврош", "5В" );
        journal.setMark("Габидуллин Рашид", new Mark(new Date(2021, 8, 3), MarkEnum.FIVE, SubjectEnum.FRENCH));
        journal.setMark("Габидуллин Рашид", new Mark(new Date(2021, 8, 4), MarkEnum.FOUR, SubjectEnum.FRENCH));
        journal.setMark("Габидуллин Рашид", new Mark(new Date(2021, 8, 5), MarkEnum.THREE, SubjectEnum.FRENCH));
        journal.setMark("Абдуллаев Муртаза", new Mark(new Date(), MarkEnum.FOUR, SubjectEnum.FRENCH));
        journal.setMark("Габидуллин Рашид", MarkEnum.FIVE, SubjectEnum.HISTORY);
        journal.printStudentWithMarks ("Габидуллин Рашид", SubjectEnum.FRENCH);





    }
}
