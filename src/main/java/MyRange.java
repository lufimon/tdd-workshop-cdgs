public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public boolean isStartWithOne() {
        if(startWithInclude()){
            return Integer.parseInt(String.valueOf(input.charAt(1))) == 1;
        }
        return false;
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

    public void validate() {
        if (!startWithInclude() && !startWithExclude()) {
            throw new InputInvalidException("Input error");
        }
    }
}
