package aqa.addressbook;

public class CreateGroupData {
    private final String name;
    private final String header;
    private final String footer;
    //конструктор нижче, який дозволяє проініціалізувати об"єкт з трьома значеннями
    public CreateGroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
    // три метода нижче які повіртають значення трьох параметрів
    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
