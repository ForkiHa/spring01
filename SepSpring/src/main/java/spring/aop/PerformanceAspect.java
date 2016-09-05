package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * spring.aop..*sayHello*(..))")
	public void setPointCut(){}
	
	
	//ProceedingJoinPoint
	//���ü �� ȣ��Ǵ� �޼��忡 ���� ���� �Ǵ� ���޵Ǵ� �Ķ���Ϳ� ���� ����
	@Around("setPointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		long startTime = System.nanoTime();
		System.out.println("[Log]Method before :"+ methodName + "time check start");
		Object obj = null;
		
		try{
			obj = joinPoint.proceed();
		} catch(Exception e){
			System.out.println("[Log]Method error :" + methodName);
		}
		
		long endTime = System.nanoTime();
		System.out.println("[Log]Method after :" + methodName + "time check end");
		System.out.println
		("[Log]" + methodName + "Processing time is" + (endTime-startTime)+"ns");
		return obj;
	}
}
