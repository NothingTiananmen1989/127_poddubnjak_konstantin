import java.util.HashMap;

public class Counter {
    public HashMap<Integer, Integer> total(int[]x) {
        HashMap<Integer, Integer> y = new HashMap<>();
        for(int i=0; i<x.length; i=i+1) {
            if(y.containsKey(x[i])) {
                int a=y.get(x[i])+1;
                y.put(x[i],a);
            }
            else {
                y.put(x[i], 1);
            }
        }
        return y;
    }
}