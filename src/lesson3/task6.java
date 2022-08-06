//Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
//   The First Name and Last Name of the user should be in the following format: "Name Surname".
//   Result should be:
//   login = "John Smith"
//   domain = "example.com"

public class task6 {
    public static void main(String[] args) {
        String email = "john_smith@example.com";

        String[] atArray = email.split("@");
        String domain = atArray[1];

        String LastName_Name = atArray[0];

        String[] beforeAt01_02 = LastName_Name.split("_");

        String name = beforeAt01_02[0];
        String lastName = beforeAt01_02[1];
        String var01 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String var02 = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Login: " + var01 + " " + var02);
        System.out.println("Domain: " + domain);

    }
}
