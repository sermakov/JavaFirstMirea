package ru.mirea.task2.opt3;

public class Book {
    private Integer pages;
    private Integer currentPage;
    private String bookTitle;
    private boolean readyRead;
    private Integer timesRead;

    Book(String bookTitle, Integer pages) {
        this.setBookTitle(bookTitle);
        this.setPages(pages);
        this.timesRead = 0;
        this.close();
    }

    Book(String bookTitle)  {
        this(bookTitle, 320);
    }

    Book(Integer pages) {
        this("1984", pages);
    }

    Book()  {
        this("1984", 320);
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Integer getTimesRead() {
        return timesRead;
    }

    public boolean isReadyRead() {
        return readyRead;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle != "") {
            this.bookTitle = bookTitle;
            return;
        }
        this.bookTitle = "1984";
    }

    public void setPages(Integer pages) {
        if (pages > 0)  {
            this.pages = pages;
            return;
        }
        this.pages = 320;
    }

    public void open()  {
        this.readyRead = true;
        this.currentPage = 1;
    }

    public void close() {
        this.readyRead = false;
        this.currentPage = 0;
    }

    public boolean choosePage(Integer page) {
        if (this.readyRead) {
            if  (page > 0 && page <= this.pages) {
                this.currentPage = page;
                return true;
            }
        }
        return false;
    }

    public boolean read(Integer pages) {
        if (this.readyRead)  {
            if (pages >= 0) {
                this.currentPage += (pages - 1);
                while (this.currentPage >= this.pages)  {
                    this.timesRead++;
                    this.currentPage = this.currentPage - this.pages;
                }
                if (this.currentPage == 0)  {
                    this.currentPage++;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()    {
        String status = "Название книги: " + this.bookTitle + "\nКоличество страниц: " +
                this.pages + "\nКнига прочитана " + this.timesRead + " раз";
        if (this.readyRead)     {
            status += "\nТекущая страница: " + this.currentPage + "\nКнига открыта";
            return status;
        }
        status += "\nКнига закрыта";
        return status;
    }
}
