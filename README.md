# Gra Wisielec

## Spis Treści
1. [O Projekcie](#o-projekcie)
2. [Funkcjonalności](#funkcjonalności)
3. [Instrukcje](#instrukcje)
4. [Wymagania](#wymagania)
5. [Jak Uruchomić](#jak-uruchomić)

## O Projekcie
Gra Wisielec to klasyczna gra słowna przeniesiona do konsoli. Gracz1 wymyśla słowo, a Gracz2 stara się je odgadnąć, podając litery. Jeśli Gracz2 popełni zbyt wiele błędów, wisielec zostanie "zbudowany" i gra się kończy.

## Funkcjonalności
- **Wybór słowa przez Gracza1:** Gracz1 wpisuje słowo, które ma zostać odgadnięte.
- **Zgadywanie liter przez Gracza2:** Gracz2 podaje litery, próbując odgadnąć słowo.
- **Wyświetlanie aktualnego stanu słowa:** Po każdym ruchu pokazujemy, które litery zostały odgadnięte.
- **Zliczanie błędów:** Liczymy, ile razy Gracz2 się pomylił.
- **Wizualizacja wisielca:** Po każdym błędzie rysujemy kolejny fragment wisielca.
- **Wynik końcowy:** Na koniec gry informujemy, czy Gracz2 wygrał, czy przegrał.

## Instrukcje

### Wymagania
- Java Development Kit (JDK) w wersji 8 lub nowszej.
- Środowisko programistyczne jak Visual Studio Code (VS Code), IntelliJ IDEA, Eclipse, czy jakiekolwiek inne, które obsługuje Java.

### Jak Uruchomić
1. **Pobierz projekt:**
   - Skopiuj kod gry i zapisz go w pliku `Wisielec.java`.

2. **Skompiluj i uruchom:**
   - Otwórz terminal lub wiersz poleceń.
   - Przejdź do katalogu, gdzie zapisałeś `Wisielec.java`.
   - Wpisz komendę, aby skompilować kod:
     ```sh
     javac Wisielec.java
     ```
   - Uruchom grę poleceniem:
     ```sh
     java Wisielec
     ```

3. **Instrukcja gry:**
   - Na początku Gracz1 wpisuje słowo do odgadnięcia.
   - Następnie Gracz2 podaje litery, próbując odgadnąć słowo.
   - Po każdym błędzie zobaczycie, jak rysuje się wisielec.
   - Gra kończy się, gdy Gracz2 odgadnie słowo lub popełni sześć błędów.