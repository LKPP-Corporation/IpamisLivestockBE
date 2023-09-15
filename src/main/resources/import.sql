SET FOREIGN_KEY_CHECKS = 0;
delete from menu;
delete from menu_items;
delete from menu_router_link;
INSERT INTO `menu` (`id`, `icon`, `label`, `master_id`)
VALUES
	(10,'pi pi-home','Dashboard',NULL),
	(11,'pi pi-home','Home',10),
    (80,'pi pi-home','Configurations',NULL),
	(81,'pi pi-home','Soil Info',80),	
	(90,'pi pi-home','Menu Pentadbir',NULL),
    (91,'pi pi-home','Pengguna',90),
	(92,'pi pi-home','Menu',90);
  

INSERT into `menu_items` (`menu_id`, `items_id`) 
values (10,11),(20,21),(20,22),(20,23),(20,24),(80,81),(80,82),(80,83),(80,84),(80,85),(80,86),(90,91);

INSERT into menu_router_link (`menu_id`, `router_link`) values 
(11,'/dashboard'),
(81,'/soil'),
(91,'/user'),
(92,'/menu');
	SET FOREIGN_KEY_CHECKS = 1;


INSERT INTO `menu_role` (`id`, `role`)
VALUES
	(1,'ADMIN'),
	(2,'USER'),
	(3,'CHECKER'),
    (4,'APPROVER');

SET FOREIGN_KEY_CHECKS = 0;
delete from menurole_link;
INSERT INTO `menurole_link` (`role_id`, `menu_id`)
VALUES
	(1,10),
	(1,80),
	(1,90),
	(2,10),
	(3,10),
	(4,10);
SET FOREIGN_KEY_CHECKS = 1;

SET FOREIGN_KEY_CHECKS = 0;
delete from user;
delete from user_roles;
INSERT INTO `user` (`id`, `email`, `signature`, `staff_id`)
VALUES
	(1,'mahadzir@lcsb.com.my',NULL,'P0457');

INSERT INTO `user_roles` (`user_id`, `roles`)
VALUES
	(1,'ADMIN'),
	(1,'USER'),
	(1,'CHECKER'),
	(1,'APPROVER'),
    (2,'USER');
SET FOREIGN_KEY_CHECKS = 1;	


SET FOREIGN_KEY_CHECKS = 0;
delete from menu;
delete from menu_items;
delete from menu_router_link;
delete from menu_role;
delete from menurole_link;
delete from user;
delete from user_roles;
delete from soil;
INSERT INTO `menu` (`id`, `icon`, `label`)
VALUES
	(10,'pi pi-home','Dashboard'),
	(11,'pi pi-home','Home'),
    (80,'pi pi-home','Configurations'),
	(81,'pi pi-home','Soil Info'),	
	(90,'pi pi-home','Menu Pentadbir'),
    (91,'pi pi-home','Pengguna'),
	(92,'pi pi-home','Menu');
  

INSERT into `menu_items` (`menu_id`, `items_id`) 
values (10,11),(80,81),(90,91),(90,92);

INSERT into menu_router_link (`menu_id`, `router_link`) values 
(11,'/dashboard'),
(81,'/soil-info'),
(91,'/user'),
(92,'/menu');

INSERT INTO `menu_role` (`id`, `role`)
VALUES
	(1,'ADMIN'),
	(2,'USER'),
	(3,'CHECKER'),
    (4,'APPROVER');

	INSERT INTO `menurole_link` (`role_id`, `menu_id`)
VALUES
	(1,10),
	(1,80),
	(1,90),
	(2,10),
	(3,10),
	(4,10);

INSERT INTO `user` (`id`, `email`, `signature`, `staff_id`)
VALUES
	(1,'mahadzir@lcsb.com.my',NULL,'P0457');

INSERT INTO `user_roles` (`user_id`, `roles`)
VALUES
	(1,'ADMIN'),
	(1,'USER'),
	(1,'CHECKER'),
	(1,'APPROVER'),
    (2,'USER');	
SET FOREIGN_KEY_CHECKS = 1;	
