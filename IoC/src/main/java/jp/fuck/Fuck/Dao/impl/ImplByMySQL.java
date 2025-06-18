package jp.fuck.Fuck.Dao.impl;

import jp.fuck.Fuck.Dao.StudentDao;
import org.springframework.stereotype.Repository;

//@Repository
public class ImplByMySQL implements StudentDao  {
    @Override
    public void deleteById() {
        System.out.println("使用MySQL进行数据操作");
    }
}
