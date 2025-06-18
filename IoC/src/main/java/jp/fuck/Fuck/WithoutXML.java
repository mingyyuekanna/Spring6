package jp.fuck.Fuck;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan({"jp.fuk.Fuck.Dao","jp.fuck,Fuck.Service"})
public class WithoutXML {
}
