--Создаем таблицу с вопросами
create table questions (
    id int PRIMARY KEY,
    question_text text NOT NULL
    );
--Создаем таблицу с ответами
create table answers (
    id int PRIMARY KEY,
    questions_id int references questions(id),
    answer text,
    is_correct bool
    );
--Наполняем таблицу с вопросами
INSERT INTO questions values (1, 'Вопрос 1: правильный ответ 1');
INSERT INTO questions values (2, 'Вопрос 2: правильный ответ 2');
INSERT INTO questions values (3, 'Вопрос 3: правильный ответ 3');
--Наполняем таблицу с вариантами ответов
INSERT INTO answers values (1, 1, 'Вариант ответа 1 для вопроса 1', true);
INSERT INTO answers values (2, 1, 'Вариант ответа 2 для вопроса 1', false);
INSERT INTO answers values (3, 1, 'Вариант ответа 3 для вопроса 1', false);
INSERT INTO answers values (4, 2, 'Вариант ответа 1 для вопроса 2', false);
INSERT INTO answers values (5, 2, 'Вариант ответа 2 для вопроса 2', true);
INSERT INTO answers values (6, 2, 'Вариант ответа 3 для вопроса 2', false);
INSERT INTO answers values (7, 3, 'Вариант ответа 1 для вопроса 3', false);
INSERT INTO answers values (8, 3, 'Вариант ответа 2 для вопроса 3', false);
INSERT INTO answers values (9, 3, 'Вариант ответа 3 для вопроса 3', true);