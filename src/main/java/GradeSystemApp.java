import com.fuck.service.LibraryService;
import com.fuck.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GradeSystemApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentService serviceDao = applicationContext.getBean("serviceDao", StudentService.class);

        serviceDao.printAllStudents();

        serviceDao.updateScore(101,99);

        System.out.println("after update...");

        serviceDao.printAllStudents();


    }

//    @Test

    public void testBook(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        LibraryService libraryService = applicationContext.getBean("libraryService", LibraryService.class);

        String borrow = libraryService.borrow(101);
        System.out.println(borrow);

        System.out.println(libraryService.checkBook(102));

        System.out.println(libraryService.returnBook(101));
        System.out.println(libraryService.returnBook(101));
        System.out.println(libraryService.returnBook(101));
    }
}
