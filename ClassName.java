class Main {
    public static void main(String[] args) {
        String name = getClassName();

        System.out.println("The name of this class is: " + name);
    }

    private String getClassName() {
        return Main.class
            .toString()
            .replace("class", "")
            .trim();
    }
}
