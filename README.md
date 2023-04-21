## CurrencyBot

Telegram bot shows official exchange rate for Belarusian ruble using bank API: https://www.nbrb.by/apihelp/exrates
It is simple, no need to get personal account, token etc. Bot functionality is implemented through GET requests.

In case you want to try this bot you will need following software:
> JRE

> Maven

> IDE (IntelliJ IDEA, Eclipse or equivalent)

> Telegram

Then clone this repository to any folder on your computer:
```
https://github.com/TimurSelivanov/CurrencyBot.git
```

Register the new bot in Telegram using `@BotFather`, you will get your bot name and its token.

Open project with your IDE, and update bots name and token in `application.properties` file.

Run the application and your bot in Telegram.
Enjoy! )

## Technology stack
Java, Spring boot, Lombok, Telegram API, Belarusian national bank API