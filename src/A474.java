import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A474 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> characters = new ArrayList<>();
        char direction = input.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        String x = input.next();


        characters.add('q');
        characters.add('w');
        characters.add('e');
        characters.add('r');
        characters.add('t');
        characters.add('y');
        characters.add('u');
        characters.add('i');
        characters.add('o');
        characters.add('p');
        characters.add('[');
        characters.add(']');
        characters.add('a');
        characters.add('s');
        characters.add('d');
        characters.add('f');
        characters.add('g');
        characters.add('h');
        characters.add('j');
        characters.add('k');
        characters.add('l');
        characters.add(';');
        characters.add('\'');
        characters.add('\\');
        characters.add('z');
        characters.add('x');
        characters.add('c');
        characters.add('v');
        characters.add('b');
        characters.add('n');
        characters.add('m');
        characters.add(',');
        characters.add('.');
        characters.add('/');


        int index;
        for (char c : x.toCharArray()){
            index = characters.indexOf(c);
            if(direction == 'R'){
                sb.append(characters.get(--index));
            } else if(direction == 'L') {
                sb.append(characters.get(++index));
            }
        }

        System.out.println(sb.toString());


    }
}
