package SoftUniJavaOOP.ExamPreparationOOP.climbers.handball;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
