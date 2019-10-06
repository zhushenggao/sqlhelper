package com.jn.sqlhelper.common.ddlmodel;

import com.jn.langx.annotation.NonNull;
import com.jn.langx.annotation.Nullable;
import com.jn.sqlhelper.common.annotation.Column;

public class PrimaryKeyColumn {
    @Nullable
    @Column({"TABLE_CAT","TABLE_CATALOG"})
    private String catalog;

    @Nullable
    @Column({"TABLE_SCHEM","TABLE_SCHEMA"})
    private String schema;

    @NonNull
    @Column("TABLE_NAME")
    private String tableName;

    @NonNull
    @Column("COLUMN_NAME")
    private String columnName;

    @Column("KEY_SEQ")
    private int keySeq;

    @Nullable
    @Column("PK_NAME")
    private String name;

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getKeySeq() {
        return keySeq;
    }

    public void setKeySeq(int keySeq) {
        this.keySeq = keySeq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
