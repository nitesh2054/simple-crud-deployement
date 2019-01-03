package com.nitesh.practise.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

	private String name;
	private int age;
	private String clg;
	public Student() {
		
	}

	public Student(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.clg = builder.clg;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getClg() {
		return clg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", clg=" + clg + "]";
	}

	public static class Builder {
		private String name;
		private int age;
		private String clg;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder clg(String clg) {
			this.clg = clg;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}
}
