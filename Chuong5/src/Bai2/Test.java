package Bai2;

public class Test {
	public static void main(String[] args) {
		Author author1 = new Author("Author1", "author1@email.com");
		Author author2 = new Author("Author2", "author2@email.com");

		Author[] authors1 = { author1 };
		Author[] authors2 = { author1, author2 };

		Book book1 = new Book("Book1", 150000, authors1);
		Book book2 = new Book("Book2", 200000, authors2);
		Book book3 = new Book("Book3", 200000, authors2);

		int count = countBooksByPrice(200000, book1, book2, book3);

		if (count > 0) {
			System.out.println("Có " + count + " cuốn sách có giá 200000.");
		} else {
			System.out.println("Không có cuốn sách nào có giá 200000.");
		}

	}

	private static int countBooksByPrice(double targetPrice, Book... books) {
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() == targetPrice) {
				count++;
			}
		}
		return count;
	}
}
