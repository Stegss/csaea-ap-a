public class SchoolsTester {

    public static void main(String[] var0) {

        Schools voorhees = new Schools("Voorhees", "High School", 100);
        Schools north = new Schools("North Hunterdon", "High School", 90);


        // Prints at least one object's state before and after your methods change it.
        voorhees.check_in();
        voorhees.fire(20);



        voorhees.hire();
        voorhees.advertise();
        voorhees.open_end();
        voorhees.birthday();
        voorhees.good_inspection();
        voorhees.bad_inspection();
        voorhees.check_in();
        voorhees.expel(1);
        voorhees.fire(5);

        north.hire();
        north.advertise();
        north.open_end();
        north.birthday();
        north.good_inspection();
        north.bad_inspection();
        north.check_in();
        north.expel(20);
        north.fire(10);

    }
}