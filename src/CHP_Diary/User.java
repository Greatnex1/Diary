package CHP_Diary;

import java.util.ArrayList;

public class User {
    //creating instance variable for class User
    private static int user_id;
    private int uid;


    private ArrayList<Diary> diary; //declaring a reference a variable object of Diary in Arraylist

    public User() {
        user_id = uid++;

    }
    public static int getUser_id() {
        return user_id;
    }

    public static void setUser_id(int user_id) {
        User.user_id = user_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public void createDiary(Diary diaries) {
        diary.add(diaries);
    }

    public Diary viewDiary(int diaryId) {
        return diary.get(diaryId - 1);


    }

    public ArrayList<Diary> viewAllDiaries() {
        return diary;
    }

    public void editDiary(int d_id, String brandDiary) {
        for (Diary diary1 : diary) {
            if (diary1.getDiaryId() == d_id) {
                diary1.setName(brandDiary);
            }

        }
    }

    public void deleteDiary(int diaryId) {
        for (int i = 0; i < diary.size(); i++) {
            Diary diary1 = diary.get(i);
            if (diary1.getDiaryId() == diaryId) {
                diary.remove(i);

                break;
            }

        }

    }

    public void createEntry(Diary newDiary) {
        diary.add(newDiary);
    }
}
