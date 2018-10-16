START TRANSACTION ;

insert into configuration(`key`, `value`) values ('name', 'bluesky');
insert into configuration(`key`, `value`) values ('phone', '0912345678');

COMMIT ;
