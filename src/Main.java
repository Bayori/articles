import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<storage> articleList = new ArrayList<>(); // �������� ������

        // ������� � �������
        storage article1 = new storage(1, "������ ��� ���", "��� - ������", List.of("cheese", "food"), new Date(105, 9, 10), true);
        storage article2 = new storage(2, "������ � ����", "���� - �����", List.of("space", "moon"), new Date(118, 0, 1), false);
        storage article3 = new storage(3, "������ ��� �������������� �������", "������� - ������", List.of("magnets", "ores"), new Date(127, 5, 15), true);
        storage article4 = new storage(4, "���� �� C++", "C++ - �����", List.of("programming", "c++"), new Date(134, 8, 22), false);
        storage article5 = new storage(5, "���5 ������� ������ ��� ��������", "�������� �� �������", List.of("napkins", "joke"), new Date(142, 2, 5), true);

        // ���������� �������� � ����
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);

        // �����
        System.out.println(articleList);
    }
}