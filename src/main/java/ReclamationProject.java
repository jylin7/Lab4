/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject {
    /**
     *@param a : jaksdf
     *@param b : sfjkh
     *@return r : sfaf
     */
    public static String doitt(final String a, final String b) {
        String temp1 = a;
        String temp2 = b;
        if (a.length() > b.length()) {
            String c = a; //set c to a
            temp1 = b;
            temp2 = c;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < temp1.length(); i++) {
            for (int j = temp1.length() - i; j > 0; j--) {
                for (int k = 0; k < temp2.length() - j; k++) {
                    if (temp1.regionMatches(i, b, k, j) && j > r.length()) {
                        r = temp1.substring(i, i + j);

                    }
                }
            }
        }
        return r;
    }
}
