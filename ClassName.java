class Main {
    public static void main(String[] args) {
        String name = getClassName();

        System.out.println("The name of this class is: " + name);
    }

    private String getClassName() {
        // "Main" can be replaced with whichever
        // class you want to grab the name of.
        return Main.class
            .toString()
            .replace("class", "")
            .trim();
    }
}
