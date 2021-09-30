public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public boolean isStartWithOne() {
        return Integer.parseInt(String.valueOf(input.charAt(1))) == 1;
    }

    public boolean startWithExclude() {
        return input.startsWith("(");
    }

    public boolean endWithInclude() {
        return input.endsWith("]");
    }

    public boolean endWithExclude() {
        return input.endsWith(")");
    }
}
