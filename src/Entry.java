class Entry {
    Object key = null;
    Object value = null;
    boolean isDeleted = false;

    public Entry(Object key, Object value, boolean isDeleted) {
        this.key = key;
        this.value = value;
        this.isDeleted = isDeleted;
    }
}
