package com.java.test2;

public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch);

    // Извлечь символ из очереди
    char get();

    default void reset(){
        return;
    }

}
