# Проект по автоматизации тестовых сценариев для компании __Wildberries__
___
## Содержание:

___
- [Использованный стек](#1)
- Запуск тестов из терминала  
- Сборка в Jenkins  
- Пример Allure-отчета  
- Уведомления в Telegram с использованием бота  
- Видео примера запуска тестов в Selenoid

### Использованный стек
___

<img src="media/logo/Allure_Report.svg" width="30" height="30" title="Allure_Report">
<img src="media/logo/AllureTestOps.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/GitHub.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Gradle.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Intelij_IDEA.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Java.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Jenkins.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/jira.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/JUnit5.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Selenide.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/Selenoid.svg" width="30" height="30" title="AllureTestOps">
<img src="media/logo/telegram.svg" width="30" height="30" title="AllureTestOps">


- В данном проекте автотесты написаны на языке Java с использованием фреймворка для тестирования Selenide.
- В качестве сборщика был использован - Gradle.
- Использованы фреймворки JUnit 5 и [Selenide](https://selenide.org).
- При прогоне тестов браузер запускается в [Selenoid](https://aerokube.com/selenoid/).
- Для удаленного запуска реализована джоба в Jenkins с формированием Allure-отчета и отправкой результатов в Telegram при помощи бота.
- Осуществлена интеграция с Allure TestOps и Jira

