package di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value2) {
        store.add(consoleInput.askStr(value2));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

}
