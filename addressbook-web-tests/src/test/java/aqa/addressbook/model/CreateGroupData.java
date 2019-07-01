package aqa.addressbook.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "CreateGroupData{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { //generate to equals list elements for test
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateGroupData that = (CreateGroupData) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
