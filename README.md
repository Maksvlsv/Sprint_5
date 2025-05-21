## 🦁 Zoo Animals Project

### 📋 Описание

Это учебный Java-проект, в котором реализованы классы животных (`Cat`, `Lion`, `Feline`, `Alex`) с использованием объектно-ориентированного подхода и покрытия unit-тестами с использованием JUnit и Mockito. Проект также настроен на генерацию отчёта покрытия кода через JaCoCo.

---

### ⚙️ Технологии

| Технология      | Версия     |
|------------------|------------|
| Java             | 11         |
| Maven            | 3.9.0      |
| JUnit            | 4.13.2     |
| Mockito          | 4.8.0      |
| JaCoCo           | 0.8.8      |

---

### 🛠️ Установка и запуск

#### 1. Клонируйте репозиторий:

```bash
git clone https://github.com/ваш-профиль/название-репозитория.git
cd название-репозитория
```

#### 2. Запуск тестов:

```bash
mvn clean test
```

#### 3. Генерация отчёта о покрытии кода:

```bash
mvn jacoco:report
```

Отчёт будет доступен по пути:
```
target/site/jacoco/index.html
```

---

### 📁 Структура проекта

```
src
├── main
│   └── java
│       └── org.example
│           ├── Animal.java
│           ├── Cat.java
│           ├── Feline.java
│           ├── Lion.java
│           └── Predator.java
└── test
    └── java
        └── org.example
            ├── CatTest.java
            ├── FelineTest.java
            ├── LionTest.java
            └── LionParameterizedTest.java
```
# Sprint_5