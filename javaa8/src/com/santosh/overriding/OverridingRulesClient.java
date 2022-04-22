package com.santosh.overriding;

import java.io.IOException;

public class OverridingRulesClient extends  Student{

  @Override
 public void show() throws RuntimeException {
    System.out.println("method inside of overiding...");  }


  public static void main(String[] args) throws IOException {
OverridingRulesClient ov =new OverridingRulesClient();
ov.show();
  }
}
