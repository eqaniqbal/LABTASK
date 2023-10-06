public class Book extends LibraryItem {
    int pageCount;

    public Book(String title, String author, int year, boolean isBorrowed, LibraryItemType itemType, int pageCount) {
        super(title, author, year, isBorrowed, itemType);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
