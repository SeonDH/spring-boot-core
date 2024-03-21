package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.conditional.beans.bean.BeanBean;
import org.example.conditional.beans.bean.BeanConditionBean;
import org.example.conditional.beans.classes.ClassBean;
import org.example.conditional.beans.classes.ClassConditionalBean;
import org.example.conditional.beans.property.PropertyBean;
import org.example.conditional.beans.property.PropertyConditionalBean;
import org.example.conditional.beans.resource.ResourceBean;
import org.example.conditional.beans.resource.ResourceConditionBean;
import org.example.conditional.beans.web.WebApplicationBean;
import org.example.conditional.beans.web.WebApplicationConditionBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class AppStartupRunner implements ApplicationRunner {

    private final BeanConditionBean beanConditionBean;
    private final ClassConditionalBean classConditionalBean;
    private final PropertyConditionalBean propertyConditionalBean;
    private final ResourceConditionBean resourceConditionBean;
    private final WebApplicationConditionBean webApplicationConditionBean;

    //TODO-1 목표: AppStartupRunner 클래스와 Bean 선언 클래스는 변경하지 않고, Exception 이 나지 않도록 수정한다.
    @Override
    public void run(ApplicationArguments args) {

        System.out.println(beanConditionBean.getClass().getCanonicalName());
        System.out.println(classConditionalBean.getClass().getCanonicalName());
        System.out.println(propertyConditionalBean.getClass().getCanonicalName());
        System.out.println(resourceConditionBean.getClass().getCanonicalName());
        System.out.println(webApplicationConditionBean.getClass().getCanonicalName());

        System.out.println("====================");

        //TODO-2 특정 빈이 활성화되면 같이 활성화 된다.
        if (!(beanConditionBean instanceof BeanBean)) {
            throw new RuntimeException();
        }

        //TODO-3 특정 경로에 클래스가 생성되면 같이 활성화 된다.
        if (!(classConditionalBean instanceof ClassBean)) {
            throw new RuntimeException();
        }

        //TODO-4 특정 property 가 true 가 되면 활성화 된다. hint ** application.properties **
        if (!(propertyConditionalBean instanceof PropertyBean)) {
            throw new RuntimeException();
        }

        //TODO-5 특정 경로에 파일이 있으면 확성화 된다. ** hint resources **
        if (!(resourceConditionBean instanceof ResourceBean)) {
            throw new RuntimeException();
        }

        //TODO-6 웹어플리케이션에서 활성화 된다. hint. ** 자동 구성 **
        if (!(webApplicationConditionBean instanceof WebApplicationBean)) {
            throw new RuntimeException();
        }

        System.out.println("perfect");
    }
}