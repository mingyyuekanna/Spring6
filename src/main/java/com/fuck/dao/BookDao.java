package com.fuck.dao;

import java.util.HashMap;
import java.util.Map;

public class BookDao {
    // key: 书籍ID, value: 库存数量
    private Map<Integer, Integer> bookStock = new HashMap<>();

    public BookDao() {
        // 初始化数据
        bookStock.put(101, 3); // 《三体》剩余3本
        bookStock.put(102, 1); // 《活着》剩余1本
    }

    // 查询库存（返回-1表示书不存在）
    public int getStock(int bookId) {
        // 请实现
        return bookStock.getOrDefault(bookId,-1);
    }

    // 借书（库存-1）
    public void borrowBook(int bookId) {
        int currentStock = getStock(bookId);
        if(currentStock==-1){
            throw new RuntimeException("书籍不存在//");
        }
        if (currentStock <=0 ){
            throw new RuntimeException("库存不足!!");
        }
        bookStock.put(bookId,currentStock-1);
    }

    // 还书（库存+1）
    public void returnBook(int bookId) {
        // 请实现
        if (!bookStock.containsKey(bookId)){
            throw new RuntimeException("书籍不存在");
        }
        bookStock.put(bookId,bookStock.get(bookId)+1);
    }
}