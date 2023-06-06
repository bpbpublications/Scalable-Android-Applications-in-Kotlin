class NullSafety3 {

    void nullSafety() {
        String str = null;
        Integer length = null;

        if (str != null) {
            length = str.length();
        }
    }
}
