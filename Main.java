import config.Database;
import repositories.TodoListRepositoryDbImpl;
import services.TodoListServicesImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("mydatabase", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepositoryDbImpl todoListRepository = new TodoListRepositoryDbImpl(database);
        TodoListServicesImpl todoListService = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}
