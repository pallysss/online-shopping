CREATE TABLE category(
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)
	
);

INSERT INTO CATEGORY (NAME, DESCRIPTION, IMAGE_URL, IS_ACTIVE)
VALUES ('Television','This is description for Television','CAT_1.PNG', TRUE);
INSERT INTO CATEGORY (NAME, DESCRIPTION, IMAGE_URL, IS_ACTIVE)
VALUES ('Mobile','This is description for Mobile','CAT_2.PNG', TRUE);
INSERT INTO CATEGORY (NAME, DESCRIPTION, IMAGE_URL, IS_ACTIVE)
VALUES ('Laptop','This is description for Laptop','CAT_3.PNG', TRUE);