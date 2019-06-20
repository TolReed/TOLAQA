package aqa.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String group;
        //конструктор нижче, який дозволяє проініціалізувати об"єкт з трьома значеннями
        public ContactData(String firstname, String lastname, String group) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.group = group;

        }
        // три метода нижче які повіртають значення трьох параметрів
        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getGroup() {
            return group;
        }



}
