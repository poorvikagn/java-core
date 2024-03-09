package com.learning.core.Day5;

import java.util.Comparator;
import java.util.TreeSet;
class Person {
		    private int id;
		    private String name;
		    private int age;
		    private double salary;

		    public Person(int id, String name, int age, double salary) {
		        this.id = id;
		        this.name = name;
		        this.age = age;
		        this.salary = salary;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    @Override
		    public String toString() {
		        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
		    }

		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj) {
		            return true;
		        }
		        if (obj == null || getClass() != obj.getClass()) {
		            return false;
		        }
		        Person person = (Person) obj;
		        return id == person.getId();
		    }

		    @Override
		    public int hashCode() {
		        return id;
		    }

		    public static Comparator<Person> AGE_COMPARATOR = new Comparator<Person>() {
		        @Override
		        public int compare(Person p1, Person p2) {
		            return Integer.compare(p1.getAge(), p2.getAge());
		        }
		    };
		}

		public class D05P06 {
		    public static void main(String[] args) {
		        TreeSet<Person> persons = new TreeSet<>(Person.AGE_COMPARATOR);
		        persons.add(new Person(1, "John", 22, 1999.0));
		        persons.add(new Person(2, "Jane", 22, 1500.0));
		        persons.add(new Person(3, "Mary", 18, 2200.0));
		        persons.add(new Person(4, "Bob", 25, 1800.0));
		        persons.add(new Person(5, "Tom", 42, 3999.0));
		        persons.add(new Person(6, "Peter", 28, 2000.0));

		        System.out.println("Persons whose age is greater than 25:");
		        for (Person person : persons) {
		            if (person.getAge() > 25) {
		                System.out.println(person);
		            }
		        }
		    }
		    
		}

