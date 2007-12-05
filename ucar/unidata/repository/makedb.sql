
--- Initial data base creation

--drop table files;
--drop table level3radar;
--drop table groups;
--drop table users;
--drop table tags;

CREATE TABLE  groups (id varchar(500),
                     parent varchar(200),
                     name varchar(200),
		     description varchar(200));

CREATE INDEX GROUPS_INDEX_ID ON groups (ID);


CREATE TABLE  users (id varchar(200),
                     name  varchar(200),
		     admin int);


CREATE TABLE files (id varchar(200),
	           name varchar(200),
                   description varchar(500),
                   type varchar(200),
                   group_id varchar(200),
   		   user_id varchar(200),
	           file varchar(200),
	           createdate timestamp, 
	           fromdate timestamp, 
	           todate timestamp); 

--drop INDEX FILES_INDEX_ID;
CREATE INDEX FILES_INDEX_ID ON files (ID);

--drop INDEX FILES_INDEX_GROUP;
CREATE INDEX FILES_INDEX_GROUP ON files (GROUP_ID);

--drop INDEX FILES_INDEX_TYPE;
CREATE INDEX FILES_INDEX_TYPE ON files (TYPE);

--drop INDEX FILES_INDEX_USER_ID;
CREATE INDEX FILES_INDEX_USER_ID ON files (USER_ID);

CREATE TABLE level3radar (
	           id varchar(200),
                   station varchar(50), 
                   product varchar(50));

--drop INDEX LEVEL3RADAR_INDEX_ID;
CREATE INDEX LEVEL3RADAR_INDEX_ID ON level3radar (ID);

--drop INDEX LEVEL3RADAR_INDEX_STATION;
CREATE INDEX LEVEL3RADAR_INDEX_STATION ON level3radar (STATION);

--drop INDEX LEVEL3RADAR_INDEX_PRODUCT;
CREATE INDEX LEVEL3RADAR_INDEX_PRODUCT ON level3radar (PRODUCT);

CREATE TABLE level2radar (
	           id varchar(200),
                   station varchar(50));

--drop INDEX LEVEL2RADAR_INDEX_ID;
CREATE INDEX LEVEL2RADAR_INDEX_ID ON level2radar (ID);
--drop INDEX LEVEL2RADAR_INDEX_STATION;
CREATE INDEX LEVEL2RADAR_INDEX_STATION ON level2radar (STATION);



CREATE TABLE tags (name varchar(200),
	           file_id varchar(200));

--drop INDEX TAGS_INDEX_NAME;
CREATE INDEX TAGS_INDEX_NAME ON tags (NAME);
--drop INDEX TAGS_INDEX_FILE_ID;
CREATE INDEX TAGS_INDEX_FILE_ID ON tags (FILE_ID);



