public class MobileNoFormat {
    public static String FormatFun(String input) {
        StringBuilder formattedNo = new StringBuilder();

        // Remove any non-digit characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                formattedNo.append(c);
            }
        }

        // Check if the number has at least 10 digits
        if (formattedNo.length() < 10) {
            return "Error: Number must have at least 10 digits";
        }

        // Ensure the number starts with the country code +91
        if (formattedNo.length() == 10) {
            formattedNo.insert(0, "91");
        } else if (formattedNo.length() == 12 && formattedNo.substring(0, 2).equals("91")) {
            // Number already has country code
        } else {
            return "Error: Invalid number format";
        }

        // Format the number as +91-XXX-XXX-XXXX
        formattedNo.insert(0, "+");
        formattedNo.insert(3, "-");
        formattedNo.insert(7, "-");
        formattedNo.insert(11, "-");

        return formattedNo.toString();
    }

    public static void main(String[] args) {
        System.out.println(FormatFun("+91-988-162-8598")); // +91-988-162-8598
        System.out.println(FormatFun("+919881628598"));    // +91-988-162-8598
        System.out.println(FormatFun("9881628598"));       // +91-988-162-8598
        System.out.println(FormatFun("988162859"));        // Error: Number must have at least 10 digits
    }
}
