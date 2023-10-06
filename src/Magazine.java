public class Magazine extends LibraryItem{
    int issueNumber;

    public Magazine(String title, String author, int year, boolean isBorrowed, LibraryItemType itemType, int issueNumber) {
        super(title, author, year, isBorrowed, itemType);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                '}';
    }
}
