package jp.fuck.Fuck.Service;

import jakarta.annotation.Resource;
import jp.fuck.Fuck.Dao.StudentDao;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public void control(){
        studentDao.deleteById();
    }
}
