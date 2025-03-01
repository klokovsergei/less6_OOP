# Описание шагов приведения к SOLID

1. Класс User - "S" (Single Responsibility Principle). Нарушено правило одной ответственности. Класс описывает User'а и сам сохраняет себя и формирует отчеты.

   **Решение:** Вынес в отдельный класс UserService создание пользователя, сохранение пользователя и формирование отчета
2. "D" (Dependency Inversion Principle) - в классе Main было обращение к классам - создание User, обращение к классу сохранение, формирования отчетов.

   **Решение:** Создал слои - view -> controller -> service -> model с односторонней связностью. Исключил создание конструкторов, чтобы если будет создаваться несколько User, использовать функционал можно было без увеличения кол-ва объектов UserController и UserService.
3. "O" (Open Closed Principle) - User с конструктором, геттерами и методами работы с отчетами и т.п. подразумевает открытость класса к дальнейшим доработкам и правкам.

   **Решение:** Убрав из User действия в service, класс стал финальным (закрытым для правок), дальнейшие изменения можно делать через наследования, при этом логика текущего кода не сломается.