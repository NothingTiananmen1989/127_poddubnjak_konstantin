import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SummCalculator {
    public int count(HashMap<String, Integer> H1, HashMap<String, Integer> H2) {
        int  result=0;
        Set<HashMap.Entry<String, Integer>> part1=H1.entrySet();
        for(HashMap.Entry<String, Integer> a:part1) {
            int quantity=a.getValue();
            if(H2.containsKey(a.getKey())) {
                int v=H2.get(a.getKey());
                System.out.println("Итоговая сумма:"+v);
            }
        }
        return result;
    }
}
