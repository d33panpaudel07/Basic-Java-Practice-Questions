package javaGenerics.basicImplementation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
    public static <I, S> List<S> fromArrayToList(I[] array, Function<I, S> mapperFunction) {
        return Arrays.stream(array)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
}
