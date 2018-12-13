package edu.wctc.advjava.samplebigo;
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {

            ArrayList<String> strings = new ArrayList<String>();
            strings.add("one");
            strings.add("two");
            strings.add("three");
            strings.add("four");
            strings.add("five");
            strings.add("six");
            strings.add("seven");
            strings.add("eight");
            strings.add("nine");
            strings.add("ten");

            long reference=System.nanoTime();

            //String s = firstElement(strings);
            //printElements(strings);
            //boolean b = containsDuplicate(strings);
            int f = fibonacci(10000);

            long finishm=System.nanoTime();
            System.out.println(( (double)(finishm-reference) )/1000000000.0 + " Nano Seconds");
        }

        private static String firstElement(ArrayList<String> elements) {
            return elements.get(0);
        }

        private static void printElements(ArrayList<String> elements) {
            for (String s : elements)
                System.out.println(s);
        }

        private static boolean containsDuplicate(ArrayList<String> elements) {
            for (int i = 0; i < elements.size(); i++) {
                for (int j = 0; j < elements.size(); j++) {
                    if (i == j) continue;

                    if(elements.get(i).equals(elements.get(j))) return true;
                }
            }

            return false;
        }

        private static int fibonacci(int number) {
            if (number <= 1) return number;

            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }

