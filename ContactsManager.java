public class ContactsManager {
    // Attributs
    Contact[] myFriends;
    int friendsCount;

    // Constructeur
    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode d'ajout de contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode de recherche de contact
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
