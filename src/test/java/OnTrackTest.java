import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OnTrackTest {
    private OnTrack onTrack;

    @BeforeEach
    public void setUp() {
        onTrack = new OnTrack();
    }

    @Test
    public void testGetTaskInbox() {
        List<OnTrack.TaskSummary> expected = new ArrayList<>();
        expected.add(onTrack.new TaskSummary("1", "Math Homework"));
        expected.add(onTrack.new TaskSummary("2", "Science Project"));

        List<OnTrack.TaskSummary> result = onTrack.getTaskInbox("student1");

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }
}
