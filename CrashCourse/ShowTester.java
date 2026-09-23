public class ShowTester {
    
    public static void main(String[] args) {

        Show fido = new Show("Fido", "Mr. Mack", "Mrs. Mack");
        Show arben = new Show("Arben's World", "Mr. Husenaj", "Mrs. Husenaj");
        Show pc = new Show("The adventures of PC", "Patrick C.", "Mrs. C");
        Show npa = new Show("The Memory of the NPA Rat", "RPA Mouse", "SPA Dog");
        Show ja = new Show("How Java was Made", "Mr. Java", "Mrs. Java");

        fido.premiere();
        fido.release();
        fido.end();
        fido.good();
        fido.bad();
        fido.anniversary();

        arben.premiere();
        arben.release();
        arben.end();
        arben.good();
        arben.bad();
        arben.anniversary();

        pc.premiere();
        pc.release();
        pc.end();
        pc.good();
        pc.bad();
        pc.anniversary();     
        
        npa.premiere();
        npa.release();
        npa.end();
        npa.good();
        npa.bad();
        npa.anniversary();

        ja.premiere();
        ja.release();
        ja.end();
        ja.good();
        ja.bad();
        ja.anniversary();

    }


}
