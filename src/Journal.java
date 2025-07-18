import java.util.ArrayList;

public class Journal {

    private final ArrayList<Memory> memories = new ArrayList<>();

    //Add a memory
    public void addMemory(Memory memory){
        memories.add(memory);
    }

    //Remove a memory
    public void removeMemory(Memory memory){
        memories.remove(memory);
    }

    public void showMemories(){
        for (Memory memory : memories){
            memory.showMemory();
        }
    }

    //Find by name
    public void findbyName(String name){
        ArrayList<Memory> nameResults = new ArrayList<>();

        for (Memory memory : memories) {
            if (memory.getName().equalsIgnoreCase(name.toLowerCase())) {
                    nameResults.add(memory);
            }
        }
        if (nameResults.isEmpty()){
            System.out.println("MEMORIES NAMED " + name.toUpperCase() + " NOT FOUND.");
        }else {
            System.out.println("MEMORIES NAMED " + name.toUpperCase());
            for (Memory memory : nameResults) {
                memory.showMemory();
            }
        }
    }

    //Find by description
    public void findbyDescription(String desc){
        ArrayList<Memory> descResults = new ArrayList<>();

        for (Memory memory : memories){
            if (memory.getDescription().equalsIgnoreCase(desc.toLowerCase())){
                descResults.add(memory);
            }
        }
    }
    //Find based on the provided emotion
    public void findbyEmotion(String emotion){
        ArrayList<Memory> emoResults = new ArrayList<>();

        try {
            Memory.Emotion emotion1 = Memory.Emotion.valueOf(emotion.toUpperCase());

            for (Memory memory : memories) {
                if (memory.getRelatedEmotion().equals(emotion1)) {
                    emoResults.add(memory);
                }
            }
            System.out.println("MEMORIES RELATED TO " + emotion1);
            for (Memory memory : emoResults) {
                memory.showMemory();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid emotion!");
            System.out.println("Emotions: Happines, sadness, nostalgia, anger");
        }
    }
}
