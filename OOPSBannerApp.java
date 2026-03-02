/**
 * OOPSBannerApp
 *
 * UC5: Array Initialization using String.join()
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization together
        String[] banner = new String[] {
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*     ", "*     ", "*     ", "    *"),
            String.join("   ", "*     ", "*     ", "*     ", "    *"),
            String.join("   ", "*     ", "*     ", "*     ", "*****")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}