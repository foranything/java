import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
    public static void main(String[] args) {

    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring/di/setting.xml");
    	
//         ExamConsole console = (ExamConsole) context.getBean("console"); // cast
    	ExamConsole console = context.getBean(ExamConsole.class); // type
        console.print();
    }
}
