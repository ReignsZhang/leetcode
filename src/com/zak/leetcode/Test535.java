package com.zak.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test535 {
    Map<String, String> shortAndLongMap = new HashMap<>();
    Integer index = 0;

    public String encode(String longUrl){
        String shortUrl = "http://tinyurl.com/" + index;
        shortAndLongMap.put(shortUrl, longUrl);
        index++;
        return shortUrl;
    }

    public String decode(String shortUrl){
        String longUrl = shortAndLongMap.get(shortUrl);
        return longUrl;
    }
}
