package com.learn.mockit.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Saiteja on 2020-05-26
 */
public class MockitKlass {

  private Map<String, String> mockMap;

  public MockitKlass() {
    mockMap = new HashMap<>();
  }

  public String getValue(String key) {
    return mockMap.get(key);
  }

}
