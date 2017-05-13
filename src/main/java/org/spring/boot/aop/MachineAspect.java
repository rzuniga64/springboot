package org.spring.boot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 *  MachineAspect class.
 */
@Component
@Aspect
public class MachineAspect {

    /** IMachine reference. */
    @DeclareParents(value = "org.spring.boot.aop.*",
            defaultImpl = Machine.class)
    private IMachine machine;

    /**
     * runMachine method.
     * @param jp jp
     */
    @Around("within(org.spring.boot.aop.*)")
    public void runMachine(final ProceedingJoinPoint jp) {

        System.out.println("Running ...");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.getMessage();
        }
            System.out.println("... completed.");
    }
}

