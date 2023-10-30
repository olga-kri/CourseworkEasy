public class TotalName {
    String name;
    String surname;
    String patronimic;

    public TotalName(String name, String surname, String patronimic) {
        this.name = name;
        this.surname = surname;
        this.patronimic = patronimic;
    }

    @Override
    public String toString() {
        return name + " " +
                surname + " "
                + patronimic;
    }

}
