
import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<LibraryItem> libraryItems;

    public Library() {
        libraryItems = new ArrayList<>();
    }

    public void addItem(LibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }

    public void borrowItem(LibraryItem libraryItem) {
        for (LibraryItem item : libraryItems) {
            if (item.equals(libraryItem) && !item.isBorrowed()) {
                item.isBorrowed();
                return;
            }
        }
    }


    public void displayAvailableItems() {
        for (LibraryItem item : libraryItems) {
            if (!item.isBorrowed()) {
                System.out.println(item);
            }
        }
    }

    public void displayBorrowedItems() {
        for (LibraryItem item : libraryItems) {
            if (item.isBorrowed()) {
                System.out.println(item);
            }
        }
    }
}
