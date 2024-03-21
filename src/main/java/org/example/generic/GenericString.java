package org.example.generic;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class GenericString implements Generic<String> {

    @Override
    public void sampleGenericMethod(String param) {
        System.out.println(param);
    }

    @Override
    public void sampleGenericCollectionMethod(Collection<String> param) {
        param.forEach(System.out::println);
    }
}
