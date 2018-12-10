package com.muftau.blogpost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BlogpostController {
	
	
	@Autowired
	private BlogpostService postService;
	
	@CrossOrigin(origins = "http://localhost:4200/posts")
	@RequestMapping("/posts")
	public List<Post> getAllPosts(){
		return postService.getAllPosts();
	}
	@CrossOrigin(origins = "http://localhost:4200/posts")
	@RequestMapping(method=RequestMethod.POST, value="/posts")
	public void addPost(@RequestBody Post post) {
		postService.addPost(post);
	}
	@CrossOrigin(origins = "http://localhost:4200/api/posts")
	@RequestMapping(method=RequestMethod.DELETE, value="/posts/{id}")
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
	}
	
}
