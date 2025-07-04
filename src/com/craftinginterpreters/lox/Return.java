package com.craftinginterpreters.lox;

class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        super(null, null, false, false); // Disable stack trace for performance
        this.value = value;
    }
}