import java.util.function.Function;

class ScopeFunction24 {
    void scopeFunction() {

        String str = "";
        if (str != null) {
            Integer length = new Function<String, Integer>() {
                @Override
                public Integer apply(String s) {
                    // Perform operations on non-null 'str'
                    return s.length();
                }
            }.apply(str);
        }
    }
}
