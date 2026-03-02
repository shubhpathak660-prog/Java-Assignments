/**
 * OOPSBannerApp
 *
 * UC4: Print OOPS banner using Array and Loop
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*   *", "*   *", "*   *", "*     "),
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*     ", "*     ", "*     ", "    *"),
            String.join("   ", "*     ", "*     ", "*     ", "    *"),
            String.join("   ", "*     ", "*     ", "*     ", "*****")
        };

        // loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}