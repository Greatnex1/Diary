package CHP_Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class EntryTest {
Entry entries;
    @BeforeEach
    void setUp() {
        entries = new Entry("22345","West","Well");
    }
    @Test
    void testEntryCanBeCreated(){
        assertNotNull(entries);
    }
@Test
    void testDiaryHasABody(){
        entries.setBody("Willie");
        assertEquals("Willie", entries.getBody());
}
@Test
    void testEntriesHasAnId(){
      assertEquals("22345", entries.getId());


}
}