public class StaticArray<T> extends ArrayStack<T>{
    public StaticArray(int tamanho) {
        super(tamanho);
    }

    public boolean isFull() {
        return this.data.length == this.top + 1;
    }
}
