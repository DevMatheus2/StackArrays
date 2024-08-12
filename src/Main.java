//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>();
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);

        System.out.println(array.pop());
        System.out.println(array.isEmpty());
        array.clear();
        System.out.println(array.isEmpty());
        array.push(3);
        System.out.println(array.pop());


    }
}