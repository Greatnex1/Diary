package CHP_Diary;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class DiaryMain {
    private static  Scanner myScan = new Scanner(System.in);
    private static  Diary diaries;
//   private static User user;



    public static void main(String[] args) {
        System.out.println("Enter diary name");
        String name = myScan.next();
        diaries = new Diary(name);
        int counter = 0;
        while(counter != -1) {
        System.out.println("""
                         Welcome to your Diary App
                Press 1 to create an Entry
                Press 2 to view an Entry
                Press 3 to edit an Entry's body
                press 4 to delete an Entry
                Press 5 to view all entries
                Press 0 to exit
                """);
       int userInput = myScan.nextInt();
       if(userInput == 0){
           counter = -1;      }
       else{
           switch (userInput){
               case 1 -> {
               createEntry();
               }
               case 2 ->{
                   viewEntry();
               }
               case 3 -> {
                   editDiary();
               }
               case 4 -> {
                   deleteDiary();
               }
               case 5 ->{
                   viewAllEntries();
               }
           }
           }
       }
    }

    private static void createEntry() {
        System.out.println("Enter an Entry name :");
        String enter = myScan.next();
        System.out.println("Enter Body :");
        String body = myScan.next();
        Entry entry = new Entry(enter, body);
//        user.createDiary(diaries);
       System.out.println(entry + " Entry Created Successfully!! ");
    }

    private static  void viewEntry() {
        System.out.println("Enter Entry id");
        int id = myScan.nextInt();
        Entry entry = diaries.getIndividualEntry("id");
        System.out.println(entry);

    }
    public static void editDiary(){
//        System.out.println("Enter Diary id");
//        int id = myScan.nextInt();
          System.out.println("Enter a new Title :");
        String name = myScan.next();
        System.out.println("Enter a new body:");
        String body = myScan.next();
        diaries.editEntry( name, body);
        System.out.println(name + body + "Diary edited successfully");
    }

public static  void deleteDiary(){
    System.out.println("Enter your Diary name");
    String diary_name = myScan.next();
    System.out.println(diary_name + " Diary successfully deleted");

    diaries.deleteEntry("223");
    System.out.println("Entry successfully deleted");
}


public static void viewAllEntries(){
    ArrayList<Entry> entries = diaries.getEntries();
    for (Entry enter: entries
         ) {
        System.out.println(enter);



    }
}

}
