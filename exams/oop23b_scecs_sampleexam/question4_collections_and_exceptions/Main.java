package exams.oop23b_scecs_sampleexam.question4_collections_and_exceptions;

public class Main
{
    public static void main(String[] args)
    {
        Pair<String, Integer> pair1 = new Pair<>("A", 1);
        Pair<String, Integer> pair2 = new Pair<>("B", 2);
        Pair<String, Integer> pair3 = new Pair<>("C", 3);

        Function<String, Integer> function = new Function<>();
        function.addPair(pair1);
        function.addPair(pair2);
        function.addPair(pair3);

        String input = "B";
        Integer result = function.evaluate(input);
        System.out.println("The result of evaluating '" + input + "' is: " + result);
        //The result of evaluating 'B' is: 2
    }
}
