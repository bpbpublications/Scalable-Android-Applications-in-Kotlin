class IntContainer {
    private int value;

    private IntContainer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static IntContainer intContainerFactory(int value) {
        return new IntContainer(value);
    }
}
