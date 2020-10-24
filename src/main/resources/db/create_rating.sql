CREATE SEQUENCE  "RATING_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;


CREATE TABLE "RATING" (
	"ID" NUMBER DEFAULT "RATING_ID_SEQ".NEXTVAL NOT NULL,
	"RATING_USER_ID" NUMBER NOT NULL,
    "RATED_USER_ID" NUMBER NOT NULL,
    "RATING" NUMBER(3,2) NOT NULL,
	"MESSAGE" CLOB NOT NULL,
	"DATE_CREATED" TIMESTAMP (6) NOT NULL,
	"DATE_UPDATED" TIMESTAMP (6),
	"VERSION" NUMBER NOT NULL,
	CONSTRAINT "RATING_PK" PRIMARY KEY ("ID"),
	CONSTRAINT "RATING_RATING_USER_FK" FOREIGN KEY ("RATING_USER_ID") REFERENCES "USERS" ("ID"),
	CONSTRAINT "RATING_RATED_USER_FK" FOREIGN KEY ("RATED_USER_ID") REFERENCES "USERS" ("ID")
	);
