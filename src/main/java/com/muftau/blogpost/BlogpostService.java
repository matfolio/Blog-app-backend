package com.muftau.blogpost;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogpostService{
	
	@Autowired
	private BlogpostRepository postRepo;
	
	private List<Post> posts;
	
	public List<Post> getAllPosts(){
		posts = new ArrayList<>();
		postRepo.findAll().forEach(posts::add);
		return posts;
	}
	
	public void addPost(Post post) {
		postRepo.save(post);
	}
	
	public void deletePost(String id) {
		postRepo.deleteById(id);
	}
	
	


}
