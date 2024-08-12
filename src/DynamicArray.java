public class DynamicArray<T> extends ArrayStack<T>{
    public DynamicArray() {
        this.data = (T[]) new Object[1];
    }

    @Override
    public void push(T item) {
        this.top += 1;
        if(this.top >= this.data.length - 1) {
            T[] oldArray = this.data;
            this.data = (T[]) new Object[oldArray.length * 2];
            for(int i = 0; i < oldArray.length; i++) {
                this.data[i] = oldArray[i];
            }
            this.data[this.top] = item;
        } else {
            this.data[this.top] = item;
        }
    }
}
