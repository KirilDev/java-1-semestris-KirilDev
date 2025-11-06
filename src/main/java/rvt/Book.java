package rvt;

class Book {
    String title; 
    String author; 
    int pages;
    // Konstruktoru metode šeit
    Book(String title, String author, int pages) {
    // aizpildi konstruktoru
    this.title = title;
    this.author = author;
    this.pages = pages;
}

    // Metode, kas izvada informāciju par grāmatu
    void showInfo() {
    // aizpildi šo metodi
   System.out.println("The book is  " + title + ", by author " + author + ", has " + pages + " pages.");
}

    public static void main(String[] args) {
        Book book1 = new Book("Core Java(TM), Volume I--Fundamentals", "Cay S. Horstmann", 1200);
        Book book2 = new Book("Dead Note. Book 1", "Tsugumi Ohba", 200);

    // Pārbaudi metodi showInfo() šeit
    book1.showInfo();
    book2.showInfo();
    } 

}
