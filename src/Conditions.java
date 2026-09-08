public static Scanner scanner = new Scanner(System.in);

public static void IfElse()
{
    String oldPassword = "12345678";

    IO.print("Введите пароль: ");

    String password = scanner.nextLine();

    if (password.length() <= 5 || password.length() >= 50)
        IO.println("Длина пароля меня не удовлетворяет");

    else if (password.equals("password") || password.equals(oldPassword) || password.contains("$"))
        IO.println("Ваш пароль слишком прост");

    else if (!password.contains(" ") && password.matches(".*\\d.*") && !password.equals(password.toLowerCase()) && password.matches(".*[!@#%^&*()_+\\-=\\[\\]{};:'\",.<>?/].*"))
        IO.println("Пойдет");

    else IO.println("хз что не так");
}

public static void Ternary()
{
    int num = scanner.nextInt();
    scanner.nextLine();

    String res = (num % 2 == 0) ? "четное" : "нечетное";
    IO.println("Число " + res);
}

void main()
{
    IO.println("""
            1 - Операторы условия if/else if/else с двумя, тремя и четырьмя операндами с использованием операций и/или
            2 - Тернарный оператор условия
            switch/case c break и default - это само меню
            0 - Выход""");

    int n = scanner.nextInt();
    scanner.nextLine();

    switch (n) {
        case 1:
            IfElse();
            main();

        case 2:
            Ternary();
            main();

        case 0:
            break;

        default:
            IO.println("Такого нет в меню");

    }
}
