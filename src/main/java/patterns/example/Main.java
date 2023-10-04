package patterns.example;

import patterns.example.facade.CustomerRepository;
import patterns.example.facade.MovieRentalSystem;
import patterns.example.facade.TextFileCustomerRepository;



import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Файл з даними для кожного користувача
        CustomerRepository customerRepository = new TextFileCustomerRepository("customers.txt");
        // Файл з каталогом всіх доступних фільмів
        List<Movie> movieCatalog = null;
        MovieRentalSystem movieRentalSystem = new MovieRentalSystem(customerRepository,movieCatalog);

        while (true) {
            System.out.println("Movie Rental System Menu:");
            System.out.println("1. Переглянути каталог фільмів");
            System.out.println("2. Додати фільм");
            System.out.println("3. Пошук за характеристиками");
            System.out.println("4. Вийти");

            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Опція "Переглянути каталог фільмів"
                    // список фільмів з каталогу
                    List<Movie> movies = movieRentalSystem.getAllMovies();
                    for (Movie movie : movies) {
                        System.out.println("Назва фільму: " + movie.getTitle() + ", Ціна: " + movie.calculatePrice(1));
                    }
                    break;
                case 2:
                    // Опція "Додати фільм"
                    // Запросити користувача про деталі нового фільму та додати його в каталог
                    System.out.print("Введіть назву нового фільму: ");
                    String movieTitle = scanner.nextLine();
                    System.out.print("Введіть тип фільму (REGULAR, NEW_RELEASE, CHILDREN і т. д.): ");
                    String movieType = scanner.nextLine();
                    //Movie.MovieType type = Movie.MovieType.valueOf(movieType); // Перетворення рядка на enum

                    // Створіть новий фільм і додайте його в каталог
                    //Movie newMovie = new Movie(movieTitle, type);
                    //movieRentalSystem.addMovie(newMovie);
                    break;
                case 3:
                    // Опція "Пошук за характеристиками"
                    // Запросити користувача про критерії пошуку та вивести результати
                    System.out.print("Введіть тип фільму для пошуку: ");
                    String searchType = scanner.nextLine();
                    System.out.print("Введіть мінімальну тривалість оренди: ");
                    int minDuration = scanner.nextInt();

                    List<Movie> searchResults = movieRentalSystem.searchMoviesByCharacteristics(searchType, minDuration);
                    if (searchResults.isEmpty()) {
                        System.out.println("Фільми за заданими характеристиками не знайдено.");
                    } else {
                        System.out.println("Результати пошуку:");
                        for (Movie movie : searchResults) {
                            System.out.println("Назва фільму: " + movie.getTitle() + ", Ціна: " + movie.calculatePrice(1)); // Приклад виведення
                        }
                    }
                    break;
                case 4:
                    // Опція "Вийти"
                    System.out.println("Дякуємо за користування нашою системою!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Невірний вибір. Будь ласка, виберіть іншу опцію.");
            }
        }
    }
}
