package org.example.generic;

import java.util.Collection;

public interface Generic<T> {
    void sampleGenericMethod(T param);

    void sampleGenericCollectionMethod(Collection<T> param);
}
