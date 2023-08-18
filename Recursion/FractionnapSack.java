import java.util.Arrays;
import java.util.Comparator;

class Item {
    int profit;
    int weight;

    public Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
    }
}

public class FractionnapSack {
    static double getmaxprof(Item a[], int capacity) {
        double profit = 0;

        Arrays.sort(a, 0, a.length, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                return  (b.profit / b.weight)-(a.profit / a.weight);
            }
        });
        int i = 0;
        while (capacity > 0 && i < a.length - 1 && capacity-a[i].weight>0) {
            if (capacity - a[i].weight >= 0) {
                profit += a[i].profit;
                capacity -= a[i].weight;
                i++;
            }
             
           
        }
        System.out.println(i);
        System.out.println(profit);
       
        profit += (double)(capacity*a[i].profit)/a[i].weight;
        capacity=0;
        return profit;
    }

    public static void main(String[] args) {
        // Item[] a = {
        //         new Item(32, 6), new Item(15, 5), new Item(6, 1), new Item(3, 1), new Item(7, 4),new Item(36, 22)
        // };
        Item[] a = {new Item(60, 10),
new Item(100, 20),
new Item(120, 30) };
        double p = getmaxprof(a, 15);
        System.out.println(p);
    }
}
