-- insert cinemas
insert into cinema (location) values ('London');
insert into cinema (location) values ('Manchester');
insert into cinema (location) values ('Leeds');

-- insert events
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','A seemingly indestructible humanoid cyborg is sent from 2029 to 1984 to assassinate a waitress, whose unborn son will lead humanity in a war against the machines, while a soldier from that war is sent to protect her at all costs.','film','1984-10-22 22:00:12.0',1,'Terminator');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18',' A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son, John Connor, from a more advanced cyborg. ','film','1991-10-22 22:00:12.0',1,'Terminator 2');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home. ','film','2003-10-22 22:00:12.0',1,'Finding Nemo');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','A seemingly indestructible humanoid cyborg is sent from 2029 to 1984 to assassinate a waitress, whose unborn son will lead humanity in a war against the machines, while a soldier from that war is sent to protect her at all costs.','film','1984-10-22 22:00:12.0',2,'Terminator');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18',' A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son, John Connor, from a more advanced cyborg. ','film','1991-10-22 22:00:12.0',2,'Terminator 2');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home. ','film','2003-10-22 22:00:12.0',2,'Finding Nemo');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18','A seemingly indestructible humanoid cyborg is sent from 2029 to 1984 to assassinate a waitress, whose unborn son will lead humanity in a war against the machines, while a soldier from that war is sent to protect her at all costs.','film','1984-10-22 22:00:12.0',3,'Terminator');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('18',' A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son, John Connor, from a more advanced cyborg. ','film','1991-10-22 22:00:12.0',3,'Terminator 2');
insert into event(certification,description,eventType,releaseDate,event_showingID,title) values ('PG','After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home. ','film','2003-10-22 22:00:12.0',3,'Finding Nemo');

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


