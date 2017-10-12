package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskChoice) {

        switch (taskChoice) {
            case SHOPPING:
                return new ShoppingTask("Book", "Java head first", 1.0);
            case PAINTING:
                return new PaintingTask("Wall", "White", "White colour paint");
            case DRIVING:
                return new DrivingTask("Night driving", "around city", "Car");
            default:
                return null;
        }
    }
}