import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<storage> articleList = new ArrayList<>(); // Создание списка

        // Объекты с данными
        storage article1 = new storage(1, "Статья про сыр", "Сыр - вкусно", List.of("cheese", "food"), stringToDate("2022-02-20"), true);
        storage article2 = new storage(2, "Статья о луне", "Луна - дырки", List.of("space", "moon"), stringToDate("1996-02-20"), false);
        storage article3 = new storage(3, "Статья про редкоземельные магниты", "Магниты - сильно", List.of("magnets", "ores"), stringToDate("1945-05-09"), true);
        storage article4 = new storage(4, "Гайд по C++", "C++ - круто", List.of("programming", "c++"), stringToDate("2029-01-30"), false);
        storage article5 = new storage(5, "Топ5 смешных фактов про салфетку", "Салфетки не смешные", List.of("napkins", "joke"), stringToDate("3013-09-30"), true);

        // Добавление объектов в лист
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);

        // Вывод
        System.out.println(articleList);
    }
    public static Date stringToDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
