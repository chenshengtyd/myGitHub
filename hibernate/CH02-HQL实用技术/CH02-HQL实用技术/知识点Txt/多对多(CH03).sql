-- Create table
create table PROJECT
(
  PROID   NUMBER(6) not null,
  PRONAME NVARCHAR2(50) not null
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table PROJECT add constraint PK_PROJECT primary key (PROID);

  -- Create table
create table EMPLOYEE
(
  EMPID   NUMBER(6) not null,
  EMPNAME NVARCHAR2(50) not null
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table EMPLOYEE  add constraint PK_EMPLOYEE primary key (EMPID);
  -- Create table
create table PROEMP
(
  RPROID NUMBER(6) not null,
  REMPID NUMBER(6) not null
);
-- Create/Recreate primary, unique and foreign key constraints 
alter table PROEMP
  add constraint PK_PROEMP primary key (RPROID, REMPID);
alter table PROEMP
  add constraint FK_EMPID foreign key (REMPID)  references EMPLOYEE (EMPID);
alter table PROEMP
  add constraint FK_PROID foreign key (RPROID)  references PROJECT (PROID);
  