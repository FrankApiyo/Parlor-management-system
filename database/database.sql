drop database board2;
create database board2;

use board2;

create table Cow(
		tag VARCHAR(10),
		name VARCHAR(200),
		dob DATE,
		lactating BIT,
		born_on_farm BIT,
		PRIMARY KEY(tag)
		);
create table Entry(
		sessionId INT AUTO_INCREMENT,
		session VARCHAR(2),
		dt DATE,
		PRIMARY KEY(sessionId, session, dt)
		);
create table Desease(
		name VARCHAR(200),
		PRIMARY KEY(name)
		);
create table DeseaseIncident(
		name VARCHAR(200),
		cow VARCHAR(10),
		sessionId INT,
		symptom VARCHAR(500),
		attended BIT,
		PRIMARY KEY(name, cow, sessionId),
		FOREIGN KEY(name) REFERENCES Desease(name),
		FOREIGN KEY(cow) REFERENCES Cow(tag),
		FOREIGN KEY(sessionId) REFERENCES Entry(sessionId)
		);
create table Personel(
		name VARCHAR(200),
		id VARCHAR(20),
		role VARCHAR(50),
		password VARCHAR(20),
		PRIMARY KEY(id)
		);
create table PersonelEntry(
		sessionId INT,
		pid VARCHAR(20)
		);
create table HeatIncident(
	heatId INT AUTO_INCREMENT,
	cow VARCHAR(10),
	sessionId INT,
	PRIMARY KEY(heatId, cow, sessionId),
	FOREIGN KEY(sessionId) REFERENCES Entry(sessionId)
	);
create table ServiceIncident(
	serviceId INT AUTO_INCREMENT,
	sessionId INT,
	cow VARCHAR(10),
	heatId INT,
	PRIMARY KEY(serviceId, cow),
	FOREIGN KEY(sessionId) REFERENCES 	Entry(sessionId),
	FOREIGN KEY(heatId) REFERENCES HeatIncident(heatId),
	FOREIGN KEY(cow) REFERENCES Cow(tag)
	);
create table CalvingIncident(
	dt DATE,
	calver VARCHAR(10),
	personel VARCHAR(20),
	calf VARCHAR(10),
	serviceId INT,
	PRIMARY KEY(calver, calf),
	FOREIGN KEY(serviceId) REFERENCES ServiceIncident(serviceId)
	);
create table MilkEntry(
	cow VARCHAR(10),
	sessionId INT,
	milkInKgs FLOAT,
	discarded BIT,
	PRIMARY KEY(cow, sessionId),
	FOREIGN KEY(cow) REFERENCES Cow(tag),
	FOREIGN KEY(sessionId) REFERENCES Entry(sessionId)
	);