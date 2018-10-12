/******** INSERT INTO LEAGUE ********/
INSERT IGNORE INTO league (id, name, amount_teams, director, actual_champion, team_more_titles) VALUES (1, "Liga BBVA", 20, "Javier Gómez", "Fútbol Club Barcelona", "Real Madrid C.F.");

/******** INSERT INTO TEAM ********/
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (1, "Real Betis Balompié", "Estadio Benito Villamarín", "Ángel Haro", "1907-09-12 00:00:00", "Sevilla", 1);

/******** INSERT INTO PLAYER ********/
INSERT IGNORE INTO player (id, name, surname, birthdate, age, height, team) VALUES (1, "José Andrés", "Guardado Hernández", "1886-09-29 00:00:00", 32, "1.69", 1);