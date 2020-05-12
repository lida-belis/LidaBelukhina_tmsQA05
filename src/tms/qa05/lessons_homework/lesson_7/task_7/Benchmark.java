package tms.qa05.lessons_homework.lesson_7.task_7;

public class Benchmark {
    public static void main(String[] args) {
        String string = "";
        String word = "Wine";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        int iteration = 100_000;

        long stringTestTime = stringTest(string, iteration, word);
        System.out.println("String test time " + stringTestTime + " ms;");

        long stringBuilderTestTime = stringBuilderTest(stringBuilder, iteration, word);
        System.out.println("StringBuilder test time " + stringBuilderTestTime + " ms;");

        long stringBufferTestTime = stringBufferTest(stringBuffer, iteration, word);
        System.out.println("StringBuffer test time " + stringBufferTestTime + " ms.");
    }

    private static long stringTest(String input, int iteration, String word) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input = input + word;
        }
        Long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long stringBuilderTest(StringBuilder input, int iteration, String word) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input.append(word);
        }
        Long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long stringBufferTest(StringBuffer input, int iteration, String word) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input.append(word);
        }
        Long finish = System.currentTimeMillis();
        return finish - start;
    }
}