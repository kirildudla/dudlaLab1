static Scanner scanner = new Scanner(System.in);
static Random random = new Random();

// Создать многомерный массив и перебрать все его элементы
static void MatrixAndCicleFor() {
    int n = 3;
    int m = 4;

    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = random.nextInt(0, 10);
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            IO.print(matrix[i][j] + " ");
        }

        IO.println();
    }
}

// Написать циклы for, while, do…while
static void While() {
    int n = random.nextInt(1, 151);
    int guess = 0;

    IO.println("Угадайте число от 0 от 150 ");

    while (guess != n || guess != 555) {
        IO.print("Гадай: ");

        guess = scanner.nextInt();
    }

    IO.println("Молодец");

}

static void DoWhile() {
    int n = 10;

    IO.println("Отсчет пошел:");

    do {
        n--;
        IO.print(n + " ");
    }

    while (n > 0);
}

static void For() {
    int n = 100;

    for (int i = 0; i < n; i++) {
        if (i == 67 || i == 52) continue;

        IO.println(n);
    }
}


void main() {
    int n = scanner.nextInt();

    switch (n) {
        case 1:
            MatrixAndCicleFor();
            main();

        case 2:
            While();
            main();

        case 3:
            DoWhile();
            main();
        case 4:
            For();
            main();
        case 0:
            break;

    }
}
