public class Main {
    public static void main(String[] args) {
        // Création du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        // Ajout de 5 contacts
        Contact c1 = new Contact();
        c1.name = "Alice";
        c1.phoneNumber = "+2250102030405";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Bob";
        c2.phoneNumber = "+2250506070809";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Charlie";
        c3.phoneNumber = "+2251112131415";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Diana";
        c4.phoneNumber = "+2251617181920";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Eve";
        c5.phoneNumber = "+2252122232425";
        myContactsManager.addContact(c5);

        // Recherche d’un contact
        Contact result = myContactsManager.searchContact("Charlie");
        if (result != null) {
            System.out.println("Numéro de Charlie : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
