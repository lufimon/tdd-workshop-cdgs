public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public int getStart() {
        return Integer.parseInt(String.valueOf(input.charAt(1)));
    }
}
