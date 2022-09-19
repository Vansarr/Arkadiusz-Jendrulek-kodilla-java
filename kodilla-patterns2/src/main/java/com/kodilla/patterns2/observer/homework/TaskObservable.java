package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface TaskObservable {
    void registerTaskObserver(TaskObserver observer);
    void notifyTaskObservers();
    void removeTaskObserver(TaskObserver observer);
}
