import java.util.ArrayList;
import java.util.List;

public class Branch2 {
    public static void branch2(String[] args) {
        elements2and4();
    }

    public static int elements2and4() {
        //создать коллекцию, добавить 5 элементов и вывести 2 и 4
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(38);
        list.add(910);
        list.add(1);
        list.add(74);
        int element2 = list.get(2);
        int element4 = list.get(4);
        System.out.println(element2);
        System.out.println(element4);
        return 0;
    }
}
