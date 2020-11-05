public class GroceryList {

    // Instance variables
    private String[] arr;
    
    // Constructors
    public GroceryList() { 
        arr = new String[10];
    }

    // Behaviors
    public void add(String item) { 
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) { 
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == item) {
                for (int p=i; p<(arr.length-1); p++) {
                    arr[p] = arr[(p+1)];
                }
                arr[(arr.length-1)] = null;
            }
        }
    }

    public String toString() { 
        String str = "";
        for (int i=0; i<arr.length; i++) {
            if (!(arr[i] == null)) {
                str += arr[i];
                str += " ";
            }
        }
        return "Grocery List: " + str;
    }
}