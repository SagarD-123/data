use demo;
USE email_app;
show tables;
desc users;
truncate users;
select * from users;
CREATE TABLE templates (
    template_id INT AUTO_INCREMENT PRIMARY KEY,
    template_name VARCHAR(255) NOT NULL,
    template_path VARCHAR(255) NOT NULL,
    template_subject VARCHAR(255) NOT NULL
);

CREATE TABLE training_details (
    training_id INT PRIMARY KEY,
    training_name VARCHAR(255) NOT NULL
);

INSERT INTO training_details values(00001,'PG-DAC');
INSERT INTO training_details values(00002,'PG-DBDA');
INSERT INTO students values(11001,'Sagar Deware',00001,'sagardevre297964@gmail.com');
INSERT INTO students values(11002,'Vishal Deware',00002,'robertcena30@outlook.com');
INSERT INTO students values(11003,'Kamala Deware',00001,'sagardevredemo@gmail.com');
INSERT INTo  students values(11004,'Ravi Deware',00002,'priyankasethi077@gmail.com');

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(255) NOT NULL,
    training_id INT NOT NULL,
    email VARCHAR(255) NOT NULL,
    FOREIGN KEY (training_id) REFERENCES training_details(training_id)
);


insert into templates values(1,'Certificate','C:\\Users\\cdac\\Desktop\\templates\\Certificate.txt','Regarding the course Certificate');
insert into templates values(2,'Feedback Form','C:\\Users\\cdac\\Desktop\\templates\\Feedback Form.txt','Regarding the Feedback Form');
insert into templates values(3,'Hostel Fee Payment','C:\\Users\\cdac\\Desktop\\templates\\Hostel Fee Payment.txt','Regarding the Hostel Fee Payment');
insert into templates values(4,'Registration Form','C:\\Users\\cdac\\Desktop\\templates\\Registration Form.txt','Regarding the Registration Form');
insert into templates values(5,'Support Service','C:\\Users\\cdac\\Desktop\\templates\\Support Service.txt','Regarding the Support Service');
insert into templates values(6,'Training Details','C:\\Users\\cdac\\Desktop\\templates\\Training Details.txt','Regarding the Training Details');

show tables;
desc template1_data;
select * from template1_data;
truncate template1_data;
insert into template1_data values(2,'mailtesting01@mailinator.com','test01','sdfdsfsdf','cdac');
insert into template1_data values(3,'mailtesting02@mailinator.com','test02','sdfdsfsdf','cdac');
insert into template1_data values(4,'mailtesting03@mailinator.com','test03','sdfdsfsdf','cdac');
insert into template1_data values(5,'mailtesting04@mailinator.com','test04','sdfdsfsdf','cdac');
insert into template1_data values(6,'mailtesting05@mailinator.com','test05','sdfdsfsdf','cdac');
insert into template1_data values(7,'mailtesting06@mailinator.com','test06','sdfdsfsdf','cdac');
insert into template1_data values(8,'mailtesting07@mailinator.com','test07','sdfdsfsdf','cdac');
insert into template1_data values(9,'mailtesting08@mailinator.com','test08','sdfdsfsdf','cdac');
insert into template1_data values(10,'mailtesting09@mailinator.com','test09','sdfdsfsdf','cdac');
insert into template1_data values(11,'mailtesting10@mailinator.com','test10','sdfdsfsdf','cdac');
insert into template1_data values(12,'mailtesting11@mailinator.com','test11','sdfdsfsdf','cdac');
