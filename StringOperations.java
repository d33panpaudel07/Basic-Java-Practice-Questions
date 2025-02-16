class StringOperations {
    public static void main(String[] args) {
        String x = "Airplane";

        char resultChar = x.charAt(3);
        System.out.println("The value of charAt is: " + resultChar);

        String resultConCat = x.concat(" has crashed into twin tower.");
        System.out.println("The value of concat is: " + resultConCat);

        boolean resultEq = x.equalsIgnoreCase("airplane");
        System.out.println("The value of eqIgnoreCase is: " + resultEq);

        int resultLength = x.length();
        System.out.println("The value of length() is: " + resultLength);

        String resReplace = x.replace("air", "jet");
        System.out.println("The airplane has changed to: " + resReplace);

        String resSubString = x.substring(4, 8);
        System.out.println("The airplane should look like: " + resSubString);

        String resLower = x.toLowerCase();
        System.out.println("The lowercase of " + x + " is " + resLower);

        String resUpper = x.toUpperCase();
        System.out.println("The uppercase of " + x + " is " + resUpper);

        x += "      ";
        System.out.println("Airplane has some gap ☆*: .｡. o(≧▽≦)o .｡.:*☆ : " + x + "shitttttttt");
        System.out.println("NOW let's cut he gap,");
        x = x.trim();
        System.out.println(x + ", yay it came back to normal");

        System.out.println("NOW let's try for contains funciton...");
        System.out.println("For plane: " + x.contains("plane"));
        System.out.println("For air: " + x.contains("air"));
    }

}