package aqa.addressbook.model;

import java.util.Objects;

public class CreateGroupData {
    private int id;
    private final String name;
    private final String header;
    private final String footer;
    //конструктор нижче, який дозволяє проініціалізувати об"єкт з трьома значеннями
    public CreateGroupData(int id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public CreateGroupData(String name, String header, String footer) { //another method, if we no need id as parameter
        this.id = 0;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateGroupData that = (CreateGroupData) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CreateGroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
