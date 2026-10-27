public class Email {

    // Add one attribute for the address
    // Create a constructor that assigns an address to this address
    // Create the following methods
    // toString
    // getAtIndex
    // getUser
    // getDomain
    // isSchool

    private String address;

    public Email(String address) {

        this.address = address;

    }

    public String toString() {

        return address;

    }

    // Where is the @?  
    public int getAtIndex() {

        return address.indexOf("@");

    }

    // getUser will return everything to the LEFT of the @

    // method substring -- cuts out part of a String.
     // String substring(int from, int to)   from index "from" up to, NOT including, "to"
      // String substring(int from)           from index "from" to the end

    public String getUser() {

        return address.substring(0, address.indexOf("@"));

    }

    public String getDomain() {

        return address.substring(address.indexOf("@") + 1, address.length());

    }

    public boolean isSchool() {

        return false;

    }
}
