import java.util.Arrays;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    MOD('/'),
    DIVIDE('%'),

    ;
    final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public static OperatorType getOperatorType(char operator) {
        return Arrays.stream(OperatorType.values())
                .filter(o -> o.operator == operator)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자"));
    }

}
