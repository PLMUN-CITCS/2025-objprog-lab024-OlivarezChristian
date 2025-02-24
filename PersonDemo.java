class Person{
  String name;
  int age;

//Constructors with args
 public  Person(String name, int age){
  this.name = name;
  this.age = age;
  }
//Constructor no args
  public Person(){
    this.name = "Unknown";
    this.age = 0;
  }
//Display
  public void displayPerson(){
    System.out.println("Name: " +  name + ", Age: " + age);
  }
}

public class PersonDemo{
  public static void main(String[] args) {
      Person person1 = new Person("bob", 30);
      Person person2 = new Person();

      person1.displayPerson();
      person2.displayPerson();

  }
}