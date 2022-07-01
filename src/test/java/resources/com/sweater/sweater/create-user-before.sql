DELETE FROM user_role;
DELETE FROM usr;

INSERT INTO usr(id, name, email, password, active) values
               (1, 'u', 'u@u.com', '$2a$08$ueokSlUg3qKO.SETDE8i4uiL1ZCJveSuwzJxwVhC/be9ZDbe4l86u', true),
               (2, 'm', 'm@m.com', '$2a$08$ueokSlUg3qKO.SETDE8i4uiL1ZCJveSuwzJxwVhC/be9ZDbe4l86u', true);

INSERT INTO user_role(user_id, roles) values
          (1, 'ADMIN'), (1, 'USER'),
          (2, 'USER');
