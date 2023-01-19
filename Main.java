import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList <String> items = new ArrayList<>(20);
//        addItems(items, "study");
//        addItems(items, "dinner");
//        addItems(items, "lunch");
//        addItems(items, "study");
//        addItems(items, "shopping");
//        removeItems(items, 4);
//        removeItems(items);
//        addItems(items, "study");
//        addItems(items, "dinner");
//        addItems(items, "lunch");
//        addItems(items, "study");
//        addItems(items, "shopping");
//        removeItems(items, "shopping");
//        checkItems(items, "lunch");
//        addItems(items, "study");
//        addItems(items, "dinner");
//        addItems(items, "lunch");
//        addItems(items, "study");
//        addItems(items, "shopping");
//        sortItems(items);
//        removeDoubles(items);
//        removeDoubles(items);

        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addManyItems(items);
                case 3 -> removeManyItems(items);
                default -> flag = false;
            }
            items.sort(Comparator.naturalOrder());
            System.out.println(items);
        }
    }

    public static void addManyItems(ArrayList<String> items) {
        System.out.println("Add items [separate items by comma]:");
        String [] manyItems = scanner.nextLine().split(",");
        items.addAll(List.of(manyItems));

        for (String i : manyItems) {
            String trimmed = i.trim();
            if(items.indexOf(trimmed) < 0) {
                items.add(trimmed);
            }
        }
    }

    public static void removeManyItems(ArrayList<String> items) {
        System.out.println("Remove items [separate items by comma]:");
        String [] manyItems = scanner.nextLine().split(",");
          for (String i : manyItems) {
            String trimmed = i.trim();
            items.remove(trimmed);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

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
            for (int i = 0; i < items.size() - 1; i++){
                if (items.get(i) == items.get(i + 1)) {
                    items.remove(i);
                }
            }
            System.out.println(items);
        }

    }


}