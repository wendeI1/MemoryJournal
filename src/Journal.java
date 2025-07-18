import java.util.ArrayList;
import java.util.HashMap;

public class Journal {

    private ArrayList<Memory> memories = new ArrayList<>();

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
    public ArrayList<Memory> findbyName(String name){
        ArrayList<Memory> nameResults = new ArrayList<>();

        for (Memory memory : memories){
            if (memory.getName().equalsIgnoreCase(name.toLowerCase())){
                nameResults.add(memory);
            }
        }
        return nameResults;
    }

    //Find by description
    public ArrayList<Memory> findbyDescription(String desc){
        ArrayList<Memory> descResults = new ArrayList<>();

        for (Memory memory : memories){
            if (memory.getDescription().equalsIgnoreCase(desc.toLowerCase())){
                descResults.add(memory);
            }
        }
        return descResults;
    }
    //Find based on the provided emotion
    public ArrayList<Memory> findbyEmotion(String emotion){
        ArrayList<Memory> emoResults = new ArrayList<>();

        Memory.Emotion emotion1 = Memory.Emotion.valueOf(emotion.toUpperCase());

        for (Memory memory : memories){
            if (memory.getRelatedEmotion().equals(emotion1)){
                emoResults.add(memory);
            }
        }
        for(Memory memory : emoResults){
            memory.showMemory();
        }
        return emoResults;
    }
}
