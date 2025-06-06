package com.fuck.service;

import com.fuck.dao.BookDao;

import javax.security.auth.kerberos.KerberosTicket;

public class LibraryService {  // 请实现
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public String checkBook(int bookId){
      /*  bookDao.getStock(bookId);
        String msg= "书籍 "+bookDao.getStock(bookId)+"本";
        return msg;*/
        // 检查书籍状态
            int stock = bookDao.getStock(bookId);
            return stock == -1 ? "书籍不存在" :
                    String.format("书籍%d可借，剩余%d本", bookId, stock);
    }

    public String borrow(int bookId){
        try {
            bookDao.borrowBook(bookId);
            return String.format("借阅成功！书籍%d剩余%d本",
                    bookId, bookDao.getStock(bookId));
        }catch (RuntimeException e){
            return "借阅失败!" +e.getMessage();
        }
    }

    public String returnBook(int bookId){
        try {
            bookDao.returnBook(bookId);
            return String.format("归还成功！书籍%d剩余%d本",
                    bookId, bookDao.getStock(bookId));
        }catch (RuntimeException e){
            return "归还失败：" + e.getMessage();
        }
    }
}
