package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductTest {

    @Test
    void productCreatedCorrectly() {
        Product p = new Product("Laptop", 999.99);
        assertThat(p.getName()).isEqualTo("Laptop");
        assertThat(p.getPrice()).isEqualTo(999.99);
    }

    @Test
    void negativePrice_shouldThrowException() {
        assertThatThrownBy(() -> new Product("Laptop", -1.0))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
