package CHP_Diary;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diary {
    private String name;

    private static int uid;
    private final LocalDate dateCreated = LocalDate.now();
    public ArrayList<Entry> entries = new ArrayList<>();

    public static int getUid() {
        return uid;
    }

    public static void setUid(int uid) {
        Diary.uid = uid;
    }

    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }
    private int diaryId;
    public Diary(String name){
        this.name = name;
        diaryId = uid++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createEntry(Entry newEntry){
        for(Entry e : entries){
            if(e.getTitle().equals(newEntry.getTitle())){
                throw new IllegalArgumentException("Entry already exist with same title");
            }

            }
        this.entries.add(newEntry);
        }

    public ArrayList<Entry> getEntries() {
        return entries;
    }
    public void  editEntry(String id, String body){
        Entry eToEdit = findEntry(id);
        eToEdit.setBody(body);
    }
    public Entry getIndividualEntry(String id){
        Entry foundEntry = findEntry(id);
        return foundEntry;
    }
    public void deleteEntry(String id){
        Entry entryToDelete = findEntry(id);
        entries.remove(entryToDelete);

    }
    private Entry findEntry(String id){
        int entryIndex = 1;
        for (int i = 0; i <entries.size(); i++) {
            if((entries.get(i)).getId().equals(id)){
                entryIndex = 1;
                break;
            }

        }
        if (entryIndex == -1){
            throw new IllegalArgumentException("Entry with id " + id + "not found");
        }
            return entries.get(entryIndex);
    }
}
