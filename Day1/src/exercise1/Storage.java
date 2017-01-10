package exercise1;

/**
 * Created by Casper on 10/01/2017.
 */
class Storage<T> {
    T x;
    public void setValue(T value) {
        x = value;
    }
    public T getValue() {
        return x;

    }
}

