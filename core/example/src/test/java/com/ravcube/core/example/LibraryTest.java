
package com.ravcube.core.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library library = new Library();

        assertThat(library.someLibraryMethod())
                .isTrue();
    }
}
