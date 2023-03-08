CREATE DATABASE StudentPractise
USE StudentPractise

CREATE TABLE Users (
	UserID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	First_name VARCHAR(50) NOT NULL,
	Last_name VARCHAR(50) NOT NULL,
	Age VARCHAR(20) NOT NULL,
	Gender VARCHAR(50) NOT NULL,
	Email VARCHAR(50) NOT NULL,
	[Admin] BIT NOT NULL
);

CREATE TABLE Wallets (
	WalletID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Balance INT NOT NULL,
	AllTimeMade INT NOT NULL,
	AllTimeLost INT NOT NULL,
	MaxProfit INT NOT NULL,
	MinProfit INT NOT NULL
);

CREATE TABLE UsersWallets (
	UserID UNIQUEIDENTIFIER FOREIGN KEY REFERENCES Users(UserID),
	WalletID UNIQUEIDENTIFIER FOREIGN KEY REFERENCES Wallets(WalletID),
	PRIMARY KEY(UserID, WalletID)
);

CREATE TABLE Stocks ( 
	StockId UNIQUEIDENTIFIER FOREIGN KEY REFERENCES Users(UserID), 
	StockName VARCHAR(50), 
	StockOriginalBuy INT, 
	StockOriginalSell INT, 
	StockRateDay INT, 
	StockRateWeek INT, 
	StockRateMonth INT, 
	StockRateYear INT 
);

CREATE TABLE Cryptos ( 
	CryptoId UNIQUEIDENTIFIER FOREIGN KEY REFERENCES Users(UserID), 
	CryptoName VARCHAR(50), 
	CryptoOriginalBuy INT, 
	CryptoOriginalSell INT, 
	CryptoRateDay INT, 
	CryptoRateWeek INT, 
	CryptoRateMonth INT, 
	CryptoRateYear INT 
);

ALTER TABLE Users
ADD [Admin] BIT;

INSERT INTO Users (First_name, Last_name, Age, Gender, Email) VALUES ('Lorna', 'Hakey', 49, 'Bigender', 'lhakey0@sogou.com');
INSERT INTO Wallets (Balance, AllTimeMade, AllTimeLost, MaxProfit, MinProfit) VALUES (0, 0, 0, 0, 0);
INSERT INTO UsersWallets (UserID, WalletID) VALUES ('FD6AE52A-0566-471A-9185-14E1BF001B1C','79153867-BB2A-425B-B62D-2F87B657B9C6');
INSERT INTO Users (First_name, Last_name, Age, Gender, Email) VALUES ('Andreana', 'Moyle', 27, 'Female', 'amoyle1@ycombinator.com');
INSERT INTO Wallets (Balance, AllTimeMade, AllTimeLost, MaxProfit, MinProfit) VALUES (0, 0, 0, 0, 0);
INSERT INTO UsersWallets (UserID, WalletID) VALUES ('90C4C06B-EF2D-4CC7-A9E8-882DDAE6B4FD','42FA2740-07E3-4133-8813-5330242CACA7');
INSERT INTO Users (First_name, Last_name, Age, Gender, Email) VALUES ('Gertrude', 'Greneham', 83, 'Female', 'ggreneham2@nature.com');
INSERT INTO Wallets (Balance, AllTimeMade, AllTimeLost, MaxProfit, MinProfit) VALUES (0, 0, 0, 0, 0);
INSERT INTO UsersWallets (UserID, WalletID) VALUES ('E2A99737-C2D9-4BFD-9CF3-DAD9071D5C5E','EE644764-A64D-4A85-9DE1-CBB0B6C738A2');
INSERT INTO Users (First_name, Last_name, Age, Gender, Email) VALUES ('Edsel', 'Hellwig', 23, 'Male', 'ehellwig3@google.it');
INSERT INTO Wallets (Balance, AllTimeMade, AllTimeLost, MaxProfit, MinProfit) VALUES (0, 0, 0, 0, 0);
INSERT INTO UsersWallets (UserID, WalletID) VALUES ('D882523D-FD07-4353-BA09-F9A8E32EA8FB','2639D273-1ED5-4C72-ABD2-ECA87AF0077B');
INSERT INTO Users (First_name, Last_name, Age, Gender, Email) VALUES ('Elvin', 'Eaglestone', 99, 'Male', 'eeaglestone4@ycombinator.com');
INSERT INTO Wallets (Balance, AllTimeMade, AllTimeLost, MaxProfit, MinProfit) VALUES (0, 0, 0, 0, 0);
	INSERT INTO UsersWallets (UserID, WalletID) VALUES ('8DFDBD1A-A634-49C8-928A-FA9EB336E625','E82C3637-B19B-4BB6-8A56-FB09372815D7');