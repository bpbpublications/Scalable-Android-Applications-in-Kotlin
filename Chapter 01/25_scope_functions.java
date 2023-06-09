import java.util.Optional;

class ScopeFunction25 {
    void scopeFunction() {

        String str = "";
        Optional<Integer> length = Optional.ofNullable(str).map(s -> {
            // Perform operations on nullable 'str'
            return s.length();
        });
    }
}
