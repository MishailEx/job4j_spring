package di;

public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value, String value2) {
        store.add(value);
        consoleInput.askStr(value2);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

}
