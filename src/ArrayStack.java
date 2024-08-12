public abstract class ArrayStack<T> implements Stack<T>{
    protected int top = -1;
    protected T[] data;

    public ArrayStack() {}
    public ArrayStack(int tamanho) {
        this.data = (T[]) new Object[tamanho];
    }

    public T pop(){
        T valor = this.data[top];
        this.top -= 1;
        return valor;
    }

    public void clear() {
        this.top = -1;
    }

    public void push(T item){
        this.top += 1;
        this.data[this.top] = item;
    }

    public boolean isEmpty() {
        return this.top < 0;
    }
}
