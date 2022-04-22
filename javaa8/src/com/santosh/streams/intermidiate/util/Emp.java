package com.santosh.streams.intermidiate.util;

public class Emp {

  private  Long id;
  private  String name;

  public Emp() {
  }

  public Long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Emp{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Emp(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}
