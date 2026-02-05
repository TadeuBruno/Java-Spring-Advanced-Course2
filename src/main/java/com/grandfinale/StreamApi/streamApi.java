package com.grandfinale.StreamApi;

import java.util.Arrays;
import java.util.List;

public class streamApi {

    public void stream(){
        List<Integer> nums = Arrays.asList(1,2,5,4,2);

        nums.forEach(n -> System.out.println(n));
    }
}
