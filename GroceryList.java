import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class GroceryList {

    public static void addItems (ArrayList <String> items, String newItem) {
        items.add(newItem);
        System.out.println(items);
    }

    public static void removeItems (ArrayList <String> items, int index) {
        items.remove(index);
        System.out.println(items);
    }

    public static void removeItems (ArrayList <String> items, String item) {
        items.remove(item);
        System.out.println(items);
    }

    public static void removeItems (ArrayList <String> items) {
        items.clear();
        System.out.println(items);
    }

    public static void checkItems (ArrayList <String> items, String itemToCheck) {
        if (items.indexOf(itemToCheck) != -1) {
            System.out.println("The list already has " + itemToCheck);
        } else {
            System.out.println("The list does not have " + itemToCheck);
        }
    }

    public static void sortItems (ArrayList <String> items) {
        Collections.sort(items);
        System.out.println(items);

    }

    public static void removeDoubles (ArrayList <String> items) {

        HashSet<String> set = new HashSet<>(items);

        if(items.size() >  set.size()) {
            Collections.sort(items);
            for (int i = 0; i < items.size(); i++){
                if (items.get(i) == items.get(i + 1)) {
                    items.remove(i);
                }
            }
            System.out.println(items);
        }

    }
}
