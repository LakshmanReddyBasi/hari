

import java.util.*;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele:map.keySet()){
            if(map.get(ele) == 1){
                return ele;
            }
        }
        return -1;
    }
       
}


                        (or)


//XOR operation 
import java.util.*;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int res = 0;
        for(int ele:arr)
            res ^= ele;
        return res;
    }
       
}
