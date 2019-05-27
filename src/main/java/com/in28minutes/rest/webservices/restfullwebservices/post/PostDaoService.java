package com.in28minutes.rest.webservices.restfullwebservices.post;
import java.util.List;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;

@Component
public class PostDaoService {
	public static int PostCount=3;
	public static List<Post> posts = new ArrayList<>();
	
	static {
		posts.add(new Post(1, 1, "Este es mi primer post",new Date()));
		posts.add(new Post(1, 2, "Este es mi segundo post",new Date()));
		posts.add(new Post(1, 3, "Este es mi tercer post",new Date()));
		
		posts.add(new Post(2, 1, "Soy el segundo usuario y este es mi primer post",new Date()));
		posts.add(new Post(2, 2, "Soy el segundo usuario y este es mi segundo post",new Date()));
		posts.add(new Post(2, 3, "Soy el segundo usuario y este es mi tercer post",new Date()));
	}
	
	public List<Post> findAll(){
		return posts;
	}
	
	public List<Post> findAllPostOfThisUser(int userId){
		List<Post> userPosts = new ArrayList<>();
		for(Post post:posts) {
			if(userId == post.getUserId()){
			userPosts.add(post);
			}
		}
		return userPosts;
	}

	public Post save(Post post) {
		if (post.getId() == null) {
			post.setId(++PostCount);
		}
		posts.add(post);
		return post;
	}
	
	public Post findOne(int userId, int id) {
		for(Post post:posts) {
			if(post.getUserId()== userId && post.getId()==id) {
				return post;
			}
		}
		return null;
	}
	
	
}
