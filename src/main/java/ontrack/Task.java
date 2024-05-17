package ontrack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String title;
    private List<String> comments;
    private List<LocalDateTime> timestamps;

    public Task(String title) {
        this.title = title;
        this.comments = new ArrayList<>();
        this.timestamps = new ArrayList<>();
    }

    public void addComment(String text) {
        this.comments.add(text);
        this.timestamps.add(LocalDateTime.now());
    }

    public List<String> getComments() {
        return comments;
    }

    public List<LocalDateTime> getTimestamps() {
        return timestamps;
    }

   
}
