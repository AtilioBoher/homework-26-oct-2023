public class Exercise1 {
    public static void main(String[] args) {
        if (args.length == 3) {
            System.out.printf("Hi everyone! My name is %s, I'm %s years old and I'm from %s.",
                    args[0], args[1], args[2]);
        }
        else if (args.length == 1 && args[0].equals("-help")){

            System.out.println("""
                    This program needs three arguments.
                        1) The user's name
                        2) The user's age
                        3) The user's country name

                    Example:
                        $ java Exercise1 Atilio 26 Argentina
                        Hi everyone! My name is Atilio, I'm 26 years old and I'm from Argentina.""");
        }
        else {
            System.out.println("Error: wrong arguments. Use the -help flag to see instructions");
        }
    }
}