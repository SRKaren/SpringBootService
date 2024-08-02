package com.darckcode.spring.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts/1")
    public Post getPost() {
        return new Post(1, 1, "Sample Title", "This is a sample body.");
    }

    static class Post {
        private int userId;
        private int id;
        private String title;
        private String body;

        public Post(int userId, int id, String title, String body) {
            this.userId = userId;
            this.id = id;
            this.title = title;
            this.body = body;
        }

        // Getters y Setters
        public int getUserId() { return userId; }
        public void setUserId(int userId) { this.userId = userId; }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getBody() { return body; }
        public void setBody(String body) { this.body = body; }
    }
}
