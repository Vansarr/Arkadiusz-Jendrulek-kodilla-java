package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("shopping", "pizzas", 3.0);
            case PAINTING:
                return new PaintingTask("painting", "colorful", "everything");
            case DRIVING:
                return new DrivingTask("driving", "over wild blue yonder", "imagination");
            default:
                return null;
        }
    }
}
