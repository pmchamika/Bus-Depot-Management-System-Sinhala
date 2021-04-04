drop database SLTB;
create database SLTB;
use SLTB;


CREATE TABLE `duty` (
  `duty_no` int(11) NOT NULL,
  `bus_type` varchar(3) NOT NULL,
  `service_st` varchar(30) NOT NULL,
  `service_mid` varchar(30) DEFAULT NULL,
  `service_end` varchar(30) NOT NULL,
  `distance` double NOT NULL,
  PRIMARY KEY (`duty_no`)
);

CREATE TABLE `supplier` (
  `cid` varchar(10) NOT NULL primary key,
  `c_name` varchar(30) NOT NULL,
  `typeo` varchar(30) NOT NULL,
  `validate_year` int(10) NOT NULL,
  `phone_number` int(10) NOT NULL,
  `address` varchar(51) NOT NULL,
  `e_maill` varchar(70) NOT NULL,
  `validate_start_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `rout` (
  `RoutId` varchar(10) NOT NULL,
  `StartPoint` varchar(20) NOT NULL,
  `EndPoint` varchar(20) NOT NULL,
  `BusTypeList` varchar(10) NOT NULL,
  `Distance` double NOT NULL,
  `SpNote` varchar(45) NOT NULL,
  PRIMARY KEY (`RoutId`)
);


CREATE TABLE `busdetailes` (
  `BusNumber` varchar(7) NOT NULL,
  `Model` varchar(10) NOT NULL,
  `Brand` varchar(10) NOT NULL,
  `ModelYear` int(4) NOT NULL,
  `BusType` varchar(1) NOT NULL,
  `Seat` int(3) NOT NULL,
  `FuelCapacity` double NOT NULL,
  `SpNote` varchar(50) NOT NULL,
  `DateOfRegister` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `BusStatus` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`BusNumber`)
);

create table Employee(
SalaryNo int(10) not null auto_increment,
E_SName varchar(100) not null,
E_Name varchar(100) not null,
E_Gender varchar(10) not null,
E_Address varchar(100) not null,
E_NIC varchar(10) not null,
E_Grade varchar(15) not null,
E_DOB varchar(12) not null,
E_BasicSalary varchar(10) not null,
E_AccountNo varchar(30) not null,
E_Password varchar(300),
E_Phone varchar(10) not null,
E_StartDate timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
E_MedicalStatus varchar(10) not null,
E_EmergencyContact varchar(10) not null,
constraint SalaryNo_PK primary key(SalaryNo)
);


CREATE TABLE `daily_duty` (
  `asin_did` int(11) NOT NULL AUTO_INCREMENT,
  `duty_no` int(3) NOT NULL,
  `d_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `asinSno` int(3) NOT NULL,
  `abSno` int(3) NOT NULL,
  PRIMARY KEY (`asin_did`),
  KEY `asinSno_FK` (`asinSno`),
  KEY `abSno_FK` (`abSno`),
  CONSTRAINT `abSno_FK` FOREIGN KEY (`abSno`) REFERENCES `employee` (`SalaryNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `asinSno_FK` FOREIGN KEY (`asinSno`) REFERENCES `employee` (`SalaryNo`) ON DELETE CASCADE ON UPDATE CASCADE
);



CREATE TABLE `monthly_duty` (
  `mon_did` varchar(10) NOT NULL,
  `Sno` int(3) NOT NULL,
  `Year` int(4) NOT NULL,
  `month` varchar(20) NOT NULL,
  `ticketm_no` int(10) NOT NULL,
  `BusNumber` varchar(7) NOT NULL,
  `d1` int(3) NOT NULL,
  `d2` int(3) NOT NULL,
  `d3` int(3) NOT NULL,
  `d4` int(3) NOT NULL,
  `d5` int(3) NOT NULL,
  `d6` int(3) NOT NULL,
  `d7` int(3) NOT NULL,
  `d8` int(3) NOT NULL,
  `d9` int(3) NOT NULL,
  `d10` int(3) NOT NULL,
  `d11` int(3) NOT NULL,
  `d12` int(3) NOT NULL,
  `d13` int(3) NOT NULL,
  `d14` int(3) NOT NULL,
  `d15` int(3) NOT NULL,
  `d16` int(3) NOT NULL,
  `d17` int(3) NOT NULL,
  `d18` int(3) NOT NULL,
  `d19` int(3) NOT NULL,
  `d20` int(3) NOT NULL,
  `d21` int(3) NOT NULL,
  `d22` int(3) NOT NULL,
  `d23` int(3) NOT NULL,
  `d24` int(3) NOT NULL,
  `d25` int(3) NOT NULL,
  `d26` int(3) NOT NULL,
  `d27` int(3) NOT NULL,
  `d28` int(3) NOT NULL,
  `d29` int(3) NOT NULL,
  `d30` int(3) NOT NULL,
  `d31` int(3) NOT NULL,
  PRIMARY KEY (`mon_did`),
  KEY `SNo_FK` (`Sno`),
  KEY `Busno_FK2` (`BusNumber`),
  CONSTRAINT `Busno_FK2` FOREIGN KEY (`BusNumber`) REFERENCES `busdetailes` (`BusNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `SNo_FK` FOREIGN KEY (`Sno`) REFERENCES `employee` (`SalaryNo`) ON DELETE CASCADE ON UPDATE CASCADE
);
 
create table OfficerAttendance(
A_ID int(10) not null auto_increment unique,
SalaryNo int(10) not null,
A_Date timestamp not null DEFAULT CURRENT_TIMESTAMP,
Grade varchar(15) not null,
OnTime timestamp not null DEFAULT CURRENT_TIMESTAMP,
OffTime timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
Attendance tinyint(1) not null,
Availability tinyint(1) not null,
E_Leave tinyint(1),
Reason varchar(100),
constraint att2_PK primary key(SalaryNo,A_Date),
constraint SalaryNo2_FK foreign key (SalaryNo) references Employee(SalaryNo) ON DELETE CASCADE ON UPDATE CASCADE
);


create table DCAttendance(
A_ID int(10) not null auto_increment unique,
SalaryNo int(10) not null,
A_Date timestamp not null DEFAULT CURRENT_TIMESTAMP,
Grade varchar(15) not null,
OnTime timestamp not null DEFAULT CURRENT_TIMESTAMP,
OffTime timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
Duty int(3) not null,
Attendance tinyint(1) not null,
Availability tinyint(1) not null,
E_Leave tinyint(1),
Reason varchar(100),
constraint att1_PK primary key(SalaryNo,A_Date),
constraint SalaryNo_FK foreign key (SalaryNo) references Employee(SalaryNo) ON DELETE CASCADE ON UPDATE CASCADE
);



CREATE TABLE `ticketmachine` (
  `M_No` int(10) NOT NULL auto_increment primary key,
  `Cid` varchar(10) NOT NULL,
  `M_Warranty_Period` varchar(10) NOT NULL,
  `M_Brand` varchar(10) NOT NULL,
  `M_Price` varchar(10) NOT NULL,
  `M_Manufacturer` varchar(10) NOT NULL,
  `M_ScontactNo` varchar(10) NOT NULL,
  `M_Status` varchar(50) NOT NULL,
  `M_Bought_Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint `ticketcid_fk` foreign key (`Cid`) references `supplier` (`cid`) on delete cascade on update cascade
);

create table guest(
		ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        g_Name varchar(50),
		g_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
        Reason varchar(300),
        
        NIC varchar(15)
);

create table other_vehicle(

		ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        license_number varchar(20),
        o_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
        driver_nic varchar(15),
		o_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
        Reason varchar(300)
); 

create table depot_vehicle(

		ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        license_number varchar(20),
        v_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
        v_come_leave varchar(20),
		v_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
		constraint license_number_FK foreign key (license_number) references busdetailes(BusNumber) ON DELETE CASCADE ON UPDATE CASCADE
        
);

create table ticket_book(

		ID_ticket int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        rout_number varchar(10),
        book_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
        custmer_nic varchar(15),
        seat_number varchar(4),
        price double,
        date_time varchar(20),
		constraint rout_number_FK foreign key (rout_number) references rout(RoutId) ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE `company_item` (
  `cid` varchar(10) NOT NULL,
  `c_type` varchar(30) NOT NULL,
  `item` varchar(30) NOT NULL,
  `price` double NOT NULL,
  `c_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint `companyid_fk` foreign key (`cid`) references `supplier` (`cid`) on delete cascade on update cascade
);

CREATE TABLE `oparations` (
  `OparationId` int(11) NOT NULL,
  `dutyno` int(3) NOT NULL,
  `BusNumber` varchar(7) NOT NULL,
  `StartTime` time NOT NULL,
  `EndTime` time NOT NULL,
  `RoutIdList` varchar(45) NOT NULL,
  `Distrance` double NOT NULL,
  `OType` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`OparationId`),
  KEY `Busno_FK` (`BusNumber`),
  CONSTRAINT `Busno_FK` FOREIGN KEY (`BusNumber`) REFERENCES `busdetailes` (`BusNumber`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `fuelstock` (
  `FuelID` int(20) NOT NULL PRIMARY KEY auto_increment,
  `Name` varchar(45) NOT NULL,
  `Liters` double NOT NULL,
  `S_Date` timestamp not null DEFAULT CURRENT_TIMESTAMP
  
);

CREATE TABLE `fuelrelease` (
  `FuelID` int(11) NOT NULL PRIMARY KEY auto_increment ,
  `BusNo` varchar(45) NOT NULL,
  `ReleaseTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `FuelLiter` double NOT NULL,
  `OilLiter` double NOT NULL,
  `DE` varchar(45) NULL,
  `R_Date` timestamp not null DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE `busrepair` (
  `repreqno` int(10) NOT NULL AUTO_INCREMENT,
  `busno` varchar(10) NOT NULL,
  `placeofacc` varchar(45) NOT NULL,
  `detailacc` varchar(500) NOT NULL,
  `busesinof` varchar(45) NOT NULL,
  `dno` varchar(45) NOT NULL,
  `hovt` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `hovft` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remaingDestance` int(11) NOT NULL,
  PRIMARY KEY (`repreqno`),
  KEY `Busnumber_FK` (`busno`),
  CONSTRAINT `Busnumber_FK` FOREIGN KEY (`busno`) REFERENCES `busdetailes` (`BusNumber`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `parts` (
  `pcode` int(11) NOT NULL AUTO_INCREMENT,
  `parttype` varchar(100) NOT NULL,
  `qunt` int(11) NOT NULL,
  `Price` varchar(45) NOT NULL,
  `Se` varchar(45) NOT NULL,
  `p_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pcode`)
);

CREATE TABLE `service_stock` (
  `scodeno` int(11) NOT NULL AUTO_INCREMENT,
  `parttype` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `eqsupplier` varchar(45) NOT NULL,
  `qunt` varchar(45) NOT NULL,
  `sdet` varchar(45) DEFAULT NULL,
  `S_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`scodeno`)
);

CREATE TABLE `wastemat` (
  `itemno` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(45) NOT NULL,
  `qunt` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  PRIMARY KEY (`itemno`)
);

CREATE TABLE `avil` (
  `avno` int(11) NOT NULL AUTO_INCREMENT,
  `ridno` int(11) NOT NULL,
  `activityno` varchar(45) NOT NULL,
  `sestar` varchar(10) NOT NULL,
  `pority` varchar(45) NOT NULL,
  `busno` varchar(45) DEFAULT NULL,
  `timeset` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`avno`)
);




CREATE TABLE `activitydetails` (
  `TID` INT NOT NULL,
  `RideNumber` INT NOT NULL,
  `TargetIncome` DOUBLE NOT NULL,
  `BusNumber` VARCHAR(7) NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`TID`),
   CONSTRAINT `actiBUS`
    FOREIGN KEY (`BusNumber`)
    REFERENCES `busdetailes` (`BusNumber`));
  
  CREATE TABLE `seasonsincome` (
  `TID` INT NOT NULL,
  `StartNumber` INT NOT NULL,
  `LastNumber` INT NOT NULL,
  `TicketIncome` DOUBLE NOT NULL,
  `PrepaidTicketQty` INT NULL DEFAULT 0,
  `PrepaidTicketIncome` DOUBLE NULL DEFAULT 0,
  `StudentSeasonsQty` INT NULL DEFAULT 0,
  `StudentSeasonsIncome` DOUBLE NULL DEFAULT 0,
  `MachanicalsSeasonsQty` INT NULL DEFAULT 0,
  `EldersSeasonsQty` INT NULL DEFAULT 0,
  `MonksSeasonsQty` INT NULL DEFAULT 0,
  `MonksSeasonsIncome` DOUBLE NULL DEFAULT 0,
  `PoliceVoucherQty` INT NULL DEFAULT 0,
  `PoliceVoucherIncome` DOUBLE NULL DEFAULT 0,
  `LuggageTicketsQty` INT NULL DEFAULT 0,
  `LuggageTicketIncome` DOUBLE NULL DEFAULT 0,
  `ImediatTicketIncome` DOUBLE NULL DEFAULT 0,
  `TotalIncome` DOUBLE NOT NULL,
  `Date` DATE NOT NULL,
  UNIQUE INDEX `TID_UNIQUE` (`TID` ASC),
  CONSTRAINT `seTID`
    FOREIGN KEY (`TID`)
    REFERENCES `activitydetails` (`TID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
	CREATE TABLE `dailyexpenses` (
  `TID` INT NOT NULL,
  `PaidBonus` DOUBLE NULL DEFAULT 0,
  `ParkingEntryPayment` DOUBLE NULL DEFAULT 0,
  `OtherExpenses` DOUBLE NULL DEFAULT 0,
  `Total` DOUBLE NOT NULL DEFAULT 0,
  UNIQUE INDEX `TID_UNIQUE` (`TID` ASC),
  CONSTRAINT `exTID`
    FOREIGN KEY (`TID`)
    REFERENCES `activitydetails` (`TID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
	CREATE TABLE `otherincomes` (
  `Date` DATE NOT NULL,
  `OilVolume` DOUBLE NULL DEFAULT 0,
  `OilPrice` DOUBLE NULL DEFAULT 0,
  `OilIncome` DOUBLE NOT NULL DEFAULT 0,
  `EmptyBaralQty` INT NULL DEFAULT 0,
  `EmptyBaralIncome` DOUBLE NULL DEFAULT 0,
  PRIMARY KEY (`Date`));
  
  CREATE TABLE `rentbuses` (
  `RID` INT NOT NULL AUTO_INCREMENT,
  `BusNumber` VARCHAR(7) NOT NULL,
  `Distance` DOUBLE NOT NULL,
  `PayType` VARCHAR(45) NOT NULL DEFAULT 'Cash',
  `TotalIncome` DOUBLE NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`RID`),
  CONSTRAINT `rentBUS`
    FOREIGN KEY (`BusNumber`)
    REFERENCES `busdetailes` (`BusNumber`));

CREATE TABLE `expensesfinance` (
  `exID` INT NOT NULL,
  `BusNumber` VARCHAR(7) NOT NULL,
  `BillNumber` INT NOT NULL,
  `OtherExpenses` DOUBLE NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`exID`),
   FOREIGN KEY (`BusNumber`)
    REFERENCES `busdetailes` (`BusNumber`));

CREATE TABLE `tenders` (
  `STID` int(11) NOT NULL primary key,
  `UnitPrice` double NOT NULL,
  `type` varchar(20) NOT NULL,
  `Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
 
CREATE TABLE `deposits` (
  `DID` INT NOT NULL,
  `AccountNum` INT NOT NULL,
  `BankDeposits` DOUBLE NOT NULL,
  `SafeDeposits` DOUBLE NOT NULL,
  `Date` DATE NOT NULL,
  PRIMARY KEY (`DID`));
  
CREATE TABLE `monkseasons` (
  `CuponID` INT NOT NULL,
  `ReleaseDate` DATE NOT NULL,
  `UnitPrice` DOUBLE NOT NULL,
  `Qty` INT NOT NULL,
  `Total` DOUBLE NOT NULL,
  PRIMARY KEY (`CuponID`));

CREATE TABLE `normalseasons` (
  `SeasonID` INT NOT NULL,
  `ReleaseDate` DATE NOT NULL,
  `EndDate` DATE NOT NULL,
  `Distance` DOUBLE NOT NULL,
  `Type` VARCHAR(45) NOT NULL,
  `Amount` INT NOT NULL,
  PRIMARY KEY (`SeasonID`));
  
CREATE TABLE `seasonsvalues` (
  `CuponID` INT NULL,
  `SeasonID` INT NULL,
  `PriceKM` DOUBLE NOT NULL,
  `Type` VARCHAR(45) NOT NULL,
  INDEX `monksID_idx` (`CuponID` ASC),
  INDEX `normalID_idx` (`SeasonID` ASC),
  CONSTRAINT `monksID`
    FOREIGN KEY (`CuponID`)
    REFERENCES `monkseasons` (`CuponID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `normalID`
    FOREIGN KEY (`SeasonID`)
    REFERENCES `normalseasons` (`SeasonID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `monthlysalary` (
  `SalaryID` INT NOT NULL,
  `OtherBonus` DOUBLE NULL,
  `LifeTimeBonus` DOUBLE NULL,
  `BookingOT` DOUBLE NULL,
  `UnbookingOT` DOUBLE NULL,
  `MiddleTimeBonus` DOUBLE NULL,
  `Total` DOUBLE NOT NULL,
  `Date` DATE NOT NULL,
  constraint SalID_FK foreign key (SalaryID) references Employee(SalaryNo) ON DELETE CASCADE ON UPDATE CASCADE);

ALTER TABLE `monthlysalary` 
ADD COLUMN `RoomsPay` DOUBLE NULL AFTER `Date`,
ADD COLUMN `OldBusPay` DOUBLE NULL AFTER `RoomsPay`,
ADD COLUMN `ChallangeBonus` DOUBLE NULL AFTER `OldBusPay`;

CREATE TABLE `employeedetails` (
  `SalaryID` INT NOT NULL,
  `SalaryNum` INT NULL,
  `Date` DATE NULL,
  `Total` DOUBLE NOT NULL,
  constraint SalID1_FK foreign key (SalaryID) references Employee(SalaryNo) ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE `dailybonus` (
  `SalaryID` INT NOT NULL,
  `Bounus` DOUBLE NOT NULL DEFAULT 0,
  `Date` DATE NOT NULL,
  constraint SalID2_FK foreign key (SalaryID) references Employee(SalaryNo) ON DELETE CASCADE ON UPDATE CASCADE);



CREATE TABLE `ch_email` (
  `che_id` int(11) NOT NULL AUTO_INCREMENT,
  `mon` int(3) DEFAULT NULL,
  `year` int(5) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `state` int(3) DEFAULT NULL,
  PRIMARY KEY (`che_id`)
);

CREATE TABLE `email_se` (
  `host` varchar(50) DEFAULT NULL,
  `user` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `port` varchar(10) DEFAULT NULL
);

CREATE TABLE `sup_fuel` (
  `cid` varchar(10) NOT NULL,
  `oil_type` varchar(15) NOT NULL,
  `leter` int(10) NOT NULL,
  `price` double NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint `cid_fk` foreign key (`cid`) references `supplier` (`cid`) on delete cascade on update cascade
);

CREATE TABLE `sup_offce` (
  `cid` varchar(10) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `qty` int(10) NOT NULL,
  `price` double NOT NULL,
  `manufac` varchar(10) NOT NULL,
  `woranty` int(5) NOT NULL,
  `status` varchar(15) NOT NULL,
  `se_co_no` int(10) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint `supofcid_fk` foreign key (`cid`) references `supplier` (`cid`) on delete cascade on update cascade
);

CREATE TABLE `sup_service` (
  `cid` varchar(10) NOT NULL,
  `item` varchar(20) NOT NULL,
  `qty` int(10) NOT NULL,
  `price` double NOT NULL,
  `manufacch` varchar(20) NOT NULL,
  `woranty` int(5) NOT NULL,
  `status` varchar(15) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint `supsercid_fk` foreign key (`cid`) references `supplier` (`cid`) on delete cascade on update cascade
);

CREATE TABLE `all_de` (
  `cid` varchar(20) NOT NULL,
  `iname` varchar(50) NOT NULL,
  `qty` int(10) DEFAULT NULL,
  `price` double NOT NULL,
  `manu` varchar(30) DEFAULT NULL,
  `woran` int(10) DEFAULT NULL,
  `stat` varchar(30) DEFAULT NULL,
  `se_con` int(10) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);


#INSERT INTO `duty` VALUES (1,'B','fydfrdõm;dk','','fld<U',283.2),(2,'B','fld<U','','fydfrdõm;dk',283.2),(3,'B','lyg.iaos.s,sh ','fld<U','.f,kaìÿkqjej ',246.9),(5,'B','lsjqf,alv ','','fld<U',239.5),(7,'B','lyg.iaos.s,sh ','','uykqjr',314),(9,'B','fydfrdõm;dk','','wkqrdOmqrh',308.2),(11,'B','fydfrdõm;dk','','wkqrdOmqrh',277.8),(13,'B','lyg.iaos.s,sh ','','fld<U',493.8),(15,'B','fydfrdõm;dk','','wkqrdOmqrh',252.4),(17,'B','fydfrdõm;dk','wkqrdOmqrh',';,dj',280.6),(19,'B','osh;s;a;jej','','wkqrdOmqrh',261.2),(21,'B','riakljej','','fydfrdõfmd;dk',130.4),(23,'B','riakljej','','wkqrdOmqrh',267),(25,'B','jdf.d,a,dlv','','fydfrdõfmd;dk',216),(27,'B','by<osjq,ajej','','fydfrdõfmd;dk',178.8),(29,'B','mäldruvqj','','uykqjr',322.2),(31,'B','fougjej','','wkqrdOmqrh',182.9),(33,'D','lsõf,alv','','wkqrdOmqrh',273),(35,'B','lyg.iaos.s,sh','','leì;sf.d,a,Ej',229),(37,'B','yqre¿ksljej','','wkqrdOmqrh',246.4),(39,'C','mäldruvqj','','wkqrdOmqrh',256.5),(41,'B','ÿgqjej','','wkqrdOmqrh',255.5),(43,'B','hlal,','','wkqrdOmqrh',297),(45,'B','r;au,a.yjej','','lyg.iaos.s,sh',127),(47,'B','r;au,a.yjej','','lyg.iaos.s,sh',127),(49,'B','ÿgqjej','','fydfrdõfmd;dk',171.4),(51,'B','frdgjej','','wkqrdOmqrh',180),(53,'B','fydfrdõfmd;dk','','fld<U',283.2),(54,'B','fld<U','','lyg.iaos.s,sh',266.5),(55,'B','fyÜáálÜáh','','lyg.iaos.s,sh',132.4),(57,'B','lsõf,alv','','fydfrdõfmd;dk',234),(59,'B','md¿jej','.f,kaìÿkqjej','lyg.iaos.s,sh',169.2),(61,'B','yqre¿ksljej','','uykqjr',399),(63,'B','lyg.iaos.s,sh','','lsõf,alv',271.9),(65,'B','lyg.iaos.s,sh','fydfrdõfmd;dk','fld<U',304.9),(66,'B','fld<U','','fydfrdõfmd;dk',304.9),(67,'B','we;dneoswej','','fydfrdõfmd;dk',139.4),(69,'D',';durjej','','fydfrdõfmd;dk',217.4),(71,'B','jdy,alv','','fydfrdõfmd;dk',198),(73,'B','wkqrdOmqrh','',';%sl=Kdu,h',300.8),(75,'B','ÿgqjej','','fld<U',466.5),(77,'C',';durjej','',';%sl=Kdu,h',271),(79,'B','ÿgqjej','','fld<U',266.5);
#alter table oparations add OType varchar(50);
alter table Employee add E_Email varchar(50) not null  unique ;
alter table sltb.fuelrelease add fuelName varchar(50) after FuelID;
alter table sltb.fuelrelease drop OilLiter ;
ALTER TABLE `all_de` ADD CONSTRAINT `scid_fk` FOREIGN KEY (`cid`) REFERENCES `supplier` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE;

INSERT INTO `supplier` (`cid`, `c_name`, `typeo`, `validate_year`, `phone_number`, `address`, `e_maill`, `validate_start_date`) VALUES
('10003', 'iÑka m%hsjÜ ,sñgâ % ', 'ld¾hd,Sh Ndxv ', 9, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:16:10'),
('10004', 'y¾Y m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729757965, 'fud;f,a fld,n   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10005', 'kosl  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10006', 'liqka  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10007', 'misÿ  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 759745965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10008', 'l,am  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729748965, 'l=rekE., fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10009', 'ud,S  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 725778965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10010', 'ñ;=k  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 9, 729745965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10011', 'ufyaYa  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 9, 729748965, 'l=rekE., fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10012', 'iqmqka  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 8, 529748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:15:54'),
('10013', 'iÑka  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 729747965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10014', 'ks,kal  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:15:38'),
('10015', 'ñysr  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 729748565, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10016', 'l=uß  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729548965, 'ud;f,a fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10017', ',,ka;  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 725758965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10018', 'ó.kq  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 9, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10019', ',ais;d  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10020', ',,skao  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 727748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10021', 'm%n;a  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10022', 'iqo¾YkS  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 6, 725748965, 'l=rekE., fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('10023', 'osidkhl  m%rhsjÜ ,sñfgâ ', 'ld¾hd,Sh Ndxv ', 9, 779758965, 'fld,n mdr ó.uqj   ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('12003', 'iÑka m%hsjÜ ,sñgâ % ', 'fiajd Ndkav ', 2, 729642965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12004', 'y¾Y m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729757965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12005', 'kosl  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 729726965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12006', 'liqka  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 769748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12007', 'misÿ  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 759745965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12008', 'l,am  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729768965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12009', 'ud,S  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 725778965, 'ud;f,a fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12010', 'ñ;=k  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 9, 729645965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12011', 'ufyaYa  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 9, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12012', 'iqmqka  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 529748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12013', 'iÑka  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 729747965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12014', 'ks,kal  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729648965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12015', 'ñysr  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 729748565, 'ud;f,a fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('12016', 'l=uß  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729548965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12017', ',,ka;  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 725768265, 'l=rekE., fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12018', 'ó.kq  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 9, 729742965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12019', ',ais;d  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729748965, 'l=rekE., fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12020', ',,skao  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 722748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12021', 'm%n;a  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 2, 729748965, 'ud;f,a fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12022', 'iqo¾YkS  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 6, 726748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('12023', 'osidkhl  m%rhsjÜ ,sñfgâ ', 'fiajd Ndkav ', 9, 772756965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20003', 'iÑka f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20004', 'y¾Y f;,a .nvdj  ', 'bkaOk ', 2, 729757965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20005', 'kosl  f;,a .nvdj  ', 'bkaOk ', 6, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20006', 'liqka  f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20007', 'misÿ  f;,a .nvdj  ', 'bkaOk ', 6, 759745965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20008', 'l,am  f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20009', 'ud,S  f;,a .nvdj  ', 'bkaOk ', 2, 725778965, 'ud;f,a fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20010', 'ñ;=k  f;,a .nvdj  ', 'bkaOk ', 9, 729745965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20011', 'ufyaYa  f;,a .nvdj  ', 'bkaOk ', 9, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20012', 'iqmqka  f;,a .nvdj  ', 'bkaOk ', 2, 529748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20013', 'iÑka  f;,a .nvdj  ', 'bkaOk ', 6, 729747965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20014', 'ks,kal  f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20015', 'ñysr  f;,a .nvdj  ', 'bkaOk ', 6, 729748565, 'ud;f,a fld,n    ', 'kasunc969@gmail.com', '2018-09-18 11:14:54'),
('20016', 'l=uß  f;,a .nvdj  ', 'bkaOk ', 2, 729548965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20017', ',,ka;  f;,a .nvdj  ', 'bkaOk ', 2, 725758965, 'l=rekE., fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20018', 'ó.kq  f;,a .nvdj  ', 'bkaOk ', 9, 729748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20019', ',ais;d  f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'l=rekE., fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20020', ',,skao  f;,a .nvdj  ', 'bkaOk ', 6, 727748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20021', 'm%n;a  f;,a .nvdj  ', 'bkaOk ', 2, 729748965, 'ud;f,a fld,n    ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20022', 'iqo¾YkS  f;,a .nvdj  ', 'bkaOk ', 6, 725748965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54'),
('20023', 'osidkhl  f;,a .nvdj  ', 'bkaOk ', 9, 779758965, 'fld,n mdr ó.uqj   ', 'supunruchira.mg@gmail.com', '2018-09-18 11:14:54');

INSERT INTO `all_de` (`cid`, `iname`, `qty`, `price`, `manu`, `woran`, `stat`, `se_con`, `date`) VALUES
('10003', 'mqgq', 10, 8000, 'fukaäia ', 2, 'w¨;a ', NULL, '2018-09-18 06:26:34'),
('10003', 'mqgq', 19, 15200, 'fukaäia ', 2, 'Ndú;d lrk,o ', NULL, '2018-09-18 06:26:54'),
('10003', 'mqgq', 19, 15200, 'fukaäia ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:27:01'),
('10004', 'fldiq ', 19, 2280, 'fukaäia ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:29:37'),
('10005', 'álÜ ueYska 1', NULL, 12000, 'ieïiqka.a ', 5, 'w¨;a ', 778554233, '2018-09-18 06:30:29'),
('10006', 'álÜ ueYska 2', NULL, 15000, 'ieïiqka.a ', 5, 'w¨;a ', 778554233, '2018-09-18 06:30:55'),
('10007', 'ialEka hka;% ', 19, 950000, 'fukaäia ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:31:13'),
('10007', 'ialEka hka;% ', 19, 950000, 'fukaäia ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:31:18'),
('10007', 'ialEka hka;% ', 19, 950000, 'fukaäia ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:31:21'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'ieïiqka.a ', 5, 'w¨;a ', 778554233, '2018-09-18 06:31:37'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'ieïiqka.a ', 5, 'w¨;a ', 778554233, '2018-09-18 06:31:41'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'ieïiqka.a ', 5, 'w¨;a ', 778554233, '2018-09-18 06:31:44'),
('10009', 'álÜ ueYska 1', NULL, 12000, 'ñrdud¾ ', 5, 'w¨;a ', 778554233, '2018-09-18 06:32:38'),
('10009', 'álÜ ueYska 1', NULL, 12000, 'ñrdud¾ ', 8, 'm%;sixialrKh l, ', 778554233, '2018-09-18 06:32:50'),
('10009', 'álÜ ueYska 1', NULL, 12000, 'ñrdud¾ ', 8, 'Ndú;d lrk,o ', 778554233, '2018-09-18 06:32:55'),
('10010', 'bo,a ', 69, 10350, 'y¾Y ', 2, 'w¨;a ', NULL, '2018-09-18 06:33:27'),
('10010', 'bo,a ', 69, 10350, 'y¾Y ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:33:35'),
('10003', 'álÜ ueYska 3', NULL, 20000, 'ñrdud¾ ', 8, 'Ndú;d lrk,o ', 778554233, '2018-09-18 06:37:19'),
('10003', 'álÜ ueYska 3', NULL, 20000, 'iqñ;a ', 6, 'm%;sixialrKh l, ', 777855453, '2018-09-18 06:37:55'),
('10003', 'álÜ ueYska 3', NULL, 20000, 'iqñ;a ', 4, 'Ndú;d lrk,o ', 777855453, '2018-09-18 06:38:16'),
('10006', 'mß.kl ', 7, 350000, 'y¾Y ', 2, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:38:43'),
('10006', 'mß.kl ', 7, 350000, 'y¾Y ', 2, 'Ndú;d lrk,o ', NULL, '2018-09-18 06:38:49'),
('10006', 'mß.kl ', 7, 350000, 'mqnqÿ ', 2, 'Ndú;d lrk,o ', NULL, '2018-09-18 06:39:02'),
('10007', 'ialEka hka;% ', 8, 400000, 'ud,skao ', 8, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:39:36'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'ljils ', 9, 'w¨;a ', 114775633, '2018-09-18 06:40:18'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'ljils ', 9, 'Ndú;d lrk,o ', 114775633, '2018-09-18 06:40:24'),
('10008', 'álÜ ueYska 2', NULL, 15000, 'bkaoshd s ', 5, 'm%;sixialrKh l, ', 114775633, '2018-09-18 06:41:17'),
('10006', 'álÜ ueYska 2', NULL, 15000, 'bkaoshd s ', 5, 'm%;sixialrKh l, ', 114775633, '2018-09-18 06:41:35'),
('10010', 'álÜ ueYska 3', NULL, 20000, 'ñßkao ', 3, 'm%;sixialrKh l, ', 114775669, '2018-09-18 06:42:13'),
('10010', 'álÜ ueYska 3', NULL, 20000, 'ñßkao ', 3, 'w¨;a ', 114775669, '2018-09-18 06:42:18'),
('10010', 'álÜ ueYska 3', NULL, 20000, 'Yd,skS ', 3, 'w¨;a ', 778899665, '2018-09-18 06:43:34'),
('10010', 'álÜ ueYska 3', NULL, 20000, 'Yd,skS ', 3, 'm%;sixialrKh l, ', 778899665, '2018-09-18 06:43:40'),
('10006', 'álÜ ueYska 1', NULL, 12000, 'liqka ', 6, 'm%;sixialrKh l, ', 778669666, '2018-09-18 06:44:22'),
('10006', 'álÜ ueYska 1', NULL, 12000, 'liqka ', 5, 'w¨;a ', 778669666, '2018-09-18 06:44:40'),
('10003', 'taiS hka;% ', 6, 72000, 'l,k ', 8, 'w¨;a ', NULL, '2018-09-18 06:45:16'),
('10003', 'taiS hka;% ', 6, 72000, 'l,k ', 8, 'Ndú;d lrk,o ', NULL, '2018-09-18 06:45:22'),
('10009', 'álÜ ueYska 1', NULL, 12000, 'ñ;=k ', 2, 'Ndú;d lrk,o ', 778982587, '2018-09-18 06:46:00'),
('12003', 'gh¾ ', 55, 2200000, 'y¾Y ', 6, 'w¨;a ', NULL, '2018-09-18 06:46:29'),
('12003', 'msiagka ', 100, 5000000, 'ñ,sk ', 9, 'w¨;a ', NULL, '2018-09-18 06:47:02'),
('12004', 'leurd ', 100, 500000, 'ñ,sk ', 9, 'w¨;a ', NULL, '2018-09-18 06:47:39'),
('12005', 'oe;s frdao ', 100, 250000, 'ñ,sk ', 9, 'w¨;a ', NULL, '2018-09-18 06:47:50'),
('12006', 'ßï ', 100, 3000000, 'ñ,sk ', 9, 'w¨;a ', NULL, '2018-09-18 06:48:03'),
('12007', 'lkakdä ', 100, 100000, 'ñ,sk ', 9, 'w¨;a ', NULL, '2018-09-18 06:48:17'),
('12009', 'YSÜ ', 8, 32000, 'ñ,sk ', 9, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:48:38'),
('12010', 'fydaka ', 8, 8000, 'ñ,sk ', 9, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:48:51'),
('12011', 'jE,a ', 8, 32000, 'liqka ', 5, 'm%;sixialrKh l, ', NULL, '2018-09-18 06:49:41'),
('20003', 'fmg%,a ', 1000, 120000, NULL, NULL, NULL, NULL, '2018-09-18 06:50:00'),
('20003', 'ãi,a ', 100, 10000, NULL, NULL, NULL, NULL, '2018-09-18 06:50:34'),
('20004', 'iqm¾ Ths,a ', 1000, 150000, NULL, NULL, NULL, NULL, '2018-09-18 06:50:50'),
('20004', 'fkdau,a Ths,a ', 1000, 150000, NULL, NULL, NULL, NULL, '2018-09-18 06:50:59'),
('20006', 'N+ñ f;,a ', 1070, 96300, NULL, NULL, NULL, NULL, '2018-09-18 06:51:17'),
('20007', 'l¨ Ths,a ', 10, 500, NULL, NULL, NULL, NULL, '2018-09-18 06:51:32'),
('20003', 'fmg%,a ', 1000, 120000, NULL, NULL, NULL, NULL, '2018-09-18 06:52:12'),
('20006', 'iqm¾ Ths,a ', 100000, 15000000, NULL, NULL, NULL, NULL, '2018-09-18 06:52:28'),
('20007', 'l¨ Ths,a ', 100, 5000, NULL, NULL, NULL, NULL, '2018-09-18 06:52:43'),
('20007', 'fkdau,a Ths,a ', 100, 5000, NULL, NULL, NULL, NULL, '2018-09-18 06:53:23'),
('20005', 'l¨ Ths,a ', 500, 25000, NULL, NULL, NULL, NULL, '2018-09-18 06:53:48'),
('20005', 'fkdau,a Ths,a ', 500, 25000, NULL, NULL, NULL, NULL, '2018-09-18 06:53:53'),
('20003', 'ãi,a ', 500, 50000, NULL, NULL, NULL, NULL, '2018-09-18 06:54:25'),
('20004', 'iqm¾ Ths,a ', 222, 33300, NULL, NULL, NULL, NULL, '2018-09-18 06:56:15');

INSERT INTO `company_item` (`cid`, `c_type`, `item`, `price`, `c_date`) VALUES
('12003', 'fiajd Ndkav', 'gh¾ ', 10000, '2018-08-29 12:40:29'),
('12003', 'fiajd Ndkav', 'lkakdä ', 1000, '2018-08-29 12:40:29'),
('12003', 'fiajd Ndkav ', 'gh¾ ', 40000, '2018-08-29 12:46:31'),
('12003', 'fiajd Ndkav ', 'lkakdä ', 1000, '2018-08-29 13:47:47'),
('12003', 'fiajd Ndkav ', 'msiagka ', 50000, '2018-08-29 13:47:47'),
('12017', 'fiajd Ndkav ', 'ma,.a ', 30000, '2018-08-29 13:47:47'),
('12003', 'fiajd Ndkav ', 'gexls ', 8000, '2018-08-29 13:47:47'),
('12003', 'fiajd Ndkav ', 'jE,a ', 4000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'hlv ng ', 1000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'ksl, ng ', 2000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'msWia ', 500, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'leurd ', 5000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'ßï ', 30000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'n,aí ', 700, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'fydaka ', 1000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'ù,a ', 5000, '2018-08-29 13:47:47'),
('12004', 'fiajd Ndkav ', 'fn,a ', 400, '2018-08-29 13:47:47'),
('12005', 'fiajd Ndkav ', 'YSÜ ', 4000, '2018-08-29 13:47:47'),
('12005', 'fiajd Ndkav ', 'oe;s frdao ', 2500, '2018-08-29 13:47:47'),
('12005', 'fiajd Ndkav ', ';yvq ', 1000, '2018-08-29 13:47:47'),
('12013', 'fiajd Ndkav ', 'ldnka ', 4000, '2018-08-29 13:47:47'),
('12005', 'fiajd Ndkav ', 'kÜ ', 100, '2018-08-29 13:47:48'),
('12005', 'fiajd Ndkav ', 'iaúÉ ', 100, '2018-08-29 13:47:48'),
('12005', 'fiajd Ndkav ', 'lkakdä ', 1000, '2018-08-29 13:48:31'),
('12005', 'fiajd Ndkav ', 'msiagka ', 50000, '2018-08-29 13:48:31'),
('12005', 'fiajd Ndkav ', 'ma,.a ', 30000, '2018-08-29 13:48:31'),
('12005', 'fiajd Ndkav ', 'gexls ', 8000, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'jE,a ', 4000, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'hlv ng ', 1000, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'ksl, ng ', 2000, '2018-08-29 13:48:31'),
('12014', 'fiajd Ndkav ', 'msWia ', 500, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'leurd ', 5000, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'ßï ', 30000, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'n,aí ', 700, '2018-08-29 13:48:31'),
('12006', 'fiajd Ndkav ', 'fydaka ', 1000, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'ù,a ', 5000, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'fn,a ', 400, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'YSÜ ', 4000, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'oe;s frdao ', 2500, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', ';yvq ', 1000, '2018-08-29 13:48:31'),
('12015', 'fiajd Ndkav ', 'ldnka ', 4000, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'kÜ ', 100, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'iaúÉ ', 100, '2018-08-29 13:48:31'),
('12007', 'fiajd Ndkav ', 'lkakdä ', 1000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'msiagka ', 50000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'ma,.a ', 30000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'gexls ', 8000, '2018-08-29 13:50:20'),
('12011', 'fiajd Ndkav ', 'jE,a ', 4000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'hlv ng ', 1000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'ksl, ng ', 2000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'msWia ', 500, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'leurd ', 5000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'ßï ', 30000, '2018-08-29 13:50:20'),
('12008', 'fiajd Ndkav ', 'n,aí ', 700, '2018-08-29 13:50:20'),
('12010', 'fiajd Ndkav ', 'fydaka ', 1000, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'ù,a ', 5000, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'fn,a ', 400, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'YSÜ ', 4000, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'oe;s frdao ', 2500, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', ';yvq ', 1000, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'ldnka ', 4000, '2018-08-29 13:50:20'),
('12009', 'fiajd Ndkav ', 'kÜ ', 100, '2018-08-29 13:50:20'),
('12012', 'fiajd Ndkav ', 'iaúÉ ', 120000, '2018-08-29 13:50:20'),
('12012', 'fiajd Ndkav ', 'msiagka ', 50000, '2018-08-29 13:51:41'),
('12012', 'fiajd Ndkav ', 'ma,.a ', 30000, '2018-08-29 13:51:41'),
('12012', 'fiajd Ndkav ', 'gexls ', 8000, '2018-08-29 13:51:41'),
('12013', 'fiajd Ndkav ', 'jE,a ', 4000, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', 'hlv ng ', 1000, '2018-08-29 13:51:42'),
('12015', 'fiajd Ndkav ', 'ksl, ng ', 2000, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', 'msWia ', 500, '2018-08-29 13:51:42'),
('12018', 'fiajd Ndkav ', 'ßï ', 30000, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', 'n,aí ', 700, '2018-08-29 13:51:42'),
('12020', 'fiajd Ndkav ', 'fydaka ', 1000, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', 'ù,a ', 5000, '2018-08-29 13:51:42'),
('12022', 'fiajd Ndkav ', 'fn,a ', 400, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', 'YSÜ ', 4000, '2018-08-29 13:51:42'),
('12023', 'fiajd Ndkav ', 'oe;s frdao ', 2500, '2018-08-29 13:51:42'),
('12012', 'fiajd Ndkav ', ';yvq ', 1000, '2018-08-29 13:51:42'),
('12023', 'fiajd Ndkav ', 'ldnka ', 4000, '2018-08-29 13:51:42'),
('20003', 'bkaOk ', 'fmg%,a ', 120, '2018-08-29 13:51:42'),
('20003', 'bkaOk ', 'ãi,a ', 100, '2018-08-29 13:51:42'),
('20004', 'bkaOk ', 'iqm¾ Ths,a ', 150, '2018-08-29 13:51:42'),
('20004', 'bkaOk ', 'fkdau,a Ths,a ', 90, '2018-08-29 13:51:42'),
('20004', 'bkaOk ', 'N+ñ f;,a ', 90, '2018-08-29 13:51:42'),
('20005', 'bkaOk ', 'l¨ Ths,a ', 50, '2018-08-29 13:51:42'),
('20005', 'bkaOk ', 'fmg%,a ', 120, '2018-08-29 13:51:42'),
('20005', 'bkaOk ', 'ãi,a ', 100, '2018-08-29 13:51:42'),
('20006', 'bkaOk ', 'iqm¾ Ths,a ', 150, '2018-08-29 13:51:42'),
('20006', 'bkaOk ', 'fkdau,a Ths,a ', 90, '2018-08-29 13:51:42'),
('20006', 'bkaOk ', 'N+ñ f;,a ', 90, '2018-08-29 13:51:43'),
('20007', 'bkaOk ', 'l¨ Ths,a ', 50, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'mqgq', 800, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'fïi ', 1000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'lnâ ', 10000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'mß.kl ', 50000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'uqøk hka;% ', 8000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 1', 12000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 2', 15000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 3', 20000, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'lvodis ', 120, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'ta4', 5, '2018-08-29 13:51:43'),
('10003', 'ld¾hd,Sh Ndxv ', 'taiS hka;% ', 12000, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', '*Eka ', 5000, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', 'fmd;a ', 120, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', ';ska; ', 1200, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', 'fldiq ', 120, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', 'bo,a ', 150, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', 'ialEka hka;% ', 50000, '2018-08-29 13:51:43'),
('10004', 'ld¾hd,Sh Ndxv ', 'mqgq', 800, '2018-08-29 13:51:44'),
('10004', 'ld¾hd,Sh Ndxv ', 'fïi ', 1000, '2018-08-29 13:51:44'),
('10004', 'ld¾hd,Sh Ndxv ', 'lnâ ', 10000, '2018-08-29 13:51:44'),
('10004', 'ld¾hd,Sh Ndxv ', 'mß.kl ', 50000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'uqøk hka;% ', 8000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 1', 12000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 2', 15000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 3', 20000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'ta4', 5, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'taiS hka;% ', 12000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', '*Eka ', 5000, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'fmd;a ', 120, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', ';ska; ', 1200, '2018-08-29 13:51:44'),
('10005', 'ld¾hd,Sh Ndxv ', 'bo,a ', 150, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'ialEka hka;% ', 50000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'mqgq', 800, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'fïi ', 1000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'lnâ ', 10000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'mß.kl ', 50000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'uqøk hka;% ', 8000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 1', 12000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 2', 15000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 3', 20000, '2018-08-29 13:51:44'),
('10006', 'ld¾hd,Sh Ndxv ', 'lvodis ', 120, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'ta4', 5, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'taiS hka;% ', 12000, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', '*Eka ', 5000, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'fmd;a ', 120, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', ';ska; ', 1200, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'fldiq ', 120, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'bo,a ', 150, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'ialEka hka;% ', 50000, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'mqgq', 800, '2018-08-29 13:51:44'),
('10007', 'ld¾hd,Sh Ndxv ', 'fïi ', 1000, '2018-08-29 13:51:44'),
('10008', 'ld¾hd,Sh Ndxv ', 'lnâ ', 10000, '2018-08-29 13:51:44'),
('10008', 'ld¾hd,Sh Ndxv ', 'uqøk hka;% ', 8000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 1', 12000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 2', 15000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 3', 20000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'lvodis ', 120, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'ta4', 5, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'taiS hka;% ', 12000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', '*Eka ', 5000, '2018-08-29 13:51:45'),
('10008', 'ld¾hd,Sh Ndxv ', 'fmd;a ', 120, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', ';ska; ', 1200, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'fldiq ', 120, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'bo,a ', 150, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'ialEka hka;% ', 50000, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'mqgq', 800, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'fïi ', 1000, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'mß.kl ', 50000, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'uqøk hka;% ', 8000, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 1', 12000, '2018-08-29 13:51:45'),
('10009', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 2', 15000, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', 'álÜ ueYska 3', 20000, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', 'lvodis ', 120, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', '*Eka ', 5000, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', 'fmd;a ', 120, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', ';ska; ', 1200, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', 'bo,a ', 150, '2018-08-29 13:51:45'),
('10010', 'ld¾hd,Sh Ndxv ', 'ialEka hka;% ', 50000, '2018-08-29 13:51:45');

INSERT INTO `sup_fuel` (`cid`, `oil_type`, `leter`, `price`, `date`) VALUES
('20003', 'fmg%,a ', 1000, 120, '2018-09-18 12:20:00'),
('20003', 'ãi,a ', 100, 100, '2018-09-18 12:20:33'),
('20004', 'iqm¾ Ths,a ', 1000, 150, '2018-09-18 12:20:50'),
('20004', 'fkdau,a Ths,a ', 1000, 150, '2018-09-18 12:20:59'),
('20006', 'N+ñ f;,a ', 1070, 90, '2018-09-18 12:21:17'),
('20007', 'l¨ Ths,a ', 10, 50, '2018-09-18 12:21:32'),
('20003', 'fmg%,a ', 1000, 120, '2018-09-18 12:22:12'),
('20006', 'iqm¾ Ths,a ', 100000, 150, '2018-09-18 12:22:28'),
('20007', 'l¨ Ths,a ', 100, 50, '2018-09-18 12:22:43'),
('20007', 'fkdau,a Ths,a ', 100, 50, '2018-09-18 12:23:23'),
('20005', 'l¨ Ths,a ', 500, 50, '2018-09-18 12:23:48'),
('20005', 'fkdau,a Ths,a ', 500, 50, '2018-09-18 12:23:53'),
('20003', 'ãi,a ', 500, 100, '2018-09-18 12:24:25'),
('20004', 'iqm¾ Ths,a ', 222, 150, '2018-09-18 12:26:15');

INSERT INTO `sup_offce` (`cid`, `item_name`, `qty`, `price`, `manufac`, `woranty`, `status`, `se_co_no`, `date`) VALUES
('10003', 'mqgq', 10, 800, 'fukaäia ', 2, 'w¨;a ', 777139219, '2018-09-18 11:56:34'),
('10003', 'mqgq', 19, 800, 'fukaäia ', 2, 'Ndú;d lrk,o ', 777139219, '2018-09-18 11:56:54'),
('10003', 'mqgq', 19, 800, 'fukaäia ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 11:57:01'),
('10004', 'fldiq ', 19, 120, 'fukaäia ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 11:59:37'),
('10007', 'ialEka hka;% ', 19, 50000, 'fukaäia ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:01:13'),
('10007', 'ialEka hka;% ', 19, 50000, 'fukaäia ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:01:18'),
('10007', 'ialEka hka;% ', 19, 50000, 'fukaäia ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:01:21'),
('10010', 'bo,a ', 69, 150, 'y¾Y ', 2, 'w¨;a ', 777139219, '2018-09-18 12:03:27'),
('10010', 'bo,a ', 69, 150, 'y¾Y ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:03:35'),
('10006', 'mß.kl ', 7, 50000, 'y¾Y ', 2, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:08:43'),
('10006', 'mß.kl ', 7, 50000, 'y¾Y ', 2, 'Ndú;d lrk,o ', 777139219, '2018-09-18 12:08:49'),
('10006', 'mß.kl ', 7, 50000, 'mqnqÿ ', 2, 'Ndú;d lrk,o ', 777139219, '2018-09-18 12:09:02'),
('10007', 'ialEka hka;% ', 8, 50000, 'ud,skao ', 8, 'm%;sixialrKh l,', 777139219, '2018-09-18 12:09:36'),
('10003', 'taiS hka;% ', 6, 12000, 'l,k ', 8, 'w¨;a ', 778889636, '2018-09-18 12:15:16'),
('10003', 'taiS hka;% ', 6, 12000, 'l,k ', 8, 'Ndú;d lrk,o ', 778889636, '2018-09-18 12:15:22');

INSERT INTO `sup_service` (`cid`, `item`, `qty`, `price`, `manufacch`, `woranty`, `status`, `date`) VALUES
('12003', 'gh¾ ', 55, 40000, 'y¾Y ', 6, 'w¨;a ', '2018-09-18 12:16:29'),
('12003', 'msiagka ', 100, 50000, 'ñ,sk ', 9, 'w¨;a ', '2018-09-18 12:17:02'),
('12004', 'leurd ', 100, 5000, 'ñ,sk ', 9, 'w¨;a ', '2018-09-18 12:17:39'),
('12005', 'oe;s frdao ', 100, 2500, 'ñ,sk ', 9, 'w¨;a ', '2018-09-18 12:17:50'),
('12006', 'ßï ', 100, 30000, 'ñ,sk ', 9, 'w¨;a ', '2018-09-18 12:18:03'),
('12007', 'lkakdä ', 100, 1000, 'ñ,sk ', 9, 'w¨;a ', '2018-09-18 12:18:17'),
('12009', 'YSÜ ', 8, 4000, 'ñ,sk ', 9, 'm%;sixialrKh l,', '2018-09-18 12:18:38'),
('12010', 'fydaka ', 8, 1000, 'ñ,sk ', 9, 'm%;sixialrKh l,', '2018-09-18 12:18:51'),
('12011', 'jE,a ', 8, 4000, 'liqka ', 5, 'm%;sixialrKh l,', '2018-09-18 12:19:41');

INSERT INTO `tenders` (`STID`, `UnitPrice`, `type`, `Date`) VALUES
(10000, 200000, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:37:08'),
(10002, 50000, 'ld¾hd,Sh Ndxv ', '2018-08-30 10:08:14'),
(10025, 57755, 'ld¾hd,Sh Ndxv ', '2018-08-30 15:35:43'),
(11000, 2000005, 'bkaOk ', '2018-08-29 22:37:22'),
(11221, 1000, 'ld¾hd,Sh Ndxv ', '2018-08-30 13:33:09'),
(12000, 208745, 'fiajd Ndkav ', '2018-08-29 22:37:36'),
(13000, 2088622, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:37:48'),
(14000, 7796552, 'bkaOk ', '2018-08-29 22:38:05'),
(14526, 57755, 'ld¾hd,Sh Ndxv ', '2018-08-30 15:36:11'),
(14527, 12000, 'fiajd Ndkav ', '2018-08-29 23:49:17'),
(14528, 20000, 'ld¾hd,Sh Ndxv ', '2018-08-30 09:45:26'),
(14537, 223, 'fiajd Ndkav ', '2018-08-30 00:52:47'),
(14538, 223, 'bkaOk ', '2018-08-30 00:52:17'),
(14782, 57755, 'bkaOk ', '2018-08-30 15:36:52'),
(14789, 57755, 'fiajd Ndkav ', '2018-08-30 15:41:18'),
(15000, 77968666, 'fiajd Ndkav ', '2018-08-29 22:38:19'),
(16000, 560000, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:38:46'),
(17000, 860000, 'bkaOk ', '2018-08-29 22:38:59'),
(18000, 860089, 'fiajd Ndkav ', '2018-08-29 22:39:20'),
(19000, 990000, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:39:36'),
(20000, 990000, 'bkaOk ', '2018-08-29 22:39:47'),
(24531, 10000, 'ld¾hd,Sh Ndxv ', '2018-08-30 11:14:12'),
(24532, 10000, 'ld¾hd,Sh Ndxv ', '2018-08-30 11:15:00'),
(24533, 10000, 'bkaOk ', '2018-08-30 11:16:41'),
(24534, 10000, 'fiajd Ndkav ', '2018-08-30 11:17:14'),
(25255, 24555, 'ld¾hd,Sh Ndxv ', '2018-08-30 09:52:55'),
(25555, 10000, 'ld¾hd,Sh Ndxv ', '2018-08-30 15:34:51'),
(30000, 990000, 'fiajd Ndkav ', '2018-08-29 22:40:00'),
(33333, 2225600, 'bkaOk ', '2018-09-18 12:25:52'),
(55553, 5, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:04:58'),
(56566, 6566, 'ld¾hd,Sh Ndxv ', '2018-08-29 21:26:23'),
(57785, 200000, 'ld¾hd,Sh Ndxv ', '2018-08-30 10:01:56'),
(70000, 10000, 'ld¾hd,Sh Ndxv ', '2018-08-29 22:36:19'),
(77777, 5566666, 'ld¾hd,Sh Ndxv ', '2018-08-30 10:00:53'),
(80000, 1000000, 'bkaOk ', '2018-08-29 22:36:35'),
(80004, 555555, 'fiajd Ndkav ', '2018-08-29 23:41:26'),
(90000, 1000000, 'fiajd Ndkav ', '2018-08-29 22:36:48');

INSERT INTO `ticketmachine` (`M_No`, `Cid`, `M_Warranty_Period`, `M_Brand`, `M_Price`, `M_Manufacturer`, `M_ScontactNo`, `M_Status`, `M_Bought_Date`) VALUES
(27, '10005', '5', 'samsung', '12000.0', 'ieïiqka.a ', '0778554233', 'w¨;a ', '2018-09-18 12:00:28'),
(28, '10006', '5', 'apple', '15000.0', 'ieïiqka.a ', '0778554233', 'w¨;a ', '2018-09-18 12:00:55'),
(29, '10008', '5', 'apple', '15000.0', 'ieïiqka.a ', '0778554233', 'w¨;a ', '2018-09-18 12:01:37'),
(30, '10008', '5', 'apple', '15000.0', 'ieïiqka.a ', '0778554233', 'w¨;a ', '2018-09-18 12:01:41'),
(31, '10008', '5', 'apple', '15000.0', 'ieïiqka.a ', '0778554233', 'w¨;a ', '2018-09-18 12:01:44'),
(32, '10009', '5', 'dell', '12000.0', 'ñrdud¾ ', '0778554233', 'w¨;a ', '2018-09-18 12:02:38'),
(33, '10009', '8', 'dell', '12000.0', 'ñrdud¾ ', '0778554233', 'm%;sixialrKh l, ', '2018-09-18 12:02:50'),
(34, '10009', '8', 'dell', '12000.0', 'ñrdud¾ ', '0778554233', 'Ndú;d lrk,o ', '2018-09-18 12:02:55'),
(35, '10003', '8', 'dell', '20000.0', 'ñrdud¾ ', '0778554233', 'Ndú;d lrk,o ', '2018-09-18 12:07:19'),
(36, '10003', '6', 'pilips', '20000.0', 'iqñ;a ', '0777855453', 'm%;sixialrKh l, ', '2018-09-18 12:07:55'),
(37, '10003', '4', 'nokia', '20000.0', 'iqñ;a ', '0777855453', 'Ndú;d lrk,o ', '2018-09-18 12:08:16'),
(38, '10008', '9', 'kavasaki', '15000.0', 'ljils ', '0114775633', 'w¨;a ', '2018-09-18 12:10:18'),
(39, '10008', '9', 'kavasaki', '15000.0', 'ljils ', '0114775633', 'Ndú;d lrk,o ', '2018-09-18 12:10:24'),
(40, '10008', '5', 'huwawe', '15000.0', 'bkaoshd s ', '0114775633', 'm%;sixialrKh l, ', '2018-09-18 12:11:17'),
(41, '10006', '5', 'huwawe', '15000.0', 'bkaoshd s ', '0114775633', 'm%;sixialrKh l, ', '2018-09-18 12:11:35'),
(42, '10010', '3', 'huwawe', '20000.0', 'ñßkao ', '0114775669', 'm%;sixialrKh l, ', '2018-09-18 12:12:13'),
(43, '10010', '3', 'huwawe', '20000.0', 'ñßkao ', '0114775669', 'w¨;a ', '2018-09-18 12:12:18'),
(44, '10010', '3', 'mic', '20000.0', 'Yd,skS ', '0778899665', 'w¨;a ', '2018-09-18 12:13:34'),
(45, '10010', '3', 'mic', '20000.0', 'Yd,skS ', '0778899665', 'm%;sixialrKh l, ', '2018-09-18 12:13:40'),
(46, '10006', '6', 'micro', '12000.0', 'liqka ', '0778669666', 'm%;sixialrKh l, ', '2018-09-18 12:14:22'),
(47, '10006', '5', 'micro', '12000.0', 'liqka ', '0778669666', 'w¨;a ', '2018-09-18 12:14:40'),
(48, '10009', '2', 'micromax', '12000.0', 'ñ;=k ', '0778982587', 'Ndú;d lrk,o ', '2018-09-18 12:16:00');

INSERT INTO `email_se` VALUES ('smtp.gmail.com','lankanstwtravels@gmail.com','Stwtravel','587');
INSERT INTO `duty` VALUES (1,'B','fydfrdõm;dk','','fld<U',283.2),(2,'B','fld<U','','fydfrdõm;dk',283.2),(3,'B','lyg.iaos.s,sh ','fld<U','.f,kaìÿkqjej ',246.9),(5,'B','lsjqf,alv ','','fld<U',239.5),(7,'B','lyg.iaos.s,sh ','','uykqjr',314),(9,'B','fydfrdõm;dk','','wkqrdOmqrh',308.2),(11,'B','fydfrdõm;dk','','wkqrdOmqrh',277.8),(13,'B','lyg.iaos.s,sh ','','fld<U',493.8),(15,'B','fydfrdõm;dk','','wkqrdOmqrh',252.4),(17,'B','fydfrdõm;dk','wkqrdOmqrh',';,dj',280.6),(19,'B','osh;s;a;jej','','wkqrdOmqrh',261.2),(21,'B','riakljej','','fydfrdõfmd;dk',130.4),(23,'B','riakljej','','wkqrdOmqrh',267),(25,'B','jdf.d,a,dlv','','fydfrdõfmd;dk',216),(27,'B','by<osjq,ajej','','fydfrdõfmd;dk',178.8),(29,'B','mäldruvqj','','uykqjr',322.2),(31,'B','fougjej','','wkqrdOmqrh',182.9),(33,'D','lsõf,alv','','wkqrdOmqrh',273),(35,'B','lyg.iaos.s,sh','','leì;sf.d,a,Ej',229),(37,'B','yqre¿ksljej','','wkqrdOmqrh',246.4);

insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla tia r;akdhl","K S Rathnayake","Male","ó.uqj mdr okafldgqj","112233445V","Driver","1985-08-04","20000","44578866846","987654321","0712583699","Good","0779874756","sachinhotel@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tia tia osidkdhl","S S Disanayaka","Male","ó.uqj mdr okafldgqj","332233445V","Driver","1985-08-05","20000","54578866846","987654321","0712583698","Good","0779874758","ssd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla fla ir;a","K K Sarath","Male","ó.uqj mdr okafldgqj","812233445V","Driver","1985-08-03","20000","34578866846","987654321","0712583697","Good","0779874751","sad@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla tia r;akfialr ","K S Rathnasekara","Male","ó.uqj mdr okafldgqj","712233445V","Driver","1985-08-02","20000","44578866845","987654321","0712583696","Good","0779874752","sdd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ã tia à r;akdhl","D S T Rathnayake","Male","ó.uqj mdr okafldgqj","612233445V","Driver","1985-08-01","20000","44578866844","987654321","0712583695","Good","0779874753","szd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla tia is,ajd","K S Silva","Male","ó.uqj mdr okafldgqj","999233445V","Driver","1985-08-06","20000","44578866843","987654321","0722583699","Good","0719874756","sqd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tï mS myka","M P Pahan","Male","ó.uqj mdr okafldgqj","812233448V","Driver","1988-08-04","20000","66578866846","987654321","0712583688","Good","0779874856","swd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla tia risl","K S Rasika","Male","ó.uqj mdr okafldgqj","822233445V","Driver","1985-08-12","20000","44578866811","987654321","0714583699","Good","0774874756","sed@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î tia is,ajd","B S Silva","Male","ó.uqj mdr okafldgqj","832233445V","Driver","1985-08-13","20000","44578667777","987654321","0732583699","Good","0739874756","srd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("mS tia OkqYal","P S Dhanushka","Male","ó.uqj mdr okafldgqj","842233445V","Driver","1985-08-14","20000","55578866846","987654321","0777583699","Good","0777874756","sssrdd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("mS mS r;akdhl","P P Rathnayake","Male","ó.uqj mdr okafldgqj","162233445V","Driver","1985-08-15","20000","66578866846","987654321","0712583789","Good","0779874788","sbvcd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î tia l=i,a","B S Kusal","Male","ó.uqj mdr okafldgqj","552233445V","Driver","1985-08-16","20000","77578866846","987654321","0718983699","Good","0771874756","smmd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("Ô à mjka","G T Pavan","Male","ó.uqj mdr okafldgqj","992233445V","Driver","1988-08-17","20000","99978866846","987654321","0782583699","Good","0779874889","sbbd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ã tia isß,a","D S Siril","Male","ó.uqj mdr okafldgqj","952233456V","Driver","1989-08-18","20000","44571236846","987654321","0712583556","Good","0779564756","ppd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ta tï iqrka.","A M Suranga","Male","ó.uqj mdr okafldgqj","666233445V","Driver","1985-08-19","20000","98978866846","987654321","0752583698","Good","0770874756","mmk@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("s´ tia iqr,a","O S Sural","Male","ó.uqj mdr okafldgqj","772233445V","Driver","1988-08-04","20000","95578866846","987654321","0722583555","Good","0779874999","lld@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î î iqks,a","B B Sunil","Male","ó.uqj mdr okafldgqj","799233445V","Driver","1978-08-05","20000","88878866846","987654321","0789583699","Good","0789874759","poi@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tÉ t*a m%kdkaÿ","H F Fernandu","Male","ó.uqj mdr okafldgqj","333233445V","Driver","1981-09-04","20000","55579966846","987654321","0752583622","Good","0759874777","thd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ã tia lu,a","D S Kamal","Male","ó.uqj mdr okafldgqj","999833445V","Driver","1985-09-03","20000","22578866846","987654321","0713383692","Good","0772274799","jkl@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("t,a tia is,ajd","L S Silva","Male","ó.uqj mdr okafldgqj","668833445V","Driver","1985-10-25","20000","88888966846","987654321","0722582999","Good","0777474756","bbg@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î à iuka","B T Saman","Male","ó.uqj mdr okafldgqj","632233445V","Driver","1977-08-04","20000","44573333846","987654321","0742583699","Good","0739974733","ookuy@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("iS B fmf¾rd","C E Perera","Male","ó.uqj mdr okafldgqj","552288433V","Driver","1965-06-04","20000","12348866846","987654321","0732583668","Good","0776674756","tghj@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("wd¾ wd¾ kdu,a","R R Namal","Male","ó.uqj mdr okafldgqj","889233666V","Driver","1987-08-06","20000","99998865555","987654321","0762583111","Good","0729870756","etrw@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tÉ ã WYdka","H D Ushan","Male","ó.uqj mdr okafldgqj","555233495V","Driver","1988-02-04","20000","55578866333","987654321","0762583700","Good","0719844051","hhhu@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ta tï os,aYdka","A M Dilshan","Male","ó.uqj mdr okafldgqj","444433445V","Driver","1978-07-04","20000","65473333846","987654321","0742577779","Good","0737777733","ookuy32@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ta tÉ ks,ka; ","A H Nilantha","Male","ó.uqj mdr okafldgqj","333388433V","Driver","1966-06-04","20000","65348866846","987654321","0732588888","Good","0770000756","tghj88@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("à mS iÿka","T P Sandun","Male","ó.uqj mdr okafldgqj","555533666V","Driver","1984-06-06","20000","65298865555","987654321","0760000111","Good","0729870733","etr77w@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("B tï ksyd,a","E M Nihal","Male","ó.uqj mdr okafldgqj","777733495V","Driver","1989-02-04","20000","65178866333","987654321","0762511100","Good","0719844555","hhh99u@gmail.com");







insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("sfÊ fÊ r;akdhl","J J Rathnayake","Male","ó.uqj mdr okafldgqj","123433445V","Conductor","1985-08-04","20000","14578866846","987654321","0772583699","Good","0789874756","sfghd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tia osidkdhl","J S Disanayaka","Male","ó.uqj mdr okafldgqj","122333445V","Conductor","1985-08-05","20000","14578866846","987654321","0772583698","Good","0789874758","sfghsd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ fla ir;a","J K Sarath","Male","ó.uqj mdr okafldgqj","122233445V","Conductor","1985-08-03","20000","14578866846","987654321","0772583697","Good","0789874751","sfghad@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs tia r;akfialr","I S Rathnasekara","Male","ó.uqj mdr okafldgqj","147533445V","Conductor","1985-08-02","20000","14578866845","987654321","0772583696","Good","0789874752","sdjkd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs tia à r;akdhl","I S T Rathnayake","Male","ó.uqj mdr okafldgqj","157833445V","Conductor","1985-08-01","20000","14578866844","987654321","0772583695","Good","0789874753","szsdfd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs tia is,ajd","I S Silva","Male","ó.uqj mdr okafldgqj","132433445V","Conductor","1985-08-06","20000","14578866843","987654321","0772583699","Good","0789874756","sqsdfd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tï fÊ myka","M J Pahan","Male","ó.uqj mdr okafldgqj","198733448V","Conductor","1988-08-04","20000","16578866846","987654321","0772583688","Good","0789874856","swdffd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fla fÊ risl","K J Rasika","Male","ó.uqj mdr okafldgqj","185233445V","Conductor","1985-08-12","20000","14578866811","987654321","0774583699","Good","0784874756","sewerd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î fÊ is,ajd","B J Silva","Male","ó.uqj mdr okafldgqj","164733445V","Conductor","1985-08-13","20000","14578667777","987654321","0772583699","Good","0789874756","srwerd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("smS fÊ OkqYal","P J Dhanushka","Male","ó.uqj mdr okafldgqj","165433445V","Conductor","1985-08-14","20000","15578866846","987654321","0757583699","Good","0787874756","sswersrdd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ mS r;akdhl","J P Rathnayake","Male","ó.uqj mdr okafldgqj","148933445V","Conductor","1985-08-15","20000","16578866846","987654321","0772583789","Good","0789874788","sbvwercd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tia l=i,a","J S Kusal","Male","ó.uqj mdr okafldgqj","184633445V","Conductor","1985-08-16","20000","17578866846","987654321","0778983699","Good","0781874756","smmewrd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ à mjka","J T Pavan","Male","ó.uqj mdr okafldgqj","113433445V","Conductor","1988-08-17","20000","19978866846","987654321","0772583699","Good","0789874889","sbbfgfd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tia isß,a","J S Siril","Male","ó.uqj mdr okafldgqj","172833456V","Conductor","1989-08-18","20000","14571236846","987654321","0772583556","Good","0789564756","ppffgd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tï iqrka.","J M Suranga","Male","ó.uqj mdr okafldgqj","142533445V","Conductor","1985-08-19","20000","18978866846","987654321","0772583698","Good","0780874756","mmkfg@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tia iqr,a","J S Sural","Male","ó.uqj mdr okafldgqj","143633445V","Conductor","1988-08-04","20000","15578866846","987654321","0772583555","Good","0789874999","llfgfgd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ î iqks,a","J B Sunil","Male","ó.uqj mdr okafldgqj","475833445V","Conductor","1978-08-05","20000","18878866846","987654321","0779583699","Good","0709874759","pofgfi@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ t*a m%kdkaÿ","J F Fernandu","Male","ó.uqj mdr okafldgqj","476933445V","Conductor","1981-09-04","20000","15579966846","987654321","0772583622","Good","0789874777","tfgfhd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("fÊ tia lu,a","J S Kamal","Male","ó.uqj mdr okafldgqj","193733445V","Conductor","1985-09-03","20000","12578866846","987654321","0773383692","Good","0782274799","jkfgfl@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs tia is,ajd","I S Silva","Male","ó.uqj mdr okafldgqj","194633445V","Conductor","1985-10-25","20000","18888966846","987654321","0772582999","Good","0787474756","bbfgfg@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("î whs iuka","B I Saman","Male","ó.uqj mdr okafldgqj","159233445V","Conductor","1977-08-04","20000","14573333846","987654321","0772583699","Good","0789974733","oofgfgkuy@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs fÊ fmf¾rd","I J Perera","Male","ó.uqj mdr okafldgqj","163288433V","Conductor","1965-06-04","20000","02348866846","987654321","0772583668","Good","0786674756","tgfghj@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("wd¾ fÊ kdu,a","R J Namal","Male","ó.uqj mdr okafldgqj","148933666V","Conductor","1987-08-06","20000","19998865555","987654321","0772583111","Good","0789870756","etrfgfw@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("whs ã WYdka","I D Ushan","Male","ó.uqj mdr okafldgqj","168933495V","Conductor","1988-02-04","20000","15578866333","987654321","0772583700","Good","0789844051","hhhfggfu@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("wd¾ tï os,aYdka","R M Dilshan","Male","ó.uqj mdr okafldgqj","444422245V","Conductor","1977-07-04","20000","10173333846","987654321","0742577679","Good","0737777933","ookuy732@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tka tÉ ks,ka;","N H Nilantha","Male","ó.uqj mdr okafldgqj","333377733V","Conductor","1986-06-01","20000","20248866846","987654321","0732588688","Good","0770009756","tghj788@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("mS wd¾ iÿka","P R Sandun","Male","ó.uqj mdr okafldgqj","555531166V","Conductor","1994-06-08","20000","30398865555","987654321","0760660111","Good","0729870739","etr737w@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("B à ksyd,a","E T Nihal","Male","ó.uqj mdr okafldgqj","770033495V","Conductor","1999-12-14","20000","40478866333","987654321","0762566100","Good","0719844559","hhh989u@gmail.com");



insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("smS à ;s,ka.","P T Thilanga","Male","ó.uqj mdr okafldgqj","123456789V","HR Clerk","1996-12-14","30000","40078866333","123456789","0775566778","Good","0729887766","abbccd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("siS tï ks,ka;sld","C M Nilanthika","Female","ó.uqj mdr okafldgqj","147258369V","Inventory Clerk","1995-10-15","30000","40578866333","123456789","0772566778","Good","0722887766","ab6ccd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ta mS iuka;","A P Samantha","Female","ó.uqj mdr okafldgqj","987654321V","A.M Operarion","1985-08-15","45000","40579966333","123456789","0712500778","Good","0720887066","lloccd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tï mS ùrfialr","M P Veerasekara","Male","ó.uqj mdr okafldgqj","369258147V","A.M Security","1975-06-04","45000","80579966333","123456789","0712501778","Good","0720827066","ppoccd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("iS mS ;s,sk","C P Thilina","Male","ó.uqj mdr okafldgqj","963852741V","A.M Engineering","1977-02-04","45000","80002233333","123456789","0725801778","Good","0723697066","aavvffcd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("ù tï uÿYdks","V M Madhushani","Female","ó.uqj mdr okafldgqj","741852963V","A.M Financial","1967-10-24","45000","99888233333","123456789","0720011778","Good","0700397066","mnnbffcd@gmail.com");
insert into Employee(E_SName,E_Name,E_Gender,E_Address,E_NIC,E_Grade,E_DOB,E_BasicSalary,E_AccountNo,E_Password,E_Phone, E_MedicalStatus,E_EmergencyContact,E_Email) values("tia ir;a","S Sarath","Male","ó.uqj mdr okafldgqj","456789123V","Manager","1965-01-24","50000","55888233333","123456789","0720011228","Good","0700391166","mana@gmail.com");




INSERT INTO `daily_duty` VALUES (1,11,'2018-08-16 12:54:29',11,15),(3,1,'2018-08-17 07:35:54',11,21),(4,2,'2018-08-17 07:36:12',23,45),(5,1,'2018-08-17 07:36:44',18,46);
INSERT INTO `busdetailes` VALUES ('0','0','0',0,'0',0,0,'0','2018-08-11 05:08:05',0),('AB-7898','bn','EICHER',2013,'D',35,450,'','2018-08-17 07:38:30',1),('ABC1234','JN','Leyland',2017,'B',65,650,'','2018-08-27 05:59:39',1),('ABC1258','MN','TATA',2018,'B',65,950,'','2018-08-28 05:43:54',0),('AM1456','budy','TATA',2010,'C',35,550,'','2018-08-28 11:06:20',0),('AS1234','KL','Leyland',2014,'B',60,750,'','2018-08-30 09:59:53',0),('HM9875','oo','Audi',2005,'B',65,1500,'','2018-08-28 06:23:38',0),('KL-2030','ASA','Leyland',1987,'D',24,450,'','2018-08-17 17:20:59',0),('NA-4251','K8','Leyland',2014,'A',85,750,'','2000-10-05 18:30:00',0),('NA-4258','K8','Leyland',2014,'A',85,750,'','2018-08-16 10:19:53',0),('NA-5639','sa','Leyland',2000,'C',45,250,'','2018-08-17 07:03:19',0),('NA4219','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:09',0),('NA4249','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NA4380','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NA4389','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:09',0),('NA4737','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:18:01',0),('NA4806','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NA8886','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NB-2030','KL','Leyland',2016,'B',60,500,'','2018-08-16 10:33:35',0),('NB1112','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:08',0),('NB3828','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NB4389','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:09',0),('NB6889','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:09',0),('NB8482','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NB9567','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NB9892','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NB9920','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NC1498','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NC1583','AKA','Leyland',2010,'B',65,750,'','2018-08-29 06:41:22',0),('NC1645','AKA','Leyland',2014,'B',75,750,'','2018-08-29 11:17:10',0),('NC9053','AKA','Leyland',2010,'B',65,750,'','2018-08-29 06:45:06',0),('QS-5454','mnl','Leyland',1999,'C',45,540,'','2018-08-17 08:09:26',0),('WQ-2132','lk','EICHER',2013,'C',40,250,'','2018-08-17 08:04:49',0);

INSERT INTO `oparations` VALUES (1,2,'NA-4258','06:00:00','06:00:00','57/1',150,'.eñ  ießh '),(2,1,'NB9892','07:00:00','02:00:00','4',150,'idudkH'),(3,1,'KL-2030','07:49:48','03:49:48','4',60,'idudkH'),(4,1,'HM9875','06:33:38','03:33:38','57/1',58,'isiq ißh '),(5,1,'NB9920','10:30:23','03:30:23','57/1',60,'.eñ  ießh '),(6,1,'ABC1258','01:42:36','09:42:36','4',147,'idudkH'),(7,1,'AM1456','01:44:22','09:44:22','4',100,'idudkH'),(8,1,'AS1234','18:45:30','21:45:30','4',52,'idudkH'),(9,1,'NA-4251','13:07:27','13:07:27','1',300,'idudkH');
INSERT INTO `rout` VALUES ('1','fld<U','uykqjr ','A+',150,''),('2','fld<U','ud;r','A',200,''),('3','fld<U','.d,a,','A',250,''),('4','wkqrdOmqr','fld<U','B',240,''),('57/1','wkqrdOmqr','l=reKE.,','B',190,''),('84','wkqrdOmqr','fld<U','A',230,'');
INSERT INTO `parts` VALUES (1,'FEEF',10,'10000','äfmdfõ','2018-08-16 16:59:09'),(2,'FEEF',10,'10000','äfmdfõ','2018-08-17 04:46:17'),(3,'FEEF',10,'10000','äfmdfõ','2018-08-17 05:02:17'),(9,'FEEF',1010,'10000','äfmdfõ','2018-08-26 06:50:33'),(13,'FEEF',10,'10000','äfmdfõ','2018-08-26 06:50:33'),(31,'úiaj ',1010,'1000000','äfmdfõ','2018-08-28 05:30:31'),(33,'FEEF',10,'10000','msg;','2018-08-28 12:48:04');
INSERT INTO `service_stock` VALUES (2,'sgdg','12','sfs','21','zdvsfdvd','2018-08-28 13:56:22'),(3,'2','10','äfmdfõ','101','16515sdgv','2018-08-28 13:57:48'),(6,'4','10','msg;','11','16515sdgvasv','2018-08-28 14:12:29'),(7,'2','10','äfmdfõ','11','16515sdgvasv','2018-08-28 14:12:31');
INSERT INTO `avil` VALUES (12,123,'123','12.30','2','wq-1234165656556','2018-08-28 15:09:22'),(13,11,'afa','wafa','3','awdwa','2018-08-28 16:04:33'),(14,11,'afa','wafa','3','awdwa','2018-08-28 16:04:34'),(15,11,'afa','wafa','3','awdwa','2018-08-28 16:04:34'),(16,11,'afa','wafa','3','awdwa','2018-08-28 16:04:35'),(17,11,'afa','wafa','3','awdwa','2018-08-28 16:04:35'),(18,11,'afa','wafa','3','awdwa','2018-08-28 16:04:35'),(20,11,'afa','wafa','3','awdwa','2018-08-28 16:04:35'),(21,11,'afa','wafa','3','awdwa','2018-08-28 16:04:35'),(23,11,'afa','wafa','3','awdwa','2018-08-28 16:04:36'),(24,11,'afa','wafa','3','awdwa','2018-08-28 16:04:36'),(25,11,'afa','wafa','3','awdwa','2018-08-28 16:04:36'),(28,11,'12','wafa','3','awdwa','2018-08-28 16:04:41'),(30,11,'12','wafa','3','awdwa','2018-08-28 16:04:41'),(33,11,'12','wafa','3','awdwa','2018-08-28 16:04:42'),(38,11,'','','1','','2018-08-28 16:04:55'),(49,11,'','','1','','2018-08-28 16:05:02'),(50,11,'','','1','','2018-08-28 16:05:03'),(51,11,'','','1','','2018-08-28 16:05:03'),(53,11,'','','1','','2018-08-28 16:05:04'),(54,11,'','','1','','2018-08-28 16:05:04'),(55,11,'','','1','','2018-08-28 16:05:04'),(56,11,'12','12.20','4','12-1456','2018-08-28 16:06:04'),(57,11,'12','12.20','4','12-1456','2018-08-28 16:06:07'),(58,12,'1222','12.30','5','qw-1234','2018-08-28 16:06:58'),(59,12,'1222','12.30','5','qw-1234','2018-08-28 16:06:59'),(60,12,'1222','12.30','5','qw-1234','2018-08-28 16:07:02'),(61,12,'1222','12.30','5','qw-1234','2018-08-28 16:07:03'),(62,12,'1222','12.30','5','qw-1234','2018-08-28 16:07:04'),(63,12,'1222','12.30','5','qw-1234','2018-08-28 16:07:04'),(65,12,'1222','12.30','1','5','2018-08-28 16:46:15'),(66,11,'11','wafa','3','NB-2345','2018-08-28 16:52:54'),(67,11,'11','wafa','3','awdwa','2018-08-28 16:53:11'),(70,11,'afa','wafa','3','awdwa','2018-08-28 17:16:42'),(71,11,'afa','wafa','3','awdwa','2018-08-28 17:16:43'),(72,11,'afa','wafa','3','awdwa','2018-08-28 17:16:43'),(73,11,'afa','wafa','3','awdwa','2018-08-28 17:16:44'),(74,11,'afa','wafa','3','awdwa','2018-08-28 17:16:44'),(75,11,'afa','wafa','3','awdwa','2018-08-28 17:16:45'),(76,11,'11','wafa','3','awdwa','2018-08-28 17:16:52');
INSERT INTO `wastemat` VALUES (54,'wishva','1500','20'),(55,'wishva','1000','20'),(57,'wishva','1000','60'),(60,'wishva','10000','00000'),(61,'wishva','1000','00000'),(62,'wishva','','00000');

ALTER TABLE `sltb`.`monthlysalary` 
DROP COLUMN `ChallangeBonus`,
DROP COLUMN `OldBusPay`,
DROP COLUMN `RoomsPay`,
DROP COLUMN `MiddleTimeBonus`,
DROP COLUMN `UnbookingOT`,
DROP COLUMN `LifeTimeBonus`,
CHANGE COLUMN `Date` `Date` VARCHAR(10) NOT NULL ,
ADD COLUMN `LeaveDays` INT NULL AFTER `Date`;

ALTER TABLE `sltb`.`monthlysalary` 
CHANGE COLUMN `Date` `Date` VARCHAR(10) NOT NULL AFTER `SalaryID`,
CHANGE COLUMN `LeaveDays` `LeaveDays` INT(11) NULL DEFAULT NULL AFTER `Date`,
CHANGE COLUMN `BookingOT` `BookingOT` DOUBLE NULL DEFAULT NULL AFTER `LeaveDays`,
ADD COLUMN `Loans` DOUBLE NULL AFTER `OtherBonus`,
ADD COLUMN `BasicSal` DOUBLE NOT NULL AFTER `Loans`;

ALTER TABLE `sltb`.`dailyexpenses` 
ADD COLUMN `Date` DATE NOT NULL AFTER `Total`;

ALTER TABLE `sltb`.`activitydetails` 
ADD COLUMN `Income` DOUBLE NOT NULL AFTER `Date`;

ALTER TABLE `sltb`.`seasonsincome` 
DROP COLUMN `ImediatTicketIncome`,
DROP COLUMN `LuggageTicketIncome`,
DROP COLUMN `LuggageTicketsQty`,
DROP COLUMN `PoliceVoucherIncome`,
DROP COLUMN `PoliceVoucherQty`,
DROP COLUMN `MonksSeasonsIncome`,
DROP COLUMN `PrepaidTicketIncome`,
DROP COLUMN `LastNumber`,
DROP COLUMN `StartNumber`,
CHANGE COLUMN `PrepaidTicketQty` `TicketQty` INT(11) NULL DEFAULT '0' ,
CHANGE COLUMN `StudentSeasonsQty` `SeasonsQty` INT(11) NULL DEFAULT '0' ,
CHANGE COLUMN `StudentSeasonsIncome` `SeasonsIncome` DOUBLE NULL DEFAULT '0' ,
CHANGE COLUMN `MachanicalsSeasonsQty` `PassengerSeasonsQty` INT(11) NULL DEFAULT '0' ,
CHANGE COLUMN `EldersSeasonsQty` `NormalSeasonsQty` INT(11) NULL DEFAULT '0' ;

ALTER TABLE `sltb`.`otherincomes` 
DROP COLUMN `EmptyBaralIncome`,
DROP COLUMN `EmptyBaralQty`,
DROP COLUMN `OilIncome`,
DROP COLUMN `OilPrice`,
DROP COLUMN `OilVolume`,
ADD COLUMN `Item` VARCHAR(45) NOT NULL AFTER `Date`,
ADD COLUMN `Qty` INT NOT NULL AFTER `Item`,
ADD COLUMN `UnitPrice` INT NOT NULL AFTER `Qty`,
ADD COLUMN `Total` INT NOT NULL AFTER `UnitPrice`;

ALTER TABLE `sltb`.`otherincomes` 
CHANGE COLUMN `Date` `Date` VARCHAR(15) NOT NULL ;

ALTER TABLE `sltb`.`otherincomes` 
ADD COLUMN `ID` INT NOT NULL AUTO_INCREMENT AFTER `Total`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`ID`);

ALTER TABLE `sltb`.`dailybonus` 
DROP FOREIGN KEY `SalID2_FK`;
ALTER TABLE `sltb`.`dailybonus` 
CHANGE COLUMN `SalaryID` `SalaryID` INT(10) NOT NULL ;
ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `SalID2_FK`
  FOREIGN KEY (`SalaryID`)
  REFERENCES `sltb`.`employee` (`SalaryNo`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

  ALTER TABLE `sltb`.`dailybonus` 
ADD COLUMN `ID` INT NOT NULL AUTO_INCREMENT AFTER `Date`,
ADD PRIMARY KEY (`ID`);

ALTER TABLE `sltb`.`dailybonus` 
DROP FOREIGN KEY `SalID2_FK`;
ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `SalID2_FK`
  FOREIGN KEY (`SalaryID`)
  REFERENCES `sltb`.`employee` (`SalaryNo`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

  ALTER TABLE `sltb`.`dailybonus` 
ADD COLUMN `TID` INT(11) NOT NULL AFTER `ID`,
ADD INDEX `SalTID_FK_idx` (`TID` ASC);
ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `SalTID_FK`
  FOREIGN KEY (`TID`)
  REFERENCES `sltb`.`activitydetails` (`TID`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `TID_FK`
  FOREIGN KEY (`TID`)
  REFERENCES `sltb`.`activitydetails` (`TID`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `sltb`.`activitydetails` 
ADD COLUMN `Deport` VARCHAR(45) NOT NULL AFTER `Income`;

ALTER TABLE `sltb`.`dailybonus` 
DROP FOREIGN KEY `SalID2_FK`;
ALTER TABLE `sltb`.`dailybonus` 
CHANGE COLUMN `SalaryID` `DSalaryID` INT(10) NOT NULL ,
ADD COLUMN `CSalaryID` INT(10) NULL AFTER `TID`,
ADD INDEX `SalID3_FK_idx` (`CSalaryID` ASC);
ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `SalID2_FK`
  FOREIGN KEY (`DSalaryID`)
  REFERENCES `sltb`.`employee` (`SalaryNo`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `SalID3_FK`
  FOREIGN KEY (`CSalaryID`)
  REFERENCES `sltb`.`employee` (`SalaryNo`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `sltb`.`dailybonus` 
DROP FOREIGN KEY `TID_FK`;
ALTER TABLE `sltb`.`dailybonus` 
ADD CONSTRAINT `TID_FK`
  FOREIGN KEY (`TID`)
  REFERENCES `sltb`.`activitydetails` (`TID`)
  ON DELETE CASCADE
  ON UPDATE NO ACTION;

  ALTER TABLE `sltb`.`dailyexpenses` 
DROP FOREIGN KEY `exTID`;
ALTER TABLE `sltb`.`dailyexpenses` 
ADD CONSTRAINT `exTID`
  FOREIGN KEY (`TID`)
  REFERENCES `sltb`.`activitydetails` (`TID`)
  ON DELETE CASCADE
  ON UPDATE NO ACTION;

  ALTER TABLE `sltb`.`seasonsincome` 
DROP FOREIGN KEY `seTID`;
ALTER TABLE `sltb`.`seasonsincome` 
ADD CONSTRAINT `seTID`
  FOREIGN KEY (`TID`)
  REFERENCES `sltb`.`activitydetails` (`TID`)
  ON DELETE CASCADE
  ON UPDATE NO ACTION;
INSERT INTO `monthly_duty` VALUES ('10_2018_06',10,2018,'cQks',45,'NB1112',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,35,35,35,35,35,35,35,35,35,35,0),('10_2018_07',10,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('10_2018_08',10,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('10_2018_09',10,2018,'iema;eïn¾',28,'ABC1234',500,500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0),('11_2018_06',11,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('11_2018_07',11,2018,'cQ,s',0,'0',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,500,200,200,200,200,200,200),('11_2018_08',11,2018,'wf.daia;=',44,'NB-2030',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,33,33,33,33,33,33,33,33,33,33,33),('11_2018_09',11,2018,'iema;eïn¾',36,'NA-5639',7,7,7,7,7,500,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,0),('12_2018_06',12,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('12_2018_07',12,2018,'cQ,s',43,'NA8886',21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,500,31,31,31,31,31,31,31,31,31,31,31),('12_2018_08',12,2018,'wf.daia;=',33,'KL-2030',3,3,3,3,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11),('12_2018_09',12,2018,'iema;eïn¾',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,500,200,200,200,200,200,200,0),('13_2018_06',13,2018,'cQks',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,200,200,200,200,200,200,0),('13_2018_07',13,2018,'cQ,s',38,'NA4249',11,11,11,11,11,11,11,11,11,11,500,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21),('13_2018_08',13,2018,'wf.daia;=',40,'NA4389',17,17,17,17,17,17,17,17,17,17,17,17,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25),('13_2018_09',13,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('14_2018_06',14,2018,'cQks',47,'NB4389',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,200,200,200,200,200,200,0),('14_2018_07',14,2018,'cQ,s',46,'NB3828',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,500,37,37,37,37,37,37,37,37,37,37,37),('14_2018_08',14,2018,'wf.daia;=',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,200,200,200,200,200,200,200),('14_2018_09',14,2018,'iema;eïn¾',44,'NB-2030',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,500,33,33,33,33,33,33,33,33,33,33,0),('15_2018_06',15,2018,'cQks',40,'NA4389',17,17,17,17,17,17,17,17,17,17,17,17,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,0),('15_2018_07',15,2018,'cQ,s',27,'AB-7898',500,500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),('15_2018_08',15,2018,'wf.daia;=',31,'AS1234',1,1,1,1,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7),('15_2018_09',15,2018,'iema;eïn¾',40,'NA4389',15,15,15,15,15,15,15,15,15,15,500,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,0),('16_2018_06',16,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('16_2018_07',16,2018,'cQ,s',40,'NA4389',15,15,15,15,15,15,15,15,15,15,500,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25),('16_2018_08',16,2018,'wf.daia;=',42,'NA4806',21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29),('16_2018_09',16,2018,'iema;eïn¾',43,'NA8886',21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,500,31,31,31,31,31,31,31,31,31,31,0),('17_2018_06',17,2018,'cQks',28,'ABC1234',500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0),('17_2018_07',17,2018,'cQ,s',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,500,200,200,200,200,200,200),('17_2018_08',17,2018,'wf.daia;=',28,'ABC1234',500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2),('17_2018_09',17,2018,'iema;eïn¾',38,'NA4249',11,11,11,11,11,11,11,11,11,11,500,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,0),('18_2018_06',18,2018,'cQks',36,'NA-5639',9,9,9,9,9,9,9,9,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,0),('18_2018_07',18,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('18_2018_08',18,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('18_2018_09',18,2018,'iema;eïn¾',32,'HM9875',1,1,1,1,1,500,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0),('19_2018_06',19,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('19_2018_07',19,2018,'cQ,s',32,'HM9875',1,1,1,1,1,500,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9),('19_2018_08',19,2018,'wf.daia;=',47,'NB4389',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,200,200,200,200,200,200,200),('19_2018_09',19,2018,'iema;eïn¾',37,'NA4219',9,9,9,9,9,9,9,9,9,9,500,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,0),('1_2018_06',1,2018,'cQks',41,'NA4737',19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,0),('1_2018_07',1,2018,'cQ,s',39,'NA4380',13,13,13,13,13,13,13,13,13,13,500,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23),('1_2018_08',1,2018,'wf.daia;=',35,'NA-4258',7,7,7,7,7,7,7,7,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15),('1_2018_09',1,2018,'iema;eïn¾',42,'NA4806',19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,500,29,29,29,29,29,29,29,29,29,29,0),('20_2018_06',20,2018,'cQks',38,'NA4249',13,13,13,13,13,13,13,13,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,0),('20_2018_07',20,2018,'cQ,s',35,'NA-4258',5,5,5,5,5,500,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15),('20_2018_08',20,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('20_2018_09',20,2018,'iema;eïn¾',31,'AS1234',500,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0),('21_2018_06',21,2018,'cQks',35,'NA-4258',7,7,7,7,7,7,7,7,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,0),('21_2018_07',21,2018,'cQ,s',45,'NB1112',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,500,35,35,35,35,35,35,35,35,35,35,35),('21_2018_08',21,2018,'wf.daia;=',36,'NA-5639',9,9,9,9,9,9,9,9,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17),('21_2018_09',21,2018,'iema;eïn¾',34,'NA-4251',3,3,3,3,3,500,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,0),('22_2018_06',22,2018,'cQks',34,'NA-4251',5,5,5,5,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,0),('22_2018_07',22,2018,'cQ,s',30,'AM1456',500,500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),('22_2018_08',22,2018,'wf.daia;=',30,'AM1456',500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),('22_2018_09',22,2018,'iema;eïn¾',47,'NB4389',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,500,200,200,200,200,200,200,0),('23_2018_06',23,2018,'cQks',29,'ABC1258',500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0),('23_2018_07',23,2018,'cQ,s',47,'NB4389',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,500,200,200,200,200,200,200),('23_2018_08',23,2018,'wf.daia;=',43,'NA8886',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,31,31,31,31,31,31,31,31,31,31,31),('23_2018_09',23,2018,'iema;eïn¾',35,'NA-4258',5,5,5,5,5,500,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,0),('24_2018_06',24,2018,'cQks',42,'NA4806',21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29,29,29,29,0),('24_2018_07',24,2018,'cQ,s',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,500,200,200,200,200,200,200),('24_2018_08',24,2018,'wf.daia;=',39,'NA4380',15,15,15,15,15,15,15,15,15,15,15,15,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23),('24_2018_09',24,2018,'iema;eïn¾',46,'NB3828',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,500,37,37,37,37,37,37,37,37,37,37,0),('25_2018_06',25,2018,'cQks',31,'AS1234',1,1,1,1,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0),('25_2018_07',25,2018,'cQ,s',36,'NA-5639',7,7,7,7,7,500,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17),('25_2018_08',25,2018,'wf.daia;=',41,'NA4737',19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27),('25_2018_09',25,2018,'iema;eïn¾',39,'NA4380',13,13,13,13,13,13,13,13,13,13,500,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,0),('26_2018_06',26,2018,'cQks',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,200,200,200,200,200,200,0),('26_2018_07',26,2018,'cQ,s',37,'NA4219',9,9,9,9,9,9,9,9,9,9,500,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19),('26_2018_08',26,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('26_2018_09',26,2018,'iema;eïn¾',30,'AM1456',500,500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0),('27_2018_06',27,2018,'cQks',48,'NB6889',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,200,200,200,200,200,200,0),('27_2018_07',27,2018,'cQ,s',33,'KL-2030',2,2,2,2,2,500,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11),('27_2018_08',27,2018,'wf.daia;=',34,'NA-4251',5,5,5,5,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13),('27_2018_09',27,2018,'iema;eïn¾',41,'NA4737',17,17,17,17,17,17,17,17,17,17,500,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,0),('28_2018_06',28,2018,'cQks',43,'NA8886',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,31,31,31,31,31,31,31,31,31,31,0),('28_2018_07',28,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('28_2018_08',28,2018,'wf.daia;=',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,200,200,200,200,200,200,200),('28_2018_09',28,2018,'iema;eïn¾',45,'NB1112',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,500,35,35,35,35,35,35,35,35,35,35,0),('29_2018_06',29,2018,'cQks',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,200,200,200,200,200,200,0),('29_2018_07',29,2018,'cQ,s',40,'NA4389',15,15,15,15,15,15,15,15,15,15,500,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25),('29_2018_08',29,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('29_2018_09',29,2018,'iema;eïn¾',38,'NA4249',11,11,11,11,11,11,11,11,11,11,500,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,0),('2_2018_06',2,2018,'cQks',37,'NA4219',11,11,11,11,11,11,11,11,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,0),('2_2018_07',2,2018,'cQ,s',28,'ABC1234',500,500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2),('2_2018_08',2,2018,'wf.daia;=',48,'NB6889',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,200,200,200,200,200,200,200),('2_2018_09',2,2018,'iema;eïn¾',33,'KL-2030',2,2,2,2,2,500,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,0),('30_2018_06',30,2018,'cQks',40,'NA4389',17,17,17,17,17,17,17,17,17,17,17,17,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,0),('30_2018_07',30,2018,'cQ,s',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,500,200,200,200,200,200,200),('30_2018_08',30,2018,'wf.daia;=',33,'KL-2030',3,3,3,3,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11),('30_2018_09',30,2018,'iema;eïn¾',44,'NB-2030',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,500,33,33,33,33,33,33,33,33,33,33,0),('31_2018_06',31,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('31_2018_07',31,2018,'cQ,s',35,'NA-4258',5,5,5,5,5,500,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15),('31_2018_08',31,2018,'wf.daia;=',32,'HM9875',2,2,2,2,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9),('31_2018_09',31,2018,'iema;eïn¾',42,'NA4806',19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,500,29,29,29,29,29,29,29,29,29,29,0),('32_2018_06',32,2018,'cQks',35,'NA-4258',7,7,7,7,7,7,7,7,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,0),('32_2018_07',32,2018,'cQ,s',32,'HM9875',1,1,1,1,1,500,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9),('32_2018_08',32,2018,'wf.daia;=',40,'NA4389',17,17,17,17,17,17,17,17,17,17,17,17,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25),('32_2018_09',32,2018,'iema;eïn¾',39,'NA4380',13,13,13,13,13,13,13,13,13,13,500,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,0),('33_2018_06',33,2018,'cQks',42,'NA4806',21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29,29,29,29,0),('33_2018_07',33,2018,'cQ,s',41,'NA4737',17,17,17,17,17,17,17,17,17,17,500,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27),('33_2018_08',33,2018,'wf.daia;=',27,'AB-7898',500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),('33_2018_09',33,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('34_2018_06',34,2018,'cQks',28,'ABC1234',500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0),('34_2018_07',34,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('34_2018_08',34,2018,'wf.daia;=',48,'NB6889',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,200,200,200,200,200,200,200),('34_2018_09',34,2018,'iema;eïn¾',32,'HM9875',1,1,1,1,1,500,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0),('35_2018_06',35,2018,'cQks',45,'NB1112',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,35,35,35,35,35,35,35,35,35,35,0),('35_2018_07',35,2018,'cQ,s',39,'NA4380',13,13,13,13,13,13,13,13,13,13,500,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23),('35_2018_08',35,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('35_2018_09',35,2018,'iema;eïn¾',27,'AB-7898',500,500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0),('36_2018_06',36,2018,'cQks',47,'NB4389',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,200,200,200,200,200,200,0),('36_2018_07',36,2018,'cQ,s',38,'NA4249',11,11,11,11,11,11,11,11,11,11,500,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21),('36_2018_08',36,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('36_2018_09',36,2018,'iema;eïn¾',41,'NA4737',17,17,17,17,17,17,17,17,17,17,500,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,0),('37_2018_06',37,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('37_2018_07',37,2018,'cQ,s',31,'AS1234',500,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7),('37_2018_08',37,2018,'wf.daia;=',47,'NB4389',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,200,200,200,200,200,200,200),('37_2018_09',37,2018,'iema;eïn¾',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,500,200,200,200,200,200,200,0),('38_2018_06',38,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('38_2018_07',38,2018,'cQ,s',34,'NA-4251',3,3,3,3,3,500,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13),('38_2018_08',38,2018,'wf.daia;=',29,'ABC1258',500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3),('38_2018_09',38,2018,'iema;eïn¾',45,'NB1112',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,500,35,35,35,35,35,35,35,35,35,35,0),('39_2018_06',39,2018,'cQks',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200,0),('39_2018_07',39,2018,'cQ,s',47,'NB4389',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,500,200,200,200,200,200,200),('39_2018_08',39,2018,'wf.daia;=',46,'NB3828',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,37,37,37,37,37,37,37,37,37,37,37),('39_2018_09',39,2018,'iema;eïn¾',40,'NA4389',15,15,15,15,15,15,15,15,15,15,500,500,500,500,500,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,0),('3_2018_06',3,2018,'cQks',27,'AB-7898',500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0),('3_2018_07',3,2018,'cQ,s',31,'AS1234',500,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7),('3_2018_08',3,2018,'wf.daia;=',45,'NB1112',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,35,35,35,35,35,35,35,35,35,35,35),('3_2018_09',3,2018,'iema;eïn¾',48,'NB6889',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,500,200,200,200,200,200,200,0),('40_2018_06',40,2018,'cQks',29,'ABC1258',500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0),('40_2018_07',40,2018,'cQ,s',46,'NB3828',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,500,37,37,37,37,37,37,37,37,37,37,37),('40_2018_08',40,2018,'wf.daia;=',37,'NA4219',11,11,11,11,11,11,11,11,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19),('40_2018_09',40,2018,'iema;eïn¾',46,'NB3828',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,500,37,37,37,37,37,37,37,37,37,37,0),('41_2018_06',41,2018,'cQks',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,200,200,200,200,200,200,0),('41_2018_07',41,2018,'cQ,s',37,'NA4219',9,9,9,9,9,9,9,9,9,9,500,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19),('41_2018_08',41,2018,'wf.daia;=',35,'NA-4258',7,7,7,7,7,7,7,7,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15),('41_2018_09',41,2018,'iema;eïn¾',43,'NA8886',21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,500,31,31,31,31,31,31,31,31,31,31,0),('42_2018_06',42,2018,'cQks',34,'NA-4251',5,5,5,5,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,0),('42_2018_07',42,2018,'cQ,s',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,500,200,200,200,200,200,200),('42_2018_08',42,2018,'wf.daia;=',42,'NA4806',21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29),('42_2018_09',42,2018,'iema;eïn¾',29,'ABC1258',500,500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0),('43_2018_06',43,2018,'cQks',38,'NA4249',13,13,13,13,13,13,13,13,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,0),('43_2018_07',43,2018,'cQ,s',36,'NA-5639',7,7,7,7,7,500,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17),('43_2018_08',43,2018,'wf.daia;=',41,'NA4737',19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27),('43_2018_09',43,2018,'iema;eïn¾',33,'KL-2030',2,2,2,2,2,500,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,0),('44_2018_06',44,2018,'cQks',48,'NB6889',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,200,200,200,200,200,200,0),('44_2018_07',44,2018,'cQ,s',33,'KL-2030',2,2,2,2,2,500,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11),('44_2018_08',44,2018,'wf.daia;=',38,'NA4249',13,13,13,13,13,13,13,13,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21),('44_2018_09',44,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('45_2018_06',45,2018,'cQks',41,'NA4737',19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,0),('45_2018_07',45,2018,'cQ,s',43,'NA8886',21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,500,500,500,500,500,31,31,31,31,31,31,31,31,31,31,31),('45_2018_08',45,2018,'wf.daia;=',34,'NA-4251',5,5,5,5,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13),('45_2018_09',45,2018,'iema;eïn¾',37,'NA4219',9,9,9,9,9,9,9,9,9,9,500,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,0),('46_2018_06',46,2018,'cQks',46,'NB3828',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,37,37,37,37,37,37,37,37,37,37,0),('46_2018_07',46,2018,'cQ,s',42,'NA4806',19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29),('46_2018_08',46,2018,'wf.daia;=',44,'NB-2030',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,33,33,33,33,33,33,33,33,33,33,33),('46_2018_09',46,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('47_2018_06',47,2018,'cQks',43,'NA8886',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,31,31,31,31,31,31,31,31,31,31,0),('47_2018_07',47,2018,'cQ,s',45,'NB1112',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,500,35,35,35,35,35,35,35,35,35,35,35),('47_2018_08',47,2018,'wf.daia;=',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,200,200,200,200,200,200),('47_2018_09',47,2018,'iema;eïn¾',28,'ABC1234',500,500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0),('48_2018_06',48,2018,'cQks',31,'AS1234',1,1,1,1,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0),('48_2018_07',48,2018,'cQ,s',28,'ABC1234',500,500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2),('48_2018_08',48,2018,'wf.daia;=',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,200,200,200,200,200,200,200),('48_2018_09',48,2018,'iema;eïn¾',31,'AS1234',500,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0),('49_2018_06',49,2018,'cQks',36,'NA-5639',9,9,9,9,9,9,9,9,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,0),('49_2018_07',49,2018,'cQ,s',30,'AM1456',500,500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),('49_2018_08',49,2018,'wf.daia;=',45,'NB1112',27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,500,500,500,500,35,35,35,35,35,35,35,35,35,35,35),('49_2018_09',49,2018,'iema;eïn¾',30,'AM1456',500,500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0),('4_2018_06',4,2018,'cQks',30,'AM1456',500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0),('4_2018_07',4,2018,'cQ,s',34,'NA-4251',3,3,3,3,3,500,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13),('4_2018_08',4,2018,'wf.daia;=',37,'NA4219',11,11,11,11,11,11,11,11,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19),('4_2018_09',4,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('50_2018_06',50,2018,'cQks',44,'NB-2030',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,33,33,33,33,33,33,33,33,33,33,0),('50_2018_07',50,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('50_2018_08',50,2018,'wf.daia;=',43,'NA8886',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,31,31,31,31,31,31,31,31,31,31,31),('50_2018_09',50,2018,'iema;eïn¾',35,'NA-4258',5,5,5,5,5,500,500,500,500,500,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,0),('51_2018_06',51,2018,'cQks',32,'HM9875',2,2,2,2,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0),('51_2018_07',51,2018,'cQ,s',0,'0',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,500,200,200,200,200,200,200),('51_2018_08',51,2018,'wf.daia;=',0,'0',37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,500,500,500,500,200,200,200,200,200,200,200),('51_2018_09',51,2018,'iema;eïn¾',48,'NB6889',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,500,200,200,200,200,200,200,0),('52_2018_06',52,2018,'cQks',33,'KL-2030',3,3,3,3,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,0),('52_2018_07',52,2018,'cQ,s',48,'NB6889',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,500,200,200,200,200,200,200),('52_2018_08',52,2018,'wf.daia;=',28,'ABC1234',500,500,500,500,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2),('52_2018_09',52,2018,'iema;eïn¾',36,'NA-5639',7,7,7,7,7,500,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,0),('53_2018_06',53,2018,'cQks',27,'AB-7898',500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0),('53_2018_07',53,2018,'cQ,s',29,'ABC1258',500,500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3),('53_2018_08',53,2018,'wf.daia;=',30,'AM1456',500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),('53_2018_09',53,2018,'iema;eïn¾',47,'NB4389',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,500,200,200,200,200,200,200,0),('54_2018_06',54,2018,'cQks',30,'AM1456',500,500,500,500,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0),('54_2018_07',54,2018,'cQ,s',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200),('54_2018_08',54,2018,'wf.daia;=',31,'AS1234',1,1,1,1,500,500,500,500,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7),('54_2018_09',54,2018,'iema;eïn¾',34,'NA-4251',3,3,3,3,3,500,500,500,500,500,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,0),('55_2018_06',55,2018,'cQks',39,'NA4380',15,15,15,15,15,15,15,15,15,15,15,15,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,0),('55_2018_07',55,2018,'cQ,s',44,'NB-2030',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,500,33,33,33,33,33,33,33,33,33,33,33),('55_2018_08',55,2018,'wf.daia;=',36,'NA-5639',9,9,9,9,9,9,9,9,500,500,500,500,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17),('55_2018_09',55,2018,'iema;eïn¾',0,'0',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,500,200,200,200,200,200,200,0),('56_2018_06',56,2018,'cQks',37,'NA4219',11,11,11,11,11,11,11,11,500,500,500,500,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,0),('56_2018_07',56,2018,'cQ,s',27,'AB-7898',500,500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),('56_2018_08',56,2018,'wf.daia;=',39,'NA4380',15,15,15,15,15,15,15,15,15,15,15,15,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23),('56_2018_09',56,2018,'iema;eïn¾',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,500,200,200,200,200,200,200,0),('5_2018_06',5,2018,'cQks',44,'NB-2030',25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,500,500,500,500,33,33,33,33,33,33,33,33,33,33,0),('5_2018_07',5,2018,'cQ,s',42,'NA4806',19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,500,500,500,500,500,29,29,29,29,29,29,29,29,29,29,29),('5_2018_08',5,2018,'wf.daia;=',27,'AB-7898',500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),('5_2018_09',5,2018,'iema;eïn¾',0,'0',33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,500,500,500,500,500,200,200,200,200,200,200,0),('6_2018_06',6,2018,'cQks',46,'NB3828',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,37,37,37,37,37,37,37,37,37,37,0),('6_2018_07',6,2018,'cQ,s',41,'NA4737',17,17,17,17,17,17,17,17,17,17,500,500,500,500,500,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27),('6_2018_08',6,2018,'wf.daia;=',38,'NA4249',13,13,13,13,13,13,13,13,500,500,500,500,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21),('6_2018_09',6,2018,'iema;eïn¾',0,'0',200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,200,500,500,500,500,500,200,200,200,200,200,200,0),('7_2018_06',7,2018,'cQks',32,'HM9875',2,2,2,2,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,0),('7_2018_07',7,2018,'cQ,s',29,'ABC1258',500,500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3),('7_2018_08',7,2018,'wf.daia;=',46,'NB3828',29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,500,500,500,500,37,37,37,37,37,37,37,37,37,37,37),('7_2018_09',7,2018,'iema;eïn¾',0,'0',35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,500,500,500,500,500,200,200,200,200,200,200,0),('8_2018_06',8,2018,'cQks',33,'KL-2030',3,3,3,3,500,500,500,500,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,0),('8_2018_07',8,2018,'cQ,s',48,'NB6889',31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,500,500,500,500,500,200,200,200,200,200,200),('8_2018_08',8,2018,'wf.daia;=',32,'HM9875',2,2,2,2,500,500,500,500,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9),('8_2018_09',8,2018,'iema;eïn¾',29,'ABC1258',500,500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0),('9_2018_06',9,2018,'cQks',39,'NA4380',15,15,15,15,15,15,15,15,15,15,15,15,500,500,500,500,23,23,23,23,23,23,23,23,23,23,23,23,23,23,0),('9_2018_07',9,2018,'cQ,s',44,'NB-2030',23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,500,500,500,500,500,33,33,33,33,33,33,33,33,33,33,33),('9_2018_08',9,2018,'wf.daia;=',29,'ABC1258',500,500,500,500,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3),('9_2018_09',9,2018,'iema;eïn¾',27,'AB-7898',500,500,500,500,500,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0);

INSERT INTO `guest` VALUES (1,'kamala','2018-09-27 05:24:31','Reason','948512234V');
INSERT INTO `guest` VALUES (2,'nimal','2018-09-27 05:24:31','Reason','948512765V');
INSERT INTO `guest` VALUES (3,'sunil','2018-09-27 05:24:31','Reason','948511231V');
INSERT INTO `guest` VALUES (4,'chamika','2018-09-27 05:24:31','Reason','948512121V');
INSERT INTO `guest` VALUES (5,'isuru','2018-09-27 05:24:31','Reason','948512432V');
INSERT INTO `guest` VALUES (6,'wishwa','2018-09-27 05:24:31','Reason','948512856V');
INSERT INTO `guest` VALUES (7,'janith','2018-09-27 05:24:31','Reason','948512083V');
INSERT INTO `guest` VALUES (8,'amara','2018-09-27 05:24:31','Reason','948512092V');
INSERT INTO `guest` VALUES (9,'shabi','2018-09-27 05:24:31','Reason','948512964V');
INSERT INTO `guest` VALUES (10,'saliya','2018-09-27 05:24:31','Reason','948512098V');

INSERT INTO `depot_vehicle` VALUES (1,'NA4219','2018-09-27 05:38:40','Come in','2018-09-27 05:38:40');
INSERT INTO `depot_vehicle` VALUES (2,'AM1456','2018-09-27 05:48:40','Come in','2018-09-27 05:48:40');
INSERT INTO `depot_vehicle` VALUES (3,'AS1234','2018-09-27 05:58:40','Come in','2018-09-27 05:58:40');
INSERT INTO `depot_vehicle` VALUES (4,'HM9875','2018-09-27 06:18:40','Come in','2018-09-27 06:18:40');
INSERT INTO `depot_vehicle` VALUES (5,'NA4219','2018-09-27 06:38:40','Come in','2018-09-27 06:38:40');
INSERT INTO `depot_vehicle` VALUES (6,'NA4249','2018-09-27 06:58:40','Come in','2018-09-27 06:58:40');
INSERT INTO `depot_vehicle` VALUES (7,'NA4380','2018-09-27 07:28:40','Come in','2018-09-27 07:28:40');
INSERT INTO `depot_vehicle` VALUES (8,'AS1234','2018-09-27 07:38:40','Leave','2018-09-27 07:38:40');
INSERT INTO `depot_vehicle` VALUES (9,'AM1456','2018-09-27 07:48:40','Leave','2018-09-27 07:48:40');
INSERT INTO `depot_vehicle` VALUES (10,'HM9875','2018-09-27 07:58:40','Leave','2018-09-27 07:58:40');


INSERT INTO `other_vehicle` VALUES (1,'ND6343','2018-09-27 05:38:40','B7649635','2018-09-27 05:38:40','Reason');
INSERT INTO `other_vehicle` VALUES (2,'NW6343','2018-09-27 05:48:40','B7649634','2018-09-27 05:48:40','Reason');
INSERT INTO `other_vehicle` VALUES (3,'NE6343','2018-09-27 05:58:40','B7649234','2018-09-27 05:58:40','Reason');
INSERT INTO `other_vehicle` VALUES (4,'NT6343','2018-09-27 06:18:40','B7649123','2018-09-27 06:18:40','Reason');
INSERT INTO `other_vehicle` VALUES (5,'AD6343','2018-09-27 06:38:40','B7649875','2018-09-27 06:38:40','Reason');
INSERT INTO `other_vehicle` VALUES (6,'GD6343','2018-09-27 06:58:40','B7649234','2018-09-27 06:58:40','Reason');
INSERT INTO `other_vehicle` VALUES (7,'HD6343','2018-09-27 07:28:40','B7649763','2018-09-27 07:28:40','Reason');
INSERT INTO `other_vehicle` VALUES (8,'JK6343','2018-09-27 07:38:40','B7649146','2018-09-27 07:38:40','Reason');
INSERT INTO `other_vehicle` VALUES (9,'OR6343','2018-09-27 07:48:40','B7649094','2018-09-27 07:48:40','Reason');
INSERT INTO `other_vehicle` VALUES (10,'IR6343','2018-09-27 07:58:40','B7649240','2018-09-27 07:58:40','Reason');

INSERT INTO `fuelrelease` VALUES (1,'ãi,a','KL-1234','2018-09-21 03:55:34',50,'äfmdaj ','2018-09-21 03:55:34'),(2,'ãi,a','KL-1234','2018-09-21 03:57:21',14,'äfmdaj ','2018-09-21 03:55:43'),(3,'ãi,a','KL-1234','2018-09-21 03:56:22',45,'äfmdaj ','2018-09-21 03:56:22'),(4,'ãi,a','KL-1234','2018-09-21 15:07:53',50,'ndysßka','2018-09-21 04:14:55'),(5,'ãi,a 1','KL-3456','2018-09-26 15:11:26',56,'äfmdaj ','2018-09-21 15:04:11'),(6,'ãi,a 2','DFG-6789','2018-09-21 15:15:57',67,'ndysßka','2018-09-21 15:15:57'),(8,'fmg%,a','HF-2345','2018-09-27 06:37:37',45,'ndysßka','2018-09-27 06:37:37'),(9,'ãi,a','SDF-2345','2018-09-27 06:37:59',45,'ndysßka','2018-09-27 06:37:59'),(10,'ãi,a','HF-2345','2018-09-27 06:38:17',450,'äfmdaj ','2018-09-27 06:38:17');
INSERT INTO `wastemat` VALUES (66,'áka ','50','700'),(67,'ner,a ','50','5000'),(68,'mqgqjg','20','50000'),(69,'leka ','500','12000'),(70,'ner,a 2','500','50000'),(71,'fïi ','10','25000'),(72,'ner,a 3','25','4500'),(73,'frdao','45','70000'),(74,'ner,a 4','506','6000'),(75,'ueYska ','50','10000'),(76,'ueYska ','500.0','10000'),(77,'ueYska ','500','500.0'),(78,'ueYska ','500.0','500.0');
INSERT INTO `fuelstock` VALUES (1,'ãi,a',1000,'2018-09-21 07:11:37'),(2,'fmg%,a',500,'2018-09-21 07:11:57'),(3,',sysis',100,'2018-09-21 07:12:21'),(4,'ãi,a 1',200,'2018-09-21 14:48:32'),(5,'ãi,a 2',450,'2018-09-21 15:20:16'),(6,'ãi,a24',500,'2018-09-26 14:57:57'),(9,'fmg%,a2',500,'2018-09-27 06:35:21'),(10,'thel',450,'2018-09-27 06:36:25');
