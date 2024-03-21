package org.example.generic;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class GenericInt implements Generic<Integer> {

    @Override
    public void sampleGenericMethod(Integer param) {
        System.out.println(param);
    }

    @Override
    public void sampleGenericCollectionMethod(Collection<Integer> param) {
        param.forEach(System.out::println);
    }
}
