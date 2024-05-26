import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void TestZaNullLista() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(null, 200);
        });
        assertEquals("allItems list can't be null!", exception.getMessage());
    }

    @Test
    void TestNemaIme() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("", "203193", 100, 0));
        assertTrue(SILab2.checkCart(items, 100));
        assertEquals("unknown", items.get(0).getName());
    }

    @Test
    void TestGresenBarkod() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Marija", "203193Marija", 100, 0));
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items, 200);
        });
        assertEquals("Invalid character in item barcode!", exception.getMessage());
    }

    @Test
    void TestPopust() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Marija", "203193", 100, 0.5));
        assertTrue(SILab2.checkCart(items, 200));
    }

    @Test
    void TestPopustPoseben() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Marija", "0203193", 100, 0.5));
        assertTrue(SILab2.checkCart(items, 200));
    }



    @Test
    void TestTotalnaSumaPogolema() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Marija", "203193", 100, 0));
        assertFalse(SILab2.checkCart(items, 200));
    }

    @Test
    void TestTotalnaSumapomala() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Marija", "203193", 200, 0));
        assertTrue(SILab2.checkCart(items, 500));
    }


}
