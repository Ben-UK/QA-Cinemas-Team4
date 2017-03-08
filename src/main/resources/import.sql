-- insert cinemas
insert into cinema (location) values ('London');
insert into cinema (location) values ('Manchester');
insert into cinema (location) values ('Leeds');

-- insert events
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','A seemingly indestructible humanoid cyborg is sent from 2029 to 1984 to assassinate a waitress, whose unborn son will lead humanity in a war against the machines, while a soldier from that war is sent to protect her at all costs.','film','1984-10-22 22:00:12.0',1,'Terminator');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son, John Connor, from a more advanced cyborg. ','film','1991-10-22 22:00:12.0',1,'Terminator 2');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home. ','film','2003-10-22 22:00:12.0',1,'Finding Nemo');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','Bruce Wayne must not only deal with the criminals of Gotham City, but also the responsibility of raising a boy he adopted.','film','1984-10-22 22:00:12.0',2,'The LEGO Batman Movie');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','Retelling the timeless tale for a new generation, Beauty And The Beast is the story of Belle, a spirited, intelligent and beautiful woman who is taken prisoner by a beast.','film','1991-10-22 22:00:12.0',2,'Beauty and the Beast');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','A working-class African-American father tries to raise his family in the 1950s, while coming to terms with the events of his life.','film','2003-10-22 22:00:12.0',2,'Fences');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','Hidden Figures is the inspiring true story of Dorothy Vaughan, Mary Jackson and Katherine Johnson, three African-American women who played a pivotal role in the birth of the NASA space program.','film','1984-10-22 22:00:12.0',3,'Hidden Figures');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','People used to call him the Wolverine. Now he’s just Logan. Years have passed, the world has changed, and the mutants are all but gone.','film','1991-10-22 22:00:12.0',3,'Logan');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','A timeless story of the search for companionship, ‘Moonlight’ chronicles the life of a young black man named Chiron, as he grows up gay in a rough Miami neighbourhood. ','film','2003-10-22 22:00:12.0',3,'Moonlight');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','Sing is the story of Buster Moon, a dapper, down-on-his-luck koala whose theatre has fallen on hard times. In a last-ditch attempt to save it, he organises a singing competition. ','film','2003-10-22 22:00:12.0',2,'Sing');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','Three girls are kidnapped by a man with a diagnosed 23 distinct personalities, they must try to escape before the apparent emergence of a frightful new 24th.','film','1984-10-22 22:00:12.0',3,'Split');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','After 20 years abroad, Mark Renton returns to Scotland and reunites with his old friends Sick Boy, Spud, and Begbie.','film','1991-10-22 22:00:12.0',3,'T2: Trainspotting');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','An ambitious young executive is sent to retrieve the company CEO from an idyllic but mysterious wellness center at a remote location in the Swiss Alps, but soon suspects that the spa treatments are not what they seem.','film','2003-10-22 22:00:12.0',3,'A Cure For Wellness');

-- insert showings
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (1,'2016-10-22 22:00:12.0',50, 1);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (1,'2016-10-02 22:00:12.0',50, 2);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (1,'2017-02-22 22:00:12.0',50, 3);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (2,'2016-10-22 22:00:12.0',50, 1);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (2,'2015-12-14 22:00:12.0',50, 2);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (2,'2017-11-03 22:00:12.0',50, 3);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (3,'2016-10-22 22:00:12.0',50, 1);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (3,'2015-12-14 22:00:12.0',50, 2);
insert into showing (showing_cinemaID, dateTime, seatCount, event_showingID) values (3,'2017-11-03 22:00:12.0',50, 3);

-- insert bookings
insert into booking (bookings_showingID) values (1);
insert into booking (bookings_showingID) values (1);
insert into booking (bookings_showingID) values (2);
insert into booking (bookings_showingID) values (2);
insert into booking (bookings_showingID) values (3);
insert into booking (bookings_showingID) values (4);
insert into booking (bookings_showingID) values (5);

-- insert tickets
insert into ticket (tickets_bookingID, ticketType) values (1,'adult');
insert into ticket (tickets_bookingID, ticketType) values (1,'adult');
insert into ticket (tickets_bookingID, ticketType) values (2,'adult');
insert into ticket (tickets_bookingID, ticketType) values (2,'adult');
insert into ticket (tickets_bookingID, ticketType) values (2,'adult');
insert into ticket (tickets_bookingID, ticketType) values (2,'adult');
insert into ticket (tickets_bookingID, ticketType) values (3,'adult');
insert into ticket (tickets_bookingID, ticketType) values (4,'adult');
insert into ticket (tickets_bookingID, ticketType) values (5,'adult');
insert into ticket (tickets_bookingID, ticketType) values (6,'adult');
insert into ticket (tickets_bookingID, ticketType) values (7,'adult');


