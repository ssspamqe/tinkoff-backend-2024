/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.CharacterSets;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = 1L;

    public void setCharacterSetCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getCharacterSetCatalog() {
        return (String) get(0);
    }

    public void setCharacterSetSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getCharacterSetSchema() {
        return (String) get(1);
    }

    public void setCharacterSetName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getCharacterSetName() {
        return (String) get(2);
    }

    public void setCharacterRepertoire(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getCharacterRepertoire() {
        return (String) get(3);
    }

    public void setFormOfUse(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getFormOfUse() {
        return (String) get(4);
    }

    public void setDefaultCollateCatalog(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getDefaultCollateCatalog() {
        return (String) get(5);
    }

    public void setDefaultCollateSchema(@Nullable String value) {
        set(6, value);
    }

    @Nullable
    public String getDefaultCollateSchema() {
        return (String) get(6);
    }

    public void setDefaultCollateName(@Nullable String value) {
        set(7, value);
    }

    @Nullable
    public String getDefaultCollateName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    @ConstructorProperties({ "characterSetCatalog", "characterSetSchema", "characterSetName", "characterRepertoire", "formOfUse", "defaultCollateCatalog", "defaultCollateSchema", "defaultCollateName" })
    public CharacterSetsRecord(@Nullable String characterSetCatalog, @Nullable String characterSetSchema, @Nullable String characterSetName, @Nullable String characterRepertoire, @Nullable String formOfUse, @Nullable String defaultCollateCatalog, @Nullable String defaultCollateSchema, @Nullable String defaultCollateName) {
        super(CharacterSets.CHARACTER_SETS);

        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCharacterRepertoire(characterRepertoire);
        setFormOfUse(formOfUse);
        setDefaultCollateCatalog(defaultCollateCatalog);
        setDefaultCollateSchema(defaultCollateSchema);
        setDefaultCollateName(defaultCollateName);
        resetChangedOnNotNull();
    }

    public CharacterSetsRecord(edu.java.domain.jooq.information_schema.tables.pojos.CharacterSets value) {
        super(CharacterSets.CHARACTER_SETS);

        if (value != null) {
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            setCharacterRepertoire(value.getCharacterRepertoire());
            setFormOfUse(value.getFormOfUse());
            setDefaultCollateCatalog(value.getDefaultCollateCatalog());
            setDefaultCollateSchema(value.getDefaultCollateSchema());
            setDefaultCollateName(value.getDefaultCollateName());
            resetChangedOnNotNull();
        }
    }
}