-- Удаляем старые таблицы, если они есть
DROP TABLE IF EXISTS enrollments;
DROP TABLE IF EXISTS courses;
DROP TABLE IF EXISTS students;

-- Создаем таблицу студентов
CREATE TABLE students (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE
);

-- Создаем таблицу курсов
CREATE TABLE courses (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         credits INT NOT NULL
);

-- Создаем таблицу записей на курсы (enrollments)
CREATE TABLE enrollments (
                             id SERIAL PRIMARY KEY,
                             student_id INT NOT NULL REFERENCES students(id) ON DELETE CASCADE,
                             course_id INT NOT NULL REFERENCES courses(id) ON DELETE CASCADE,
                             UNIQUE(student_id, course_id)
);

-- Вставляем студентов
INSERT INTO students (name, email) VALUES
                                       ('Maksat', 'maksat@mail.com'),
                                       ('Nariman', 'nariman@mail.com'),
                                       ('Madi', 'madi@mail.com');

-- Вставляем курсы
INSERT INTO courses (name, credits) VALUES
                                        ('OOP', 5),
                                        ('Database', 4),
                                        ('Web Development', 6);

-- Вставляем записи на курсы (enrollments)
INSERT INTO enrollments (student_id, course_id) VALUES
                                                    (1, 1),
                                                    (1, 2),
                                                    (2, 1),
                                                    (3, 3);
