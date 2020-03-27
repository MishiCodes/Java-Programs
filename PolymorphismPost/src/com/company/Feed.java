package com.company;

import java.util.List;

public class Feed {
    private List<Post> posts;

    public void DisplayPosts() {
        for (Post post : posts){
            post.display();
        }
    }

    public static void main(String[] args) {
	    SimplePost p1 = new SimplePost();
	    p1.display();

        PhotoPost p2 = new PhotoPost();
        p2.display();

        Post p3 = new VideoPost();
        p3.display();

        Post p4 = new TextPost();
        p4.display();
    }
}
