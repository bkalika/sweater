INSERT INTO usr (id, name, password, email, active)
    values (1, 'admin', '1', 'admin@mail.com', true);

insert into user_role(user_id, roles)
    values (1, 'USER'), (1, 'ADMIN');
