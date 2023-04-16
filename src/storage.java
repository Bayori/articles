import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class storage {
    private int id; // ����; ID
    private String title; // ���������
    private String content; // ����������
    private List<String> tags; // ���� (��� ��� ������� ����, �.�. �� ����� ���� ���������)
    private Date date; // ����
    private boolean isPublished; // ������

    // �����������
    public storage(int id, String title, String content, List<String> tags, Date date, boolean isPublished) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.date = date;
        this.isPublished = isPublished;
    }

    // �������/������� ��� ������� ����
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

    // ��������������� � json. ���� ����� ���������� �������������
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
