package com.stream.find.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "sohan", 40000));
		list.add(new Employee(102, "sandip", 45000));
		list.add(new Employee(103, "sagar", 55000));
		list.add(new Employee(104, "samadhan", 50000));
		list.add(new Employee(105, "shantanu", 35000));

		Optional<Employee> emp = list.stream().findFirst();
		emp.ifPresent(e -> System.out.println(e));
	}
}
