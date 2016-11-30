package it.ubiquity.spring.gg3aspectj;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import it.ubiquity.spring.gg3aop.ClasseEsempio;

public class App {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AspectjConfig.class); 
		
		// esempio di scan di un packege senza @Component
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx, false);
		scanner.addIncludeFilter(new TypeFilter() {
			public boolean match(MetadataReader arg0, MetadataReaderFactory arg1) throws IOException {
				return true;
			}
		});
		scanner.scan("it.ubiquity.spring.gg3aop");
		ctx.refresh();
		// da qui in poi....
		// ctx.getBean(classe del packge it.ubiquity)
		
		ClasseEsempio ce = ctx.getBean(ClasseEsempio.class);
		ce.met1();
		
		AdvisedClass ac = ctx.getBean(AdvisedClass.class);
		ac.doSomething();
		ac.deleteSomething();
		ac.updateSomething();
		
		Classe2 c2 = ctx.getBean(Classe2.class);
		c2.metodoX();
		c2.metodoY();
	}

}
