package ontrack;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

public class TaskTest {

	@Test
    public void testSuccessAddCommentAndPrintTimestamp() {
        Task task = new Task("Task 1");
        task.addComment("Hi Ma'am please check my task");
        List<String> comments = task.getComments();
        assertEquals(1, comments.size());
        assertEquals("Hi Ma'am please check my task", comments.get(0));
        System.out.println("Task Message: " + comments);

        assertNotNull(task.getTimestamps().get(0));
        LocalDateTime timestamp = task.getTimestamps().get(0);
        System.out.println("Timestamp: " + timestamp);
    }

	@Test
    public void testfailAddCommentAndPrintTimestamp() {
        Task task = new Task("Task 2");
        task.addComment("Hi Ma'am please check my task its done from my side");
        List<String> comments = task.getComments();
        assertEquals(1, comments.size());
        assertEquals("Hi Ma'am please check my task its done from my side", comments.get(0));
        System.out.println("Task Message: " + comments);

        assertNotNull(task.getTimestamps().get(0));
        LocalDateTime timestamp = task.getTimestamps().get(0);
        System.out.println("Timestamp: " + timestamp);
    }
}