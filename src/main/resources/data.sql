INSERT INTO roles (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO roles (`id`, `name`) VALUES ('2', 'ROLE_USER');

INSERT INTO users (`id`, `email`, `full_name`, `password`) VALUES ('1', 'admin', 'admin', 'admin');
INSERT INTO users (`id`, `email`, `full_name`, `password`) VALUES ('2', 'user', 'user', 'user');

INSERT INTO users_roles (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO users_roles (`user_id`, `role_id`) VALUES ('1', '2');
INSERT INTO users_roles (`user_id`, `role_id`) VALUES ('2', '2');


SET FOREIGN_KEY_CHECKS=0;
DROP TABLE film_actor ;
DROP TABLE film_category;
DROP TABLE inventory;