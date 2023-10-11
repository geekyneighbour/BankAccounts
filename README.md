# BankAccounts
Заглушка JavaSpring Web

1. При необходимости скачать maven с официального сайта (в зависимости от используемой ОС) https://maven.apache.org/download.cgi и добавить в PATH. Командой ‘mvn --version’ проверить установку и версию.
2. Клонировать проект Git на компьютер.
3. Перейти в командную строку и зайти в директорию, в которой сохранен проект (в этой папке должен храниться pom.xml)
4. Выполнить команду ‘mvn clean install’ либо команду ‘mvn spring-boot:run’. При выполнении команды ‘mvn spring-boot:run’ осуществится сборка и проект сразу запустится (но файл jar не будет создан. При необходимости создания jar-файла нужно в директории проекта выполнить команду ‘mvn package’. При выполнении команды ‘mvn clean install’ необходимо запустить сформированный jar-файл командой ‘java -jar путь до файла без кавычек’
5. Альтернатива: запустить проект из IDEA.
6. При работе с командной строкой открыть новую командную строку и вводить запросы.
7. Заглушка принимает на вход запросы в указанном порядке (на http://localhost:8080/accounts):

  1) POST-запрос (возможно только три корректных запроса (данные юзеров в заглушке):
     curl -H "Content-Type: application/json" -d "{\"login\":\"ivanov\",\"password\":\"12345\"}" http://localhost:8080/accounts
     curl -H "Content-Type: application/json" -d "{\"login\":\"safonova\",\"password\":\"666\"}" http://localhost:8080/accounts
     curl -H "Content-Type: application/json" -d "{\"login\":\"petrov\",\"password\":\"privet\"}" http://localhost:8080/accounts
  2) GET-запрос, который выдает данные аккаунта, если POST-запрос был направлен с корректными данными. Если же первый запрос был направлен с некорректными данными, то от сервера придет ошибка.
      curl http://localhost:8080/accounts

     Пример ответа, если запрос был направлен с корректными данными:
        {"data":{"accountList":[{"accountNumber":"8800555353542069","fullName":"Индивидуальный Предприниматель Иванов Иван Иванович.","status":"1","contractNum":"124567","accountTypeCode":"6","packageAbility":"false","allowReady":"None"}]},"success":true}

     Ответ, если запрос был направлен с некорректными данными:
        {"data":"error","success":false}
  4) GET-запрос, который возвращает строку "номер отправленного аккаунта = (введенный номер аккаунта)"
      curl http://localhost:8080/accounts/номер аккаунта