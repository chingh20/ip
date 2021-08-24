public class Deadline extends Task{
    protected String deadline;

    Deadline(String description) {
        super(description);
        this.deadline = "";
    }

    Deadline(String description, boolean isDone) {
        super(description, isDone);
        this.deadline = "";
    }

    Deadline(String description, boolean isDone, String deadline) {
        super(description, isDone);
        this.deadline = deadline;
    }

    Deadline(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return this.deadline;
    }

    @Override
    public String saveTaskToFile() {
        return typeOfTask() + "||" + getStatusIcon() + "||" + this.getDescription() + "||" + this.getDeadline();
    }

    @Override
    public String typeOfTask() {
        return "D";
    }

    @Override
    public String toString() {
        return String.format("[%s][%s] %s (by: %s)", this.typeOfTask(),
                this.getStatusIcon(), this.getDescription(), this.getDeadline());
    }
}
