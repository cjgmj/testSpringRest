/******** INSERT INTO LEAGUE ********/
INSERT IGNORE INTO league (id, name, amount_teams, actual_champion, team_more_titles) VALUES (999, "Serie A", 20, "Juventus F. C.", "Juventus F. C.");
INSERT IGNORE INTO league (id, name, amount_teams, actual_champion, team_more_titles) VALUES (998, "Liga BBVA", 20, "Fútbol Club Barcelona", "Real Madrid C.F.");
INSERT IGNORE INTO league (id, name, amount_teams, actual_champion, team_more_titles) VALUES (997, "Ligue 1 Conforama", 20, "Paris Saint-Germain F. C.", "A. S. Saint-Étienne");
INSERT IGNORE INTO league (id, name, amount_teams, actual_champion, team_more_titles) VALUES (996, "Premier League", 20, "Manchester City F. C.", "Manchester United F. C.");
INSERT IGNORE INTO league (id, name, amount_teams, actual_champion, team_more_titles) VALUES (995, "Bundesliga", 18, "F. C. Bayern", "F. C. Bayern");

/******** INSERT INTO TEAM ********/
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (999, "Juventus F. C.", "Allianz Stadium", "Andrea Agnelli", "1897-11-01 00:00:00", "Turín", 999);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (998, "F. C. Barcelona", "Camp Nou", "Andrea Agnelli", "1899-11-29 00:00:00", "Barcelona", 998);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (997, "Paris Saint-Germain F. C.", "Parc des Princes", "Nasser Al-Khelaifi", "1970-08-12 00:00:00", "París", 997);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (996, "Real Madrid C. F.", "Santiago Bernabéu", "Florentino Pérez", "1902-03-06 00:00:00", "Madrid", 998);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (995, "Manchester City F. C.", "Etihad Stadium", "Khaldoon Al Mubarak", "1894-04-13 00:00:00", "Manchester", 996);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (994, "Chelsea F. C.", "Stamford Bridge", "Bruce Buck", "1905-03-10 00:00:00", "Londres", 996);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (993, "Manchester United F. C.", "Old Trafford", "Joel Glazer", "1902-04-24 00:00:00", "Manchester", 996);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (992, "F. C. Bayern", "Allianz Arena", "Uli Hoeneß", "1900-02-27 00:00:00", "Múnich", 995);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (991, "Atlético de Madrid", "Wanda Metropolitano", "Enrique Cerezo", "1903-04-26 00:00:00", "Madrid", 998);
INSERT IGNORE INTO team (id, name, stadium, president, date_foundation, location, league) VALUES (990, "Tottenham Hotspur F. C.", "Wembley", "Daniel Levy", "1882-09-05 00:00:00", "Londres", 996);

/******** INSERT INTO PLAYER ********/
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (999, "Cristiano Ronaldo", "dos Santos Aveiro", "Portugal", "Delantero", "1985-02-05 00:00:00", "1.85", 94, 999);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (998, "Lionel Andrés", "Messi Cuccittini", "Argentina", "Delantero", "1987-06-24 00:00:00", "1.70", 94, 998);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (997, "Neymar", "da Silva Santos Júnior", "Brasil", "Delantero", "1992-02-05 00:00:00", "1.75", 92, 997);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (996, "Luka", "Modrić", "Croacia", "Centrocampista", "1985-09-09 00:00:00", "1.72", 91, 996);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (995, "Kevin", "De Bruyne", "Bélgica", "Centrocampista", "1991-06-28 00:00:00", "1.81", 91, 995);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (994, "Eden Michael", "Hazard", "Bélgica", "Delantero", "1991-11-24 00:00:00", "1.73", 91, 994);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (993, "Sergio", "Ramos García", "España", "Defensa", "1986-03-30 00:00:00", "1.84", 91, 996);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (992, "Luis Alberto", "Suárez Díaz", "Uruguay", "Delantero", "1987-01-24 00:00:00", "1.82", 91, 998);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (991, "David", "de Gea Quintana", "España", "Portero", "1990-11-07 00:00:00", "1.93", 91, 993);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (990, "Toni", "Kroos", "Alemania", "Centrocampista", "1990-01-04 00:00:00", "1.83", 90, 996);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (989, "Robert", "Lewandowski", "Alemania", "Delantero", "1988-08-21 00:00:00", "1.85", 90, 992);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (988, "Manuel Peter", "Neuer", "Alemania", "Portero", "1986-03-27 00:00:00", "1.93", 90, 992);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (987, "Diego", "Godín", "Uruguay", "Defensa", "1986-02-16 00:00:00", "1.87", 90, 991);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (986, "Thibaut Nicolas Marc", "Courtois", "Bélgica", "Portero", "1992-05-11 00:00:00", "1.99", 90, 996);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (985, "Jan", "Oblak", "Eslovenia", "Portero", "1993-01-07 00:00:00", "1.89", 90, 991);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (984, "N'Golo", "Kanté", "Francia", "Centrocampista", "1991-03-29 00:00:00", "1.68", 89, 994);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (983, "Harry", "Kane", "Inglaterra", "Delantero", "1993-07-28 00:00:00", "1.88", 89, 990);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (982, "Antoine", "Griezmann", "Francia", "Delantero", "1991-03-21 00:00:00", "1.76", 89, 991);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (981, "Giorgio", "Chiellini", "Italia", "Defensa", "1984-08-14 00:00:00", "1.88", 89, 999);
INSERT IGNORE INTO player (id, name, surname, nationality, position, birthdate, height, rate, team) VALUES (980, "Sergio Leonel", "Agüero", "Argentina", "Delantero", "1988-06-02 00:00:00", "1.72", 89, 995);