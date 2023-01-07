import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimeController {
    public String return_max_time (ArrayList<String> list1, ArrayList<Integer> list2){
        String final_num="";
        int max_final=0;
        for(int i=0; i<list1.size(); i=i+1) {
            System.out.println(list1.get(i));
        }
        for(int i=0; i<list2.size(); i=i+1) {
            System.out.println(list2.get(i));
        }
        HashMap<String,Integer> H1=new HashMap<>();
        for(int i=0; i<list1.size(); i=i+1) {
            if(H1.containsKey(list1.get(i))) {
                int k=list2.get(i)+H1.get(list1.get(i));
                H1.put(list1.get(i), k);
            }
            else{
                H1.put(list1.get(i), list2.get(i));
            }
        }
        System.out.println(H1);
        max_final = H1.get(list1.get(0));
        Set<HashMap.Entry<String ,Integer>> count1 =  H1.entrySet();
        for(HashMap.Entry<String, Integer> a:count1) {
            if(a.getValue()>max_final){
                max_final = a.getValue();
                final_num = a.getKey();
            }
        }
        return final_num;
    }
}