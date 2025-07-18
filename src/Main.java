//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        Memory memory = new Memory("Birthday", "My 18 years old party", "happiness", 2024, 11, 13);
        Memory memory1 = new Memory("End of parent's relationship", "I miss him", "sadness", 2020,10,5);

        journal.addMemory(memory);
        journal.addMemory(memory1);

        journal.findbyEmotion("happiness");
        journal.findbyEmotion("sadness");

    }
}