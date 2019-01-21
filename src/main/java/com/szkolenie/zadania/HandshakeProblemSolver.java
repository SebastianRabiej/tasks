package com.szkolenie.zadania;

class HandshakeProblemSolver {

    static int result;

    public static int calculateNumberOfPeople(int numberOfHandshakes) {

        if (numberOfHandshakes > 0) {

            int a = 1;
            int b = -1;

            double delta = b * b - 4 * a * (-2 * numberOfHandshakes);

            return result = (int) (-b + Math.sqrt(delta) / (2 * a));

        }
        return result = 0;
    }

    public static int calculateNumberOfHandshakes(int numberOfPeople) {

        if (numberOfPeople >= 2) {
            return result = numberOfPeople * (numberOfPeople - 1) / 2;
        }
        return result = 0;
    }
}