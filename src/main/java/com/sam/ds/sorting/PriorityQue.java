package com.sam.ds.sorting;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}


public class PriorityQue {


  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Comparator<Person> com = Comparator.comparing(Person::getAge).reversed();
    Queue<Person> persons = new PriorityQueue<Person>(com);
    persons.offer(new Person("a", 80));
    persons.offer(new Person("b", 40));
    persons.offer(new Person("c", 90));
   
    persons.stream().forEach(p -> System.out.println(p.getAge()));

  }

}
