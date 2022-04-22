package com.santosh.relationship.isa;

public class Engine {

  String enginePower;
  String enginModel;

  public Engine() {
  }

  public Engine(String enginePower, String enginModel) {
    this.enginePower = enginePower;
    this.enginModel = enginModel;
  }

  public String getEnginePower() {
    return enginePower;
  }

  public void setEnginePower(String enginePower) {
    this.enginePower = enginePower;
  }

  public String getEnginModel() {
    return enginModel;
  }

  public void setEnginModel(String enginModel) {
    this.enginModel = enginModel;
  }

  @Override
  public String toString() {
    return "Engine{" +
        "enginePower='" + enginePower + '\'' +
        ", enginModel='" + enginModel + '\'' +
        '}';
  }
}
