public class remove_apple {
    public static void main(String[] args){
        System.out.println(skip("", "baacbappledh"));
    }

    static String skip(String p, String up) {
        if (up.isEmpty()) {
            return p;  // Return the processed string
        }

        if (up.startsWith("apple")) {
            return skip(p, up.substring(5));  // Skip "apple" (5 letters)
        } else {
            return skip(p + up.charAt(0), up.substring(1));  // Keep the first character and move forward
        }
    }
}
