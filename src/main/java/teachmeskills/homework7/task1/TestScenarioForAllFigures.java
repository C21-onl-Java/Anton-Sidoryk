package teachmeskills.homework7.task1;

public class TestScenarioForAllFigures {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(6, 7, 8, 7, 6);
        figures[1] = new Rectangle(8, 9);
        figures[2] = new Circle(7);
        figures[3] = new Triangle(7, 8, 9, 8, 7);
        figures[4] = new Rectangle(6, 10);

        double sumOfPerimeters = 0;
        for (Figure figure : figures) {
            sumOfPerimeters += figure.getPerimeter();
        }

        System.out.println("Sum of perimeters: " + sumOfPerimeters);
    }
}
