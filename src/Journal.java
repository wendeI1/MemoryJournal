import java.util.ArrayList;

public class Journal {
    protected User owner;
    private final ArrayList<Memory> memories = new ArrayList<>();

    protected Journal(User owner){
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    //Add a memory
    public void addMemory(Memory memory){
        memories.add(memory);
    }

    //Remove a memory
    public void removeMemory(Memory memory){
        memories.remove(memory);
    }

    public void showMemories(){
        System.out.println(" --- MEMORY JOURNAL ---");
        System.out.println("This Memory Journal belongs to " + this.owner.getName());
        for (Memory memory : memories){
            memory.showMemory();
        }
    }

    //Find by name
    public void findbyName(String name){
        ArrayList<Memory> nameResults = new ArrayList<>();

        for (Memory memory : memories) {
            if (memory.getName().contains(name.toUpperCase())) {
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
        System.out.println("--------------");
    }

    //Find by description
    public void findbyDescription(String desc){
        ArrayList<Memory> descResults = new ArrayList<>();

        for (Memory memory : memories){
            if (memory.getDescription().contains(desc.toUpperCase())){
                descResults.add(memory);
            }
        }
        for (Memory memory : descResults){
            memory.showMemory();
        }
        System.out.println("--------------");
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
            System.out.println("--------------");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid emotion!");
            System.out.println("Emotions: Happines, sadness, nostalgia, anger");
            System.out.println("--------------");
        }
    }

    public void showAbout(){
        System.out.println("This memory book belongs to " + this.owner.getName());
        System.out.println("Age: " + this.owner.getAge());
        System.out.println("Gender: " + this.owner.getGender());
        System.out.println("Memories in this book: " + this.memories.size());
        System.out.println("--------------");
    }
}
