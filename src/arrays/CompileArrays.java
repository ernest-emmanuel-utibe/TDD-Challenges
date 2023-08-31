package arrays;

public class CompileArrays {
    public static int returnIntegerAndString(){
        int[] ages = {17, 27, 39, 45, 75};
        boolean[] students = new boolean[5];
        students[0] = true;
        students[1] = false;
        students[2] = false;
        students[3] = true;
        students[4] = false;

        System.out.println(ages);
        System.out.println(students);

        String message = "Hello World!";
        message = message.toUpperCase();
        message = message.toLowerCase();
        message = message.concat(" Lovely day, isn't it?");

        message = message.replace('o', 'a');
        message = message.replace('e', '3');
        message = message.replace('r', 'v');

        char[] characters = message.toCharArray();
        for(char c : characters) {
            System.out.print(c);
        }

        return -1;

    }
}
