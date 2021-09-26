public enum SubjectEnum {

    MATHS ("Математика"),
    BIOLOGY("Биология"),
    LITERATURE ("Литература"),
    HISTORY("История"),
    ARTS("Искусство"),
    FRENCH("Французский язык");

    private String title;

    public String getTitle() {
        return title;
    }

    SubjectEnum(String title) {
        this.title = title;
    }

}
