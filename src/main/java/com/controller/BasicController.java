package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.model.Student;
import com.service.StudeService;

/*
 * 
 * Sample Rest API
 * 
 */

@Path("/Stud")
public class BasicController {
	StudeService  service=new StudeService();
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Student> getAll(){
		StudeService  service=new StudeService();
		return service.getAllStudent();
	}
	
	@GET
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Student getEmployee(@PathParam("empNo") String empNo) {
        return service.getEmployee(empNo);
    }
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	public Student addCountry(Student country)
	{
		return service.addStudent(country);
	}
	
	 @PUT
	 @Produces(MediaType.APPLICATION_JSON)
	 public Student updateStud(Student country)
	 {
	  return service.updateStud(country);  
	 }
	 
	 @DELETE
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	 public void deleteCountry(@PathParam("id") String id)
	 {
		 service.deleteStud(id);
	  
	 }
	

}

