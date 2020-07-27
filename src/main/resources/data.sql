insert into user(first_name, surname) values ('Ada', 'Mazurkiewicz');
insert into user(first_name, surname) values ('Grzegorz', 'Kozlowski');
insert into user(first_name, surname) values ('Diana', 'Artemida');

insert into ride(ride_from, ride_to, ride_date, seats,id_owner ) values ('Warsaw', 'Legionowo', '2020-09-12 08:00:00', 4, 1);
insert into ride(ride_from, ride_to, ride_date, seats,id_owner ) values ('Wawer', 'Legionowo', '2020-07-22 08:00:00', 4, 1);
insert into ride(ride_from, ride_to, ride_date, seats,id_owner ) values ('Legionowo', 'Warszawa', '2020-09-12 08:00:00', 4, 3);
insert into ride(ride_from, ride_to, ride_date, seats,id_owner ) values ('Warsaw', 'Legionowo', '2020-09-12 08:00:00', 4, 1);

insert into booked_ride(id_ride,id_passenger) values (1,1);
insert into booked_ride(id_ride,id_passenger) values (1,2);
insert into booked_ride(id_ride,id_passenger) values (1,2);
insert into booked_ride(id_ride,id_passenger) values (2,1);