/**
 * OOPSBannerApp
 *
 * UC6: Using Static Functions
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = buildBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static function to build banner
    public static String[] buildBanner() {

        return new String[] {
            buildLine("*****", "*****", "*****", "*****"),
            buildLine("*   *", "*   *", "*   *", "*     "),
            buildLine("*   *", "*   *", "*   *", "*     "),
            buildLine("*****", "*****", "*****", "*****"),
            buildLine("*     ", "*     ", "*     ", "    *"),
            buildLine("*     ", "*     ", "*     ", "    *"),
            buildLine("*     ", "*     ", "*     ", "*****")
        };
    }

    // Static helper function
    public static String buildLine(String a, String b, String c, String d) {
        return String.join("   ", a, b, c, d);
    }
}