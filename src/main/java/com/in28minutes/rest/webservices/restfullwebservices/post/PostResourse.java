package com.in28minutes.rest.webservices.restfullwebservices.post;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class PostResourse {
	//Injection de dependencia
	@Autowired 
	private PostDaoService service;
	//obtener todos los posts con el URI /users/posts
	@GetMapping("/users/posts")
	public List<Post> retrieveAllPosts(){
		return service.findAll();
	}
	@GetMapping("/users/{userId}/posts")
	public List<Post> retrieveAllPostsOfThisUser(@PathVariable int userId){
		return service.findAllPostOfThisUser(userId);
	}
	//Obtener un posts del usuario por iD
	@GetMapping("/users/{userId}/{id}")
	public Post retrievePost(@PathVariable int userId,@PathVariable int id) {
		Post post = service.findOne(userId, id);
		//en caso de no encontrar usuario con id devolver UserNotFoundException
	//	if (user == null) 
	//		throw new UserNotFoundException("id-"+id);
		return post;
	}
	//crear nuevo usuario con un body
	

}
