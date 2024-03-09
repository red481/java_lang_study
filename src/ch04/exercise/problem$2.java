package ch04.exercise;

public class problem$2 {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = switch(grade){
            case "A", "a" -> 100;
            case "B", "b" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println(score1);
    }
}
