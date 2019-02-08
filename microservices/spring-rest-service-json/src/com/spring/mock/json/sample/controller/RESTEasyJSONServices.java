package com.spring.mock.json.sample.controller;

import main.com.javacodegeeks.enterprise.rest.resteasy.model.Student;
import main.com.javacodegeeks.enterprise.rest.resteasy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


@RestController
@Path("/jsonServices")
public class RESTEasyJSONServices {


	@Autowired
	private StudentService userService;

	@GET
	@Path("/students/all")
	@Produces("application/json")
	public List<Student> getAllStudents() {
		///Student st = new Student(name, "Marco",19,12);
		return userService.getAll();
	}

//	@GET
//	@Path("/print/{name}")
//	@Produces("application/json")
//	public Student produceJSON(@PathParam("name") String name ) {
//		Student st = new Student(name, "Marco",19,12);
//		return st;
//	}
//
//	@POST
//	@Path("/send")
//	@Consumes("application/json")
//	public Response consumeJSON( Student student ) {
//		String output = student.toString();
//		return Response.status(200).entity(output).build();
//	}


}
