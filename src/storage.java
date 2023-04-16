import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class storage {
    private int id; // Поля; ID
    private String title; // Заголовок
    private String content; // Содержимое
    private List<String> tags; // Теги (Для них юзается лист, т.к. их может быть несколько)
    private Date date; // Дата
    private boolean isPublished; // Статус

    // Конструктор
    public storage(int id, String title, String content, List<String> tags, Date date, boolean isPublished) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.date = date;
        this.isPublished = isPublished;
    }

    // Геттеры/Сеттеры для каждого поля
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        this.isPublished = published;
    }

    // Конвертирование в json. Этот метод вызывается автоматически
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
