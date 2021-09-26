public enum MarkEnum {

    TWO ("Неудовлетворительно", 2),
    THREE("Удовлетворительно", 3),
    FOUR("Хорошо", 4),
    FIVE("Отлично", 5);

    private String title;
    private int mark;

    public String getTitle() {
        return title;
    }
    public int getMark() {
        return mark;
    }

    MarkEnum(String title, int mark) {
        this.title = title;
        this.mark = mark;
    }


}
