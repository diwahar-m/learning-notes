package JAVA.Telusko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        // Collection<Integer> nums3 = new ArrayList<Integer>(); 
        List<Integer> nums = new ArrayList<Integer>(); 
        nums.add(1);
        nums.add(2);
        nums.add(33);
        nums.add(5);

        for(int i: nums){
            System.out.println(i);
        }

        // sorting list
        java.util.Collections.sort(nums);

        System.out.println(nums.indexOf(3)); 

        //   SET

        Set<Integer> nums2 = new HashSet<Integer>();
        // Set - collection of a unique value
        nums2.add(1);
        nums2.add(3);
        nums2.add(2);
        nums2.add(1); 


        Set<Integer> nums3 = new TreeSet<Integer>();
        // TreeSet - a sorted set
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);
        nums3.add(1);

        // 
        Iterator<Integer> values = nums.iterator();
        // Parent of Colection - Iterator

        while(values.hasNext()){
            System.out.println(values.next());
        }


    }
}
