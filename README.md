# module2_catsgram

# **Добавляем обработку ошибок в Catsgram**

В проекте Catsgram подтяните в ветку develop изменения из ветки error-handler_add-handling.
Создайте исключение IncorrectParameterException, унаследовав его от RuntimeException. В исключение добавьте поле
parameter.
Исправьте условия в PostConroller и PostFeedController, чтобы для ошибки в конкретном поле вместо
IllegalArgumentException пробрасывалось IncorrectParameterException с названием ошибочного поля. Например, если значение
page меньше нуля, должно быть проброшено исключение, в котором поле parameter содержит значение “page”.
В пакет ru.yandex.practicum.catsgram.controller добавьте класс ErrorHandler — обработчик ошибок. При ошибках должен
возвращаться объект ErrorResponse. Добавьте логику по обработке исключений:
Для исключений PostNotFoundException и UserNotFoundException должен возвращаться код ответа
404
404 (Not found), в поле error — сообщение из исключения.
Для исключения UserAlreadyExistException — код ответа
409
409 (Conflict), в поле error — сообщение из исключения.
Для исключения InvalidEmailException — код ответа
400
400 (Bad request), в поле error — сообщение из исключения.
Для исключения IncorrectParameterException — код ответа
400
400 (Bad request), в поле error — сообщение вида Ошибка с полем “наименование поля”.
Для любого другого исключения (Throwable) — код ответа
500
500 (Internal server error) и сообщение "Произошла непредвиденная ошибка.".

проверить себя по авторскому решению из ветки
https://github.com/praktikum-java/module2_catsgram/tree/error-handler_error-response