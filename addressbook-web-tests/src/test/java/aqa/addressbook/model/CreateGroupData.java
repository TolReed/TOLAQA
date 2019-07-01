package aqa.addressbook.model;

import java.util.Objects;

public class CreateGroupData {
    private final String id;
    private final String name;
    private final String header;
    private final String footer;
    //конструктор нижче, який дозволяє проініціалізувати об"єкт з трьома значеннями
    public CreateGroupData(String id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public CreateGroupData(String name, String header, String footer) { //another method, if we no need id as parameter
        this.id = null;
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

    public String getId() { return id; }

    @Override
    public String toString() {
        return "CreateGroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateGroupData that = (CreateGroupData) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
