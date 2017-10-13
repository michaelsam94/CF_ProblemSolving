import java.util.*;

public class A520 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPangram = true;
        String res;
        List<Character> characters = new ArrayList<>();
        Set<Character> charsInInput = new HashSet<>();


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
        characters.add('a');
        characters.add('s');
        characters.add('d');
        characters.add('f');
        characters.add('g');
        characters.add('h');
        characters.add('j');
        characters.add('k');
        characters.add('l');
        characters.add('z');
        characters.add('x');
        characters.add('c');
        characters.add('v');
        characters.add('b');
        characters.add('n');
        characters.add('m');



        int x = input.nextInt();
        String s = input.next();

        int index;
        for (char c : s.toCharArray()) {
            index = characters.indexOf(Character.toLowerCase(c));
            if(index != -1) {
                charsInInput.add(Character.toLowerCase(c));
            }
        }



        res = charsInInput.size() == 26 ? "YES" : "NO";


        System.out.println(res);
    }
}
