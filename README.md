# Проект по автоматизации тестовых сценариев для компании __Wildberries__
___
## :notebook: Содержание:

___
- [Использованный стек](#computer-использованный-стек)
- [Запуск тестов из терминала](#arrow_forward-запуск-тестов-из-терминала)
- [Сборка в Jenkins](#-Сборка-в-Jenkins)
- [Пример Allure-отчета]()
- [Уведомления в Telegram с использованием бота]()  
- [Видео примера запуска тестов в Selenoid]()

### :computer: Использованный стек
___
<p align="center">
<img src="media/logo/Allure_Report.svg" width="30" height="30" title="Allure_Report">
<img src="media/logo/AllureTestOps.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/GitHub.svg" width="30" height="30" title="GitHub">
<img src="media/logo/Gradle.svg" width="30" height="30" title="Gradle">
<img src="media/logo/Intelij_IDEA.svg" width="30" height="30" title="Intelij_IDEA">
<img src="media/logo/Java.svg" width="30" height="30" title="Java">
<img src="media/logo/Jenkins.svg" width="30" height="30" title="Jenkins">
<img src="media/logo/jira.svg" width="30" height="30" title="jira">
<img src="media/logo/JUnit5.svg" width="30" height="30" title="JUnit5">
<img src="media/logo/Selenide.svg" width="30" height="30" title="Selenide">
<img src="media/logo/Selenoid.svg" width="30" height="30" title="Selenoid">
<img src="media/logo/Telegram.svg" width="30" height="30" title="telegram">
</p>

- В проекте написаны автотесты  на языке Java с использованием фреймворка для тестирования Selenide.
- В качестве сборщика был использован - Gradle.
- Использованы фреймворки JUnit 5 и [Selenide](https://selenide.org).
- При прогоне тестов браузер запускается в [Selenoid](https://aerokube.com/selenoid/).
- Для удаленного запуска реализована джоба в Jenkins с формированием Allure-отчета и отправкой результатов в Telegram при помощи бота.
- Осуществлена интеграция с Allure TestOps и Jira

#### Allure-отчет содержит:

- Шаги теста;
- Скриншот страницы на последнем шаге;
- Page Source;
- Логи браузерной консоли;
- Видео выполнения автотеста.

___

### :arrow_forward: Запуск тестов из терминала

```
gradle clean wildberriesTest
```

При выполнении команды, тесты запустятся удаленно в <code>Selenoid</code>.

Удаленный запуск с использованием Jenkins+Selinoid

```
gradle clean test -Denv=wildberriesTest
```

### <img src="media/logo/Jenkins.svg" width="30" height="30" title="Jenkins"> Сборка в Jenkins
