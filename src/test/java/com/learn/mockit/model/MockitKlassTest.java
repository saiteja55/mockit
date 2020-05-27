package com.learn.mockit.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

/**
 * Created by Saiteja on 2020-05-26
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitKlassTest {

  @InjectMocks
  private MockitKlass mockitKlass; //Mocking Map inside this class

  @Mock
  private Map<String, String> mockMap;

  @Test
  public void test() {
    Mockito.when(mockMap.get(Mockito.anyString())).thenReturn("Test");
    Assert.assertEquals("Test", mockitKlass.getValue("TestMe"));
  }

}