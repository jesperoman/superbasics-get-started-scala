package superbasics

case class Contact(name: String, phone: String, address: String)

case class PhoneBook(contacts: List[Contact], name: String) {

  /**
    * Exercise 1
    * Return a new PhoneBook including the new contact
    * @param contact Contact to add to the phone book
    * @return PhoneBook
    */
  def add(contact: Contact): PhoneBook = this.copy(contacts = contact :: contacts)

  /**
    * Exercise 2
    * Return a list of contacts, sorted by name, a-z
    * @return A List of Contacts
    */
  def sortByName: List[Contact] = contacts.sortBy(_.name)

  /**
    * Exercise 3
    * Return a new PhoneBook excluding the contact(s) matching exactly the
    * name supplied
    * @param name Name of contact to be deleted
    * @return
    */
  def delete(name: String): PhoneBook = this.copy(contacts = contacts.filterNot(_.name == name))

  /**
    * Exercise 4
    * Implement a function that is able to search for contacts by parts
    * of their names
    * @param name Partial name to search for
    * @return List of contacts that matches
    */
  def search(name: String): List[Contact] = contacts.filter(_.name.contains(name))

  /**
    * Exercise 5
    * Create a new PhoneBook consisting of this and all records of "other"
    * PhoneBook
    * @param other Another phonebook to concat with this
    * @return A new PhoneBook
    */
  def concat(other: PhoneBook): PhoneBook = this.copy(contacts ++ other.contacts)

  /**
    * Exercise 6
    * Return the first Contact found,
    * if no one is found, return None
    * @param name Name of contact
    * @return Maybe a contact
    */
  def findByName(name: String): Option[Contact] = contacts.find(_.name == name)

  /**
    * Exercise 7
    * Return the first Contact matching the number
    * If no one is found, return None
    * @param number the number to search for
    * @return Maybe a Contact
    */
  def findByNumber(number: String): Option[Contact] = contacts.find(_.phone == number)

  /**
    * Exercise 8
    * Return the number of the first contact whos name is matching supplied
    * string
    * Return "Not found" if not found
    * @param name Name to search for
    * @return The number of the contact found
    */
  def findNr(name: String): String = findByName(name).map(_.phone).getOrElse("Not found")

  /**
    * Exercise 9
    * Return the name of the first contact who's number is matching
    * supplied string
    * Return "No contact" if not found
    * @param number Phone number to search for
    * @return Name of the contact found
    */
  def findName(number: String): String = findByNumber(number).map(_.name).getOrElse("No contact")


  /**
    * You're finished?
    * All 14 tests are green?
    * Great!
    *
    * Why not try out some more stuff?
    *
    * Can you implement all functions as one-liners?
    *
    * Add fields to Contact: description, email, etc. (make the tests run again)
    *
    * Maybe make it possible to have multiple phone numbers per contact?
    *
    * You could create a runnable app with a command line interface to make it more useful?
    *
    * Of course, write unit tests for your new features!
    */
}
