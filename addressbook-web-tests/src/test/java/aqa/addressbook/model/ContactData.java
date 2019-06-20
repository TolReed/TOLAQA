package aqa.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String secondname;
    private final String group;
        //конструктор нижче, який дозволяє проініціалізувати об"єкт з трьома значеннями
        public ContactData(String firstname, String secondname, String group) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.group = group;

        }
        // три метода нижче які повіртають значення трьох параметрів
        public String getFirstname() {
            return firstname;
        }

        public String getSecondname() {
            return secondname;
        }

        public String getGroup() {
            return group;
        }
    }

}
