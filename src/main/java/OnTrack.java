
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnTrack {
    private Map<String, List<Task>> tasks;

    public OnTrack() {
        tasks = new HashMap<>();
        List<Task> student1Tasks = new ArrayList<>();
        student1Tasks.add(new Task("1", "Math Homework"));
        student1Tasks.add(new Task("2", "Science Project"));
        tasks.put("student1", student1Tasks);
    }

    public List<TaskSummary> getTaskInbox(String studentId) {
        List<Task> studentTasks = tasks.get(studentId);
        List<TaskSummary> taskSummaries = new ArrayList<>();
        if (studentTasks != null) {
            for (Task task : studentTasks) {
                taskSummaries.add(new TaskSummary(task.getTaskId(), task.getTitle()));
            }
        }
        return taskSummaries;
    }

    class Task {
        private String taskId;
        private String title;

        public Task(String taskId, String title) {
            this.taskId = taskId;
            this.title = title;
        }

        public String getTaskId() {
            return taskId;
        }

        public String getTitle() {
            return title;
        }
    }

    class TaskSummary {
        private String taskId;
        private String title;

        public TaskSummary(String taskId, String title) {
            this.taskId = taskId;
            this.title = title;
        }

        public String getTaskId() {
            return taskId;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TaskSummary that = (TaskSummary) o;
            return taskId.equals(that.taskId) && title.equals(that.title);
        }

        @Override
        public int hashCode() {
            return taskId.hashCode() + title.hashCode();
        }
    }
}
