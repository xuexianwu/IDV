/**
 * $Id: TrackDataSource.java,v 1.90 2007/08/06 17:02:27 jeffmc Exp $
 *
 * Copyright 1997-2005 Unidata Program Center/University Corporation for
 * Atmospheric Research, P.O. Box 3000, Boulder, CO 80307,
 * support@unidata.ucar.edu.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package ucar.unidata.repository;


import ucar.unidata.sql.SqlUtil;


/**
 * Class SqlUtil _more_
 *
 *
 * @author IDV Development Team
 * @version $Revision: 1.3 $
 */
public class Tables {
public static class ENTRIES {
public static final String NAME = "entries";
public static final String COL_ID = NAME + ".id";
public static final String COL_TYPE = NAME + ".type";
public static final String COL_NAME = NAME + ".name";
public static final String COL_DESCRIPTION = NAME + ".description";
public static final String COL_PARENT_GROUP_ID = NAME + ".parent_group_id";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_RESOURCE = NAME + ".resource";
public static final String COL_RESOURCE_TYPE = NAME + ".resource_type";
public static final String COL_DATATYPE = NAME + ".datatype";
public static final String COL_CREATEDATE = NAME + ".createdate";
public static final String COL_FROMDATE = NAME + ".fromdate";
public static final String COL_TODATE = NAME + ".todate";
public static final String COL_SOUTH = NAME + ".south";
public static final String COL_NORTH = NAME + ".north";
public static final String COL_EAST = NAME + ".east";
public static final String COL_WEST = NAME + ".west";
public static final String []ARRAY= new String[] {
COL_ID,COL_TYPE,COL_NAME,COL_DESCRIPTION,COL_PARENT_GROUP_ID,COL_USER_ID,COL_RESOURCE,COL_RESOURCE_TYPE,COL_DATATYPE,COL_CREATEDATE,COL_FROMDATE,COL_TODATE,COL_SOUTH,COL_NORTH,COL_EAST,COL_WEST
};

public static final String UPDATE =SqlUtil.makeUpdate(NAME,COL_ID,ARRAY);

public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class ANCESTORS {
public static final String NAME = "ancestors";
public static final String COL_ID = NAME + ".id";
public static final String COL_ANCESTOR_ID = NAME + ".ancestor_id";
public static final String []ARRAY= new String[] {
COL_ID,COL_ANCESTOR_ID
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class METADATA {
public static final String NAME = "metadata";
public static final String COL_ID = NAME + ".id";
public static final String COL_ENTRY_ID = NAME + ".entry_id";
public static final String COL_TYPE = NAME + ".type";
public static final String COL_INHERITED = NAME + ".inherited";
public static final String COL_ATTR1 = NAME + ".attr1";
public static final String COL_ATTR2 = NAME + ".attr2";
public static final String COL_ATTR3 = NAME + ".attr3";
public static final String COL_ATTR4 = NAME + ".attr4";
public static final String COL_EXTRA = NAME + ".extra";
public static final String []ARRAY= new String[] {
COL_ID,COL_ENTRY_ID,COL_TYPE,COL_INHERITED,COL_ATTR1,COL_ATTR2,COL_ATTR3,COL_ATTR4,COL_EXTRA
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class COMMENTS {
public static final String NAME = "comments";
public static final String COL_ID = NAME + ".id";
public static final String COL_ENTRY_ID = NAME + ".entry_id";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_DATE = NAME + ".date";
public static final String COL_SUBJECT = NAME + ".subject";
public static final String COL_COMMENT = NAME + ".comment";
public static final String []ARRAY= new String[] {
COL_ID,COL_ENTRY_ID,COL_USER_ID,COL_DATE,COL_SUBJECT,COL_COMMENT
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class ASSOCIATIONS {
public static final String NAME = "associations";
public static final String COL_ID = NAME + ".id";
public static final String COL_NAME = NAME + ".name";
public static final String COL_TYPE = NAME + ".type";
public static final String COL_FROM_ENTRY_ID = NAME + ".from_entry_id";
public static final String COL_TO_ENTRY_ID = NAME + ".to_entry_id";
public static final String []ARRAY= new String[] {
COL_ID,COL_NAME,COL_TYPE,COL_FROM_ENTRY_ID,COL_TO_ENTRY_ID
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class USERS {
public static final String NAME = "users";
public static final String COL_ID = NAME + ".id";
public static final String COL_NAME = NAME + ".name";
public static final String COL_EMAIL = NAME + ".email";
public static final String COL_QUESTION = NAME + ".question";
public static final String COL_ANSWER = NAME + ".answer";
public static final String COL_PASSWORD = NAME + ".password";
public static final String COL_ADMIN = NAME + ".admin";
public static final String COL_LANGUAGE = NAME + ".language";
public static final String COL_TEMPLATE = NAME + ".template";
public static final String COL_ISGUEST = NAME + ".isguest";
public static final String []ARRAY= new String[] {
    COL_ID,COL_NAME,COL_EMAIL,COL_QUESTION,COL_ANSWER,COL_PASSWORD,COL_ADMIN,COL_LANGUAGE,COL_TEMPLATE,COL_ISGUEST
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class USERROLES {
public static final String NAME = "userroles";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_ROLE = NAME + ".role";
public static final String []ARRAY= new String[] {
COL_USER_ID,COL_ROLE
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class FAVORITES {
public static final String NAME = "favorites";
public static final String COL_ID = NAME + ".id";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_ENTRY_ID = NAME + ".entry_id";
public static final String COL_NAME = NAME + ".name";
public static final String COL_CATEGORY = NAME + ".category";
public static final String []ARRAY= new String[] {
COL_ID,COL_USER_ID,COL_ENTRY_ID,COL_NAME,COL_CATEGORY
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class USER_ACTIVITY {
public static final String NAME = "user_activity";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_DATE = NAME + ".date";
public static final String COL_WHAT = NAME + ".what";
public static final String COL_EXTRA = NAME + ".extra";
public static final String COL_IPADDRESS = NAME + ".ipaddress";
public static final String []ARRAY= new String[] {
COL_USER_ID,COL_DATE,COL_WHAT,COL_EXTRA,COL_IPADDRESS
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class SESSIONS {
public static final String NAME = "sessions";
public static final String COL_SESSION_ID = NAME + ".session_id";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_CREATE_DATE = NAME + ".create_date";
public static final String COL_LAST_ACTIVE_DATE = NAME + ".last_active_date";
public static final String COL_EXTRA = NAME + ".extra";
public static final String []ARRAY= new String[] {
COL_SESSION_ID,COL_USER_ID,COL_CREATE_DATE,COL_LAST_ACTIVE_DATE,COL_EXTRA
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class MONITORS {
public static final String NAME = "monitors";
public static final String COL_MONITOR_ID = NAME + ".monitor_id";
public static final String COL_NAME = NAME + ".name";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_FROM_DATE = NAME + ".from_date";
public static final String COL_TO_DATE = NAME + ".to_date";
public static final String COL_ENCODED_OBJECT = NAME + ".encoded_object";
public static final String []ARRAY= new String[] {
COL_MONITOR_ID,COL_NAME,COL_USER_ID,COL_FROM_DATE,COL_TO_DATE,COL_ENCODED_OBJECT
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class PERMISSIONS {
public static final String NAME = "permissions";
public static final String COL_ENTRY_ID = NAME + ".entry_id";
public static final String COL_ACTION = NAME + ".action";
public static final String COL_ROLE = NAME + ".role";
public static final String []ARRAY= new String[] {
COL_ENTRY_ID,COL_ACTION,COL_ROLE
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class HARVESTERS {
public static final String NAME = "harvesters";
public static final String COL_ID = NAME + ".id";
public static final String COL_CLASS = NAME + ".class";
public static final String COL_CONTENT = NAME + ".content";
public static final String []ARRAY= new String[] {
COL_ID,COL_CLASS,COL_CONTENT
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class GLOBALS {
public static final String NAME = "globals";
public static final String COL_NAME = NAME + ".name";
public static final String COL_VALUE = NAME + ".value";
public static final String []ARRAY= new String[] {
COL_NAME,COL_VALUE
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class WIKIPAGEHISTORY {
public static final String NAME = "wikipagehistory";
public static final String COL_ENTRY_ID = NAME + ".entry_id";
public static final String COL_USER_ID = NAME + ".user_id";
public static final String COL_DATE = NAME + ".date";
public static final String COL_DESCRIPTION = NAME + ".description";
public static final String COL_WIKITEXT = NAME + ".wikitext";
public static final String []ARRAY= new String[] {
COL_ENTRY_ID,COL_USER_ID,COL_DATE,COL_DESCRIPTION,COL_WIKITEXT
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class SERVERREGISTRY {
public static final String NAME = "serverregistry";
public static final String COL_URL = NAME + ".url";
public static final String COL_TITLE = NAME + ".title";
public static final String COL_DESCRIPTION = NAME + ".description";
public static final String COL_EMAIL = NAME + ".email";
public static final String COL_ISREGISTRY = NAME + ".isregistry";
public static final String []ARRAY= new String[] {
COL_URL,COL_TITLE,COL_DESCRIPTION,COL_EMAIL,COL_ISREGISTRY
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class REMOTESERVERS {
public static final String NAME = "remoteservers";
public static final String COL_URL = NAME + ".url";
public static final String COL_TITLE = NAME + ".title";
public static final String COL_DESCRIPTION = NAME + ".description";
public static final String COL_EMAIL = NAME + ".email";
public static final String COL_ISREGISTRY = NAME + ".isregistry";
public static final String COL_SELECTED = NAME + ".selected";
public static final String []ARRAY= new String[] {
COL_URL,COL_TITLE,COL_DESCRIPTION,COL_EMAIL,COL_ISREGISTRY,COL_SELECTED
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class DUMMY {
public static final String NAME = "dummy";
public static final String COL_NAME = NAME + ".name";
public static final String []ARRAY= new String[] {
COL_NAME
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};

public static class POINTDATAMETADATA {
public static final String NAME = "pointdatametadata";
public static final String COL_TABLENAME = NAME + ".tablename";
public static final String COL_COLUMNNAME = NAME + ".columnname";
public static final String COL_COLUMNNUMBER = NAME + ".columnnumber";
public static final String COL_SHORTNAME = NAME + ".shortname";
public static final String COL_LONGNAME = NAME + ".longname";
public static final String COL_UNIT = NAME + ".unit";
public static final String COL_VARTYPE = NAME + ".vartype";
public static final String []ARRAY= new String[] {
COL_TABLENAME,COL_COLUMNNAME,COL_COLUMNNUMBER,COL_SHORTNAME,COL_LONGNAME,COL_UNIT,COL_VARTYPE
};


public static final String COLUMNS = SqlUtil.comma(ARRAY);
public static final String NODOT_COLUMNS = SqlUtil.commaNoDot(ARRAY);
public static final String INSERT=
SqlUtil.makeInsert(
NAME,
NODOT_COLUMNS,
SqlUtil.getQuestionMarks(ARRAY.length));

};


}

