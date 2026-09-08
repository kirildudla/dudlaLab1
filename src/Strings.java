import java.util.Scanner;

static Scanner scanner = new Scanner(System.in);

static void First() // Продемонстрировать: замену в строке, обрезку строки и разбиение строки на подстроки по разделителю
{
    // Замена

    IO.print("Введите текст: ");
    String input = scanner.nextLine();

    IO.print("Введите что нужно заменить на 123: ");
    String rep = scanner.nextLine();

    String newInput = input.replace(rep, "123");

    IO.println("Строка после замены: " + newInput);

    // Обрезание

    IO.print("Введите индекс, после которого нужно обрезание: ");
    int indStart = scanner.nextInt();
    scanner.nextLine();

    IO.print("Введите индекс, до которого нужно обрезание: ");
    int indEnd = scanner.nextInt();
    scanner.nextLine();

    newInput = newInput.substring(indStart, indEnd);

    IO.println("Строка после обрезания: " + newInput);

    // Разбиение

    IO.print("Введите новую строку c пробелами для разбиения на подстроки");
    input = scanner.nextLine();

    String[] shutteredString = input.split(" ");

    for (String s : shutteredString)
    {
        IO.print(s + " ");
    }
}

static void Second() //Продемонстрировать сравнение строк (и в чем отличие) через «==» equals и equalsIgnoreCase
{
    IO.print("Введите строку 1: ");
    String input1 = scanner.nextLine();

    IO.print("Введите строку 2: ");
    String input2 = scanner.nextLine();

    if (input2 == input1) // Не работает так, как надо
    {
        IO.println("Одинаковы");
    }

    else IO.println("Нет");

    if (input1.equals(input2)) IO.println("Одинаковы"); // Сравнивает строки с учетом регистра

    else IO.println("Нет");

    if (input1.equalsIgnoreCase(input2)) IO.println("Одинаковы(Без учета регистра)"); // Сравнивает без учета регистра

    else IO.println("Нет");

}

static void StringBuilder()
{
    StringBuilder sb = new StringBuilder(scanner.nextLine());

    IO.println("Длина строки: " + sb.length() + "\n" + "Предоставленный объем: " + sb.capacity());

    IO.println("Введите допольнительную строку, которую объединим с предыдущей");

    sb.append(scanner.nextLine());

    IO.println("Новая строка: " + sb);
    IO.println("Длина строки: " + sb.length() + "\n" + "Предоставленный объем: " + sb.capacity());

    sb.setLength(4);
    IO.println("Новая строка: " + sb);
    IO.println("Длина строки: " + sb.length() + "\n" + "Предоставленный объем: " + sb.capacity());
}

void main()
{
    StringBuilder();
    scanner.close();
}