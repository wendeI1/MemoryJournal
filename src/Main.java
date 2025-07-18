//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        Memory memory = new Memory("Aniversario", "Minha festa de 18 anos", "happiness", 2024, 11, 13);
        //TO DO

        journal.addMemory(memory);

        journal.findbyEmotion("happiness");
    }
}