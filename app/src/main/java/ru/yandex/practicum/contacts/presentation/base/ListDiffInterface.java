package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T>{

    public boolean theSameAs(T other);
    public boolean equals(Object other);
}
