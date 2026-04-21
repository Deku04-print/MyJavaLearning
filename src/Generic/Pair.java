package Generic;

public class Pair<H,S> {

    private H key;
    private S value;

    public Pair(H key, S value) {
        this.key = key;
        this.value = value;
    }

    public H getKey() {
        return key;
    }

    public void setKey(H key) {
        this.key = key;
    }

    public S getValue() {
        return value;
    }

    public void setValue(S value) {
        this.value = value;
    }
}
