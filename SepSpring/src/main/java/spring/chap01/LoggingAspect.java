package spring.chap01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


public class LoggingAspect {

	private Log log = LogFactory.getLog(getClass());
	
	
	public void publicMethod(){}
	

	private Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("��� ����");
		StopWatch stopWatch = new StopWatch();
		try{
			stopWatch.start();
			Object retValue = joinPoint.proceed();
			//proceed() :  ������ �����Ű���� �޼��� ����
			return retValue;
		} catch(Throwable e){
			throw e;
		} finally{
			stopWatch.stop();
			log.info("��� ����");
			log.info(joinPoint.getSignature().getName()+"�޼��� ���� �ð� :" + stopWatch.getTotalTimeMillis());
			//joinPoint.getSignature().getName() : ������ �����Ų �޼���
			
		}
	}
}
