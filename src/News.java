import java.time.LocalDateTime;

public class News {
    private String source;
    private String category;
    private String message;
    private int length;
    private LocalDateTime time;

    public News(String source, String category, String message, int length, LocalDateTime time) {
        this.source = source;
        this.category = category;
        this.message = message;
        this.length = length;
        this.time = time;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "News: " +
                "source='" + source + '\'' +
                ", category='" + category + '\'' +
                ", message='" + message + '\'' +
                ", length=" + length +
                ", time=" + time +
                '}';
    }
}
