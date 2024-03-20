/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_.tables.records;


import edu.java.domain.jooq.public_.tables.StackOverflowQuestions;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StackOverflowQuestionsRecord extends TableRecordImpl<StackOverflowQuestionsRecord> {

    private static final long serialVersionUID = 1L;

    public void setId(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    public void setLinkId(@NotNull Long value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getLinkId() {
        return (Long) get(1);
    }

    public void setDescriptionMd5Hash(@NotNull String value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getDescriptionMd5Hash() {
        return (String) get(2);
    }

    public void setAnswersIds(@NotNull Long[] value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long[] getAnswersIds() {
        return (Long[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public StackOverflowQuestionsRecord() {
        super(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS);
    }

    @ConstructorProperties({ "id", "linkId", "descriptionMd5Hash", "answersIds" })
    public StackOverflowQuestionsRecord(@NotNull Long id, @NotNull Long linkId, @NotNull String descriptionMd5Hash, @NotNull Long[] answersIds) {
        super(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS);

        setId(id);
        setLinkId(linkId);
        setDescriptionMd5Hash(descriptionMd5Hash);
        setAnswersIds(answersIds);
        resetChangedOnNotNull();
    }

    public StackOverflowQuestionsRecord(edu.java.domain.jooq.public_.tables.pojos.StackOverflowQuestions value) {
        super(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS);

        if (value != null) {
            setId(value.getId());
            setLinkId(value.getLinkId());
            setDescriptionMd5Hash(value.getDescriptionMd5Hash());
            setAnswersIds(value.getAnswersIds());
            resetChangedOnNotNull();
        }
    }
}