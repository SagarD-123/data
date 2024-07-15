use email_app;

show tables;
drop table `mail-template-type`;
desc `mail-template-type`;
create table `mail-template-type`(`temp-type-id` varchar(30) primary key not null,`temp-type-name` varchar(40) not null,`temp-type-is-valid` boolean not null);

create table `mail-template`(`temp-id` varchar(30) primary key not null,`temp-type-id` varchar(40) not null,
`temp-purpose` varchar(100) not null,`temp-file-path` varchar(200)not null,
`temp-attach-count` int not null,`temp-subject` varchar(200) not null,`temp-is-valid` boolean not null, 
FOREIGN KEY (`temp-type-id`) REFERENCES `mail-template-type`(`temp-type-id`));

create table `mail-queue`(`mail-queue-id` varchar(40) primary key not null ,
`mail-context` json not null,
`mail-sending-count` int not null,`mail-status` varchar(40) not null,`mail-is-valid` boolean not null
);

create table training(`training-id` varchar(30) primary key not null,`training-name` varchar(50) not null,`training-is-valid` boolean not null);

create table batch(`batch-id` varchar(30) primary key not null,`batch-name` varchar(50) not null,`training-id` varchar(30),`batch-is-valid` boolean not null,
foreign key(`training-id`) references training(`training-id`));

create table `stu-info`(PRN varchar(100) primary key not null, name varchar(50) not null,email varchar(200) not null,
`training-id` varchar(30) not null,`batch-id` varchar(30) not null,`info-is-valid` boolean not null,
foreign key(`training-id`) references training(`training-id`),
foreign key(`batch-id`) references batch(`batch-id`));

create table `login-details`(userID varchar(100) primary key not null, password varchar(200) not null,PRN varchar(100) not null,
foreign key(PRN) references `stu-info`(PRN));





insert into training values('TR001','PG-DAC',true);
insert into training values('TR002','PG-DBDA',true);

insert into batch values('BA001','MAR-2024','TR001',true);
insert into batch values('BA002','SEPT-2024','TR001',true);
insert into batch values('BA003','MAR-2024','TR002',true);
insert into batch values('BA004','SEPT-2024','TR002',true);

INSERT INTO `stu-info` values('DAC0001','Sagar Deware','robertcena30@outlook.com','TR001','BA001',true);
INSERT INTO `stu-info` values('DAC0002','Priyanka sethi','priyankasethi077@gmail.com','TR001','BA002',true);
INSERT INTO `stu-info` values('DAC0003','Vijay Verma','seasawthat@gmail.com','TR002','BA003',true);
INSERT INTO `stu-info` values('DAC0004','Pankaj Tripathi','kamladevre7440@gmail.com','TR001','BA004',true);
INSERT INTO `stu-info` values('DAC0005','Manoj Bajpayee','sagardevredemo@gmail.com','TR001','BA002',true);
INSERT INTO `stu-info` values('DAC0006','robert cena','robertcena30@gmail.com','TR001','BA002',true);

INSERT INTO `mail-template-type` values('TA001','HTML',TRUE);
INSERT INTO `mail-template-type` values('TA002','TEXT',TRUE);

INSERT INTO `mail-template` values('TEMP0001','TA002','Providing Certificate',
'C:\\Users\\cdac\\Desktop\\templates\\Certificate.txt',1,'Regarding the course Certificate',true);
INSERT INTO `mail-template` values('TEMP0002','TA001','Getting Feedback from Students',
'C:\\Users\\cdac\\Desktop\\templates\\Feedback Form.txt',0,'Regarding the Feedback Form',true);
INSERT INTO `mail-template` values('TEMP0003','TA001','Informing about Hostel Details',
'C:\\Users\\cdac\\Desktop\\templates\\Hostel Fee Payment.txt',1,'Regarding the Hostel Fee Payment',true);
INSERT INTO `mail-template` values('TEMP0004','TA001','getting Info about registraion form',
'C:\\Users\\cdac\\Desktop\\templates\\Registration Form.txt',0,'Regarding the Registration Form',true);
INSERT INTO `mail-template` values('TEMP0005','TA001','Providing Service',
'C:\\Users\\cdac\\Desktop\\templates\\Support Service.txt',0,'Regarding the Support Service',true);
INSERT INTO `mail-template` values('TEMP0006','TA001','Informing about Training Details',
'C:\\Users\\cdac\\Desktop\\templates\\Training Details.txt',0,'Regarding the Training Details',true);

