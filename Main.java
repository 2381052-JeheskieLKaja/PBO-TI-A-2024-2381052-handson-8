import repositories.TodoListRepositoryImpl;
import services.TodoListServicesImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServicesImpl todoListService = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}
