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

        return address.substring(address.indexOf("@") + 1);

    }

    public boolean isSchool() {

        // use indexOf. return true if "hcvsd.org" is NOT in the email
        return address.indexOf("hcvsd.org") != -1;

    }

    // ===== CHALLENGE 1 =====
// Method name: getFirstName
// School addresses are formatted first.last@hcvsd.org
// Return the first name: the part of the user before the ".".
//     "ana.lee@hcvsd.org" -> "ana"
// Hint: call your helper method getUser() first and store it in a variable.
// Hint: find the "." in that variable, not in address.
// Tools: getUser, indexOf, substring

    public String getFirstName() {

        String fullname = getUser();
        int dotindex = fullname.indexOf(".");
        if (dotindex != -1) {
            return fullname.substring(0, dotindex);
        }
        return fullname;

    }

// ===== CHALLENGE 2 =====
// Method name: changeDomain
// Return a new address with the same user but a different domain.
//     "ana@hcvsd.org", "gmail.com" -> "ana@gmail.com"
// Reminder: this method must TAKE IN a parameter (the new domain).
//     What type is it? What will you name it?
// Hint: you don't need indexOf. getUser() already does the cutting.
// Hint: join Strings with +. Don't forget the "@".
// Tools: getUser, +

    public String changeDomain(String domain) {

        String newAddress = getUser();
        newAddress = newAddress + domain;
        return newAddress;
    }

// ===== CHALLENGE 3 =====
// Method name: getLabel
// Label the address as "School" or "Personal", followed by the domain.
//     "ana.lee@hcvsd.org" -> "School: hcvsd.org"
//     "ana99@gmail.com"   -> "Personal: gmail.com"
// Hint: isSchool() already returns true or false, so use it as your condition.
// Hint: every path through the method needs a return.
// Tools: if/else, isSchool, getDomain

    public String getLabel() {

        if (isSchool()) {
            return ("School: " + getDomain());
        } else {
            return ("Personal: " + getDomain());
        }

    }

    public boolean isStaffFormat() {

        String fullname = getUser();
        int dotindex = fullname.indexOf(".");
        int schoolIndex = toString().indexOf("hcvsd.org");

        if (schoolIndex != -1 && dotindex != -1) {
            return true;
        } else {
            return false;
        }

    } // maybe return schoolIndex != -1 && dotindex != -1 -- would work in one line?

}
