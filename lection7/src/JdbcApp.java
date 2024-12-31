import java.sql.*;
import java.util.Scanner;

public class JdbcApp {

    private static Connection connection;
    private static Statement statement;
    public static int id;

    public static void main(String[] args) {
        try {
            connect();
            createTableEx();
            readEx();
            checkNaughtyList();
            addNew();
            givePresents();
            newYearUpdate();
            deleteAdults();
            readEx();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    /**
     * Подключение к базе данных.
     */
    private static void connect() throws SQLException {
        System.out.println("Открывается соединение с БД");
        connection = DriverManager.getConnection("jdbc:sqlite:lection7/javadb.db");
        statement = connection.createStatement();
    }

    /**
     * Отключение от базы данных.
     */
    private static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Соединение закрыто");
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    /**
     * Создание таблицы DedMorozList.
     */
    private static void createTableEx() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS DedMorozList (\n" +
                "ID INTEGER PRIMARY KEY,\n" +
                "Name TEXT,\n" +
                "Age INTEGER,\n" +
                "Present TEXT,\n" +
                "inNaughtyList BLOB\n" +
                ");");
    }

    /**
     * Чтение всех записей в таблице DedMorozList.
     */
    private static void readEx() throws SQLException {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM DedMorozList;")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("Name") + " " +
                        rs.getInt(3) + " " + rs.getString("Present") + " " + rs.getBoolean(5));
                id = rs.getInt(1) + 1;
            }
        }
    }

    /**
     * Добавление новых записей в таблицу DedMorozList.
     */
    private static void addNew() {
        try (PreparedStatement prepInsert = connection.prepareStatement("INSERT INTO DedMorozList(ID, Name, Age, Present, inNaughtyList) VALUES(?,?,?,?,?)")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество новых записей");
            int count = sc.nextInt();
            sc.nextLine(); // "Проглотить" символ новой строки
            System.out.println("Введите записи в следующем виде:\n Name(text),\n Age(int),\n Present(text),\n inNaughtyList(true/false)");
            for (int i = 1; i <= count; i++) {
                System.out.println("Запись №" + i);
                String name = sc.nextLine();
                int age = sc.nextInt();
                sc.nextLine(); // "Проглотить" символ новой строки
                String present = sc.nextLine();
                boolean inNaughtyList = sc.nextBoolean();
                sc.nextLine(); // "Проглотить" символ новой строки
                prepInsert.setInt(1, id);
                prepInsert.setString(2, name);
                prepInsert.setInt(3, age);
                prepInsert.setString(4, present);
                prepInsert.setBoolean(5, inNaughtyList);
                prepInsert.addBatch();
                id++;
            }
            int[] result = prepInsert.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Редактирование записей в таблице DedMorozList.
     * Новые данные в колонке inNaughtyList.
     */
    private static void checkNaughtyList() {
        try (Statement statement = connection.createStatement()) {
            // Выбрать все записи из таблицы DedMorozList
            ResultSet resultSet = statement.executeQuery("SELECT * FROM DedMorozList");
            Scanner sc = new Scanner(System.in);
            int checkId = 1;
            // Пройти по каждой записи
            System.out.println("true/false?");
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                System.out.println("Плохо ли себя вел(а) " + name + " в этом году?");
                boolean newInNaughtyList = sc.nextBoolean();
                // Обновить запись с новым значением inNaughtyList
                try (PreparedStatement prepUpdate = connection.prepareStatement("UPDATE DedMorozList SET inNaughtyList = ? WHERE ID = ?")) {
                    prepUpdate.setBoolean(1, newInNaughtyList);
                    prepUpdate.setInt(2, checkId);
                    prepUpdate.executeUpdate();
                    checkId++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Выборка из таблицы DedMorozList по значению колонки inNaughtyList.
     */
    private static void givePresents() {
        try (Statement statement = connection.createStatement()) {
            // Выбрать все записи из таблицы DedMorozList
            ResultSet resultSet = statement.executeQuery("SELECT Name, Present FROM DedMorozList WHERE inNaughtyList = 0");
            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                String present = resultSet.getString("Present");
                System.out.println(name + " получил(а) " + present + " на новый год!");
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    /**
     * Обновление всех записей в таблице DedMorozList.
     * Колонка Age увеличивает значение на 1.
     */
    private static void newYearUpdate() {
        try (Statement statement = connection.createStatement()) {
            // Выбрать все записи из таблицы DedMorozList
            ResultSet resultSet = statement.executeQuery("SELECT * FROM DedMorozList");
            int checkId = 1;
            // Пройти по каждой записи
            while (resultSet.next()) {
                int age = resultSet.getInt("Age") + 1;
                // Обновить запись с новым значением Age
                try (PreparedStatement prepUpdate = connection.prepareStatement("UPDATE DedMorozList SET Age = ? WHERE ID = ?")) {
                    prepUpdate.setInt(1, age);
                    prepUpdate.setInt(2, checkId);
                    prepUpdate.executeUpdate();
                    checkId++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Выборочное удалиние записей из таблицы DedMorozList, если колонка Age >= 18.
     */
    private static void deleteAdults() throws SQLException {
        statement.executeUpdate("DELETE FROM DedMorozList WHERE Age >= 18;");
    }

}